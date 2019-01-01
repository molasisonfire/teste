/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diary;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.time.YearMonth;
/**
 *
 * @author Usuario
 */
public class Organizer {
    public int mes;
    public int ano;
    public int mesL;
    public String [] months;
    public String firstDay;
    
    
    public Organizer(){
        SimpleDateFormat sdf=new SimpleDateFormat("EEEE");
        Calendar c = Calendar.getInstance();
        Date no = new Date();
        c.setTime(no);
        firstDay = sdf.format(c.getTime());
        months = new String[]{"Jan","Feb","Mar","Apr","May","Jun",
                              "Jul","Aug","Sep","Oct","Nov","Dec"};
        mes = c.get(Calendar.MONTH);
        ano = c.get(Calendar.YEAR);
        YearMonth ym = YearMonth.of(ano,mes+1); //Xabu
        mesL = ym.lengthOfMonth();
    }
    public void nextMonth(){
        mes = mes + 1;
        if(mes >= 12) mes = 0;
    }
    public void prevMonth(){
        mes = mes - 1;
        if(mes <= -1) mes = 11;
    }
    public void nextYear(){
        ano++;
    }
    public void prevYear(){
        ano--;
    }
    public void updateDays(){
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DATE, 1);
        cal.set(Calendar.MONTH,mes);
        cal.set(Calendar.YEAR, ano);
        Date firstDayOfMonth = cal.getTime();  
        SimpleDateFormat sdf = new SimpleDateFormat("EEEEEEEE");   
        firstDay = sdf.format(firstDayOfMonth);      
    }
   /* public static void main(String [] args){
        Organizer z = new Organizer();
        System.out.println(z.mes);
        System.out.println(z.mesL);
        System.out.println(z.ano);
    }*/
}
