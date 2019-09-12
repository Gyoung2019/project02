package com.demo.gy1;

import com.demo.gy0.Customer;

import java.util.ArrayList;

public class test {
    //prsf
    private static final Customer cust = new Customer();
    //psf
    public static final int NUM = 1;
    //psfi
    public static final int NUM2 = 3;
    //psfs
    public static final String name = "GY";

    public static void main(String[] args) {
        int num1 = 10;
        System.out.println("num1 = " + num1);
        System.out.println("23333");
        System.out.println();
        int sum = 0;
        for (int i = 0; i <3 ; i++) {
            sum += i;

        }
        System.out.println(sum);
        
        
        /*增强for循环:iter
        for (String arg : args) {
            
        }
        */
        //模板四：list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);

        for (Object o : list) {

        }

        //变形：list.fori
        for (int i = 0; i < list.size(); i++) {

        }
        //变形：list.forr
        for (int i = list.size() - 1; i >= 0; i--) {

        }
        
    }
     public  void  method(){
         ArrayList list = new ArrayList();
         list.add(123);
         list.add(456);
        //ifn
         if (list == null) {

         }
         //inn
         if (list != null) {
             
         }
         //xxx.nn   / xxx.null



     }
}
