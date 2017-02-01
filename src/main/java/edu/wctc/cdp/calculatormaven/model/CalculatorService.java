/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wctc.cdp.calculatormaven.model;

/**
 *
 * @author Chris
 */
public class CalculatorService {
    
    public double calculateRectangle(String width, String length){
        double len = Double.parseDouble(length);
        double wid = Double.parseDouble(width);
        return len * wid;
       
    }
    
    public double calculateCircle(String radius){
        double rad = Double.parseDouble(radius);
        double rSquared = rad * rad;
        return Math.PI * rSquared;
    }
    
    public double calculateTriangle(String sideA, String sideB) {
        double a = Double.parseDouble(sideA);
        double b = Double.parseDouble(sideB);
        double aSquared = a * a;
        double bSquared = b * b;
        return aSquared + bSquared;
    }
    
    //public double calculateTrapezoid() {
        //return 0;
    //}
}

