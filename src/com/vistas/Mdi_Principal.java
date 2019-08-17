package com.vistas;

/**
 * nombre de la clase: Mdi_Principal
 * version:1.0
 * fecha: 17/08/19
 * copyright:ITCA-FEPADE
 * @author Brenda Ramos
 */
public class Mdi_Principal extends javax.swing.JFrame {

    /**
     * Creates new form Mdi_Principal
     */
    public Mdi_Principal() {
        initComponents();
        this.setExtendedState(Mdi_Principal.MAXIMIZED_BOTH);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        usuMenu = new javax.swing.JMenu();
        agUsuMenuItem = new javax.swing.JMenuItem();
        agmEmpMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        agrEditMenuItem = new javax.swing.JMenuItem();
        libroMenu = new javax.swing.JMenu();
        agrLibMenuItem = new javax.swing.JMenuItem();
        categMenu = new javax.swing.JMenu();
        agrCateMenuItem = new javax.swing.JMenuItem();
        autorMenu = new javax.swing.JMenu();
        agrAutorMenuItem = new javax.swing.JMenuItem();
        prestaMenu = new javax.swing.JMenu();
        agrPresMenuItem = new javax.swing.JMenuItem();
        compraMenu = new javax.swing.JMenu();
        agrComMenuItem = new javax.swing.JMenuItem();
        ventasMenu = new javax.swing.JMenu();
        agrVentaMenuItem = new javax.swing.JMenuItem();
        reporteMenu = new javax.swing.JMenu();
        repVLMenuItem = new javax.swing.JMenuItem();
        exitMenu = new javax.swing.JMenu();
        exitMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        usuMenu.setMnemonic('f');
        usuMenu.setText("Usuarios");

        agUsuMenuItem.setMnemonic('o');
        agUsuMenuItem.setText("Agregar Usuario");
        usuMenu.add(agUsuMenuItem);

        agmEmpMenuItem.setMnemonic('a');
        agmEmpMenuItem.setText("Agregar Empleado");
        usuMenu.add(agmEmpMenuItem);

        menuBar.add(usuMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Editorial");

        agrEditMenuItem.setMnemonic('t');
        agrEditMenuItem.setText("Agregar Editorial");
        editMenu.add(agrEditMenuItem);

        menuBar.add(editMenu);

        libroMenu.setMnemonic('h');
        libroMenu.setText("Libro");

        agrLibMenuItem.setMnemonic('c');
        agrLibMenuItem.setText("Agregar Libro");
        libroMenu.add(agrLibMenuItem);

        menuBar.add(libroMenu);

        categMenu.setText("Categoria");

        agrCateMenuItem.setText("Agregar Categoria");
        categMenu.add(agrCateMenuItem);

        menuBar.add(categMenu);

        autorMenu.setText("Autores");

        agrAutorMenuItem.setText("Agregar Autores");
        autorMenu.add(agrAutorMenuItem);

        menuBar.add(autorMenu);

        prestaMenu.setText("Prestamo");

        agrPresMenuItem.setText("Realizar Prestamo");
        prestaMenu.add(agrPresMenuItem);

        menuBar.add(prestaMenu);

        compraMenu.setText("Compra");

        agrComMenuItem.setText("Realizar Compra");
        compraMenu.add(agrComMenuItem);

        menuBar.add(compraMenu);

        ventasMenu.setText("Ventas");

        agrVentaMenuItem.setText("Realizar Venta");
        ventasMenu.add(agrVentaMenuItem);

        menuBar.add(ventasMenu);

        reporteMenu.setText("Reportes");

        repVLMenuItem.setText("Reporte de venta de Libros");
        reporteMenu.add(repVLMenuItem);

        menuBar.add(reporteMenu);

        exitMenu.setText("Salir");

        exitMenuItem.setText("Salir");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        exitMenu.add(exitMenuItem);

        menuBar.add(exitMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    //boton borrar 
    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Mdi_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mdi_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mdi_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mdi_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mdi_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem agUsuMenuItem;
    private javax.swing.JMenuItem agmEmpMenuItem;
    private javax.swing.JMenuItem agrAutorMenuItem;
    private javax.swing.JMenuItem agrCateMenuItem;
    private javax.swing.JMenuItem agrComMenuItem;
    private javax.swing.JMenuItem agrEditMenuItem;
    private javax.swing.JMenuItem agrLibMenuItem;
    private javax.swing.JMenuItem agrPresMenuItem;
    private javax.swing.JMenuItem agrVentaMenuItem;
    private javax.swing.JMenu autorMenu;
    private javax.swing.JMenu categMenu;
    private javax.swing.JMenu compraMenu;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu exitMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu libroMenu;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu prestaMenu;
    private javax.swing.JMenuItem repVLMenuItem;
    private javax.swing.JMenu reporteMenu;
    private javax.swing.JMenu usuMenu;
    private javax.swing.JMenu ventasMenu;
    // End of variables declaration//GEN-END:variables

}
