# JBiblioteca

### Clases
| Clase | Atributos |
| ------ | ------ |
| Libro | ISBN, titulo, autor, categoria, editorial, idioma, paginas, descripcion, fecha_lanzamiento, fecha_ingreso, cantidad|
| Usuario | nombre, cedula, telefono, email, residencia, usuario, password, Historial::Historial|
| Historial | ISBN_libro, fecha_retiro, fecha_entrega|
| Alquiler | ISBN_libro, cedula_usuario, fecha_retiro, fecha_entrega, cantidad |

### Clases
| Clase | Métodos |
| ------ | ------ |
| Libro | Insertar(){...}, Actualizar(){...}|
| Usuario | Insertar(){...}, Actualizar(){...}|
| Historial | Insertar(){...}, Actualizar(){...}|
| Alquiler | Insertar(){...}, Actualizar(){...}, Borrar(){...}|

# Estructura de datos utilizadas:
  - Libros: Arboles (no se eliminan libros)
  - Usuarios: Colas (no se eliminan usuarios)
  - Historial: Lista Simple (no se elimina historial)
  - Alquiler: Lista Doble (si se elimina alquiler)

# Pendiente:
  - Agregar el historial de libros alquilados en clase usuario
  - Agregar menu: 'Ver lista de libros alquilados' en la seccion administrador en la que se desplegaran todos los libros alquilados
  - Habilitar la cantidad de libros a alquilar para el usuario e ir y comparar la existencia de dicho libro en la biblioteca y hacer las validaciones correspondientes