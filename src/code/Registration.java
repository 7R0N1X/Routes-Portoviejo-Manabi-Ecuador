package code;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 7R0N1X
 */
public class Registration extends javax.swing.JFrame implements Runnable {

    ArrayList<Data> route = new ArrayList<>();
    DefaultTableModel modelo = new DefaultTableModel();

    public Registration() {
        initComponents();
        this.setTitle("Routes: Portoviejo - Manabí - Ecuador");
        this.setLocationRelativeTo(null);
        this.modelo.addColumn("Salida");
        this.modelo.addColumn("Destino");
        this.modelo.addColumn("Fecha");
        this.JT_Rutas.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JP_Background = new javax.swing.JPanel();
        JL_Salida = new javax.swing.JLabel();
        JL_Destino = new javax.swing.JLabel();
        JL_Fecha = new javax.swing.JLabel();
        JSP_Rutas = new javax.swing.JScrollPane();
        JT_Rutas = new javax.swing.JTable();
        JB_AgregarRuta = new javax.swing.JButton();
        JB_MostrarRutas = new javax.swing.JButton();
        JDC_Fecha = new com.toedter.calendar.JDateChooser();
        JL_Hora = new javax.swing.JLabel();
        JCB_Salida = new javax.swing.JComboBox<>();
        JCB_Destino = new javax.swing.JComboBox<>();
        JCB_Hora = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JL_Salida.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JL_Salida.setText("Salida:");

        JL_Destino.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JL_Destino.setText("Destino:");

        JL_Fecha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JL_Fecha.setText("Fecha:");

        JT_Rutas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Salida", "Destino", "Fecha"
            }
        ));
        JSP_Rutas.setViewportView(JT_Rutas);
        if (JT_Rutas.getColumnModel().getColumnCount() > 0) {
            JT_Rutas.getColumnModel().getColumn(2).setResizable(false);
        }

        JB_AgregarRuta.setText("Agregar ruta");
        JB_AgregarRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_AgregarRutaActionPerformed(evt);
            }
        });

        JB_MostrarRutas.setText("Mostrar rutas");
        JB_MostrarRutas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_MostrarRutasActionPerformed(evt);
            }
        });

        JL_Hora.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JL_Hora.setText("Hora:");

        JCB_Salida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "Portoviejo" }));

        JCB_Destino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "Cuenca", "Guayaquil", "Ibarra", "Loja", "Machala", "Manta", "Quito" }));

        JCB_Hora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A", "05:00", "05:30", "06:00", "06:30", "07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30" }));

        javax.swing.GroupLayout JP_BackgroundLayout = new javax.swing.GroupLayout(JP_Background);
        JP_Background.setLayout(JP_BackgroundLayout);
        JP_BackgroundLayout.setHorizontalGroup(
            JP_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JP_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(JSP_Rutas, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(JP_BackgroundLayout.createSequentialGroup()
                        .addGroup(JP_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(JP_BackgroundLayout.createSequentialGroup()
                                .addComponent(JL_Destino)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JCB_Destino, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(JP_BackgroundLayout.createSequentialGroup()
                                .addComponent(JL_Salida)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JCB_Salida, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JP_BackgroundLayout.createSequentialGroup()
                                .addComponent(JL_Fecha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JDC_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JL_Hora)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JCB_Hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JP_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JB_AgregarRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JB_MostrarRutas))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JP_BackgroundLayout.setVerticalGroup(
            JP_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JP_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JL_Salida)
                    .addComponent(JB_AgregarRuta)
                    .addComponent(JCB_Salida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JP_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JL_Destino)
                    .addComponent(JB_MostrarRutas)
                    .addComponent(JCB_Destino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JP_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JP_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JL_Hora, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JCB_Hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JP_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(JDC_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JL_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JSP_Rutas, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JP_Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JP_Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JB_AgregarRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_AgregarRutaActionPerformed
        Data dt = new Data();
        if (JCB_Destino.getSelectedIndex() == 0 || JCB_Salida.getSelectedIndex() == 0 || JDC_Fecha.equals(null) || JCB_Hora.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Ingrese los datos solicitados para continuar.");
        } else {
            dt.setSalida((String) JCB_Salida.getSelectedItem());
            dt.setDestino((String) JCB_Destino.getSelectedItem());
            SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyyy");
            String date = dFormat.format(JDC_Fecha.getDate());
            dt.setFecha(date);
            dt.setHora((String) JCB_Hora.getSelectedItem());
            route.add(dt);
            clearFields();
            limpiarTabla();
            cargar();
        }
    }//GEN-LAST:event_JB_AgregarRutaActionPerformed

    private void JB_MostrarRutasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_MostrarRutasActionPerformed
        Thread thread = new Thread(this);
        thread.start();
    }//GEN-LAST:event_JB_MostrarRutasActionPerformed

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
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB_AgregarRuta;
    private javax.swing.JButton JB_MostrarRutas;
    private javax.swing.JComboBox<String> JCB_Destino;
    private javax.swing.JComboBox<String> JCB_Hora;
    private javax.swing.JComboBox<String> JCB_Salida;
    private com.toedter.calendar.JDateChooser JDC_Fecha;
    private javax.swing.JLabel JL_Destino;
    private javax.swing.JLabel JL_Fecha;
    private javax.swing.JLabel JL_Hora;
    private javax.swing.JLabel JL_Salida;
    private javax.swing.JPanel JP_Background;
    private javax.swing.JScrollPane JSP_Rutas;
    private javax.swing.JTable JT_Rutas;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        Destinations dest = new Destinations();
        if (JT_Rutas.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "No hay rutas disponibles en este momento.");
        } else {
            dest.setVisible(true);
            for (int i = 0; i < route.size(); i++) {
                try {
                    String salida = route.get(i).getSalida();
                    String destino = route.get(i).getDestino();
                    String fecha = route.get(i).getFecha();
                    String hora = route.get(i).getHora();
                    String ruta = "Salida: " + salida + " - Destino: " + destino + " - Fecha: " + fecha + " - Hora: " + hora;
                    dest.JL_Ruta.setText(ruta);
                    System.out.println(ruta);
                    Thread.sleep(3000);
                } catch (InterruptedException ex) {
                    System.out.println("Error: " + ex.toString());
                }
            }
        }
    }

    private void clearFields() {
        JCB_Salida.setSelectedIndex(0);
        JCB_Destino.setSelectedIndex(0);
        JCB_Hora.setSelectedIndex(0);
        JDC_Fecha.setCalendar(null);
    }

    public void cargar() {
        Object[] ob = new Object[3];
        for (int i = 0; i < route.size(); i++) {
            ob[0] = route.get(i).getSalida();
            ob[1] = route.get(i).getDestino();
            ob[2] = route.get(i).getFecha() + " " + route.get(i).getHora();
            modelo.addRow(ob);
        }
        JT_Rutas.setModel(modelo);
    }

    public void limpiarTabla() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i -= 1;
        }
    }
}
