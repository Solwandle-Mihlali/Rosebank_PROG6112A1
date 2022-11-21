/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */



package com.mycompany.questionone;

import java.util.Scanner;
import java.util.ArrayList;

public class QuestionOne {
    
    public static void main(String[] args) {
        
        System.out.println("BRIGHT FUTURES TECHNOLOGIES APPLICATION " + "\n"+
                "****************************************");
        Scanner myObj = new Scanner(System.in);
        int input;
        
        System.out.println("Enter (1) to launch menu or any other key to exit");
        //converting string to a number
        input =Integer.parseInt( myObj.nextLine());
        
        
        if(input == 1){
            
            promptMethod();
            
            
        }
        
    }
    
    static void promptMethod(){
        
        System.out.println("""
                           Please Select one of the following menu items:
                           (1) capture a new product
                           (2) search for a product
                           (3) update a product
                           (4) delete a product
                           (5) print report
                           (6) Exit Application""");
        
        Scanner innerObj = new Scanner(System.in);
        var input2 = Integer.parseInt(innerObj.nextLine());
        
        switch( input2){
            
            case 1: captureProduct();
            case 2: searchProduct();
            case 3:updateProduct();
            case 4: deleteProduct();
            case 5: printReport();
            break;
        }

    }

    private static void captureProduct() {
      ArrayList<String> productInfo = new ArrayList<String>();
      
      
      //declaring variables 
      
       String productCode;
       String productName;
       int productCategory;
       int warrantyPeriod;
       //scanner obj
      Scanner myScanner = new Scanner(System.in);
     
      
      //prompts
      System.out.println("Enter Product Code");
      productCode = myScanner.nextLine();
      productInfo.add(productCode);
      
      System.out.println("Enter Product Name");
      productName = myScanner.nextLine();
      productInfo.add(productName);
      
     System.out.println("""
                        Select Product Category
                        (1) Desktop Computer
                        (2) Laptop
                        (3) Tablet
                        (4) Printer
                        (5) Gaming Console""");
     
     productCategory = Integer.parseInt(myScanner.nextLine());
     
        switch(productCategory) {
            case 1:
                productInfo.add("Desktop Computer");
                break;
            case 2:
                productInfo.add("Laptop");
                break;
            case 3:
                productInfo.add("Tablet");
                break;
            case 4:
                productInfo.add("Printer");
                break;
            case 5:
                productInfo.add("Gaming Console");
                break;
            default:
                break;
        }
  
       System.out.println("Enter (1) for 6 month warranty or press any other key for 2 year warant  ");
       warrantyPeriod = Integer.parseInt(  myScanner.nextLine());
       
       if(warrantyPeriod == 1){
           
           productInfo.add("6 month");
       }
       else{
           productInfo.add("2 year");
       }
       System.out.println(productInfo.get(3));
    }

    private static void searchProduct() {
        
    }

    private static void updateProduct() {
       
    }

    private static void deleteProduct() {
        
    }

    private static void printReport() {
      
    }
    
}
