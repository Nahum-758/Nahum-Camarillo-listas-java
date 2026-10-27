/**
* Problema: Supermercado
* Autor: Camarillo Solano Ángel Nahúm
* Grupo: GTID244
* Fecha: 25/10/2026
* Descripción: Lista simple propia que inserta productos de manera ordenada descendente por precio.
*/
public class ListaSimple {
    Nodo cabeza;

    public void insertarOrdenado(String nombre, double precio) {
        Nodo nuevo = new Nodo(nombre, precio);
        if (cabeza == null || cabeza.precio < precio) {
            nuevo.siguiente = cabeza;
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null && actual.siguiente.precio >= precio) {
                actual = actual.siguiente;
            }
            nuevo.siguiente = actual.siguiente;
            actual.siguiente = nuevo;
        }
    }
}