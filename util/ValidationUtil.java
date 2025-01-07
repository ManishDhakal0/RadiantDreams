package com.mattressapp.util;

import java.util.regex.Pattern;

public class ValidationUtil {

    // Regular expression patterns
    private static final Pattern NAME_PATTERN = Pattern.compile("^[a-zA-Z\\s]+$");
    private static final Pattern PRODUCT_ID_PATTERN = Pattern.compile("^1\\d{3}$"); // 4 digits starting with 1
    private static final Pattern ADDRESS_PATTERN = Pattern.compile("^[a-zA-Z\\s]+$");
    private static final Pattern CONTACT_PATTERN = Pattern.compile("^98\\d{8}$"); // Nepal contact number format

    /**
     * Validates if a string is null or empty.
     *
     * @param value the string to validate
     * @return true if the string is null or empty, otherwise false
     */
    public static boolean isNullOrEmpty(String value) {
        return value == null || value.trim().isEmpty();
    }

    /**
     * Validates if the product ID is exactly 4 digits starting with 1.
     *
     * @param productId the product ID to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidProductId(String productId) {
        return !isNullOrEmpty(productId) && PRODUCT_ID_PATTERN.matcher(productId).matches();
    }

    /**
     * Validates if the customer name contains only alphabets and spaces.
     *
     * @param customerName the name to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidCustomerName(String customerName) {
        return !isNullOrEmpty(customerName) && NAME_PATTERN.matcher(customerName).matches();
    }

    /**
     * Validates if the address contains only alphabets and spaces.
     *
     * @param address the address to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidAddress(String address) {
        return !isNullOrEmpty(address) && ADDRESS_PATTERN.matcher(address).matches();
    }

    /**
     * Validates if the quantity is between 1 and 20 (inclusive).
     *
     * @param quantity the quantity to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidQuantity(String quantity) {
        try {
            int qty = Integer.parseInt(quantity.trim());
            return qty >= 1 && qty <= 20;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /**
     * Validates if the contact number starts with 98 and has 10 digits in total.
     *
     * @param contact the contact number to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidContact(String contact) {
        return !isNullOrEmpty(contact) && CONTACT_PATTERN.matcher(contact).matches();
    }

    /**
     * Validates if a field satisfies both non-empty and specific criteria.
     *
     * @param value      the field value to validate
     * @param isCriteria the specific criteria to validate against
     * @return true if both non-empty and criteria validation pass, otherwise false
     */
    public static boolean validateField(String value, boolean isCriteria) {
        return !isNullOrEmpty(value) && isCriteria;
    }
    
}
