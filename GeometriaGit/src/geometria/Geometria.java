/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

/**
 *
 * @author matinal
 */
public class Geometria {

    public static double calcularAreaCuadrado(double lado) {
        return lado*lado;
    }
    
    public static double calcularAreaRectangulo(double base, double altura){
        return base*altura;
    }
    
    public static double calcularAreaTriangulo(double base, double altura){
        return (base*altura)/2;
    }
}
