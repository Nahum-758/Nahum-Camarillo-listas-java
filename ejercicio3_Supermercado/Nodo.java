/**
* Problema: Supermercado
* Autor: Camarillo Solano Ángel Nahúm
* Grupo: GTID244
* Fecha: 25/10/2026
* Descripción: Nodo Producto con nombre, precio y puntero al siguiente.
*/

public class Nodo {
    String nombre;
    double precio;
    Nodo siguiente;

        public Nodo(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.siguiente = null;
    }
}