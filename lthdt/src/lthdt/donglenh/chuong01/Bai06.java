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
public class Bai06 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        String input = "11-03-2001";
        Date ngaysinh = df.parse(input);
        Person person = new Person("Nguyen Van A",1,ngaysinh);
        
        System.out.println("Ho Ten: " + person.getHoten() + "; Gioi Tinh: " + person.getGioitinh()+ ";  Ngay Sinh: " + df.format(person.getNgaysinh()));
        
        
        Student sinhvien = new Student();
        sinhvien.setHoten("Nguyen  Van B");
        sinhvien.setGioitinh(1);
        sinhvien.setNgaysinh(df.parse("12-12-2002"));
        sinhvien.setTruonghoc("Dai Hoc Hue");
        System.out.println(sinhvien.getHoten() + "; Gioi Tinh " +
                sinhvien.getGioitinh() + "; Ngay Sinh " + 
                df.format(sinhvien.getNgaysinh()) + "; "+ 
                        sinhvien.getTruonghoc());
        
        Worker CongNhan = new Worker();
        CongNhan.setHoten("Nguyen Thi C");
        CongNhan.setGioitinh(0);
        CongNhan.setNgaysinh(df.parse("02-09-2003"));
        CongNhan.setCongty("IMB");
        System.out.println(CongNhan.getHoten() + "; Gioi Tinh " +
                CongNhan.getGioitinh() + "; Ngay Sinh " + 
                df.format(CongNhan.getNgaysinh()) + "; Cong Ty " + 
                CongNhan.getCongty());
    }
    
}
