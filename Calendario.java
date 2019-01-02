/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diary;
import java.awt.Color;

/**
 *
 * @author Usuario
 */
public class Calendario extends javax.swing.JFrame {

    /**
     * Creates new form Calendario
     */
    public Organizer z;
    
    public Calendario() {
        Database db= new Database();
        db.connect();
        initComponents();
        z = new Organizer();
        z.updateDays();
        jLabel1.setText(z.months[z.mes]);
        jLabel2.setText(""+z.ano);
        boolean start = false;
        int i = 1;
        int meses = z.mes+1;
        if(z.firstDay.equalsIgnoreCase("Domingo") && !start){
            button1.setLabel("Dia "+i+"");
            start = true;
            if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
                jPanel2.setBackground(Color.GREEN);
            }else{
                jPanel2.setBackground(Color.RED);
            }
            i++;
        }else{
            button1.setLabel("----------");
            jPanel2.setBackground(Color.RED);
        }//Domingo
        
        if(z.firstDay.equalsIgnoreCase("Segunda-Feira")&& !start){
            button5.setLabel("Dia "+i+"");
            start = true;
            if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
                jPanel6.setBackground(Color.GREEN);
            }else{
                jPanel6.setBackground(Color.RED);
            }
            i++;
        }else if(start){
            button5.setLabel("Dia "+i+"");
            
            if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
                jPanel6.setBackground(Color.GREEN);
            }else{
                jPanel6.setBackground(Color.RED);
            }
            i++;
        }else{
            jPanel6.setBackground(Color.RED);
            button5.setLabel("----------");
        }//Segunda-Feira
        
        if(z.firstDay.equalsIgnoreCase("Terça-Feira")&& !start){
            button7.setLabel("Dia "+i+"");
            
            start = true;
            if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
                jPanel8.setBackground(Color.GREEN);
            }else{
                jPanel8.setBackground(Color.RED);
            }
            i++;
        }else if(start){
            button7.setLabel("Dia "+i+"");
           
            if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
                jPanel8.setBackground(Color.GREEN);
            }else{
                jPanel8.setBackground(Color.RED);
            }
            i++;
        }else{
            jPanel8.setBackground(Color.RED);
            button7.setLabel("----------");
        } //Terça-Feira
        if(z.firstDay.equalsIgnoreCase("Quarta-Feira")&& !start){
            button9.setLabel("Dia "+i+"");
            
            start = true;
            if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
                jPanel10.setBackground(Color.GREEN);
            }else{
                jPanel10.setBackground(Color.RED);
            }
            i++;
        }else if(start){
            button9.setLabel("Dia "+i+"");
            
            if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
                jPanel10.setBackground(Color.GREEN);
            }else{
                jPanel10.setBackground(Color.RED);
            }
            i++;
        }else{
            jPanel10.setBackground(Color.RED);
            button9.setLabel("----------");
        }//Quarta-Feira
        if(z.firstDay.equalsIgnoreCase("Quinta-Feira")&& !start){
            button4.setLabel("Dia "+i+"");
            
            start = true;
            if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
                jPanel5.setBackground(Color.GREEN);
            }else{
                jPanel5.setBackground(Color.RED);
            }
            i++;
        }else if(start){
            button4.setLabel("Dia "+i+"");
            
            if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
                jPanel5.setBackground(Color.GREEN);
            }else{
                jPanel5.setBackground(Color.RED);
            }
            i++;
        }else{
            jPanel5.setBackground(Color.RED);
            button4.setLabel("----------");
        } //Quinta-Feira
        if(z.firstDay.equalsIgnoreCase("Sexta-Feira")&& !start){
            button8.setLabel("Dia "+i+"");
            
            start = true;
            if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
                jPanel9.setBackground(Color.GREEN);
            }else{
                jPanel9.setBackground(Color.RED);
            }
            i++;
        }else if(start){
            button8.setLabel("Dia "+i+"");
            
            if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
                jPanel9.setBackground(Color.GREEN);
            }else{
                jPanel9.setBackground(Color.RED);
            }
            i++;
        }else{
            jPanel9.setBackground(Color.RED);
            button8.setLabel("----------");
        } //Sexta-Feira
        if(z.firstDay.equalsIgnoreCase("Sábado")&& !start){
            button6.setLabel("Dia "+i+"");
            
            start = true;
            if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
                jPanel7.setBackground(Color.GREEN);
            }else{
                jPanel7.setBackground(Color.RED);
            }
            i++;
        }else if(start){
            button6.setLabel("Dia "+i+"");
            
            if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
                jPanel7.setBackground(Color.GREEN);
            }else{
                jPanel7.setBackground(Color.RED);
            }
            i++;
        }else{
            jPanel7.setBackground(Color.RED);
            button6.setLabel("----------");
        } //Sábado
        button3.setLabel("Dia "+i+"");
        if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
            jPanel4.setBackground(Color.GREEN);
        }else{
                jPanel4.setBackground(Color.RED);
            }
        i++;
        button11.setLabel("Dia "+i+"");
        if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
            jPanel12.setBackground(Color.GREEN);
        }else{
                jPanel12.setBackground(Color.RED);
            }
        i++;
        button12.setLabel("Dia "+i+"");
        if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
            jPanel13.setBackground(Color.GREEN);
        }else{
                jPanel13.setBackground(Color.RED);
            }
        i++;
        button2.setLabel("Dia "+i+"");
        if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
            jPanel3.setBackground(Color.GREEN);
        }else{
                jPanel3.setBackground(Color.RED);
            }
        i++;
        button10.setLabel("Dia "+i+"");
        if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
            jPanel11.setBackground(Color.GREEN);
        }else{
                jPanel11.setBackground(Color.RED);
            }
        i++;
        button13.setLabel("Dia "+i+"");
        if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
            jPanel14.setBackground(Color.GREEN);
        }else{
                jPanel14.setBackground(Color.RED);
            }
        i++;
        button15.setLabel("Dia "+i+"");
        if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
            jPanel16.setBackground(Color.GREEN);
        }else{
                jPanel16.setBackground(Color.RED);
            }
        i++;
        button16.setLabel("Dia " +i+"");
        if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
            jPanel17.setBackground(Color.GREEN);
        }else{
                jPanel17.setBackground(Color.RED);
            }
        i++;
        button14.setLabel("Dia "+i+"");
        if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
            jPanel15.setBackground(Color.GREEN);
        }else{
                jPanel15.setBackground(Color.RED);
            }
        i++;
        button18.setLabel("Dia "+i+"");
        if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
            jPanel19.setBackground(Color.GREEN);
        }else{
                jPanel19.setBackground(Color.RED);
            }
        i++;
        button19.setLabel("Dia "+i+"");
        if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
            jPanel20.setBackground(Color.GREEN);
        }else{
                jPanel20.setBackground(Color.RED);
            }
        i++;
        button20.setLabel("Dia "+i+"");
        if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
            jPanel21.setBackground(Color.GREEN);
        }else{
                jPanel21.setBackground(Color.RED);
            }
        i++;
        button21.setLabel("Dia "+i+"");
        if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
            jPanel22.setBackground(Color.GREEN);
        }else{
                jPanel22.setBackground(Color.RED);
            }
        i++;
        button22.setLabel("Dia "+i+"");
        if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
            jPanel23.setBackground(Color.GREEN);
        }else{
                jPanel23.setBackground(Color.RED);
            }
        i++;
        button17.setLabel("Dia "+i+"");
        if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
            jPanel18.setBackground(Color.GREEN);
        }else{
                jPanel18.setBackground(Color.RED);
            }
        i++;
        button23.setLabel("Dia "+i+"");
        if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
            jPanel24.setBackground(Color.GREEN);
        }else{
                jPanel24.setBackground(Color.RED);
            }
        i++;
        button24.setLabel("Dia "+i+"");
        if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
            jPanel25.setBackground(Color.GREEN);
        }else{
                jPanel25.setBackground(Color.RED);
            }
        i++;
        button25.setLabel("Dia "+i+"");
        if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
            jPanel26.setBackground(Color.GREEN);
        }else{
                jPanel26.setBackground(Color.RED);
            }
        i++;
        if(i<=z.mesL){
            button26.setLabel("Dia "+i+"");
            if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
                jPanel27.setBackground(Color.GREEN);
            }else{
                jPanel27.setBackground(Color.RED);
                
            }
        }else{
            jPanel27.setBackground(Color.RED);
            button26.setLabel("----------");
        }
        i++;
        if(i<=z.mesL){
            button27.setLabel("Dia "+i+"");
            if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
                jPanel28.setBackground(Color.GREEN);
            }else{
                jPanel28.setBackground(Color.RED);
                
            }
        }else{
            jPanel28.setBackground(Color.RED);
             button27.setLabel("----------");
        }
        i++;
        if(i<=z.mesL){
            button28.setLabel("Dia "+i+"");
            if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
                jPanel29.setBackground(Color.GREEN);
            }else{
                jPanel29.setBackground(Color.RED);
            }
        }else{
            jPanel29.setBackground(Color.RED);
            button28.setLabel("----------");
        }
        i++;
        if(i<=z.mesL){
            button29.setLabel("Dia "+i+"");
            if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
                jPanel30.setBackground(Color.GREEN);
            }else{
                jPanel30.setBackground(Color.RED);
            }
        }else{
            jPanel30.setBackground(Color.RED);
            button29.setLabel("----------");
        }
        i++;
        if(i<=z.mesL){
            button30.setLabel("Dia "+i+"");
            if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
                jPanel31.setBackground(Color.GREEN);
            }else{
                jPanel31.setBackground(Color.RED);
            }
        }else{
            jPanel31.setBackground(Color.RED);
            button30.setLabel("----------");
        }
        i++;
        if(i<z.mesL){
            button31.setLabel("Dia "+i+"");
            if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
                jPanel32.setBackground(Color.GREEN);
            }else{
                jPanel32.setBackground(Color.RED);
            }
        }else{
            jPanel32.setBackground(Color.RED);
            button31.setLabel("----------");
        }
        i++;
        if(i<=z.mesL){
            button32.setLabel("Dia "+i+"");
            if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
                jPanel33.setBackground(Color.GREEN);
            }else{
                jPanel33.setBackground(Color.RED);
            }
        }else{
            jPanel33.setBackground(Color.RED);
            button32.setLabel("----------");
        }
        i++;
        if(i<=z.mesL){
            button33.setLabel("Dia "+i+"");
            if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
                jPanel34.setBackground(Color.GREEN);
            }else{
                jPanel34.setBackground(Color.RED);
            }
        }else{
            jPanel34.setBackground(Color.RED);
            button33.setLabel("----------");
        }
        i++;
        if(i<=z.mesL){
            button34.setLabel("Dia "+i+"");
            if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
                jPanel35.setBackground(Color.GREEN);
            }else{
                jPanel35.setBackground(Color.RED);
            }
        }else{
            button34.setLabel("----------");
            jPanel35.setBackground(Color.RED);
        }
        i++;
        if(i<=z.mesL){
            button35.setLabel("Dia "+i+"");
            if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
                jPanel36.setBackground(Color.GREEN);
            }else{
                jPanel36.setBackground(Color.RED);
            }
        }else{
            jPanel36.setBackground(Color.RED);
            button35.setLabel("----------");
        }
        i++;
        if(i<=z.mesL){
            button36.setLabel("Dia "+i+"");
            if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
                jPanel1.setBackground(Color.GREEN);
            }else{
                jPanel1.setBackground(Color.RED);
            }
        }else{
            jPanel1.setBackground(Color.RED);
            button36.setLabel("----------");
        }
        i++;
        if(i<=z.mesL){
            button37.setLabel("Dia "+i+"");
            if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
                jPanel39.setBackground(Color.GREEN);
            }else{
                jPanel39.setBackground(Color.RED);
            }
        }else{
            jPanel39.setBackground(Color.RED);
            button37.setLabel("----------");
        }
        i++;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame2 = new javax.swing.JInternalFrame();
        jPanel2 = new javax.swing.JPanel();
        button1 = new java.awt.Button();
        jPanel3 = new javax.swing.JPanel();
        button2 = new java.awt.Button();
        jPanel4 = new javax.swing.JPanel();
        button3 = new java.awt.Button();
        jPanel5 = new javax.swing.JPanel();
        button4 = new java.awt.Button();
        jPanel6 = new javax.swing.JPanel();
        button5 = new java.awt.Button();
        jPanel7 = new javax.swing.JPanel();
        button6 = new java.awt.Button();
        jPanel8 = new javax.swing.JPanel();
        button7 = new java.awt.Button();
        jPanel9 = new javax.swing.JPanel();
        button8 = new java.awt.Button();
        jPanel10 = new javax.swing.JPanel();
        button9 = new java.awt.Button();
        jPanel11 = new javax.swing.JPanel();
        button10 = new java.awt.Button();
        jPanel12 = new javax.swing.JPanel();
        button11 = new java.awt.Button();
        jPanel13 = new javax.swing.JPanel();
        button12 = new java.awt.Button();
        jPanel14 = new javax.swing.JPanel();
        button13 = new java.awt.Button();
        jPanel15 = new javax.swing.JPanel();
        button14 = new java.awt.Button();
        jPanel16 = new javax.swing.JPanel();
        button15 = new java.awt.Button();
        jPanel17 = new javax.swing.JPanel();
        button16 = new java.awt.Button();
        jPanel18 = new javax.swing.JPanel();
        button17 = new java.awt.Button();
        jPanel19 = new javax.swing.JPanel();
        button18 = new java.awt.Button();
        jPanel20 = new javax.swing.JPanel();
        button19 = new java.awt.Button();
        jPanel21 = new javax.swing.JPanel();
        button20 = new java.awt.Button();
        jPanel22 = new javax.swing.JPanel();
        button21 = new java.awt.Button();
        jPanel23 = new javax.swing.JPanel();
        button22 = new java.awt.Button();
        jPanel24 = new javax.swing.JPanel();
        button23 = new java.awt.Button();
        jPanel25 = new javax.swing.JPanel();
        button24 = new java.awt.Button();
        jPanel26 = new javax.swing.JPanel();
        button25 = new java.awt.Button();
        jPanel27 = new javax.swing.JPanel();
        button26 = new java.awt.Button();
        jPanel28 = new javax.swing.JPanel();
        button27 = new java.awt.Button();
        jPanel29 = new javax.swing.JPanel();
        button28 = new java.awt.Button();
        jPanel30 = new javax.swing.JPanel();
        button29 = new java.awt.Button();
        jPanel31 = new javax.swing.JPanel();
        button30 = new java.awt.Button();
        jPanel32 = new javax.swing.JPanel();
        button31 = new java.awt.Button();
        jPanel33 = new javax.swing.JPanel();
        button32 = new java.awt.Button();
        jPanel34 = new javax.swing.JPanel();
        button33 = new java.awt.Button();
        jPanel35 = new javax.swing.JPanel();
        button34 = new java.awt.Button();
        jPanel36 = new javax.swing.JPanel();
        button35 = new java.awt.Button();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        button36 = new java.awt.Button();
        jPanel37 = new javax.swing.JPanel();
        jPanel39 = new javax.swing.JPanel();
        button37 = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jInternalFrame2.setVisible(true);

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));
        jPanel2.setMaximumSize(new java.awt.Dimension(77, 69));

        button1.setLabel("button1");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 153, 153));
        jPanel3.setMaximumSize(new java.awt.Dimension(77, 69));

        button2.setLabel("button1");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 153, 153));
        jPanel4.setMaximumSize(new java.awt.Dimension(77, 69));

        button3.setLabel("button1");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 153, 153));
        jPanel5.setMaximumSize(new java.awt.Dimension(77, 69));

        button4.setLabel("button1");
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 153, 153));
        jPanel6.setMaximumSize(new java.awt.Dimension(77, 69));

        button5.setLabel("button1");
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(255, 153, 153));
        jPanel7.setMaximumSize(new java.awt.Dimension(77, 69));

        button6.setLabel("button1");
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(255, 153, 153));
        jPanel8.setMaximumSize(new java.awt.Dimension(77, 69));

        button7.setLabel("button1");
        button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(255, 153, 153));
        jPanel9.setMaximumSize(new java.awt.Dimension(77, 69));

        button8.setLabel("button1");
        button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(255, 153, 153));
        jPanel10.setMaximumSize(new java.awt.Dimension(77, 69));

        button9.setLabel("button1");
        button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(button9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel11.setBackground(new java.awt.Color(255, 153, 153));
        jPanel11.setMaximumSize(new java.awt.Dimension(77, 69));

        button10.setLabel("button1");
        button10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(button10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel12.setBackground(new java.awt.Color(255, 153, 153));
        jPanel12.setMaximumSize(new java.awt.Dimension(77, 69));

        button11.setLabel("button1");
        button11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(button11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel13.setBackground(new java.awt.Color(255, 153, 153));
        jPanel13.setMaximumSize(new java.awt.Dimension(77, 69));

        button12.setLabel("button1");
        button12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(button12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel14.setBackground(new java.awt.Color(255, 153, 153));
        jPanel14.setMaximumSize(new java.awt.Dimension(77, 69));

        button13.setLabel("button1");
        button13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(button13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel15.setBackground(new java.awt.Color(255, 153, 153));
        jPanel15.setMaximumSize(new java.awt.Dimension(77, 69));

        button14.setLabel("button1");
        button14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(button14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel16.setBackground(new java.awt.Color(255, 153, 153));
        jPanel16.setMaximumSize(new java.awt.Dimension(77, 69));

        button15.setLabel("button1");
        button15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(button15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel17.setBackground(new java.awt.Color(255, 153, 153));
        jPanel17.setMaximumSize(new java.awt.Dimension(77, 69));

        button16.setLabel("button1");
        button16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(button16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel18.setBackground(new java.awt.Color(255, 153, 153));
        jPanel18.setMaximumSize(new java.awt.Dimension(77, 69));

        button17.setLabel("button1");
        button17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button17ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(button17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel19.setBackground(new java.awt.Color(255, 153, 153));
        jPanel19.setMaximumSize(new java.awt.Dimension(77, 69));

        button18.setLabel("button1");
        button18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button18ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(button18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel20.setBackground(new java.awt.Color(255, 153, 153));
        jPanel20.setMaximumSize(new java.awt.Dimension(77, 69));

        button19.setLabel("button1");
        button19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button19ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(button19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel21.setBackground(new java.awt.Color(255, 153, 153));
        jPanel21.setMaximumSize(new java.awt.Dimension(77, 69));

        button20.setLabel("button1");
        button20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button20ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(button20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel22.setBackground(new java.awt.Color(255, 153, 153));
        jPanel22.setMaximumSize(new java.awt.Dimension(77, 69));

        button21.setLabel("button1");
        button21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button21ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(button21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel23.setBackground(new java.awt.Color(255, 153, 153));
        jPanel23.setMaximumSize(new java.awt.Dimension(77, 69));

        button22.setLabel("button1");
        button22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button22ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(button22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel24.setBackground(new java.awt.Color(255, 153, 153));
        jPanel24.setMaximumSize(new java.awt.Dimension(77, 69));

        button23.setLabel("button1");
        button23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button23ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(button23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel25.setBackground(new java.awt.Color(255, 153, 153));
        jPanel25.setMaximumSize(new java.awt.Dimension(77, 69));

        button24.setLabel("button1");
        button24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button24ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(button24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel26.setBackground(new java.awt.Color(255, 153, 153));
        jPanel26.setMaximumSize(new java.awt.Dimension(77, 69));

        button25.setLabel("button1");
        button25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button25ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(button25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel27.setBackground(new java.awt.Color(255, 153, 153));
        jPanel27.setMaximumSize(new java.awt.Dimension(77, 69));

        button26.setLabel("button1");
        button26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button26ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(button26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel28.setBackground(new java.awt.Color(255, 153, 153));
        jPanel28.setMaximumSize(new java.awt.Dimension(77, 69));

        button27.setLabel("button1");
        button27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button27ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(button27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel29.setBackground(new java.awt.Color(255, 153, 153));
        jPanel29.setMaximumSize(new java.awt.Dimension(77, 69));

        button28.setLabel("button1");
        button28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button28ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(button28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel30.setBackground(new java.awt.Color(255, 153, 153));
        jPanel30.setMaximumSize(new java.awt.Dimension(77, 69));

        button29.setLabel("button1");
        button29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button29ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(button29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel31.setBackground(new java.awt.Color(255, 153, 153));
        jPanel31.setMaximumSize(new java.awt.Dimension(77, 69));

        button30.setLabel("button1");
        button30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button30ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(button30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel32.setBackground(new java.awt.Color(255, 153, 153));
        jPanel32.setMaximumSize(new java.awt.Dimension(77, 69));

        button31.setLabel("button1");
        button31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button31ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(button31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel33.setBackground(new java.awt.Color(255, 153, 153));
        jPanel33.setMaximumSize(new java.awt.Dimension(77, 69));

        button32.setLabel("button1");
        button32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button32ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(button32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel34.setBackground(new java.awt.Color(255, 153, 153));
        jPanel34.setMaximumSize(new java.awt.Dimension(77, 69));

        button33.setLabel("button1");
        button33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button33ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(button33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel35.setBackground(new java.awt.Color(255, 153, 153));
        jPanel35.setMaximumSize(new java.awt.Dimension(77, 69));

        button34.setLabel("button1");
        button34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button34ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(button34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel36.setBackground(new java.awt.Color(255, 153, 153));
        jPanel36.setMaximumSize(new java.awt.Dimension(77, 69));

        button35.setLabel("button1");
        button35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button35ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(button35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jLabel1.setText("Ano");

        jButton1.setText("Seguinte");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Anterior");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Mes");

        jButton3.setText("Seguinte");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Anterior");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel3.setText("Domingo");

        jLabel4.setText("Segunda");

        jLabel5.setText("Terça");

        jLabel6.setText("Quarta");

        jLabel7.setText("Quinta");

        jLabel8.setText("Sexta");

        jLabel9.setText("Sabado");

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setMaximumSize(new java.awt.Dimension(77, 69));

        button36.setLabel("button36");
        button36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button36ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button36, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(button36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 69, Short.MAX_VALUE)
        );

        jPanel39.setBackground(new java.awt.Color(255, 204, 204));
        jPanel39.setMaximumSize(new java.awt.Dimension(77, 69));

        button37.setLabel("button36");
        button37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button37ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button37, javax.swing.GroupLayout.PREFERRED_SIZE, 57, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(button37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2)
                            .addComponent(jButton4)))
                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel4)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                        .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3))
                            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel8)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel9)
                        .addGap(31, 31, 31))))
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                        .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                        .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                        .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame2Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel30, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel37, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5))))
                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                        .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                        .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                        .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                        .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                        .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                        .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jInternalFrame2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 151, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        z.prevMonth();
        z.updateDays();
        atualizaTudo();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        z.nextMonth();
        z.updateDays();
        atualizaTudo();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        z.prevYear();
        z.updateDays();
        atualizaTudo();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        z.nextYear();
        z.updateDays();
        atualizaTudo();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
        if(button1.getLabel().equalsIgnoreCase("----------"))return;
        int meses = z.mes+1;
        String n = button1.getLabel().split(" ")[1];
        int number = Integer.parseInt(n);
        if(number<10)n = "0"+number;
        Record r = new Record(""+z.ano+"-"+meses+"-"+n);
        r.setVisible(true);
        r.setResizable(false);
        r.run2();
        atualizaTudo();
    }//GEN-LAST:event_button1ActionPerformed

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
        // TODO add your handling code here:
        if(button5.getLabel().equalsIgnoreCase("----------"))return;
        int meses = z.mes+1;
        String n = button5.getLabel().split(" ")[1];
        int number = Integer.parseInt(n);
        if(number<10)n = "0"+number;
        Record r = new Record(""+z.ano+"-"+meses+"-"+n);
        r.setVisible(true);
        r.setResizable(false);
        r.run2();
        atualizaTudo();
    }//GEN-LAST:event_button5ActionPerformed

    private void button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button7ActionPerformed
        // TODO add your handling code here:
        if(button7.getLabel().equalsIgnoreCase("----------"))return;
        int meses = z.mes+1;
        String n = button7.getLabel().split(" ")[1];
        int number = Integer.parseInt(n);
        if(number<10)n = "0"+number;
        Record r = new Record(""+z.ano+"-"+meses+"-"+n);
        r.setVisible(true);
        r.setResizable(false);
        r.run2();
        atualizaTudo();
    }//GEN-LAST:event_button7ActionPerformed

    private void button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button9ActionPerformed
        // TODO add your handling code here:
        if(button9.getLabel().equalsIgnoreCase("----------"))return;
        int meses = z.mes+1;
        String n = button9.getLabel().split(" ")[1];
        int number = Integer.parseInt(n);
        if(number<10)n = "0"+number;
        Record r = new Record(""+z.ano+"-"+meses+"-"+n);
        r.setVisible(true);
        r.setResizable(false);
        r.run2();
        atualizaTudo();        
    }//GEN-LAST:event_button9ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        // TODO add your handling code here:
        if(button4.getLabel().equalsIgnoreCase("----------"))return;
        int meses = z.mes+1;
        String n = button4.getLabel().split(" ")[1];
        int number = Integer.parseInt(n);
        if(number<10)n = "0"+number;
        Record r = new Record(""+z.ano+"-"+meses+"-"+n);
        r.setVisible(true);
        r.setResizable(false);
        r.run2();
        atualizaTudo();        
    }//GEN-LAST:event_button4ActionPerformed

    private void button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button8ActionPerformed
        // TODO add your handling code here:
        if(button8.getLabel().equalsIgnoreCase("----------"))return;
        int meses = z.mes+1;
        String n = button8.getLabel().split(" ")[1];
        int number = Integer.parseInt(n);
        if(number<10)n = "0"+number;
        Record r = new Record(""+z.ano+"-"+meses+"-"+n);
        r.setVisible(true);
        r.setResizable(false);
        r.run2();
        atualizaTudo();         
    }//GEN-LAST:event_button8ActionPerformed

    private void button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button6ActionPerformed
        // TODO add your handling code here:
        if(button6.getLabel().equalsIgnoreCase("----------"))return;
        int meses = z.mes+1;
        String n = button6.getLabel().split(" ")[1];
        int number = Integer.parseInt(n);
        if(number<10)n = "0"+number;
        Record r = new Record(""+z.ano+"-"+meses+"-"+n);
        r.setVisible(true);
        r.setResizable(false);
        r.run2();
        atualizaTudo(); 
    }//GEN-LAST:event_button6ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        // TODO add your handling code here:
        if(button3.getLabel().equalsIgnoreCase("----------"))return;
        int meses = z.mes+1;
        String n = button3.getLabel().split(" ")[1];
        int number = Integer.parseInt(n);
        if(number<10)n = "0"+number;
        Record r = new Record(""+z.ano+"-"+meses+"-"+n);
        r.setVisible(true);
        r.setResizable(false);
        r.run2();
        atualizaTudo(); 
    }//GEN-LAST:event_button3ActionPerformed

    private void button11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button11ActionPerformed
        // TODO add your handling code here:
        if(button11.getLabel().equalsIgnoreCase("----------"))return;
        int meses = z.mes+1;
        String n = button11.getLabel().split(" ")[1];
        int number = Integer.parseInt(n);
        if(number<10)n = "0"+number;
        Record r = new Record(""+z.ano+"-"+meses+"-"+n);
        r.setVisible(true);
        r.setResizable(false);
        r.run2();
        atualizaTudo();         
    }//GEN-LAST:event_button11ActionPerformed

    private void button12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button12ActionPerformed
        // TODO add your handling code here:
        if(button12.getLabel().equalsIgnoreCase("----------"))return;
        int meses = z.mes+1;
        String n = button12.getLabel().split(" ")[1];
        int number = Integer.parseInt(n);
        if(number<10)n = "0"+number;
        Record r = new Record(""+z.ano+"-"+meses+"-"+n);
        r.setVisible(true);
        r.setResizable(false);
        r.run2();
        atualizaTudo(); 
    }//GEN-LAST:event_button12ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        // TODO add your handling code here:
        if(button2.getLabel().equalsIgnoreCase("----------"))return;
        int meses = z.mes+1;
        String n = button2.getLabel().split(" ")[1];
        int number = Integer.parseInt(n);
        if(number<10)n = "0"+number;
        Record r = new Record(""+z.ano+"-"+meses+"-"+n);
        r.setVisible(true);
        r.setResizable(false);
        r.run2();
        atualizaTudo(); 
    }//GEN-LAST:event_button2ActionPerformed

    private void button10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button10ActionPerformed
        // TODO add your handling code here:
        if(button10.getLabel().equalsIgnoreCase("----------"))return;
        int meses = z.mes+1;
        String n = button10.getLabel().split(" ")[1];
        int number = Integer.parseInt(n);
        if(number<10)n = "0"+number;
        Record r = new Record(""+z.ano+"-"+meses+"-"+n);
        r.setVisible(true);
        r.setResizable(false);
        r.run2();
        atualizaTudo(); 
    }//GEN-LAST:event_button10ActionPerformed

    private void button13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button13ActionPerformed
        // TODO add your handling code here:
        if(button13.getLabel().equalsIgnoreCase("----------"))return;
        int meses = z.mes+1;
        String n = button13.getLabel().split(" ")[1];
        int number = Integer.parseInt(n);
        if(number<10)n = "0"+number;
        Record r = new Record(""+z.ano+"-"+meses+"-"+n);
        r.setVisible(true);
        r.setResizable(false);
        r.run2();
        atualizaTudo(); 
    }//GEN-LAST:event_button13ActionPerformed

    private void button15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button15ActionPerformed
        // TODO add your handling code here:
        if(button15.getLabel().equalsIgnoreCase("----------"))return;
        int meses = z.mes+1;
        String n = button15.getLabel().split(" ")[1];
        int number = Integer.parseInt(n);
        if(number<10)n = "0"+number;
        Record r = new Record(""+z.ano+"-"+meses+"-"+n);
        r.setVisible(true);
        r.setResizable(false);
        r.run2();
        atualizaTudo();         
    }//GEN-LAST:event_button15ActionPerformed

    private void button16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button16ActionPerformed
        // TODO add your handling code here:
        if(button16.getLabel().equalsIgnoreCase("----------"))return;
        int meses = z.mes+1;
        String n = button16.getLabel().split(" ")[1];
        int number = Integer.parseInt(n);
        if(number<10)n = "0"+number;
        Record r = new Record(""+z.ano+"-"+meses+"-"+n);
        r.setVisible(true);
        r.setResizable(false);
        r.run2();
        atualizaTudo(); 
    }//GEN-LAST:event_button16ActionPerformed

    private void button14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button14ActionPerformed
        // TODO add your handling code here:
        if(button14.getLabel().equalsIgnoreCase("----------"))return;
        int meses = z.mes+1;
        String n = button14.getLabel().split(" ")[1];
        int number = Integer.parseInt(n);
        if(number<10)n = "0"+number;
        Record r = new Record(""+z.ano+"-"+meses+"-"+n);
        r.setVisible(true);
        r.setResizable(false);
        r.run2();
        atualizaTudo();         
    }//GEN-LAST:event_button14ActionPerformed

    private void button18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button18ActionPerformed
        // TODO add your handling code here:
        if(button18.getLabel().equalsIgnoreCase("----------"))return;
        int meses = z.mes+1;
        String n = button18.getLabel().split(" ")[1];
        int number = Integer.parseInt(n);
        if(number<10)n = "0"+number;
        Record r = new Record(""+z.ano+"-"+meses+"-"+n);
        r.setVisible(true);
        r.setResizable(false);
        r.run2();
        atualizaTudo();         
    }//GEN-LAST:event_button18ActionPerformed

    private void button19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button19ActionPerformed
        // TODO add your handling code here:
        if(button19.getLabel().equalsIgnoreCase("----------"))return;
        int meses = z.mes+1;
        String n = button19.getLabel().split(" ")[1];
        int number = Integer.parseInt(n);
        if(number<10)n = "0"+number;
        Record r = new Record(""+z.ano+"-"+meses+"-"+n);
        r.setVisible(true);
        r.setResizable(false);
        r.run2();
        atualizaTudo();          
    }//GEN-LAST:event_button19ActionPerformed

    private void button20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button20ActionPerformed
        // TODO add your handling code here:
        if(button20.getLabel().equalsIgnoreCase("----------"))return;
        int meses = z.mes+1;
        String n = button20.getLabel().split(" ")[1];
        int number = Integer.parseInt(n);
        if(number<10)n = "0"+number;
        Record r = new Record(""+z.ano+"-"+meses+"-"+n);
        r.setVisible(true);
        r.setResizable(false);
        r.run2();
        atualizaTudo();          
    }//GEN-LAST:event_button20ActionPerformed

    private void button21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button21ActionPerformed
        // TODO add your handling code here:
        if(button21.getLabel().equalsIgnoreCase("----------"))return;
        int meses = z.mes+1;
        String n = button21.getLabel().split(" ")[1];
        int number = Integer.parseInt(n);
        if(number<10)n = "0"+number;
        Record r = new Record(""+z.ano+"-"+meses+"-"+n);
        r.setVisible(true);
        r.setResizable(false);
        r.run2();
        atualizaTudo();          
    }//GEN-LAST:event_button21ActionPerformed

    private void button22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button22ActionPerformed
        // TODO add your handling code here:
        if(button22.getLabel().equalsIgnoreCase("----------"))return;
        int meses = z.mes+1;
        String n = button22.getLabel().split(" ")[1];
        int number = Integer.parseInt(n);
        if(number<10)n = "0"+number;
        Record r = new Record(""+z.ano+"-"+meses+"-"+n);
        r.setVisible(true);
        r.setResizable(false);
        r.run2();
        atualizaTudo();          
    }//GEN-LAST:event_button22ActionPerformed

    private void button17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button17ActionPerformed
        // TODO add your handling code here:
        if(button17.getLabel().equalsIgnoreCase("----------"))return;
        int meses = z.mes+1;
        String n = button17.getLabel().split(" ")[1];
        int number = Integer.parseInt(n);
        if(number<10)n = "0"+number;
        Record r = new Record(""+z.ano+"-"+meses+"-"+n);
        r.setVisible(true);
        r.setResizable(false);
        r.run2();
        atualizaTudo();          
    }//GEN-LAST:event_button17ActionPerformed

    private void button23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button23ActionPerformed
        // TODO add your handling code here:
        if(button23.getLabel().equalsIgnoreCase("----------"))return;
        int meses = z.mes+1;
        String n = button23.getLabel().split(" ")[1];
        int number = Integer.parseInt(n);
        if(number<10)n = "0"+number;
        Record r = new Record(""+z.ano+"-"+meses+"-"+n);
        r.setVisible(true);
        r.setResizable(false);
        r.run2();
        atualizaTudo();          
    }//GEN-LAST:event_button23ActionPerformed

    private void button24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button24ActionPerformed
        // TODO add your handling code here:
        if(button24.getLabel().equalsIgnoreCase("----------"))return;
        int meses = z.mes+1;
        String n = button24.getLabel().split(" ")[1];
        int number = Integer.parseInt(n);
        if(number<10)n = "0"+number;
        Record r = new Record(""+z.ano+"-"+meses+"-"+n);
        r.setVisible(true);
        r.setResizable(false);
        r.run2();
        atualizaTudo();          
    }//GEN-LAST:event_button24ActionPerformed

    private void button25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button25ActionPerformed
        // TODO add your handling code here:
        if(button25.getLabel().equalsIgnoreCase("----------"))return;
        int meses = z.mes+1;
        String n = button25.getLabel().split(" ")[1];
        int number = Integer.parseInt(n);
        if(number<10)n = "0"+number;
        Record r = new Record(""+z.ano+"-"+meses+"-"+n);
        r.setVisible(true);
        r.setResizable(false);
        r.run2();
        atualizaTudo();          
    }//GEN-LAST:event_button25ActionPerformed

    private void button26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button26ActionPerformed
        // TODO add your handling code here:
        if(button26.getLabel().equalsIgnoreCase("----------"))return;
        int meses = z.mes+1;
        String n = button26.getLabel().split(" ")[1];
        int number = Integer.parseInt(n);
        if(number<10)n = "0"+number;
        Record r = new Record(""+z.ano+"-"+meses+"-"+n);
        r.setVisible(true);
        r.setResizable(false);
        r.run2();
        atualizaTudo();          
    }//GEN-LAST:event_button26ActionPerformed

    private void button27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button27ActionPerformed
        // TODO add your handling code here:
        if(button27.getLabel().equalsIgnoreCase("----------"))return;
        int meses = z.mes+1;
        String n = button27.getLabel().split(" ")[1];
        int number = Integer.parseInt(n);
        if(number<10)n = "0"+number;
        Record r = new Record(""+z.ano+"-"+meses+"-"+n);
        r.setVisible(true);
        r.setResizable(false);
        r.run2();
        atualizaTudo();          
    }//GEN-LAST:event_button27ActionPerformed

    private void button28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button28ActionPerformed
        // TODO add your handling code here:
        if(button28.getLabel().equalsIgnoreCase("----------"))return;
        int meses = z.mes+1;
        String n = button28.getLabel().split(" ")[1];
        int number = Integer.parseInt(n);
        if(number<10)n = "0"+number;
        Record r = new Record(""+z.ano+"-"+meses+"-"+n);
        r.setVisible(true);
        r.setResizable(false);
        r.run2();
        atualizaTudo();          
    }//GEN-LAST:event_button28ActionPerformed

    private void button29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button29ActionPerformed
        // TODO add your handling code here:
        if(button29.getLabel().equalsIgnoreCase("----------"))return;
        int meses = z.mes+1;
        String n = button29.getLabel().split(" ")[1];
        int number = Integer.parseInt(n);
        if(number<10)n = "0"+number;
        Record r = new Record(""+z.ano+"-"+meses+"-"+n);
        r.setVisible(true);
        r.setResizable(false);
        r.run2();
        atualizaTudo();          
    }//GEN-LAST:event_button29ActionPerformed

    private void button30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button30ActionPerformed
        // TODO add your handling code here:
        if(button30.getLabel().equalsIgnoreCase("----------"))return;
        int meses = z.mes+1;
        String n = button30.getLabel().split(" ")[1];
        int number = Integer.parseInt(n);
        if(number<10)n = "0"+number;
        Record r = new Record(""+z.ano+"-"+meses+"-"+n);
        r.setVisible(true);
        r.setResizable(false);
        r.run2();
        atualizaTudo();         
    }//GEN-LAST:event_button30ActionPerformed

    private void button31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button31ActionPerformed
        // TODO add your handling code here:
        if(button31.getLabel().equalsIgnoreCase("----------"))return;
        int meses = z.mes+1;
        String n = button31.getLabel().split(" ")[1];
        int number = Integer.parseInt(n);
        if(number<10)n = "0"+number;
        Record r = new Record(""+z.ano+"-"+meses+"-"+n);
        r.setVisible(true);
        r.setResizable(false);
        r.run2();
        atualizaTudo();          
    }//GEN-LAST:event_button31ActionPerformed

    private void button32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button32ActionPerformed
        // TODO add your handling code here:
        if(button32.getLabel().equalsIgnoreCase("----------"))return;
        int meses = z.mes+1;
        String n = button32.getLabel().split(" ")[1];
        int number = Integer.parseInt(n);
        if(number<10)n = "0"+number;
        Record r = new Record(""+z.ano+"-"+meses+"-"+n);
        r.setVisible(true);
        r.setResizable(false);
        r.run2();
        atualizaTudo();          
    }//GEN-LAST:event_button32ActionPerformed

    private void button33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button33ActionPerformed
        // TODO add your handling code here:
        if(button33.getLabel().equalsIgnoreCase("----------"))return;
        int meses = z.mes+1;
        String n = button33.getLabel().split(" ")[1];
        int number = Integer.parseInt(n);
        if(number<10)n = "0"+number;
        Record r = new Record(""+z.ano+"-"+meses+"-"+n);
        r.setVisible(true);
        r.setResizable(false);
        r.run2();
        atualizaTudo();          
    }//GEN-LAST:event_button33ActionPerformed

    private void button34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button34ActionPerformed
        // TODO add your handling code here:
        if(button34.getLabel().equalsIgnoreCase("----------"))return;
        int meses = z.mes+1;
        String n = button34.getLabel().split(" ")[1];
        int number = Integer.parseInt(n);
        if(number<10)n = "0"+number;
        Record r = new Record(""+z.ano+"-"+meses+"-"+n);
        r.setVisible(true);
        r.setResizable(false);
        r.run2();
        atualizaTudo();          
    }//GEN-LAST:event_button34ActionPerformed

    private void button35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button35ActionPerformed
        // TODO add your handling code here:
        if(button35.getLabel().equalsIgnoreCase("----------"))return;
        int meses = z.mes+1;
        String n = button35.getLabel().split(" ")[1];
        int number = Integer.parseInt(n);
        if(number<10)n = "0"+number;
        Record r = new Record(""+z.ano+"-"+meses+"-"+n);
        r.setVisible(true);
        r.setResizable(false);
        r.run2();
        atualizaTudo();          
    }//GEN-LAST:event_button35ActionPerformed

    private void button36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button36ActionPerformed
        // TODO add your handling code here:
        if(button36.getLabel().equalsIgnoreCase("----------"))return;
        int meses = z.mes+1;
        String n = button36.getLabel().split(" ")[1];
        int number = Integer.parseInt(n);
        if(number<10)n = "0"+number;
        Record r = new Record(""+z.ano+"-"+meses+"-"+n);
        r.setVisible(true);
        r.setResizable(false);
        r.run2();
        atualizaTudo();          
    }//GEN-LAST:event_button36ActionPerformed

    private void button37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button37ActionPerformed
        // TODO add your handling code here:
        if(button37.getLabel().equalsIgnoreCase("----------"))return;
        int meses = z.mes+1;
        String n = button37.getLabel().split(" ")[1];
        int number = Integer.parseInt(n);
        if(number<10)n = "0"+number;
        Record r = new Record(""+z.ano+"-"+meses+"-"+n);
        r.setVisible(true);
        r.setResizable(false);
        r.run2();
        atualizaTudo();          
    }//GEN-LAST:event_button37ActionPerformed
    public void atualizaTudo(){
        z.updateDays();
        Database db= new Database();
        db.connect();
        jLabel1.setText(z.months[z.mes]);
        jLabel2.setText(""+z.ano);
        boolean start = false;
        int i = 1;
        int meses = z.mes+1;
        if(z.firstDay.equalsIgnoreCase("Domingo") && !start){
            button1.setLabel("Dia "+i+"");
            start = true;
            if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
                jPanel2.setBackground(Color.GREEN);
            }else{
                jPanel2.setBackground(Color.RED);
            }
            i++;
        }else{
            button1.setLabel("----------");
            jPanel2.setBackground(Color.RED);
        }//Domingo
        
        if(z.firstDay.equalsIgnoreCase("Segunda-Feira")&& !start){
            button5.setLabel("Dia "+i+"");
            start = true;
            if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
                jPanel6.setBackground(Color.GREEN);
            }else{
                jPanel6.setBackground(Color.RED);
            }
            i++;
        }else if(start){
            button5.setLabel("Dia "+i+"");
            
            if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
                jPanel6.setBackground(Color.GREEN);
            }else{
                jPanel6.setBackground(Color.RED);
            }
            i++;
        }else{
            button5.setLabel("----------");
        }//Segunda-Feira
        
        if(z.firstDay.equalsIgnoreCase("Terça-Feira")&& !start){
            button7.setLabel("Dia "+i+"");
            
            start = true;
            if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
                jPanel8.setBackground(Color.GREEN);
            }else{
                jPanel8.setBackground(Color.RED);
            }
            i++;
        }else if(start){
            button7.setLabel("Dia "+i+"");
           
            if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
                jPanel8.setBackground(Color.GREEN);
            }else{
                jPanel8.setBackground(Color.RED);
            }
            i++;
        }else{
            button7.setLabel("----------");
        } //Terça-Feira
        if(z.firstDay.equalsIgnoreCase("Quarta-Feira")&& !start){
            button9.setLabel("Dia "+i+"");
            
            start = true;
            if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
                jPanel10.setBackground(Color.GREEN);
            }else{
                jPanel10.setBackground(Color.RED);
            }
            i++;
        }else if(start){
            button9.setLabel("Dia "+i+"");
            
            if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
                jPanel10.setBackground(Color.GREEN);
            }else{
                jPanel10.setBackground(Color.RED);
            }
            i++;
        }else{
            button9.setLabel("----------");
        }//Quarta-Feira
        if(z.firstDay.equalsIgnoreCase("Quinta-Feira")&& !start){
            button4.setLabel("Dia "+i+"");
            
            start = true;
            if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
                jPanel5.setBackground(Color.GREEN);
            }else{
                jPanel5.setBackground(Color.RED);
            }
            i++;
        }else if(start){
            button4.setLabel("Dia "+i+"");
            
            if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
                jPanel5.setBackground(Color.GREEN);
            }else{
                jPanel5.setBackground(Color.RED);
            }
            i++;
        }else{
            button4.setLabel("----------");
        } //Quinta-Feira
        if(z.firstDay.equalsIgnoreCase("Sexta-Feira")&& !start){
            button8.setLabel("Dia "+i+"");
            
            start = true;
            if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
                jPanel9.setBackground(Color.GREEN);
            }else{
                jPanel9.setBackground(Color.RED);
            }
            i++;
        }else if(start){
            button8.setLabel("Dia "+i+"");
            
            if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
                jPanel9.setBackground(Color.GREEN);
            }else{
                jPanel9.setBackground(Color.RED);
            }
            i++;
        }else{
            button8.setLabel("----------");
        } //Sexta-Feira
        if(z.firstDay.equalsIgnoreCase("Sábado")&& !start){
            button6.setLabel("Dia "+i+"");
            
            start = true;
            if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
                jPanel7.setBackground(Color.GREEN);
            }else{
                jPanel7.setBackground(Color.RED);
            }
            i++;
        }else if(start){
            button6.setLabel("Dia "+i+"");
            
            if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
                jPanel7.setBackground(Color.GREEN);
            }else{
                jPanel7.setBackground(Color.RED);
            }
            i++;
        }else{
            button6.setLabel("----------");
        } //Sábado
        button3.setLabel("Dia "+i+"");
        if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
            jPanel4.setBackground(Color.GREEN);
        }else{
                jPanel4.setBackground(Color.RED);
            }
        i++;
        button11.setLabel("Dia "+i+"");
        if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
            jPanel12.setBackground(Color.GREEN);
        }else{
                jPanel12.setBackground(Color.RED);
            }
        i++;
        button12.setLabel("Dia "+i+"");
        if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
            jPanel13.setBackground(Color.GREEN);
        }else{
                jPanel13.setBackground(Color.RED);
            }
        i++;
        button2.setLabel("Dia "+i+"");
        if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
            jPanel3.setBackground(Color.GREEN);
        }else{
                jPanel3.setBackground(Color.RED);
            }
        i++;
        button10.setLabel("Dia "+i+"");
        if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
            jPanel11.setBackground(Color.GREEN);
        }else{
                jPanel11.setBackground(Color.RED);
            }
        i++;
        button13.setLabel("Dia "+i+"");
        if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
            jPanel14.setBackground(Color.GREEN);
        }else{
                jPanel14.setBackground(Color.RED);
            }
        i++;
        button15.setLabel("Dia "+i+"");
        if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
            jPanel16.setBackground(Color.GREEN);
        }else{
                jPanel16.setBackground(Color.RED);
            }
        i++;
        button16.setLabel("Dia " +i+"");
        if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
            jPanel17.setBackground(Color.GREEN);
        }else{
                jPanel17.setBackground(Color.RED);
            }
        i++;
        button14.setLabel("Dia "+i+"");
        if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
            jPanel15.setBackground(Color.GREEN);
        }else{
                jPanel15.setBackground(Color.RED);
            }
        i++;
        button18.setLabel("Dia "+i+"");
        if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
            jPanel19.setBackground(Color.GREEN);
        }else{
                jPanel19.setBackground(Color.RED);
            }
        i++;
        button19.setLabel("Dia "+i+"");
        if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
            jPanel20.setBackground(Color.GREEN);
        }else{
                jPanel20.setBackground(Color.RED);
            }
        i++;
        button20.setLabel("Dia "+i+"");
        if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
            jPanel21.setBackground(Color.GREEN);
        }else{
                jPanel21.setBackground(Color.RED);
            }
        i++;
        button21.setLabel("Dia "+i+"");
        if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
            jPanel22.setBackground(Color.GREEN);
        }else{
                jPanel22.setBackground(Color.RED);
            }
        i++;
        button22.setLabel("Dia "+i+"");
        if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
            jPanel23.setBackground(Color.GREEN);
        }else{
                jPanel23.setBackground(Color.RED);
            }
        i++;
        button17.setLabel("Dia "+i+"");
        if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
            jPanel18.setBackground(Color.GREEN);
        }else{
                jPanel18.setBackground(Color.RED);
            }
        i++;
        button23.setLabel("Dia "+i+"");
        if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
            jPanel24.setBackground(Color.GREEN);
        }else{
                jPanel24.setBackground(Color.RED);
            }
        i++;
        button24.setLabel("Dia "+i+"");
        if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
            jPanel25.setBackground(Color.GREEN);
        }else{
                jPanel25.setBackground(Color.RED);
            }
        i++;
        button25.setLabel("Dia "+i+"");
        if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
            jPanel26.setBackground(Color.GREEN);
        }else{
                jPanel26.setBackground(Color.RED);
            }
        i++;
        if(i<=z.mesL){
            button26.setLabel("Dia "+i+"");
            if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
                jPanel27.setBackground(Color.GREEN);
            }else{
                jPanel27.setBackground(Color.RED);
                
            }
        }else{
            jPanel27.setBackground(Color.RED);
            button26.setLabel("----------");
        }
        i++;
        if(i<=z.mesL){
            button27.setLabel("Dia "+i+"");
            if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
                jPanel28.setBackground(Color.GREEN);
            }else{
                jPanel28.setBackground(Color.RED);
                
            }
        }else{
            jPanel28.setBackground(Color.RED);
             button27.setLabel("----------");
        }
        i++;
        if(i<=z.mesL){
            button28.setLabel("Dia "+i+"");
            if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
                jPanel29.setBackground(Color.GREEN);
            }else{
                jPanel29.setBackground(Color.RED);
            }
        }else{
            jPanel29.setBackground(Color.RED);
            button28.setLabel("----------");
        }
        i++;
        if(i<=z.mesL){
            button29.setLabel("Dia "+i+"");
            if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
                jPanel30.setBackground(Color.GREEN);
            }else{
                jPanel30.setBackground(Color.RED);
            }
        }else{
            jPanel30.setBackground(Color.RED);
            button29.setLabel("----------");
        }
        i++;
        if(i<=z.mesL){
            button30.setLabel("Dia "+i+"");
            if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
                jPanel31.setBackground(Color.GREEN);
            }else{
                jPanel31.setBackground(Color.RED);
            }
        }else{
            jPanel31.setBackground(Color.RED);
            button30.setLabel("----------");
        }
        i++;
        if(i<z.mesL){
            button31.setLabel("Dia "+i+"");
            if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
                jPanel32.setBackground(Color.GREEN);
            }else{
                jPanel32.setBackground(Color.RED);
            }
        }else{
            jPanel32.setBackground(Color.RED);
            button31.setLabel("----------");
        }
        i++;
        if(i<=z.mesL){
            button32.setLabel("Dia "+i+"");
            if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
                jPanel33.setBackground(Color.GREEN);
            }else{
                jPanel33.setBackground(Color.RED);
            }
        }else{
            jPanel33.setBackground(Color.RED);
            button32.setLabel("----------");
        }
        i++;
        if(i<=z.mesL){
            button33.setLabel("Dia "+i+"");
            if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
                jPanel34.setBackground(Color.GREEN);
            }else{
                jPanel34.setBackground(Color.RED);
            }
        }else{
            jPanel34.setBackground(Color.RED);
            button33.setLabel("----------");
        }
        i++;
        if(i<=z.mesL){
            button34.setLabel("Dia "+i+"");
            if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
                jPanel35.setBackground(Color.GREEN);
            }else{
                jPanel35.setBackground(Color.RED);
            }
        }else{
            button34.setLabel("----------");
            jPanel35.setBackground(Color.RED);
        }
        i++;
        if(i<=z.mesL){
            button35.setLabel("Dia "+i+"");
            if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
                jPanel36.setBackground(Color.GREEN);
            }else{
                jPanel36.setBackground(Color.RED);
            }
        }else{
            jPanel36.setBackground(Color.RED);
            button35.setLabel("----------");
        }
        i++;
        if(i<=z.mesL){
            button36.setLabel("Dia "+i+"");
            if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
                jPanel1.setBackground(Color.GREEN);
            }else{
                jPanel1.setBackground(Color.RED);
            }
        }else{
            jPanel1.setBackground(Color.RED);
            button36.setLabel("----------");
        }
        i++;
        if(i<=z.mesL){
            button37.setLabel("Dia "+i+"");
            if(db.hasContent(""+z.ano+"-"+meses+"-"+i)){
                jPanel39.setBackground(Color.GREEN);
            }else{
                jPanel39.setBackground(Color.RED);
            }
        }else{
            jPanel39.setBackground(Color.RED);
            button37.setLabel("----------");
        }
        i++;
    }
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private java.awt.Button button10;
    private java.awt.Button button11;
    private java.awt.Button button12;
    private java.awt.Button button13;
    private java.awt.Button button14;
    private java.awt.Button button15;
    private java.awt.Button button16;
    private java.awt.Button button17;
    private java.awt.Button button18;
    private java.awt.Button button19;
    private java.awt.Button button2;
    private java.awt.Button button20;
    private java.awt.Button button21;
    private java.awt.Button button22;
    private java.awt.Button button23;
    private java.awt.Button button24;
    private java.awt.Button button25;
    private java.awt.Button button26;
    private java.awt.Button button27;
    private java.awt.Button button28;
    private java.awt.Button button29;
    private java.awt.Button button3;
    private java.awt.Button button30;
    private java.awt.Button button31;
    private java.awt.Button button32;
    private java.awt.Button button33;
    private java.awt.Button button34;
    private java.awt.Button button35;
    private java.awt.Button button36;
    private java.awt.Button button37;
    private java.awt.Button button4;
    private java.awt.Button button5;
    private java.awt.Button button6;
    private java.awt.Button button7;
    private java.awt.Button button8;
    private java.awt.Button button9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
