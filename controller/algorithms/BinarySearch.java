/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author llll
 */

    

package com.mattressapp.controller.algorithms;

import javax.swing.table.DefaultTableModel;

public class BinarySearch {

    /**
     * Performs binary search on a DefaultTableModel by a specific column.
     *
     * @param model the table model to search
     * @param searchName the name to search for
     * @param columnIndex the index of the column to search
     * @return the index of the matching row, or -1 if not found
     */
    public int search(DefaultTableModel model, String searchName, int columnIndex) {
        int low = 0;
        int high = model.getRowCount() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            String midName = model.getValueAt(mid, columnIndex).toString();

            int comparison = searchName.compareToIgnoreCase(midName);

            if (comparison == 0) {
                return mid; // Name found
            } else if (comparison < 0) {
                high = mid - 1; // Search the lower half
            } else {
                low = mid + 1; // Search the upper half
            }
        }

        return -1; // Name not found
    }
}
