package com.mattressapp.controller.algorithms;

import com.mattressapp.model.MattressModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Prithivi
 */
public class SelectionSort {
    List<MattressModel> studentSortList;

    
    public SelectionSort(){
        studentSortList = new ArrayList<>();
    }
    /**
     * Sorts a list of MattressModel objects by their LMU ID in ascending or
 descending order.
     *
     * @param studentList the list of MattressModel objects to be sorted
     * @param isDesc specifies the sort order (true for descending, false for
     * ascending)
     * @return the sorted list
     */
    public List<MattressModel> sortByLmuId(List<MattressModel> studentList, boolean isDesc) {
        this.studentSortList.clear();
        this.studentSortList.addAll(studentList);
        if (studentSortList == null || studentSortList.isEmpty()) {
            throw new IllegalArgumentException("Student list cannot be null or empty.");
        }

        for (int i = 0; i < studentSortList.size() - 1; i++) {
            int extremumIndex = findExtremumIndex(studentSortList, i, isDesc);
            if (i != extremumIndex) {
                swap(studentSortList, i, extremumIndex);
            }
        }

        return studentSortList;
    }

    /**
     * Finds the index of the extremum value (minimum or maximum) in the list
     * from the start index.
     *
     * @param studentSortList the list of MattressModel objects
     * @param startIndex the index to start searching from
     * @param isDesc specifies whether to find the maximum (true) or minimum
     * (false)
     * @return the index of the extremum value
     */
    private int findExtremumIndex(List<MattressModel> studentSortList, int startIndex, boolean isDesc) {
        int extremumIndex = startIndex;

        for (int j = startIndex + 1; j < studentSortList.size(); j++) {
            if (shouldSwap(studentSortList.get(j).getLmuId(), studentSortList.get(extremumIndex).getLmuId(), isDesc)) {
                extremumIndex = j;
            }
        }

        return extremumIndex;
    }

    /**
     * Determines whether the current value should replace the current extremum
     * based on sort order.
     *
     * @param current the current value
     * @param extremum the current extremum value
     * @param isDesc specifies the sort order (true for descending, false for
     * ascending)
     * @return true if the current value should replace the extremum; false
     * otherwise
     */
    private boolean shouldSwap(int current, int extremum, boolean isDesc) {
        return isDesc ? current > extremum : current < extremum;
    }

    /**
     * Swaps two elements in the list.
     *
     * @param studentSortList the list of MattressModel objects
     * @param i the index of the first element
     * @param j the index of the second element
     */
    private void swap(List<MattressModel> studentSortList, int i, int j) {
        MattressModel temp = studentSortList.get(i);
        studentSortList.set(i, studentSortList.get(j));
        studentSortList.set(j, temp);
    }
}
