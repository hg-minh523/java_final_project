/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ravencell;

import javax.swing.Icon;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dell
 */
public class TheModel extends AbstractTableModel{
    private String[] columns;
    private Object[][] rows;
    
    public TheModel(){}
    
    public TheModel(Object[][] data, String[] columnName){
        this.rows = data;
        this.columns = columnName;
    }
    public Class getColumnClass(int column){
        if(column == 0){
            return Icon.class;
        }else{
            return getValueAt(0, column).getClass();
        }
    }

    @Override
    public int getRowCount() {
        return this.rows.length;
    }

   @Override
    public int getColumnCount() {
        
        return this.columns.length;
       
    }

   @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return rows[rowIndex][columnIndex];

    }
    @Override
    public String getColumnName(int col){
        return this.columns[col];
    }
    boolean[] canEdit = new boolean [] {
        false, false, false, true
    };

    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
    }
    
    
//  public void removeRow(int rowIndex) {
//      if (rowIndex >= 0 && rowIndex < getRowCount()) {
//         this.removeRow(rowIndex);
//      }
//  }
    public void removeRow(int rowIndex) {
        if (rowIndex >= 0 && rowIndex < getRowCount()) {
            Object[][] newData = new Object[getRowCount() - 1][getColumnCount()];
            System.arraycopy(rows, 0, newData, 0, rowIndex);
            System.arraycopy(rows, rowIndex + 1, newData, rowIndex, getRowCount() - rowIndex - 1);
            rows = newData;
            fireTableRowsDeleted(rowIndex, rowIndex); // Notify JTable about deletion
        }
}
        
}
