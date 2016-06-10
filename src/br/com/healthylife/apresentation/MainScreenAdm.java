/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.healthylife.apresentation;

import br.com.healthylife.util.Constants;
import br.com.healthylife.util.Wallpaper;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author ruann
 */
public class MainScreenAdm extends javax.swing.JFrame {

    Wallpaper desktop;

    public MainScreenAdm() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);

        Date dateSystem = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        jLDate.setText(dateFormat.format(dateSystem));

        Timer timer = new Timer(1000, new hora());
        timer.start();
    }

    public MainScreenAdm(Login login) {
        this();
        login.dispose();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jDesktopPane3 = new javax.swing.JDesktopPane();
        jLTime = new javax.swing.JLabel();
        jLDate = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLFunction = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jNew = new javax.swing.JMenu();
        jNewEmployee = new javax.swing.JMenuItem();
        jNewMedic = new javax.swing.JMenuItem();
        jNewClient = new javax.swing.JMenuItem();
        jNewHospital = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jEditEmployee = new javax.swing.JMenuItem();
        jEditMedic = new javax.swing.JMenuItem();
        jEditClient = new javax.swing.JMenuItem();
        jEditHospital = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jExcludeEmployee = new javax.swing.JMenuItem();
        jExcludeMedic = new javax.swing.JMenuItem();
        jExcludeClient = new javax.swing.JMenuItem();
        jExcludeHospital = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItemMakeAnAppointment = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItemLeave = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuExhibitionEmployee = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMExhibitionClient = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMInvoice = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Healthy Life");

        jLTime.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTime.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jLDate.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLDate.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jLabel1.setText("Nome:");

        jLabel2.setText("Função:");

        jLFunction.setText("Adminstrador");

        jDesktopPane3.setLayer(jLTime, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jLDate, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jLName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jLFunction, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane3Layout = new javax.swing.GroupLayout(jDesktopPane3);
        jDesktopPane3.setLayout(jDesktopPane3Layout);
        jDesktopPane3Layout.setHorizontalGroup(
            jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLName, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLFunction))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLTime, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLDate, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jDesktopPane3Layout.setVerticalGroup(
            jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jDesktopPane3Layout.createSequentialGroup()
                        .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLName, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLFunction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLTime, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLDate, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane3)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jDesktopPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 833, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 423, Short.MAX_VALUE)
        );

        jMenu1.setText("Arquivo");

        jNew.setText("Novo Cadastro");

        jNewEmployee.setText("Funcionários");
        jNewEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNewEmployeeActionPerformed(evt);
            }
        });
        jNew.add(jNewEmployee);

        jNewMedic.setText("Médicos");
        jNewMedic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNewMedicActionPerformed(evt);
            }
        });
        jNew.add(jNewMedic);

        jNewClient.setText("Clientes");
        jNewClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNewClientActionPerformed(evt);
            }
        });
        jNew.add(jNewClient);

        jNewHospital.setText("Hospitais");
        jNewHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNewHospitalActionPerformed(evt);
            }
        });
        jNew.add(jNewHospital);

        jMenu1.add(jNew);

        jMenu6.setText("Editar Cadastro");

        jEditEmployee.setText("Funcionário");
        jMenu6.add(jEditEmployee);

        jEditMedic.setText("Médicos");
        jMenu6.add(jEditMedic);

        jEditClient.setText("Cliente");
        jMenu6.add(jEditClient);

        jEditHospital.setText("Hospitais");
        jMenu6.add(jEditHospital);

        jMenu1.add(jMenu6);

        jMenu5.setText("Excluir");

        jExcludeEmployee.setText("Funcionários");
        jMenu5.add(jExcludeEmployee);

        jExcludeMedic.setText("Médicos");
        jMenu5.add(jExcludeMedic);

        jExcludeClient.setText("Clientes");
        jMenu5.add(jExcludeClient);

        jExcludeHospital.setText("Hospitais");
        jMenu5.add(jExcludeHospital);

        jMenu1.add(jMenu5);
        jMenu1.add(jSeparator3);

        jMenuItemMakeAnAppointment.setText("Marcar Consultas");
        jMenuItemMakeAnAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMakeAnAppointmentActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemMakeAnAppointment);

        jMenuItem13.setText("Cancelar Consultas");
        jMenu1.add(jMenuItem13);

        jMenuItem21.setText("Remarcar Consultas");
        jMenu1.add(jMenuItem21);

        jMenuItemLeave.setText("Sair");
        jMenuItemLeave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLeaveActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemLeave);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Exibir");

        jMenuExhibitionEmployee.setText("Funcionários");
        jMenuExhibitionEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuExhibitionEmployeeActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuExhibitionEmployee);

        jMenuItem5.setText("Médicos");
        jMenu2.add(jMenuItem5);

        jMExhibitionClient.setText("Clientes");
        jMExhibitionClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMExhibitionClientActionPerformed(evt);
            }
        });
        jMenu2.add(jMExhibitionClient);

        jMenuItem20.setText("Hospitais");
        jMenu2.add(jMenuItem20);
        jMenu2.add(jSeparator1);

        jMenuItem7.setText("Consultas Marcadas");
        jMenu2.add(jMenuItem7);

        jMenuItem8.setText("Consultas Canceladas");
        jMenu2.add(jMenuItem8);

        jMenuItem9.setText("Consultas Efetuadas");
        jMenu2.add(jMenuItem9);
        jMenu2.add(jSeparator4);

        jMInvoice.setText("Pagamentos Pendentes");
        jMInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMInvoiceActionPerformed(evt);
            }
        });
        jMenu2.add(jMInvoice);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Ajuda");

        jMenuItem10.setText("Página de Ajuda");
        jMenu3.add(jMenuItem10);
        jMenu3.add(jSeparator2);

        jAbout.setText("Sobre");
        jAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAboutActionPerformed(evt);
            }
        });
        jMenu3.add(jAbout);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jDesktopPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAboutActionPerformed
        JOptionPane.showMessageDialog(this, Constants.ABOUT_MESSAGE, Constants.FRAME_TITLE,
                JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jAboutActionPerformed

    private void jNewEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNewEmployeeActionPerformed
        jDesktopPane1.add(new RegistrationScreenEmployeeIF()).setVisible(true);
    }//GEN-LAST:event_jNewEmployeeActionPerformed

    private void jNewMedicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNewMedicActionPerformed
        jDesktopPane1.add(new RegistrationScreenMedicIF()).setVisible(true);
    }//GEN-LAST:event_jNewMedicActionPerformed

    private void jMenuItemLeaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLeaveActionPerformed
        this.dispose();
    }//GEN-LAST:event_jMenuItemLeaveActionPerformed

    private void jNewClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNewClientActionPerformed
        jDesktopPane1.add(new RegistrationScreenClientIF()).setVisible(true);
    }//GEN-LAST:event_jNewClientActionPerformed

    private void jNewHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNewHospitalActionPerformed
        jDesktopPane1.add(new RegistrationScreenHospitalIF()).setVisible(true);
    }//GEN-LAST:event_jNewHospitalActionPerformed

    private void jMenuItemMakeAnAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMakeAnAppointmentActionPerformed
        jDesktopPane1.add(new MakeAnAppointmentScreenIF()).setVisible(true);
    }//GEN-LAST:event_jMenuItemMakeAnAppointmentActionPerformed

    private void jMInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMInvoiceActionPerformed
        jDesktopPane1.add(new ExhibitionInvoiceIF()).setVisible(true);
    }//GEN-LAST:event_jMInvoiceActionPerformed

    private void jMExhibitionClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMExhibitionClientActionPerformed
        jDesktopPane1.add(new ExhibitionClientIF()).setVisible(true);
    }//GEN-LAST:event_jMExhibitionClientActionPerformed

    private void jMenuExhibitionEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuExhibitionEmployeeActionPerformed
       jDesktopPane1.add(new ExhibitionEmployeeIF()).setVisible(true);
    }//GEN-LAST:event_jMenuExhibitionEmployeeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jAbout;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane3;
    private javax.swing.JMenuItem jEditClient;
    private javax.swing.JMenuItem jEditEmployee;
    private javax.swing.JMenuItem jEditHospital;
    private javax.swing.JMenuItem jEditMedic;
    private javax.swing.JMenuItem jExcludeClient;
    private javax.swing.JMenuItem jExcludeEmployee;
    private javax.swing.JMenuItem jExcludeHospital;
    private javax.swing.JMenuItem jExcludeMedic;
    private javax.swing.JLabel jLDate;
    private javax.swing.JLabel jLFunction;
    private javax.swing.JLabel jLName;
    private javax.swing.JLabel jLTime;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMExhibitionClient;
    private javax.swing.JMenuItem jMInvoice;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuExhibitionEmployee;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem jMenuItemLeave;
    private javax.swing.JMenuItem jMenuItemMakeAnAppointment;
    private javax.swing.JMenu jNew;
    private javax.swing.JMenuItem jNewClient;
    private javax.swing.JMenuItem jNewEmployee;
    private javax.swing.JMenuItem jNewHospital;
    private javax.swing.JMenuItem jNewMedic;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    // End of variables declaration//GEN-END:variables

    class hora implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Calendar now = Calendar.getInstance();
            jLTime.setText(String.format("%1$tH:%1$tM:%1$tS", now));
        }

    }

}
