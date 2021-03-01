/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.donglenh.chuong01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author ViettelStore
 */
public class Bai5 {
    public static void main(String[] args) throws ParseException {
        // Chuyenkieu du lieu Date thanh String
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss", Locale.ENGLISH);
        Date currentDate = new Date();
        String output = df.format(currentDate);
        System.out.println(output);
        
        // Chuyen kieu du lieu tu String thanh Date
        String input = "15-05-1995";
        Date ngay = df.parse(input);
        System.out.println(ngay);
        System.out.print(df.format(ngay));
    }
}
