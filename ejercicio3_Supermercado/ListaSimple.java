/**
* Problema: Formados en la cafetería
* Autor: Camarillo Solano Ángel Nahúm
* Grupo: GTID244
* Fecha: 25/10/2026
* Descripción: Resuelve el problema usando cola simple pero con el nombre de Lista Simple.
*/

public class ListaSimple {
    Nodo cabeza;
    Nodo fin;


    public ListaSimple() {
        this.cabeza = null;
        this.fin = null;
    }


    public boolean estaVacia() {
        return cabeza == null;
    }


    public void insertarAlFinal(String nombre) {
        Nodo nuevo = new Nodo(nombre);
        if (estaVacia()) {
            cabeza = nuevo;
            fin = nuevo;
        } else {
            fin.siguiente = nuevo;
            fin = nuevo;
        }
    }

    public String eliminarDelFrente() {
        if (estaVacia()) return null;
        String nombre = cabeza.nombre;
        cabeza = cabeza.siguiente;
        if (cabeza == null) {
            fin = null;
        }
        return nombre;
    }
}