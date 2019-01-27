/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.classes.libro;

import examples.classes.cuarto.*;
import examples.classes.historial.*;
import examples.classes.consola.*;
import examples.classes.comida.*;
import javax.swing.JOptionPane;

/**
 *
 * @author stevensanchezm
 */
public class ListaSimpleLibro {

    private NodoLibro cabeza;

    @Override
    public String toString() {
        //return "Lista{" + "cabeza=" + cabeza + '}';

        String msj = "";
        NodoLibro aux = cabeza;

        while (aux != null) {
            //msj += aux.getDato() + "\n"; //agrega
            msj += aux.getDato();
            aux = aux.getNext(); //avanza
        }

        return msj;
    }

    public void inserta(Libro l) {

        //Cabeza esta nulo
        if (cabeza == null) {

            //Cabeza nuevo nodo de c
            cabeza = new NodoLibro(l);

        } else {
            //Si el precio que quiero insertar es menor al de cabeza
            if (l.getId() < cabeza.getDato().getId()) {
                //Creo un nodo aux con el dato entrante
                NodoLibro aux = new NodoLibro(l);
                //Puntero de aux sera cabeza
                aux.setNext(cabeza);
                //Actualizo cabeza
                cabeza = aux;

            } else {

                //Si el puntero de cabeza es igual a nulo
                if (cabeza.getNext() == null) {

                    //A cabeza siguiente le asigno el nodo entrante
                    cabeza.setNext(new NodoLibro(l));

                } else {

                    //Creo nuevo auxiliar para no tocar cabeza
                    NodoLibro aux = cabeza;

                    //Ciclo para saber donde tenemos que insertar el siguiente dato
                    while (aux.getNext() != null && l.getId() > aux.getNext().getDato().getId()) {

                        aux = aux.getNext();

                    }

                    //Creo un nodo temporal con los datos del carro nuevo
                    NodoLibro temp = new NodoLibro(l);

                    //Al temporal ponemos el siguiente del auxiliar
                    temp.setNext(aux.getNext());

                    //Unimos a aux con temporal
                    aux.setNext(temp);
                }
            }
        }
    }
    
    //OBTIENE EL ID DEL ULTIMO LIBRO DISPONIBLE
    public int getId() {
        if (cabeza == null) {
            return 0;
        } else {
            return cabeza.getDato().getId() + 1;
        }
    }

}
