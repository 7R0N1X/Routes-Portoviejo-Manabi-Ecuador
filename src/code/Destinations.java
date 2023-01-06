package code;

/**
 *
 * @author 7R0N1X
 */
public class Destinations extends javax.swing.JFrame {

    public Destinations() {
        initComponents();
        this.setTitle("Rutas");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JP_Background = new javax.swing.JPanel();
        JL_Ruta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        JL_Ruta.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        JL_Ruta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL_Ruta.setText("Ruta:");
        JL_Ruta.setToolTipText("");

        javax.swing.GroupLayout JP_BackgroundLayout = new javax.swing.GroupLayout(JP_Background);
        JP_Background.setLayout(JP_BackgroundLayout);
        JP_BackgroundLayout.setHorizontalGroup(
            JP_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JL_Ruta, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)
                .addContainerGap())
        );
        JP_BackgroundLayout.setVerticalGroup(
            JP_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JL_Ruta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JP_Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JP_Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel JL_Ruta;
    private javax.swing.JPanel JP_Background;
    // End of variables declaration//GEN-END:variables
}
