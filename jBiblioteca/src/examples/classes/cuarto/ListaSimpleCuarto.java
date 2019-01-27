/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples.classes.cuarto;

import examples.classes.historial.*;
import examples.classes.consola.*;
import examples.classes.comida.*;
import javax.swing.JOptionPane;

/**
 *
 * @author stevensanchezm
 */
public class ListaSimpleCuarto {

    private NodoCuarto cabeza;

    @Override
    public String toString() {
        //return "Lista{" + "cabeza=" + cabeza + '}';

        String msj = "";
        NodoCuarto aux = cabeza;

        while (aux != null) {
            msj += aux.getDato() + "\n"; //agrega
            aux = aux.getNext(); //avanza
        }

        return msj;
    }

    public void inserta(Cuarto c) {

        //Cabeza esta nulo
        if (cabeza == null) {

            //Cabeza nuevo nodo de c
            cabeza = new NodoCuarto(c);

        } else {
            //Si el precio que quiero insertar es menor al de cabeza
            if (c.getCuarto() < cabeza.getDato().getCuarto()) {
                //Creo un nodo aux con el dato entrante
                NodoCuarto aux = new NodoCuarto(c);
                //Puntero de aux sera cabeza
                aux.setNext(cabeza);
                //Actualizo cabeza
                cabeza = aux;

            } else {

                //Si el puntero de cabeza es igual a nulo
                if (cabeza.getNext() == null) {

                    //A cabeza siguiente le asigno el nodo entrante
                    cabeza.setNext(new NodoCuarto(c));

                } else {

                    //Creo nuevo auxiliar para no tocar cabeza
                    NodoCuarto aux = cabeza;

                    //Ciclo para saber donde tenemos que insertar el siguiente dato
                    while (aux.getNext() != null && c.getCuarto() > aux.getNext().getDato().getCuarto()) {

                        aux = aux.getNext();

                    }

                    //Creo un nodo temporal con los datos del carro nuevo
                    NodoCuarto temp = new NodoCuarto(c);

                    //Al temporal ponemos el siguiente del auxiliar
                    temp.setNext(aux.getNext());

                    //Unimos a aux con temporal
                    aux.setNext(temp);
                }
            }
        }
    }

    public boolean vacia() {
        //retorna un true si encuentra un carro, retorna false si no lo encuentra

        if (cabeza == null) {
            return true;
        }
        return false;
    }

    //VERIFICA SI CUARTO TIENE CLIENTE
    public boolean cliente(int cuarto) {

        NodoCuarto aux = cabeza;
        boolean cliente = false;

        while (aux != null && !cliente) {

            if (cuarto == aux.getDato().getCuarto() && aux.getDato().getCliente() != null) {
                cliente = true;
            }

            aux = aux.getNext();

        }

        return cliente;

    }

    //VERIFICA SI CUARTO ESTA DESOCUPADO
    public int disponibles() {

        NodoCuarto aux = cabeza;
        int cuartos = 10;

        while (aux != null && aux.getDato().getCliente() != null) {

            cuartos--;
            aux = aux.getNext();

        }

        return cuartos;

    }

    //RETORNA EL CUARTO LIBRE MAS PROXIMO
    public int cuartoLibre() {

        NodoCuarto aux = cabeza;
        int cuarto = 0;

        while (aux != null && aux.getDato().getCliente() != null) {
            cuarto = aux.getDato().getCuarto();
            aux = aux.getNext();

        }

        if (aux != null) {
            return aux.getDato().getCuarto();
        } else {
            return ++cuarto;
        }

    }

    /*
    Asigna cuarto al cliente
     */
    public boolean asignar(int horas, int total, String usuario) {

        NodoCuarto aux = cabeza;

        boolean cuartoAsignado = false;

        while (aux != null && !cuartoAsignado) {

            if (aux.getDato().getCliente() == null) {
                cuartoAsignado = true;
                aux.getDato().setHoras(horas);
                aux.getDato().setTotal(total);
                aux.getDato().setCliente(usuario);
                aux.getDato().setCantidad_consolas(0);
            }

            aux = aux.getNext();

        }

        return cuartoAsignado;

    }

    //INFORMACION DEL CUARTO 
    public NodoCuarto informacion(int cuarto) {

        NodoCuarto aux = cabeza;

        boolean cuartoAsignado = false;

        while (aux != null && !cuartoAsignado) {

            if (cuarto == aux.getDato().getCuarto() && aux.getDato().getCliente() != null) {
                cuartoAsignado = true;
            } else {
                aux = aux.getNext();
            }

        }

        return aux;

    }

    public boolean asignarConsola(int cuarto, String consola, int precio) {

        NodoCuarto aux = cabeza;
        boolean permitido_asignar = true;

        while (aux.getNext() != null && aux.getDato().getCuarto() != cuarto) {
            aux = aux.getNext();
        }

        if (aux != null) {
            if (aux.getDato().consolas == null) {
                ColaConsola consola_temporal = new ColaConsola();
                consola_temporal.encola(new NodoConsola(new Consola(consola, precio)));
                aux.getDato().setConsolas(consola_temporal);

            } else {

                if (aux.getDato().getCantidad_consolas() < 3) {

                    aux.getDato().consolas.encola(new NodoConsola(new Consola(consola, precio)));

                } else {
                    permitido_asignar = false;
                }
            }

            if (aux.getDato().getHistorial() == null) {

                String historial = consola + "-" + precio + ",";
                ColaHistorial historial_temporal = new ColaHistorial();
                historial_temporal.encola(new NodoHistorial(new Historial(historial)));
                aux.getDato().setHistorial(historial_temporal);

            } else {
                
                if (aux.getDato().getCantidad_consolas() < 3) {

                    String historial = consola + "-" + precio + ",";
                    aux.getDato().historial.encola(new NodoHistorial(new Historial(historial)));
                
                }

            }

            if (permitido_asignar) {
                aux.getDato().setTotal(aux.getDato().getTotal() + precio);
                aux.getDato().setCantidad_consolas(aux.getDato().getCantidad_consolas() + 1);
            }

        }

        return permitido_asignar;

    }

    public boolean devolverConsola(int cuarto) {

        NodoCuarto aux = cabeza;

        boolean permitido_eliminar = true;

        while (aux.getNext() != null && aux.getDato().getCuarto() != cuarto) {
            aux = aux.getNext();
        }

        if (aux != null) {

            aux.getDato().consolas.atiende();
            aux.getDato().setCantidad_consolas(aux.getDato().getCantidad_consolas() - 1);
            //System.out.println(aux);

        }

        return permitido_eliminar;

    }

    public boolean asignarComida(int cuarto, String comida, int precio) {

        NodoCuarto aux = cabeza;

        boolean permitido_asignar = true;

        while (aux.getNext() != null && aux.getDato().getCuarto() != cuarto) {
            aux = aux.getNext();
        }

        if (aux != null) {
            if (aux.getDato().comidas == null) {
                PilaComida comida_temporal = new PilaComida();
                comida_temporal.push(new NodoComida(new Comida(comida, precio)));
                aux.getDato().setComidas(comida_temporal);

            } else {

                aux.getDato().comidas.push(new NodoComida(new Comida(comida, precio)));

            }

            if (aux.getDato().getHistorial() == null) {

                String historial = comida + "-" + precio+ ",";
                ColaHistorial historial_temporal = new ColaHistorial();
                historial_temporal.encola(new NodoHistorial(new Historial(historial)));
                aux.getDato().setHistorial(historial_temporal);

            } else {

                String historial = comida + "-" + precio+ ",";
                aux.getDato().historial.encola(new NodoHistorial(new Historial(historial)));

            }

            aux.getDato().setTotal(aux.getDato().getTotal() + precio);

        }

        return permitido_asignar;

    }

    public boolean pagarCuenta(int cuarto) {

        boolean cuartoPagado = false;

        NodoCuarto aux = cabeza;

        while (aux.getNext() != null) {

            if (cuarto == aux.getDato().getCuarto()) {

                aux.getDato().setCantidad_consolas(0);
                aux.getDato().setCliente(null);
                aux.getDato().setComidas(null);
                aux.getDato().setConsolas(null);
                aux.getDato().setHistorial(null);
                aux.getDato().setHoras(0);
                aux.getDato().setTotal(0);

                cuartoPagado = true;

            }

            aux = aux.getNext();

        }

        return cuartoPagado;

    }

}
