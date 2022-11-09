/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple.factory;

/**
 *
 * @author user
 */
public class Substract implements Calculate {
    
    @Override
    public void Calculates(double a, double b){
        System.out.println(a-b);
    
    }
}
