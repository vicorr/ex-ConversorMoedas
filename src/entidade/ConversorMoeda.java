/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

/**
 *
 * @author Acer
 */
public class ConversorMoeda {
    public static double IOF = 0.06;
    public static double dollarParaReal(double quantia, double precoDollar) {
    return quantia * precoDollar * (1.0 + IOF);
}
}
