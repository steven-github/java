/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.classes.arbol;

/**
 *
 * @author steven
 */
public class Arbol {

    private NodoLibro raiz;
    private String libros;
    private int tmp_id;

    public void inserta(Libro l) {

        if (raiz == null) {

            raiz = new NodoLibro(l);

        } else {

            insertaRec(l, raiz);

        }

    }

    //Inserta recursivo
    public void insertaRec(Libro l, NodoLibro n) {

        if (l.getId() < n.getDato().getId()) {//izq

            if (n.getHijoIzq() == null) {
                n.setHijoIzq(new NodoLibro(l));
            } else {
                insertaRec(l, n.getHijoIzq());
            }
        } else {
            if (n.getHijoDer() == null) {
                n.setHijoDer(new NodoLibro(l));
            } else {
                insertaRec(l, n.getHijoDer());
            }
        }

    }

    //inOrden
    public String inOrden() {
        libros = "";
        if (raiz == null) {
            System.out.println("No hay datos");
        } else {
            inOrdenRec(raiz);
        }

        return libros;
    }

    //inOrden recursivo
    public void inOrdenRec(NodoLibro n) {
        if (n != null) {
            inOrdenRec(n.getHijoIzq());
            libros += n;
            inOrdenRec(n.getHijoDer());
        }
    }

    //Obtiene el ID del ultimo libro insertado
    public int getId() {

        if (raiz == null) {
            return 0;
        } else {
            getIdR(raiz);
            return tmp_id;
        }
    }

    //Obtiene el ID del ultimo libro insertado recursivo
    public void getIdR(NodoLibro n) {

        tmp_id = n.getDato().getId() + 1;

        if (tmp_id < n.getDato().getId()) {//izq
            if (n.getHijoIzq() != null) {
                getIdR(n.getHijoIzq());
            }
        } else {
            if (n.getHijoDer() != null) {
                getIdR(n.getHijoDer());
            }
        }

    }

    //Obtiene un nodo libro con el parametro id
    public NodoLibro obtenerLibro(int id) {
        NodoLibro libro = raiz;
        boolean found = false;

        while (!found) {
            if (id == libro.getDato().getId()) {
                found = true;
            } else {
                if (id < libro.getDato().getId()) {
                    libro = libro.getHijoDer();
                } else {
                    libro = libro.getHijoDer();
                }
            }

        }

        //NodoLibro libro = obtenerLibroR(raiz, id);
        System.out.println("libro" + libro);
        return libro;
    }

    //Obtiene un nodo libro con el parametro id
    public NodoLibro editarLibro(NodoLibro l) {
        NodoLibro libro = raiz;
        boolean found = false;

        while (!found) {
            if (l.getDato().getId() == libro.getDato().getId()) {
                libro.setDato(l.getDato());
                found = true;
            } else {
                if (l.getDato().getId() < libro.getDato().getId()) {
                    libro = libro.getHijoDer();
                } else {
                    libro = libro.getHijoDer();
                }
            }

        }

        //NodoLibro libro = obtenerLibroR(raiz, id);
        System.out.println("libro" + libro);
        return libro;
    }

}
