package alapmuvgyak;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Muveletek extends javax.swing.JFrame {

    /**
     * Creates new form Muveletek
     */
    String mentettFajl;
    int szam1;
    int szam2;
    int eredmeny;
    int osztasKerdes = 0;
    int osztasProba = 0;
    Random rnd = new Random();
    public Muveletek() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jFileChooser1 = new javax.swing.JFileChooser();
        pnlGyakorlas = new javax.swing.JPanel();
        lblFeladat = new javax.swing.JLabel();
        txtEredmeny = new javax.swing.JTextField();
        btnEllenorzes = new javax.swing.JButton();
        lblValasz = new javax.swing.JLabel();
        btnUj = new javax.swing.JButton();
        btnMegoldas = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblOsszKerdes = new javax.swing.JLabel();
        lbllblOsszProba = new javax.swing.JLabel();
        lblEredmeny = new javax.swing.JLabel();
        lblOsszeadKerdes = new javax.swing.JLabel();
        lblKivonasKerdes = new javax.swing.JLabel();
        lblOsztasKerdes = new javax.swing.JLabel();
        lblSzorzasKerdes = new javax.swing.JLabel();
        lblOsszeadProba = new javax.swing.JLabel();
        lblKivonasProba = new javax.swing.JLabel();
        lblOsztasProba = new javax.swing.JLabel();
        lblSzorzasProba = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuFajl = new javax.swing.JMenu();
        mnuFajlMegnyit = new javax.swing.JMenuItem();
        mnuFajlMent = new javax.swing.JMenuItem();
        mnuFajlMentesMaskent = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuFajlKilep = new javax.swing.JMenuItem();
        mnuMuvelet = new javax.swing.JMenu();
        mnuOsszead = new javax.swing.JRadioButtonMenuItem();
        mnuKivon = new javax.swing.JRadioButtonMenuItem();
        mnuOszt = new javax.swing.JRadioButtonMenuItem();
        mnuSzorzas = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alapműveletek gyakoroltatása");

        pnlGyakorlas.setBorder(javax.swing.BorderFactory.createTitledBorder("Gyakorlás"));

        lblFeladat.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        btnEllenorzes.setText("Ellenőrzés");
        btnEllenorzes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEllenorzesActionPerformed(evt);
            }
        });

        lblValasz.setText("visszajelzés");

        javax.swing.GroupLayout pnlGyakorlasLayout = new javax.swing.GroupLayout(pnlGyakorlas);
        pnlGyakorlas.setLayout(pnlGyakorlasLayout);
        pnlGyakorlasLayout.setHorizontalGroup(
            pnlGyakorlasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGyakorlasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlGyakorlasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlGyakorlasLayout.createSequentialGroup()
                        .addComponent(lblFeladat, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtEredmeny, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlGyakorlasLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(lblValasz, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEllenorzes)
                .addGap(15, 15, 15))
        );
        pnlGyakorlasLayout.setVerticalGroup(
            pnlGyakorlasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGyakorlasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlGyakorlasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFeladat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlGyakorlasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtEredmeny, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEllenorzes)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblValasz, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnUj.setText("Új feladat");
        btnUj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUjActionPerformed(evt);
            }
        });

        btnMegoldas.setText("Megoldás");
        btnMegoldas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMegoldasActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Statisztika"));

        lblOsszKerdes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOsszKerdes.setText("Össz kérdések száma: 0");

        lbllblOsszProba.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbllblOsszProba.setText("Össz Probálkozások száma: 0");

        lblEredmeny.setText("Eredmény: 0 %");

        lblOsszeadKerdes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOsszeadKerdes.setText("Összeadás: 0");

        lblKivonasKerdes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblKivonasKerdes.setText("Kivonás: 0");

        lblOsztasKerdes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOsztasKerdes.setText("Osztás: 0");

        lblSzorzasKerdes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSzorzasKerdes.setText("Szorzás: 0");

        lblOsszeadProba.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOsszeadProba.setText("Összeadás: 0");

        lblKivonasProba.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblKivonasProba.setText("Kivonás: 0");

        lblOsztasProba.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOsztasProba.setText("Osztás: 0");

        lblSzorzasProba.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSzorzasProba.setText("Szorzás: 0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblEredmeny))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblOsszKerdes, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblOsszeadKerdes, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblKivonasKerdes, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblOsztasKerdes, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSzorzasKerdes, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblKivonasProba, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSzorzasProba, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblOsszeadProba, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblOsztasProba, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbllblOsszProba, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblKivonasKerdes, lblOsszeadKerdes, lblOsztasKerdes, lblSzorzasKerdes});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOsszKerdes)
                    .addComponent(lbllblOsszProba))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblOsszeadKerdes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblKivonasKerdes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblOsztasKerdes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSzorzasKerdes))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblOsszeadProba)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblKivonasProba)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblOsztasProba)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSzorzasProba)))
                .addGap(18, 18, 18)
                .addComponent(lblEredmeny)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mnuFajl.setText("Fájl");

        mnuFajlMegnyit.setText("Megnyit");
        mnuFajlMegnyit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFajlMegnyitActionPerformed(evt);
            }
        });
        mnuFajl.add(mnuFajlMegnyit);

        mnuFajlMent.setText("Ment");
        mnuFajlMent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFajlMentActionPerformed(evt);
            }
        });
        mnuFajl.add(mnuFajlMent);

        mnuFajlMentesMaskent.setText("Mentés másként...");
        mnuFajlMentesMaskent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFajlMentesMaskentActionPerformed(evt);
            }
        });
        mnuFajl.add(mnuFajlMentesMaskent);
        mnuFajl.add(jSeparator1);

        mnuFajlKilep.setText("Kilép");
        mnuFajl.add(mnuFajlKilep);

        jMenuBar1.add(mnuFajl);

        mnuMuvelet.setText("Műveletek");

        buttonGroup1.add(mnuOsszead);
        mnuOsszead.setText("Összeadás");
        mnuMuvelet.add(mnuOsszead);

        buttonGroup1.add(mnuKivon);
        mnuKivon.setSelected(true);
        mnuKivon.setText("Kivonás");
        mnuMuvelet.add(mnuKivon);

        buttonGroup1.add(mnuOszt);
        mnuOszt.setText("Osztás");
        mnuOszt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuOsztActionPerformed(evt);
            }
        });
        mnuMuvelet.add(mnuOszt);

        buttonGroup1.add(mnuSzorzas);
        mnuSzorzas.setText("Szorzás");
        mnuMuvelet.add(mnuSzorzas);

        jMenuBar1.add(mnuMuvelet);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlGyakorlas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUj, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnMegoldas, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnUj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMegoldas))
                    .addComponent(pnlGyakorlas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuFajlMentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFajlMentActionPerformed
//        JFileChooser fc = new JFileChooser();
//        fc.setDialogTitle("Fájl mentése");
//        fc.setCurrentDirectory(new File("."));
//        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
//        int valasztottGomb = fc.showSaveDialog(this);
//        if (valasztottGomb == JFileChooser.APPROVE_OPTION) {
//            File f = fc.getSelectedFile();
//            if (f.isDirectory()) {
//                lblEredmeny.setText("<html>Elérés: " + f.getPath() + "<br>Könyvtár: " + f.getName() + "</html>");
//                try {
//                    Files.write(Paths.get(f.getPath(), "/stat.txt"), "Statisztika: ".getBytes());
//                } catch (IOException ex) {
//                    Logger.getLogger(Muveletek.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//        }
        if (mentettFajl == null) {
            mnuFajlMentesMaskentActionPerformed(evt);

        } else {
            try {

                Files.write(Paths.get(mentettFajl), tartalomOsszeallitas().getBytes());

            } catch (IOException ex) {
                Logger.getLogger(Muveletek.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_mnuFajlMentActionPerformed

    private void mnuFajlMentesMaskentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFajlMentesMaskentActionPerformed
        JFileChooser fc = new JFileChooser(new File("."));
        fc.setDialogTitle("Mentés másként");
        fc.setAcceptAllFileFilterUsed(false);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("PNG és GIF képek", "png", "gif");
        fc.addChoosableFileFilter(filter);
        FileNameExtensionFilter txtfilter = new FileNameExtensionFilter("txt", ".txt", "txt");
        fc.addChoosableFileFilter(txtfilter);
        FileNameExtensionFilter kjfilter = new FileNameExtensionFilter("Speciális", ".kj", "kj");
        fc.addChoosableFileFilter(kjfilter);
        fc.setFileFilter(txtfilter);

        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int valasztottGomb = fc.showSaveDialog(this);
        if (valasztottGomb == JFileChooser.APPROVE_OPTION) {
            File f = fc.getSelectedFile();
            String[] kit = ((FileNameExtensionFilter) fc.getFileFilter()).getExtensions();
            String fn = f.getPath();// + "." + kit[0];

            if (fn.endsWith("." + kit[0])) {
                fn += "." + kit[0];
            }
            mentettFajl = fn;
            Path path = Paths.get(fn);
            boolean mentes = true;
            if (Files.exists(path)) {
                valasztottGomb = JOptionPane.showConfirmDialog(this, "Felülirja?", "A fájl létezik", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                if (valasztottGomb == JOptionPane.YES_OPTION) {
                    mentes = false;
                }
            }

            lblEredmeny.setText("<html>Elérés: " + f.getPath() + "<br>Fájl neve: " + fn + "</html>");

            try {
                if (mentes) {
                    Files.write(Paths.get(fn), tartalomOsszeallitas().getBytes());
                }
            } catch (IOException ex) {
                Logger.getLogger(Muveletek.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            JOptionPane.showMessageDialog(this, "Mentés megszakítva!", "Nincs mentés", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_mnuFajlMentesMaskentActionPerformed
    private String tartalomOsszeallitas() {
        String statisztika = "Alapmuveletek ";
        JLabel[] lbltomb = new JLabel[]{lbllblOsszProba, lblOsszKerdes, lblSzorzasKerdes, lblSzorzasProba, lblOsztasKerdes, lblOsztasProba, lblOsszeadKerdes, lblOsszeadProba, lblKivonasKerdes, lblKivonasProba};
        final int HE = 3;

        final int kerdesMaxHossz = lblOsszKerdes.getText().length();

        final int probaMaxHossz = lblOsszeadProba.getText().length();
        for (int i = 0; i < lbltomb.length - 1; i += 2) {
            JLabel labKerdes = lbltomb[i];
            JLabel labProba = lbltomb[i + 1];

            String formazo = "%" + (kerdesMaxHossz + HE) + "s%" + (probaMaxHossz + HE) + "s/n";

            statisztika += String.format(formazo, labKerdes.getText(), labKerdes.getText());

//                statisztika += labKerdes.getText()+"/t";
//                statisztika += labProba.getText()+"\n";
        }
        return statisztika;
    }

    private void mnuFajlMegnyitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFajlMegnyitActionPerformed
        JFileChooser fc = new JFileChooser(new File("."));
        fc.setDialogTitle("Megnyitás");
        fc.setAcceptAllFileFilterUsed(false);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("PNG és GIF képek", "png", "gif");
        fc.addChoosableFileFilter(filter);
        FileNameExtensionFilter txtfilter = new FileNameExtensionFilter("txt", ".txt", "txt");
        fc.addChoosableFileFilter(txtfilter);
        FileNameExtensionFilter kjfilter = new FileNameExtensionFilter("Speciális", ".kj", "kj");
        fc.addChoosableFileFilter(kjfilter);
        fc.setFileFilter(txtfilter);

        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int valasztottGomb = fc.showOpenDialog(this);
        if (valasztottGomb == JFileChooser.APPROVE_OPTION) {
            File f = fc.getSelectedFile();
            String fn = f.getPath();
            Path path = Paths.get(fn);
            lblEredmeny.setText("<html>Elérés: " + f.getPath() + "<br>Fájl neve: " + fn + "</html>");
        } else {
            JOptionPane.showMessageDialog(this, "Megnyitás megszakítva!", "Nem lesz megnyitva semmi", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_mnuFajlMegnyitActionPerformed

    private void mnuOsztActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuOsztActionPerformed
        btnEllenorzes.setEnabled(true);
        osztasKerdes++;
        do {
            szam1 = rnd.nextInt(101);
            szam2 = rnd.nextInt(101);
        } while (szam2 == 0 && szam1%szam2==0);
        lblFeladat.setText("Osztás: " + szam1 + " / " + szam2);
        lblOsztasKerdes.setText("Osztás: " + osztasKerdes);
    }//GEN-LAST:event_mnuOsztActionPerformed

    private void btnEllenorzesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEllenorzesActionPerformed
        osztasProba++;   
        eredmeny = szam1 / szam2;
        if(txtEredmeny.getText().equals(eredmeny)){
            lblValasz.setText(eredmeny + "jó!");
            
        }else{
            lblValasz.setText("Rossz Válasz");
        }
        btnEllenorzes.setEnabled(false);
        lblOsztasProba.setText("Osztás: " + osztasProba);
    }//GEN-LAST:event_btnEllenorzesActionPerformed

    private void btnUjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUjActionPerformed
        osztasKerdes++;
        btnEllenorzes.setEnabled(true);
        do {
            szam1 = rnd.nextInt(101);
            szam2 = rnd.nextInt(101);
        } while (szam2 == 0 && szam1%szam2==0);
        lblFeladat.setText("Osztás: " + szam1 + " / " + szam2);
        lblOsztasKerdes.setText("Osztás: " + osztasKerdes);
    }//GEN-LAST:event_btnUjActionPerformed

    private void btnMegoldasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMegoldasActionPerformed
         eredmeny = szam1 / szam2;
        lblEredmeny.setText(String.valueOf(eredmeny));
    }//GEN-LAST:event_btnMegoldasActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Muveletek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Muveletek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Muveletek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Muveletek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Muveletek().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEllenorzes;
    private javax.swing.JButton btnMegoldas;
    private javax.swing.JButton btnUj;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lblEredmeny;
    private javax.swing.JLabel lblFeladat;
    private javax.swing.JLabel lblKivonasKerdes;
    private javax.swing.JLabel lblKivonasProba;
    private javax.swing.JLabel lblOsszKerdes;
    private javax.swing.JLabel lblOsszeadKerdes;
    private javax.swing.JLabel lblOsszeadProba;
    private javax.swing.JLabel lblOsztasKerdes;
    private javax.swing.JLabel lblOsztasProba;
    private javax.swing.JLabel lblSzorzasKerdes;
    private javax.swing.JLabel lblSzorzasProba;
    private javax.swing.JLabel lblValasz;
    private javax.swing.JLabel lbllblOsszProba;
    private javax.swing.JMenu mnuFajl;
    private javax.swing.JMenuItem mnuFajlKilep;
    private javax.swing.JMenuItem mnuFajlMegnyit;
    private javax.swing.JMenuItem mnuFajlMent;
    private javax.swing.JMenuItem mnuFajlMentesMaskent;
    private javax.swing.JRadioButtonMenuItem mnuKivon;
    private javax.swing.JMenu mnuMuvelet;
    private javax.swing.JRadioButtonMenuItem mnuOsszead;
    private javax.swing.JRadioButtonMenuItem mnuOszt;
    private javax.swing.JRadioButtonMenuItem mnuSzorzas;
    private javax.swing.JPanel pnlGyakorlas;
    private javax.swing.JTextField txtEredmeny;
    // End of variables declaration//GEN-END:variables

}
