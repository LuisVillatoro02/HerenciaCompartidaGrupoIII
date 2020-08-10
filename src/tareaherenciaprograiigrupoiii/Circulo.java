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
public class Circulo extends Figura {

    private double radio=5.5;
    private double area;
    @Override
    public void calcularArea() {
      this.area=Math.PI*Math.pow(this.radio,2);
      System.out.println("El área del circulo es: " + this.area );
    }
    
    
}
