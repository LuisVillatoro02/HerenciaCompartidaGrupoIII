/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaherenciaprograiigrupoiii;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Luis Villatoro, Oscar Zacarias, Andrea Nova
 *         Cristian Corea, José Alería 
 */
public class TareaHerenciaPrograIIGrupoIII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int opc=0;
        int cc=0, ct=0, ccu=0;
        do{
        System.out.println("1. Cuadrado");
        System.out.println("2. Triangulo");
        System.out.println("3. Circulo");
        System.out.println("4. Salir");
            System.out.println("Elija su Opcion");
            opc= Integer.parseInt(br.readLine());
            
            switch(opc){
            
            case 1:
                Cuadrado cua=new Cuadrado();
                cua.calcularArea();
                cc++;
                break;
            case 2:
                Triangulo tr=new Triangulo();
                tr.calcularArea();
                ct++;
                break;
            case 3:
                Circulo cr=new Circulo();
                cr.calcularArea();
                ccu++;
                break;
                 
        }
        }while(opc!=4);
        System.out.println("Los calclulos del cuadrados fueron: " + cc);
        System.out.println("Los calclulos del triangulo fueron: " + ct);
        System.out.println("Los calclulos del circulo fueron: " + ccu);
        
    }
    }
    
