/**
* Problema: Cuadro de Honor
* Autor: Camarillo Solano Ángel Nahúm
* Grupo: GTID244
* Fecha: 25/10/2026
* Descripción: Lista simple propia que inserta alumnos ordenados alfabéticamente por nombre.
*/
public class ListaSimple {
    Nodo cabeza;

    public void insertarAlfabetico(String nombre, double promedio) {
        Nodo nuevo = new Nodo(nombre, promedio);
        if (cabeza == null || cabeza.nombre.compareToIgnoreCase(nombre) > 0) {
            nuevo.siguiente = cabeza;
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null && actual.siguiente.nombre.compareToIgnoreCase(nombre) < 0) {
                actual = actual.siguiente;
            }
            nuevo.siguiente = actual.siguiente;
            actual.siguiente = nuevo;
        }
    }
}