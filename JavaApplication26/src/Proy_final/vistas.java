/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proy_final;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Vector;

/**
 *
 * @author fenix
 */
public class vistas extends javax.swing.JFrame {
      arbol arb= new arbol();
      //DefaultTableModel t= new defau;
      String metodo = "InOrder";
    /**
     * Creates new form vistas
     */
    public vistas() {
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

        jTextField2 = new javax.swing.JTextField();
        agregar = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        buscar = new javax.swing.JButton();
        inorden = new javax.swing.JButton();
        preorden = new javax.swing.JButton();
        postorden = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        dato = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        agregar.setText("Agregar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        borrar.setText("Borrar");
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });

        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        inorden.setText("InOrden");
        inorden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inordenActionPerformed(evt);
            }
        });

        preorden.setText("PreOrden");
        preorden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preordenActionPerformed(evt);
            }
        });

        postorden.setText("PostOrden");
        postorden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postordenActionPerformed(evt);
            }
        });

        jLabel1.setText("dato");

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "dato"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(inorden, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(preorden, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(postorden, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dato, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(dato, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inorden)
                    .addComponent(preorden)
                    .addComponent(postorden))
                .addGap(55, 55, 55))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    
    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
      
         if (dato.getText() == null || dato.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El arbol esta vacio", "alto", JOptionPane.INFORMATION_MESSAGE);
        } else {
            try {
                arb.insertar(Integer.parseInt(dato.getText()));
            refrescar(metodo);
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
      
                
        
    }//GEN-LAST:event_agregarActionPerformed
  public void refrescar(String metodo) {
        Vector renglones = new Vector();
        DefaultTableModel tbm = (DefaultTableModel) tabla.getModel();
        tbm.getDataVector().clear();
        switch (metodo) {
            case "PreOrden":
                renglones = arb.llamaPreOrder(arb.raiz);
                break;
            case "PosOrden":
                renglones = arb.llamaPosOrder(arb.raiz);
                break;
            case "InOrden":
                renglones = arb.llamaInOrder(arb.raiz);
                break;
            default:
                renglones = arb.llamaInOrder(arb.raiz);
                System.out.println("fallo");
                break;
        }
        for (int i = 0; i < renglones.size(); i++) {
            Nodo N = (Nodo) renglones.get(i);
            tbm.addRow(new Object[]{N.dato});
        }
    }

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
     int renglon = tabla.getSelectedRow();
        String dato = tabla.getModel().getValueAt(renglon, 0).toString();
     
        int r;
        r=Integer.parseInt(dato);
        
        if(arb.buscarnodo(r)!= null)
        {
            JOptionPane.showMessageDialog(null, arb.buscarnodo(r));
        }
        
        else
        {
            JOptionPane.showMessageDialog(null,"no existe es dato");
        }
        
        

        
    }//GEN-LAST:event_buscarActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
       int renglon = tabla.getSelectedRow();
        String dato = tabla.getModel().getValueAt(renglon, 0).toString();
        arb.eliminarnodo(Integer.parseInt(dato));
        refrescar(metodo);
    }//GEN-LAST:event_borrarActionPerformed

    private void inordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inordenActionPerformed
        metodo = "InOrden";
        refrescar(metodo);
    }//GEN-LAST:event_inordenActionPerformed

    private void preordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preordenActionPerformed
        metodo = "PreOrden";
        refrescar(metodo);
    }//GEN-LAST:event_preordenActionPerformed

    private void postordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postordenActionPerformed
        metodo = "PosOrden";
        refrescar(metodo);
    }//GEN-LAST:event_postordenActionPerformed

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
            java.util.logging.Logger.getLogger(vistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JButton borrar;
    private javax.swing.JButton buscar;
    private javax.swing.JTextField dato;
    private javax.swing.JButton inorden;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton postorden;
    private javax.swing.JButton preorden;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
