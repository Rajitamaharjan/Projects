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

public class FilterUtils {
    public static void filterTable(int columnIndex, String selectedValue, JTable table) {
        DefaultTableModel tblModel = (DefaultTableModel) table.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>((DefaultTableModel) table.getModel());
        table.setRowSorter(sorter);

        RowFilter<DefaultTableModel, Object> filter = new RowFilter<DefaultTableModel, Object>() {
            @Override
            public boolean include(Entry<? extends DefaultTableModel, ? extends Object> entry) {
                String columnValue = (String) entry.getValue(columnIndex);
                return selectedValue.equals("All") || selectedValue.equals(columnValue);
            }
        };

        sorter.setRowFilter(filter);
    }
}