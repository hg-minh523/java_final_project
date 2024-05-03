/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ravencell;

import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JTable;

/**
 *
 * @author Dell
 */
public class TableActionCellEditor_Home extends DefaultCellEditor {
    private TableActionEvent_Home event;
    public TableActionCellEditor_Home(TableActionEvent_Home event) {
        super(new JCheckBox());
        this.event = event;
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        PanelAction_Home action = new PanelAction_Home();
        action.initEven(event, row);
        action.setBackground(table.getSelectionBackground());
        return action;
    }
}
