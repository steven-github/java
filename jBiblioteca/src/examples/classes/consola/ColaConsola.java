/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples.classes.consola;

/**
 *
 * @author stevensanchezm
 */
public class ColaConsola {

    private NodoConsola frente, ultimo;

    public void encola(NodoConsola n) {

        if (frente == null) {
            frente = n;
        } else {
            ultimo.setAtras(n);
        }

        ultimo = n;

    }

    public NodoConsola atiende() {

        NodoConsola aux = frente;

        if (aux != null) {

            frente = frente.getAtras();
            aux.setAtras(null);

            if (frente == null) {
                ultimo = null;
            }
        }

        return aux;
    }

    @Override
    public String toString() {
        //return "Cola{" + "frente=" + frente + ", ultimo=" + ultimo + '}';

        String msj = "";
        NodoConsola aux = frente;

        while (aux != null) {
            msj += aux + "\n"; //agrega
            aux = aux.getAtras(); //avanza
        }

        return msj;

    }
    
    public String getNombres() {
        
        String msj = "";
        NodoConsola aux = frente;

        while (aux != null) {
            msj += aux.getDato().getNombre() + ","; //agrega
            aux = aux.getAtras(); //avanza
        }

        return msj;
        
    }
    
    public String getPrecios() {
        
        String msj = "";
        NodoConsola aux = frente;

        while (aux != null) {
            msj += aux.getDato().getPrecio() + ","; //agrega
            aux = aux.getAtras(); //avanza
        }

        return msj;
        
    }
   

    public boolean encuentra(int precio) {

        NodoConsola aux = frente;

        while (aux != null) {
            //Si encuentro precio retorno true
            if (precio == aux.getDato().getPrecio()) {
                return true;
            }
            //Asigno el siguiente elemento
            aux = aux.getAtras();
        }

        //Retorno false por defecto
        return false;
    }

}
