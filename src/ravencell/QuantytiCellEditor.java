/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ravencell;

import entity.Invoice_detail;
import entity.Invoices;
import entity.Product;
import handlers.Product_DAO;
import java.awt.Component;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author Dell
 */
public class QuantytiCellEditor extends DefaultCellEditor{
    private JSpinner input;
    private JTable table;
    private int row;
//    private JButton jbTong;
    
    public QuantytiCellEditor() {
        super(new JCheckBox());
                
        input = new JSpinner();
        SpinnerNumberModel numberModel = (SpinnerNumberModel) input.getModel();
        numberModel.setMinimum(1);
        JSpinner.NumberEditor editor = (JSpinner.NumberEditor) input.getEditor();
      
        editor.getTextField().setHorizontalAlignment(SwingConstants.CENTER);
        input.addChangeListener((ChangeEvent e) -> {
            inputChange();
        });
        
        
        
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        super.getTableCellEditorComponent(table, value, isSelected, row, column);
        this.table = table;
        this.row = row;
        int qty = Integer.parseInt(value.toString());
        input.setValue(qty);
        input.setEnabled(false);
        enable();
        return input;
    }
    
    private void enable(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(100);
                    input.setEnabled(true);
                } catch (InterruptedException ex) {
                    Logger.getLogger(QuantytiCellEditor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }).start();
    }

    @Override
    public Object getCellEditorValue() {
        return input.getValue();
    }
    
//    private void inputChange(){
//        int qty = Integer.parseInt(input.getValue().toString());
//        int qtyOld = (int) table.getValueAt(row, 3);
//        if(qty != qtyOld){
//            double price = (double) table.getValueAt(row, 2);
//            double total = qty*price;
//            table.setValueAt(total, row, 4);
//        }
//    }
    private void inputChange(){
        int qty = Integer.parseInt(input.getValue().toString());
        int qtyOld = (int) table.getValueAt(row, 3);
//        if(qty != qtyOld){
            Product_DAO dao=new Product_DAO();
            Product pro=dao.getProduct((String) table.getValueAt(row, 0));
//            double price = (double) table.getValueAt(row, 2);
                Invoice_detail item=new Invoice_detail(pro, qty,new Invoices());
            double total = item.caculatorEachItem();
//            double total=qty*price; 
            DecimalFormat df=new DecimalFormat("#,###.00VND");
            table.setValueAt(df.format(total), row, 4);
//            updateTotalPrice();
            
//        }
    }
    
    
}
