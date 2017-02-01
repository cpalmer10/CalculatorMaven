/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wctc.cdp.calculatormaven.calculatorstrategy;

/**
 *
 * @author Chris
 */
public class Triangle implements CalculatorManager {

    @Override
    public double calculateArea(String length, String width, String radius, String sideA, String sideB) {
        double a = Double.parseDouble(sideA);
        double b = Double.parseDouble(sideB);
        double aSquared = a * a;
        double bSquared = b * b;
        return aSquared + bSquared;
    }
    
}

