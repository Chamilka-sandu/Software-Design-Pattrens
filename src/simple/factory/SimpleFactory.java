/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple.factory;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class SimpleFactory {

    public static void main(String[] args) {
           

     Scanner s = new Scanner(System.in);
        System.out.println("Enter first number");
        double a = s.nextDouble();
        
        System.out.println("Enter second number");
        double b = s.nextDouble();
        
        System.out.println("Enter type");
       
        CalculateFactory factory = new CalculateFactory();
        Calculate obj = factory.getcalculate(s.next());
        obj.Calculates(a, b);
    }
    
}
