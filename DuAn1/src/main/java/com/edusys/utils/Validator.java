/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edusys.utils;

import java.util.Date;

/**
 *
 * @author HP
 */
public class Validator {
   
    public static boolean isDouble(String str) {
        try {
            Double.parseDouble(str);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
    
    public static boolean isInt(String str) {
        try {
            Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
    
    public static boolean isTel(String sdt) {
        String pattern = "0[0-9]{9,10}";
        return sdt.matches(pattern);
    }

    public static boolean isEmail(String email) {
        String pattern = "\\w+@\\w+(\\.\\w+){1,2}";
        return email.matches(pattern);
    }
    
    public static boolean isValidDate(Date date) {
        return (XDate.now().getYear() - date.getYear()) >= 12; 
    }
    
    public static boolean isValidName(String name) {
        name = name.toLowerCase();
        String pattern = "^([a-zỳọáầảấờễàạằệếýộậốũứĩõúữịỗìềểẩớặòùồợãụủíỹắẫựỉỏừỷởóéửỵẳẹèẽổẵẻỡơôưăêâđ]+)"
                + "((\\s{1}[a-zỳọáầảấờễàạằệếýộậốũứĩõúữịỗìềểẩớặòùồợãụủíỹắẫựỉỏừỷởóéửỵẳẹèẽổẵẻỡơôưăêâđ]+){1,})$";
        return name.matches(pattern); 
    }
    
    public static boolean isValidPass(String password) {
        return (password.length() >= 6 && password.length() <= 15);
    }
    
    public static boolean isMatchPass(String pass1, String pass2) {
        return pass1.equals(pass2);
    }

    public static boolean isLength(String maNV, int length) {
       return maNV.length() <= length;
    }
}
