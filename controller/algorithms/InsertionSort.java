package com.mattressapp.controller.algorithms;

import javax.swing.table.DefaultTableModel;

public class InsertionSort {

    // Sorts a JTable model by the Customer Name column in ascending or descending order.

    
    public void sortByCustomerName(DefaultTableModel model, int columnIndex, boolean isDesc) {
        int rowCount = model.getRowCount();

        for (int i = 1; i < rowCount; i++) {
            Object[] currentRow = new Object[model.getColumnCount()];
            for (int col = 0; col < model.getColumnCount(); col++) {
                currentRow[col] = model.getValueAt(i, col);
            }

            int j = i - 1;
            while (j >= 0) {
                String currentName = currentRow[columnIndex].toString();
                String previousName = model.getValueAt(j, columnIndex).toString();

                // Comparison logic for ascending or descending
                if ((isDesc && currentName.compareToIgnoreCase(previousName) > 0) ||
                    (!isDesc && currentName.compareToIgnoreCase(previousName) < 0)) {
                    for (int col = 0; col < model.getColumnCount(); col++) {
                        model.setValueAt(model.getValueAt(j, col), j + 1, col);
                    }
                    j--;
                } else {
                    break;
                }
            }

            for (int col = 0; col < model.getColumnCount(); col++) {
                model.setValueAt(currentRow[col], j + 1, col);
            }
        }
    }
}

