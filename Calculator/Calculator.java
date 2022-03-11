/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package session12;

/**
 *
 * @author Admin
 */
public class Calculator {
    
    // + - * / method
    public static double Calcuate(double a,double b,String operator){
        double reSult = 0 ;
        switch(operator){
            case "+":
                reSult = a + b;
                break;
            case "-":
                reSult = a - b;
                break;
            case "x":
                reSult = a * b;
                break;
            case "/":
                reSult = a / b;
                break;            
        } 
        return reSult;
    }
    //percent method
    public static double perCent(double a){
        double reSult = 0;
        reSult = a * 0.01;
        return reSult;
    }
  
}
