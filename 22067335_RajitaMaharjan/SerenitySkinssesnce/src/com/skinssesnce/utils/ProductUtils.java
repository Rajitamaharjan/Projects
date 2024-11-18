/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.skinssesnce.utils;

/**
 *
 * @author rajitamaharjan
 */
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ProductUtils {
    public static void addProduct(JTable table, String[] data) {
        DefaultTableModel tblModel = (DefaultTableModel) table.getModel();
        tblModel.addRow(data);
    }

    public static void updateProduct(JTable table, String[] data, int selectedRow) {
        DefaultTableModel tblModel = (DefaultTableModel) table.getModel();
        for (int i = 0; i < data.length; i++) {
            tblModel.setValueAt(data[i], selectedRow, i);
        }
    }

    public static void deleteProduct(JTable table, int selectedRow) {
        DefaultTableModel tblModel = (DefaultTableModel) table.getModel();
        tblModel.removeRow(selectedRow);
    }
}
