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
public class PilaComida {

    private NodoComida top;

    public void push(NodoComida n) {

        if (top == null) {
            top = n;
        } else {
            n.setAbajo(top);
            top = n;
        }

    }

    public NodoComida pop() {

        NodoComida aux = top;

        if (top != null) {
            top = top.getAbajo();
            aux.setAbajo(null);
        }

        return aux;

    }

    @Override
    public String toString() {
        //return "PilaComida{" + "top=" + top + '}';

        //Nodo info = pop();
        NodoComida info = top;
        String libros = "";
        while (info != null) {
            //System.out.println(info.toString());
            libros += info.toString() + "\n";
            //info = pop();
            info = info.getAbajo();
        }

        return libros;
    }
    
    public String getNombres() {
        
        String msj = "";
        NodoComida aux = top;

        while (aux != null) {
            msj += aux.getDato().getNombre() + ","; //agrega
            aux = aux.getAbajo();
        }

        return msj;
        
    }
    
    public String getPrecios() {
        
        String msj = "";
        NodoComida aux = top;

        while (aux != null) {
            msj += aux.getDato().getPrecio() + ","; //agrega
            aux = aux.getAbajo(); //avanza
        }

        return msj;
        
    }

    public boolean encuentra(int precio) {

        NodoComida aux = top;
        while (aux != null) {
            if (precio == aux.getDato().getPrecio()) {
                return true;
            }
            aux = aux.getAbajo();
        }

        return false;
    }

    public void extrae(String nombre) {

        NodoComida aux = top;

        if (aux.getDato().getNombre().equals(nombre)) {
            pop();
        } else {

            while (aux.getAbajo() != null) {
                if (aux.getAbajo().getDato().getNombre().equals(nombre)) {
                    aux.setAbajo(aux.getAbajo().getAbajo());
                } else {
                    aux = aux.getAbajo();
                }
            }
        }

    }
}
