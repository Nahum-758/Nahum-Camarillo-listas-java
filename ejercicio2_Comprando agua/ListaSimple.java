/**
* Problema: Comprando agua
* Autor: Camarillo Solano Ángel Nahúm
* Grupo: GTID244
* Fecha: 25/10/2026
* Descripción: Lista simple propia para poder insertar precios y así calcular el mínimo.
*/

public class ListaSimple {
    Nodo cabeza;

    public void insertar(int precio) {
        Nodo nuevo = new Nodo(precio);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    public int obtenerMinimo() {
        if (cabeza == null) return 0;
        int min = cabeza.precio;
        Nodo actual = cabeza.siguiente;
        while (actual != null) {
            if (actual.precio < min) {
                min = actual.precio;
            }
            actual = actual.siguiente;
        }
        return min;
    }
}