/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong03.donglenh;

import java.util.Arrays;
import lthdt.chuong03.coffeelogic.Product;
import lthdt.chuong03.coffeelogic.ProductCompByPrice;

/**
 *
 * @author ViettelStore
 */
public class testProduceArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long[] sp = null;
        // TODO code application logic here
        // Taoh mang san pham
        
       System.out.println("Mang ban dau la");
       System.out.println(Arrays.toString(sp));
//       Produce temp;
//        int j = 0;
//       for(int i = 0; i < sp.length - 1; i++)
//           if(sp[i].getPrice() > sp[j].getPrice()) {
//               temp = sp[i];
//               sp[i] = sp[j];
//               sp[j] = temp;            
//           }
      
       System.out.println("Mang sap xep tang dan theo gia ca");
       System.out.println(Arrays.toString(sp));
    }
    
}
