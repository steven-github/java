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
public class Libro {

    private int id;
    private String ISBN, titulo, autor, editorial, categoria, idioma, descripcion, fecha_lanzamiento, fecha_ingreso;
    private int paginas, cantidad_ejemplares;

    public Libro(int id, String ISBN, String titulo, String autor, String editorial, String categoria, String idioma, String descripcion, String fecha_lanzamiento, String fecha_ingreso, int paginas, int cantidad_ejemplares) {
        this.id = id;
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.categoria = categoria;
        this.idioma = idioma;
        this.descripcion = descripcion;
        this.fecha_lanzamiento = fecha_lanzamiento;
        this.fecha_ingreso = fecha_ingreso;
        this.paginas = paginas;
        this.cantidad_ejemplares = cantidad_ejemplares;
    }

    @Override
    public String toString() {
        //return "[" + id + "," + ISBN + "," + titulo + "," + autor + "," + editorial + "," + categoria + "," + idioma + "," + descripcion + "," + fecha_lanzamiento + "," + fecha_ingreso + "," + paginas + "," + cantidad_ejemplares + ']';
        return "[" + id + "," + ISBN + "," + titulo + "," + autor + "," + editorial + "," + categoria + "," + idioma + "," + paginas + "," + cantidad_ejemplares + ']';
    }

    public int getId() {
        return id;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getIdioma() {
        return idioma;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getFecha_lanzamiento() {
        return fecha_lanzamiento;
    }

    public String getFecha_ingreso() {
        return fecha_ingreso;
    }

    public int getPaginas() {
        return paginas;
    }

    public int getCantidad_ejemplares() {
        return cantidad_ejemplares;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFecha_lanzamiento(String fecha_lanzamiento) {
        this.fecha_lanzamiento = fecha_lanzamiento;
    }

    public void setFecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void setCantidad_ejemplares(int cantidad_ejemplares) {
        this.cantidad_ejemplares = cantidad_ejemplares;
    }

}
