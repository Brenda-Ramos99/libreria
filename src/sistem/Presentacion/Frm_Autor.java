/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem.Presentacion;
import sistem.Entidades.Validaciones;

/**
 *
 * @author Brenda Ramos
 */
public class Frm_Autor extends javax.swing.JInternalFrame {

    /**
     * Creates new form Frm_Autor
     */
    Validaciones v= new Validaciones();
    public Frm_Autor() {
        initComponents();
        v.validarLetras(txtNomAuto);
        v.validarNombres(txtNaciAutor);
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
        panelAutor = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCodAut = new javax.swing.JTextField();
        txtNomAuto = new javax.swing.JTextField();
        txtNaciAutor = new javax.swing.JTextField();
        rbtnMasculino = new javax.swing.JRadioButton();
        rbtnFemenino = new javax.swing.JRadioButton();
        btnAgregarAuto = new javax.swing.JButton();
        btnModifAutor = new javax.swing.JButton();
        btnElimAutor = new javax.swing.JButton();
        btnSalirAutor = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableAutor = new javax.swing.JTable();

        setTitle("Autores");
        setVisible(true);

        jLabel1.setText("Código");

        jLabel2.setText("Nombre");

        jLabel3.setText("Nacionalidad");

        jLabel4.setText("Genero");

        txtCodAut.setEnabled(false);

        buttonGroup1.add(rbtnMasculino);
        rbtnMasculino.setText("Maculino");

        buttonGroup1.add(rbtnFemenino);
        rbtnFemenino.setText("Femenino");

        btnAgregarAuto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistem/Presentacion/img/agregar-boton-dentro-del-circulo-negro.png"))); // NOI18N
        btnAgregarAuto.setText("Agregar");

        btnModifAutor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistem/Presentacion/img/lapiz-escribiendo-en-un-papel.png"))); // NOI18N
        btnModifAutor.setText("Modificar");

        btnElimAutor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistem/Presentacion/img/cesto-de-basura.png"))); // NOI18N
        btnElimAutor.setText("Eliminar");

        btnSalirAutor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistem/Presentacion/img/logout.png"))); // NOI18N
        btnSalirAutor.setText("Salir");
        btnSalirAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirAutorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAutorLayout = new javax.swing.GroupLayout(panelAutor);
        panelAutor.setLayout(panelAutorLayout);
        panelAutorLayout.setHorizontalGroup(
            panelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAutorLayout.createSequentialGroup()
                .addGroup(panelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAutorLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(panelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelAutorLayout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(jLabel2))
                            .addGroup(panelAutorLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(txtCodAut, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(btnAgregarAuto))
                            .addGroup(panelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(panelAutorLayout.createSequentialGroup()
                                    .addGroup(panelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelAutorLayout.createSequentialGroup()
                                                .addComponent(rbtnMasculino)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(rbtnFemenino))
                                            .addComponent(txtNaciAutor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panelAutorLayout.createSequentialGroup()
                                            .addGap(68, 68, 68)
                                            .addComponent(jLabel4)))
                                    .addGap(27, 27, 27)
                                    .addGroup(panelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnElimAutor)
                                        .addComponent(btnSalirAutor)))
                                .addGroup(panelAutorLayout.createSequentialGroup()
                                    .addComponent(txtNomAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(21, 21, 21)
                                    .addComponent(btnModifAutor)))))
                    .addGroup(panelAutorLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel1))
                    .addGroup(panelAutorLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel3)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        panelAutorLayout.setVerticalGroup(
            panelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAutorLayout.createSequentialGroup()
                .addGroup(panelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAutorLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1))
                    .addGroup(panelAutorLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(panelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCodAut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgregarAuto))
                        .addGap(23, 23, 23)
                        .addComponent(jLabel2)))
                .addGap(17, 17, 17)
                .addGroup(panelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnModifAutor)
                    .addComponent(txtNomAuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(panelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelAutorLayout.createSequentialGroup()
                        .addComponent(txtNaciAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addGroup(panelAutorLayout.createSequentialGroup()
                        .addComponent(btnElimAutor)
                        .addGap(31, 31, 31)))
                .addGroup(panelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAutorLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbtnMasculino)
                            .addComponent(rbtnFemenino))
                        .addGap(54, 54, 54))
                    .addGroup(panelAutorLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(btnSalirAutor)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        TableAutor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TableAutor);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelAutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirAutorActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirAutorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableAutor;
    private javax.swing.JButton btnAgregarAuto;
    private javax.swing.JButton btnElimAutor;
    private javax.swing.JButton btnModifAutor;
    private javax.swing.JButton btnSalirAutor;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelAutor;
    private javax.swing.JRadioButton rbtnFemenino;
    private javax.swing.JRadioButton rbtnMasculino;
    private javax.swing.JTextField txtCodAut;
    private javax.swing.JTextField txtNaciAutor;
    private javax.swing.JTextField txtNomAuto;
    // End of variables declaration//GEN-END:variables
}
