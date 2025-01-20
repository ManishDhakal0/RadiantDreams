package com.mattressapp.controller.algorithms;

import javax.swing.table.DefaultTableModel;

public class SelectionSort {

    // Sorts a JTable model by the Product ID column in ascending or descending order.
   
    public void sortByProductId(DefaultTableModel model, int columnIndex, boolean isDesc) {
        int rowCount = model.getRowCount();

        for (int i = 0; i < rowCount - 1; i++) {
            int extremumIndex = i;

            for (int j = i + 1; j < rowCount; j++) {
                int currentId = Integer.parseInt(model.getValueAt(j, columnIndex).toString());
                int extremumId = Integer.parseInt(model.getValueAt(extremumIndex, columnIndex).toString());

                if ((isDesc && currentId > extremumId) || (!isDesc && currentId < extremumId)) {
                    extremumIndex = j;
                }
            }

            if (i != extremumIndex) {
                swapRows(model, i, extremumIndex);
            }
        }
    }

    /**
     * Swaps two rows in the table model.
   
     */
    private void swapRows(DefaultTableModel model, int row1, int row2) {
        int columnCount = model.getColumnCount();
        Object[] tempRow = new Object[columnCount];

        // Save the first row
        for (int col = 0; col < columnCount; col++) {
            tempRow[col] = model.getValueAt(row1, col);
        }

        // Move the second row to the first row
        for (int col = 0; col < columnCount; col++) {
            model.setValueAt(model.getValueAt(row2, col), row1, col);
        }

        // Move the saved first row to the second row
        for (int col = 0; col < columnCount; col++) {
            model.setValueAt(tempRow[col], row2, col);
        }
    }
}
