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
import javax.swing.table.TableRowSorter;
import javax.swing.RowFilter;

public class SearchUtils {
    public static boolean binarySearch(String searchTerm, JTable table) {
        DefaultTableModel tblModel = (DefaultTableModel) table.getModel();
        int rowCount = tblModel.getRowCount();
        // Implement binary search logic here
        return false;  // Placeholder, replace with actual logic
    }

    public static void applyFilter(JTable table, RowFilter<DefaultTableModel, Object> filter) {
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>((DefaultTableModel) table.getModel());
        table.setRowSorter(sorter);
        sorter.setRowFilter(filter);
    }
}
