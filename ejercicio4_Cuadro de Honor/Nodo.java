/**
* Problema: Cuadro de Honor
* Autor: Camarillo Solano Ángel Nahúm
* Grupo: GTID244
* Fecha: 25/10/2026
* Descripción: Nodo Alumno con nombre, promedio y puntero al siguiente.
*/
public class Nodo {
    String nombre;
    double promedio;
    Nodo siguiente;

    public Nodo(String nombre, double promedio) {
        this.nombre = nombre;
        this.promedio = promedio;
        this.siguiente = null;
    }
}