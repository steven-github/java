/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples.classes.comida;

/**
 *
 * @author stevensanchezm
 */
public class Semana4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PilaComida pila = new PilaComida();

        pila.push(new NodoComida(new Comida("Palomitas", 2000)));
        pila.push(new NodoComida(new Comida("Hamburguesas", 5000)));
        pila.push(new NodoComida(new Comida("Refresco", 950)));
        pila.push(new NodoComida(new Comida("Helado", 1500)));
        
        System.out.println(pila);

    }

}
