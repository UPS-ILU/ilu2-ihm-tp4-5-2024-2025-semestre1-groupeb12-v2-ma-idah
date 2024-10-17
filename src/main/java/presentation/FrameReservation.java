//Your assignment is due by Oct 21, 2024, 19:59 UTC (21h59 


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentation;

import com.github.lgooddatepicker.optionalusertools.DateChangeListener;
import com.github.lgooddatepicker.zinternaltools.DateChangeEvent;
import dialog.DialogReservation;
import java.time.LocalDate;
import javax.swing.JList;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.DEFAULT_OPTION;

@SuppressWarnings("serial")
public class FrameReservation extends javax.swing.JFrame {

    private DialogReservation dialog;

    public FrameReservation() {
    }

    public void initFrame() {
        initComponents();
    }

    public void setDialog(DialogReservation dialog) {
        this.dialog = dialog;
    }

    // /!\ /!\ /!\ ATTENTION /!\ /!\ /!\
    // ce code est auto généré et ne doit PAS être modifié
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateTimePanel = new javax.swing.JPanel();
        datePicker = new com.github.lgooddatepicker.components.DatePicker();
        datePicker.addDateChangeListener(new DateChangeListener(){
            public void dateChanged(DateChangeEvent dateEvent) {
                datePickerDateChanged(dateEvent);
            }
        });
        Date = new javax.swing.JLabel();
        heure = new javax.swing.JLabel();
        timePicker = new javax.swing.JComboBox<>();
        nbPersonsPanel = new javax.swing.JPanel();
        nbPers = new javax.swing.JLabel();
        nbPersPicker = new javax.swing.JComboBox<>();
        pickTablePanel = new javax.swing.JPanel();
        tablesImage = new javax.swing.JLabel();
        table = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePicker = new javax.swing.JList<>();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        validerButton = new javax.swing.JButton();
        annulerButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dateTimePanel.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        Date.setText("1. Choisissez la date");

        heure.setText("2. Choisissez l'heure");
        heure.setEnabled(false);

        timePicker.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "11h30", "12h00", "12h30", "13h00", "13h30" }));
        timePicker.setSelectedIndex(-1);
        timePicker.setSelectedItem(null);
        timePicker.setEnabled(false);
        timePicker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timePickerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dateTimePanelLayout = new javax.swing.GroupLayout(dateTimePanel);
        dateTimePanel.setLayout(dateTimePanelLayout);
        dateTimePanelLayout.setHorizontalGroup(
            dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dateTimePanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Date)
                    .addComponent(datePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(heure)
                    .addComponent(timePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
        );
        dateTimePanelLayout.setVerticalGroup(
            dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dateTimePanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Date)
                    .addComponent(heure))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        datePicker.getAccessibleContext().setAccessibleName("");
        datePicker.getAccessibleContext().setAccessibleDescription("");

        nbPersonsPanel.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        nbPers.setText("3. Indiquez le nombre de personnes");
        nbPers.setEnabled(false);

        nbPersPicker.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4", "5", "6", "7", "8" }));
        nbPersPicker.setSelectedIndex(-1);
        nbPersPicker.setSelectedItem(null);
        nbPersPicker.setEnabled(false);
        nbPersPicker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nbPersPickerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout nbPersonsPanelLayout = new javax.swing.GroupLayout(nbPersonsPanel);
        nbPersonsPanel.setLayout(nbPersonsPanelLayout);
        nbPersonsPanelLayout.setHorizontalGroup(
            nbPersonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nbPersonsPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(nbPersonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nbPersPicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nbPers))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        nbPersonsPanelLayout.setVerticalGroup(
            nbPersonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nbPersonsPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(nbPers)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nbPersPicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pickTablePanel.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        tablesImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Plan_tables.jpg"))); // NOI18N
        tablesImage.setEnabled(false);

        table.setText("4. Choisissez votre table");
        table.setEnabled(false);

        tablePicker.setEnabled(false);
        tablePicker.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                tablePickerValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(tablePicker);

        javax.swing.GroupLayout pickTablePanelLayout = new javax.swing.GroupLayout(pickTablePanel);
        pickTablePanel.setLayout(pickTablePanelLayout);
        pickTablePanelLayout.setHorizontalGroup(
            pickTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pickTablePanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pickTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pickTablePanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(tablesImage, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(table))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pickTablePanelLayout.setVerticalGroup(
            pickTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pickTablePanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(table)
                .addGroup(pickTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pickTablePanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tablesImage, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE))
                    .addGroup(pickTablePanelLayout.createSequentialGroup()
                        .addGroup(pickTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pickTablePanelLayout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pickTablePanelLayout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        validerButton.setText("Valider");
        validerButton.setEnabled(false);
        validerButton.setFocusCycleRoot(true);
        validerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validerButtonActionPerformed(evt);
            }
        });

        annulerButton.setText("Annuler");
        annulerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annulerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateTimePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nbPersonsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pickTablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(207, Short.MAX_VALUE)
                .addComponent(validerButton)
                .addGap(32, 32, 32)
                .addComponent(annulerButton)
                .addGap(280, 280, 280))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(dateTimePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nbPersonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pickTablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(validerButton)
                    .addComponent(annulerButton))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void nbPersPickerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nbPersPickerActionPerformed
        // TODO add your handling code here:
       
        if ( nbPersPicker.getSelectedItem() != null){
            String selectedNbStr = (String) nbPersPicker.getSelectedItem();
            int selectedNb = Integer.parseInt(selectedNbStr);
            dialog.handleNumOfPersonsSelectedEvent(selectedNb);}
    }//GEN-LAST:event_nbPersPickerActionPerformed

    private void timePickerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timePickerActionPerformed
        /// Appeler la méthode dans dialogReservation
        if (timePicker.getSelectedItem() != null){
             String selectedTime = (String)timePicker.getSelectedItem();
            dialog.handleTimeSelectedEvent(selectedTime);
        }
       
    }//GEN-LAST:event_timePickerActionPerformed

    private void annulerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annulerButtonActionPerformed
        // TODO add your handling code here:
        dialog.handleCancelEvent();
    }//GEN-LAST:event_annulerButtonActionPerformed

    private void tablePickerValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_tablePickerValueChanged
        // TODO add your handling code here:
        if (tablePicker.getSelectedValue() != null){
            String selectedTable = tablePicker.getSelectedValue();
            String[] parts = selectedTable.split(" "); // Sépare la chaîne par espaces
            int numTable = Integer.parseInt(parts[1]); // Convertit le numéro de table en entier

            dialog.handleTableSelectedEvent(numTable);
            }
        
        
    }//GEN-LAST:event_tablePickerValueChanged

    private void validerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validerButtonActionPerformed
        // TODO add your handling code here:
        //numero de table
        
        dialog.handleValidationEvent();
    }//GEN-LAST:event_validerButtonActionPerformed

    
    public void datePickerDateChanged(DateChangeEvent dateEvent) {
        dialog.handleDateSelectedEvent(dateEvent.getNewDate());
                
    }
    
    public JList<String> getTablePicker() {
    return tablePicker; 
}
    
    
    public void annulation(){
        datePicker.setDate(null);

        //for (int i = 0  ; i< (int) tablePicker.getSize(); i++){
        tablePicker.setSelectedValue(null, true);
        tablePicker.setListData(new String[0]);
    
        timePicker.setSelectedItem(null); 

        nbPersPicker.setSelectedItem(null); 
        diseableAnnulerSelector();
    }
    
    public void enableHourSelector(){//permet de degriser les composants
    heure.setEnabled(true);
    timePicker.setEnabled(true);
    }
    
    public void enablenbPersSelector(){//permet de degriser les composants
    nbPers.setEnabled(true);
    nbPersPicker.setEnabled(true);
    }
    
    public void enabletableSelector(){//permet de degriser les composants
    table.setEnabled(true);
    tablesImage.setEnabled(true);
    tablePicker.setEnabled(true);
    }
    
    public void enablevaliderSelector(){//permet de degriser les composants
    validerButton.setEnabled(true);
    
    }
    public void diseableAnnulerSelector(){//permet de degriser les composants
        heure.setEnabled(false); // Désactive l'étiquette d'heure
        timePicker.setEnabled(false); // Désactive le sélecteur d'heure
        nbPers.setEnabled(false); // Désactive l'étiquette de nombre de personnes
        nbPersPicker.setEnabled(false); // Désactive le sélecteur de nombre de personnes
        table.setEnabled(false); // Désactive l'étiquette de la table
        tablesImage.setEnabled(false); // Désactive l'image des tables
        tablePicker.setEnabled(false); // Désactive le sélecteur de tables
         
        validerButton.setEnabled(false);
    
    }
    
    public void validation(){
        String selectedTable = tablePicker.getSelectedValue();
        String[] parts = selectedTable.split(" "); // Sépare la chaîne par espaces
        int numTable = Integer.parseInt(parts[1]); // Convertit le numéro de table en entier
        
        //heure
        String time = (String)timePicker.getSelectedItem();
        
        //date
        LocalDate date = datePicker.getDate();  
         
            
        //nb de personnes 
        String selectedNbStr = (String) nbPersPicker.getSelectedItem();
        int nbPersonnes = Integer.parseInt(selectedNbStr);
        
        String message = "Réservation validée pour le "  +  date +  " à "  +  time +  " pour "  +  nbPersonnes  +  " personnes à la " +
" Table " + numTable + ".";

        JOptionPane.showMessageDialog(this, message, "Confirmation de réservation", JOptionPane.DEFAULT_OPTION );}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Date;
    private javax.swing.JButton annulerButton;
    private com.github.lgooddatepicker.components.DatePicker datePicker;
    private javax.swing.JPanel dateTimePanel;
    private javax.swing.JLabel heure;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel nbPers;
    private javax.swing.JComboBox<String> nbPersPicker;
    private javax.swing.JPanel nbPersonsPanel;
    private javax.swing.JPanel pickTablePanel;
    private javax.swing.JLabel table;
    private javax.swing.JList<String> tablePicker;
    private javax.swing.JLabel tablesImage;
    private javax.swing.JComboBox<String> timePicker;
    private javax.swing.JButton validerButton;
    // End of variables declaration//GEN-END:variables

}
