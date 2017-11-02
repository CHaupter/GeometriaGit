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
public class TestGeometria {
    
    public static void main(String[] args){
    
        double areaCuadrado= Geometria.calcularAreaCuadrado(2.123);
        double areaRectangulo= Geometria.calcularAreaRectangulo(2.123,1.233);
        double areaTriangulo= Geometria.calcularAreaTriangulo(2.123,1.233);
        
        System.out.println("Área del cuadrado de lado 2.123 vale " + areaCuadrado);
        System.out.println("Área del rectángulo de base 2.123 y altura 1.233 vale " + areaRectangulo);
        System.out.println("Área del triángulo de base 2.123 y altura 1.233 vale " + areaTriangulo);

        
    
    }
    
}
