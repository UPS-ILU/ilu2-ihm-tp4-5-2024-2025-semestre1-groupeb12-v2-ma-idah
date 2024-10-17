/*Your assignment is due by Oct 21, 2024, 19:59 UTC

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dialog;

import interface_noyau_fonctionnel.InterfaceNoyauFonctionnel;
import java.awt.EventQueue;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import presentation.FrameReservation;

public class DialogReservation {

    private FrameReservation frameReservation;
    private InterfaceNoyauFonctionnel inf;
   

    public DialogReservation(InterfaceNoyauFonctionnel inf) {
        this.inf = inf;
    }

    public void initDialog() {
        frameReservation = new FrameReservation();
        frameReservation.initFrame();
        frameReservation.setDialog(this);
        frameReservation.setVisible(true);
    }

    public void handleDateSelectedEvent(LocalDate date) {
       
        //System.out.println(date);pour afficher la date
        inf.dateChoisie();
        frameReservation.enableHourSelector();
        
        
    }

    public void handleTimeSelectedEvent(String time) {
        
        inf.heureChoisie();
        frameReservation.enablenbPersSelector();
    }

    public void handleNumOfPersonsSelectedEvent(int nbPersons) {
        
        String[] tables = inf.tablesDisponibles(nbPersons);
        frameReservation.getTablePicker().setListData(tables);

        frameReservation.enabletableSelector();
    }

    public void handleTableSelectedEvent(int numTable) {
        
        inf.tableChoisie(numTable);
        frameReservation.enablevaliderSelector();
    }

    public void handleCancelEvent() {
        inf.annuler();
        frameReservation.annulation();
    }

    public void handleValidationEvent() {
        inf.confirmation();
                
        frameReservation.validation();
      
    }

    public static void main(String[] args) {
        DialogReservation dialog = new DialogReservation(new InterfaceNoyauFonctionnel());
        EventQueue.invokeLater(() -> {
            dialog.initDialog();
        });
    }
    
   

}
