/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diary;

/**
 *
 * @author Usuario
 */

import java.awt.Component;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Database {
    Connection con;
    private Component rootPane;
    public  void connect() {
        String driver = "org.postgresql.Driver";
        String user = "postgres";
        String senha = "arissa123";
        String url = "jdbc:postgresql://localhost:5432/simple_diary";
        try {
            Class.forName(driver);
            con = null;
            con = (Connection) DriverManager.getConnection(url, user, senha);
            
        } catch (ClassNotFoundException ex) {
            System.err.print(ex.getMessage());
        } catch (SQLException e) {
            System.err.print(e.getMessage());
        }
    }
    public void insert(String m, String t){
        try { 
            String SQL = "select * from message;";
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
              if(rs.getString("titulo").equals(t)){
                  JOptionPane.showMessageDialog(rootPane, "Problema com titulo - já existente");
                  return;
              }
              
            }          
            Statement st = con.createStatement(); 
            st.executeUpdate("Insert into message(horario,titulo ,conteudo) values('"+getCurrentDate() + "','"+ t +"','"+ m +"')"); 
            con.close(); 
        } catch (Exception e) { 
            System.err.println("Got an exception! "); 
            System.err.println(e.getMessage()); 
        }
    }
    private static java.sql.Date getCurrentDate() {
        java.util.Date today = new java.util.Date();
        return new java.sql.Date(today.getTime());
    }
    public ArrayList<String> result(){
        ArrayList<String> r = new ArrayList<>();
        
        try{
            String SQL = "select * from message;";
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                r.add(rs.getDate("horario")+" "+rs.getString("titulo"));
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return r;
    }
    public String [] selecionado(String t){
        String [] r = new String[2];

        try{
            String SQL = "select * from message where titulo= '"+ t +"';";
            
            PreparedStatement ps = con.prepareStatement(SQL);

            ResultSet rs = ps.executeQuery();

            rs.next();
            r[0]= rs.getString("titulo");
            r[1]= rs.getString("conteudo");

            //System.out.println(rs.getString("titulo"));
            //System.out.println(rs.getString("conteudo"));
        }catch (Exception e){
            System.out.println(e);
        }
        return r;
    }
    public void deleteRecord( String t){
        try{
            String SQL = "delete from message where titulo= '" + t +"';";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.executeQuery();
        }catch (Exception e){
            
        }
    }
    public void updateRecord( String t, String m){
        try{
            String SQL = "update  message set conteudo ='"+ m +"' where titulo= '" + t +"';";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.executeQuery();
        }catch (Exception e){
            
        }
    }
    public void createRecord(String t, String m, String d){
        try{
            String SQL = "Insert into message(horario,titulo ,conteudo) values('"+d + "','"+ t +"','"+ m +"')";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.executeQuery();
        }catch (Exception e){
            
        }       
    }
    public boolean hasContent(String h){
        try{
            String SQL = "select * from message where horario = '"+h+"'";       
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            System.out.println(rs.getFetchSize());
            return rs.next();
        }catch (Exception e){
            System.out.println(e);
        }
        return false;
    }
    public String [] selectDate(String h){
        String [] resp = new String[2];
        try{
            String SQL = "select * from message where horario = '"+h+"'";       
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            rs.next();
            resp[0]= rs.getString("titulo");
            resp[1]= rs.getString("conteudo");
            return resp;
        }catch (Exception e){
            System.out.println(e);
        }
        return resp;
    }
    public boolean selectDate1(String n,String p){
        try{
            String SQL = "select * from usuarios where nome = '"+n+"' and senha = '"+p+"'";       
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            return rs.next();


        }catch (Exception e){
            System.out.println(e);
        }
        return false;
    }
}