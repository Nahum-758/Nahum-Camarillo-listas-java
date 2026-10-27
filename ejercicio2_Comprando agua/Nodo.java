/**
* Problema: Comprando agua
* Autor: Camarillo Solano Ángel Nahúm
* Grupo: GTID244
* Fecha: 25/10/2026
* Descripción: Nodo que almacena el precio del agua.
*/

public class Nodo {
    int precio;
    Nodo siguiente;

    public Nodo(int precio) {
        this.precio = precio;
        this.siguiente = null;
    }
}