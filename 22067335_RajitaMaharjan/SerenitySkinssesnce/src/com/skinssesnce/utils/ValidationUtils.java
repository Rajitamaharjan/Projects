/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.skinssesnce.utils;

/**
 *
 * @author rajitamaharjan
 */

import javax.swing.JOptionPane;

public class ValidationUtils {

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isPositiveNumeric(String str) {
        if (isNumeric(str)) {
            double value = Double.parseDouble(str);
            return value > 0;
        }
        return false;
    }

    public static boolean isNonEmptyString(String str) {
        return str != null && !str.trim().isEmpty();
    }

    public static void showValidationError(String fieldName) {
        JOptionPane.showMessageDialog(null, "Please enter a valid " + fieldName + ".", "Validation Error", JOptionPane.ERROR_MESSAGE);
    }
}
