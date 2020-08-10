/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaherenciaprograiigrupoiii;

/**
 *
 * @author Pikito
 */
public class Cuadrado extends Figura {
    private int base=5;
    private int altura=10;
    private double area;
    
    public void calcularArea() {
      this.area=this.base*this.altura;
      System.out.println("El área de un Cuadrado es: " + this.area );
    }
}
