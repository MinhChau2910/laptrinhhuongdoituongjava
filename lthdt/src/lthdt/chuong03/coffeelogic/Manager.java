/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong03.coffeelogic;

import java.util.Date;

/**
 *
 * @author ViettelStore
 */
public class Manager extends Person {
    private double income;

    public Manager() {
    }

    public Manager(double income, String hoten, int gioitinh, Date ngaysinh) {
        super(hoten, gioitinh, ngaysinh);
        this.income = income;
    }
    
}
