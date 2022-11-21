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
       //scanner obj
      Scanner myScanner = new Scanner(System.in);
     
      
      //prompts
      System.out.println("Enter Product Code");
      productCode = myScanner.nextLine();
      productInfo.add(productCode);
      
      System.out.print("Enter Product Name");
      productName = myScanner.nextLine();
      productInfo.add(productName);
      
      System.out.println(productInfo);
      
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
