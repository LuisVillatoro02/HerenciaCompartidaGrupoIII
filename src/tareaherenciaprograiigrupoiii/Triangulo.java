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
public class Triangulo extends Figura {
     private int altura =10;
     private int base =15;
     private double area;
     
      public void calcularArea() {
      this.area=(this.base*this.altura)/2;
      System.out.println("El área del Triangulo es: " + this.area );
    }
}
