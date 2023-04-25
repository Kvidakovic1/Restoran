/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import controller.ObradaArtikl;
import controller.ObradaNarudba;

import controller.ObradaStol;
import java.awt.Desktop;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import restoranapp.model.Artikl;
import restoranapp.model.Narudba;

import restoranapp.model.Stol;
import restoranapp.util.Aplikacija;
import restoranapp.util.EdunovaException;

/**
 *
 * @author Kristijan
 */
public class ProzorNarucivanje extends javax.swing.JFrame {

    private ObradaArtikl obrada;
    private ObradaNarudba obradaNarudba;

    /**
     * Creates new form ProzorNarucivanje
     */
    public ProzorNarucivanje() {
        initComponents();
        obrada = new ObradaArtikl();
        obradaNarudba = new ObradaNarudba();

        setTitle(Aplikacija.NAZIV_APP + ": " + Aplikacija.OPERATER.getIme() + ": Narucivanje");
        ucitajNarudbe();
        ucitajStolove();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUvjet = new javax.swing.JTextField();
        btnPretraga = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstPodaci = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        btnArtikli = new javax.swing.JButton();
        cmbStolovi = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaNapomena = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstNarudbe = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        btnDodaj = new javax.swing.JButton();
        btnPromjeni = new javax.swing.JButton();
        btnBrisanje = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        lstArtikliNaNarudbi = new javax.swing.JList<>();
        btnDodavanjeArtikla = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnBrisanjeArtikla = new javax.swing.JButton();
        btnRacun = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtUvjet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUvjetKeyPressed(evt);
            }
        });

        btnPretraga.setText("🔎");
        btnPretraga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPretragaActionPerformed(evt);
            }
        });

        lstPodaci.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstPodaci.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstPodaciValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstPodaci);

        jLabel1.setText("Dostupni Artikli");

        btnArtikli.setText("✚");
        btnArtikli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArtikliActionPerformed(evt);
            }
        });

        cmbStolovi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbStoloviActionPerformed(evt);
            }
        });

        jLabel2.setText("Odaberite stol za narudbu");

        txaNapomena.setColumns(20);
        txaNapomena.setRows(5);
        jScrollPane2.setViewportView(txaNapomena);

        lstNarudbe.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstNarudbe.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstNarudbeValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(lstNarudbe);

        jLabel3.setText("Napomena");

        btnDodaj.setText("Dodaj");
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });

        btnPromjeni.setText("Promjeni");
        btnPromjeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromjeniActionPerformed(evt);
            }
        });

        btnBrisanje.setText("Obriši");
        btnBrisanje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrisanjeActionPerformed(evt);
            }
        });

        jLabel4.setText("Narudbe");

        lstArtikliNaNarudbi.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstArtikliNaNarudbi.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstArtikliNaNarudbiValueChanged(evt);
            }
        });
        jScrollPane4.setViewportView(lstArtikliNaNarudbi);

        btnDodavanjeArtikla.setText("⇊");
        btnDodavanjeArtikla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodavanjeArtiklaActionPerformed(evt);
            }
        });

        jLabel5.setText("Artikli na narudbi");

        btnBrisanjeArtikla.setText("☓");
        btnBrisanjeArtikla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrisanjeArtiklaActionPerformed(evt);
            }
        });

        btnRacun.setText("Račun");
        btnRacun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRacunActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUvjet, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPretraga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnArtikli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDodavanjeArtikla, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBrisanjeArtikla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(58, 58, 58)
                        .addComponent(btnRacun)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cmbStolovi, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2))
                            .addGap(35, 35, 35))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap()))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnDodaj)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnPromjeni, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
                            .addComponent(btnBrisanje, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnArtikli)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(btnRacun))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnPretraga)
                        .addComponent(cmbStolovi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDodavanjeArtikla, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(btnBrisanjeArtikla))
                    .addComponent(txtUvjet, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(2, 2, 2)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDodaj)
                            .addComponent(btnPromjeni))
                        .addGap(22, 22, 22)
                        .addComponent(btnBrisanje)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                            .addComponent(jScrollPane4))
                        .addGap(15, 15, 15))))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3)
                .addGap(15, 15, 15))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtUvjetKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUvjetKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            ucitaj();
        }
    }//GEN-LAST:event_txtUvjetKeyPressed

    private void btnPretragaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPretragaActionPerformed
        ucitaj();
    }//GEN-LAST:event_btnPretragaActionPerformed

    private void lstPodaciValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstPodaciValueChanged
        if (evt.getValueIsAdjusting()) {
            return;
        }
        if (lstPodaci.getSelectedValue() == null) {
            return;
        }
        obrada.setEntitet(lstPodaci.getSelectedValue());


    }//GEN-LAST:event_lstPodaciValueChanged

    private void btnArtikliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArtikliActionPerformed
        new ProzorArtikl().setVisible(true);
    }//GEN-LAST:event_btnArtikliActionPerformed

    private void cmbStoloviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbStoloviActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbStoloviActionPerformed

    private void lstNarudbeValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstNarudbeValueChanged
       if(evt.getValueIsAdjusting()){
       return;
       }
       if(lstNarudbe.getSelectedValue()==null){
       return;
       }
       obradaNarudba.setEntitet(lstNarudbe.getSelectedValue());
      
       var e = obradaNarudba.getEntitet();
        txaNapomena.setText(e.getNapomena());
        cmbStolovi.setSelectedItem(e.getStol());
         napuniView();
    }//GEN-LAST:event_lstNarudbeValueChanged

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
        obradaNarudba.setEntitet(new Narudba());
        napuniModel();
        try {
            obradaNarudba.create();
            ucitajNarudbe();

        } catch (EdunovaException ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getPoruka());
        }
    }//GEN-LAST:event_btnDodajActionPerformed

    private void btnPromjeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjeniActionPerformed
        if (lstNarudbe.getSelectedValue() == null) {
            JOptionPane.showMessageDialog(getRootPane(), "Prvo odaberite narudbu za promjenu");
            return;
        }
        obradaNarudba.getEntitet().getArtikli().clear();
        napuniModel();
        try {
            obradaNarudba.update();
            
            ucitaj();
        } catch (EdunovaException ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getPoruka());
      }
    }//GEN-LAST:event_btnPromjeniActionPerformed

    private void btnBrisanjeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrisanjeActionPerformed
        if (lstNarudbe.getSelectedValue() == null) {
            JOptionPane.showMessageDialog(getRootPane(), "Prvo odaberite Artikl za brisanje");
            return;
        }

        if (JOptionPane.showConfirmDialog(getRootPane(), "Sigoruno obrisati? " , "Brisanje", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.NO_OPTION) {
            return;
        }

        try {
            obradaNarudba.delete();
            if(lstNarudbe.getSelectedValue()==null || lstNarudbe.getSelectedValuesList().isEmpty()){
            lstArtikliNaNarudbi.removeAll();
            }
            ucitajNarudbe();
        } catch (EdunovaException ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getPoruka());
        }
    }//GEN-LAST:event_btnBrisanjeActionPerformed

    private void lstArtikliNaNarudbiValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstArtikliNaNarudbiValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_lstArtikliNaNarudbiValueChanged

    private void btnDodavanjeArtiklaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodavanjeArtiklaActionPerformed
       if(lstPodaci.getSelectedValuesList()==null || lstPodaci.getSelectedValuesList().isEmpty()){
       JOptionPane.showMessageDialog(getRootPane(),
                    "Prvo pronađite artikle");
       
       return;
               
       }
       if(lstArtikliNaNarudbi.getModel()==null || !(lstArtikliNaNarudbi.getModel() instanceof DefaultListModel<Artikl>)){
           lstArtikliNaNarudbi.setModel(new DefaultListModel<>());
       }
       
       DefaultListModel<Artikl> m = (DefaultListModel<Artikl>) lstArtikliNaNarudbi.getModel();
       
       DefaultListModel<Artikl> artikli = (DefaultListModel<Artikl>) lstArtikliNaNarudbi.getModel();
       
       for(Artikl a : lstPodaci.getSelectedValuesList()){
           artikli.addElement(a);
       }
       lstArtikliNaNarudbi.repaint();
    }//GEN-LAST:event_btnDodavanjeArtiklaActionPerformed

    private void btnBrisanjeArtiklaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrisanjeArtiklaActionPerformed
       if(lstArtikliNaNarudbi.getSelectedValue()==null || lstArtikliNaNarudbi.getSelectedValuesList().isEmpty()){
       JOptionPane.showMessageDialog(getRootPane(), "Prvo odaberite artikle");
       return;
       }
       
       DefaultListModel<Artikl> a = (DefaultListModel<Artikl>) lstArtikliNaNarudbi.getModel();
       for(Artikl i : lstArtikliNaNarudbi.getSelectedValuesList()){
       a.removeElement(i);
       }
       lstArtikliNaNarudbi.repaint();
       //ucitajNarudbe();
       
    }//GEN-LAST:event_btnBrisanjeArtiklaActionPerformed

    private void btnRacunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRacunActionPerformed
        BigDecimal zbroj = new BigDecimal(0);
        if(lstNarudbe.getSelectedValue()==null){
            JOptionPane.showMessageDialog(rootPane, "Prvo odaberite narudbu za ispis!");
            return;
        }
        new File("./racuni").mkdir();
        Narudba n = lstNarudbe.getSelectedValue();
        Document document = new Document(){};
        try {
            File file = new File("./racuni/"+"Broj_Stola " + n.getStol().getBrojStola()+ ".pdf");
            PdfWriter.getInstance(document, new FileOutputStream(file));
        } catch (FileNotFoundException | DocumentException ex) {
            
        }
        document.open();
        Font font = FontFactory.getFont(FontFactory.COURIER, 16, BaseColor.BLACK);
        try {
            document.add(new Paragraph("" + n.getStol(), font));
            document.add(new Paragraph("Konobar: " + n.getStol().getKonobar(), font));
            document.add(new Paragraph("________________________________________"));
            for(int i=0;i<n.getArtikli().size();i++){
                
            document.add(new Paragraph("" + n.getArtikli().get(i), font));
            zbroj = zbroj.add(n.getArtikli().get(i).getCijena()); 
            }
            document.add(new Paragraph("________________________________________"));
            
            document.add(new Paragraph("Ukupno za platiti: " + zbroj + "€", font));
            
        } catch (DocumentException ex) {
        }
        document.close();
        try {
            Desktop.getDesktop().open(new File("racuni"));
        } catch (IOException ex) {
        }
    }//GEN-LAST:event_btnRacunActionPerformed

    /**
     * @param args the command line arguments
     */
    public void ucitaj() {

        DefaultListModel<Artikl> m = new DefaultListModel<>();
        m.addAll(obrada.read(txtUvjet.getText()));
        lstPodaci.setModel(m);
        lstPodaci.repaint();

    }

    private void ucitajNarudbe() {
        DefaultListModel<Narudba> n = new DefaultListModel<>();
        n.addAll(obradaNarudba.read());
        lstNarudbe.setModel(n);
        lstNarudbe.repaint();
    }

//      private void ucitajStavke() {
//        DefaultListModel<Stavka> a = new DefaultListModel<>();
//        a.addAll(obradaS.read());
//        lstStavke.setModel(a);
//        lstStavke.repaint();
//    }
    private void ucitajStolove() {
        DefaultComboBoxModel<Stol> k = new DefaultComboBoxModel<>();
        Stol a = new Stol();
        a.setSifra(0);

        k.addElement(a);
        k.addAll(new ObradaStol().read());
        cmbStolovi.setModel(k);
        cmbStolovi.repaint();

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArtikli;
    private javax.swing.JButton btnBrisanje;
    private javax.swing.JButton btnBrisanjeArtikla;
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnDodavanjeArtikla;
    private javax.swing.JButton btnPretraga;
    private javax.swing.JButton btnPromjeni;
    private javax.swing.JButton btnRacun;
    private javax.swing.JComboBox<Stol> cmbStolovi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList<Artikl> lstArtikliNaNarudbi;
    private javax.swing.JList<Narudba> lstNarudbe;
    private javax.swing.JList<Artikl> lstPodaci;
    private javax.swing.JTextArea txaNapomena;
    private javax.swing.JTextField txtUvjet;
    // End of variables declaration//GEN-END:variables

    private void napuniModel() {
        var v = obradaNarudba.getEntitet();

        if (txaNapomena.getText().isBlank()) {
            v.setNapomena("Nema napomene");
        } else {
            v.setNapomena(txaNapomena.getText());
        }
        v.setStol((Stol) cmbStolovi.getSelectedItem());
        
        List<Artikl> artikli = new ArrayList<>();
        try {
            DefaultListModel<Artikl> a = (DefaultListModel<Artikl>) lstArtikliNaNarudbi.getModel();
            for(int i =0;i<a.getSize();i++){
            artikli.add(a.getElementAt(i));
            }
        } catch (Exception e) {
        }
        v.setArtikli(artikli);

    }
    
    public void napuniView(){
        var e = obradaNarudba.getEntitet();
        DefaultListModel<Artikl> a = new DefaultListModel<>();
        if(e.getArtikli()!=null){
            a.addAll(e.getArtikli());
        }
        lstArtikliNaNarudbi.setModel(a);
        lstArtikliNaNarudbi.repaint();
    }
}
