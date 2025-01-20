package com.mattressapp.controller.algorithms;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.List;

public class MergeSort {

     //Sorts a JTable model by the Customer Address column using merge sort.
   
    public void sortByCustomerAddress(DefaultTableModel model, int columnIndex, boolean isDesc) {
        int rowCount = model.getRowCount();
        List<Object[]> rows = new ArrayList<>();

        // Copy rows from the model to a list
        for (int i = 0; i < rowCount; i++) {
            Object[] row = new Object[model.getColumnCount()];
            for (int col = 0; col < model.getColumnCount(); col++) {
                row[col] = model.getValueAt(i, col);
            }
            rows.add(row);
        }
        // Sort the rows using merge sort
        List<Object[]> sortedRows = mergeSort(rows, columnIndex, isDesc);

        // Update the model with the sorted rows
        for (int i = 0; i < sortedRows.size(); i++) {
            Object[] row = sortedRows.get(i);
            for (int col = 0; col < model.getColumnCount(); col++) {
                model.setValueAt(row[col], i, col);
            }
        }
    }
    private List<Object[]> mergeSort(List<Object[]> rows, int columnIndex, boolean isDesc) {
        if (rows.size() <= 1) {
            return rows;
        }
        int mid = rows.size() / 2;
        List<Object[]> left = mergeSort(rows.subList(0, mid), columnIndex, isDesc);
        List<Object[]> right = mergeSort(rows.subList(mid, rows.size()), columnIndex, isDesc);

        return merge(left, right, columnIndex, isDesc);
    }
    private List<Object[]> merge(List<Object[]> left, List<Object[]> right, int columnIndex, boolean isDesc) {
        List<Object[]> merged = new ArrayList<>();
        int i = 0, j = 0;

        while (i < left.size() && j < right.size()) {
            String leftValue = left.get(i)[columnIndex].toString();
            String rightValue = right.get(j)[columnIndex].toString();

            if ((isDesc && leftValue.compareToIgnoreCase(rightValue) > 0) ||
                (!isDesc && leftValue.compareToIgnoreCase(rightValue) <= 0)) {
                merged.add(left.get(i++));
            } else {
                merged.add(right.get(j++));
            }
        }
        while (i < left.size()) {
            merged.add(left.get(i++));
        }
        while (j < right.size()) {
            merged.add(right.get(j++));
        }
        return merged;
    }
}
