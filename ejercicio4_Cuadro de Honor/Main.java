/**
* Problema: Cuadro de Honor
* Autor: Camarillo Solano Ángel Nahúm
* Grupo: GTID244
* Fecha: 25/10/2026
* Descripción: Clase principal que filtra alumnos con promedio >= 9.5 y los imprime alfabéticamente.
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String linea = br.readLine();
        if (linea == null) return;
        int n = Integer.parseInt(linea.trim());

        ListaSimple lista = new ListaSimple();

        for (int i = 0; i < n; i++) {
            String nombre = br.readLine();
            String promLine = br.readLine();
            if (nombre == null || promLine == null) break;
            double promedio = Double.parseDouble(promLine.trim());
            if (promedio >= 9.5) {
                lista.insertarAlfabetico(nombre.trim(), promedio);
            }
        }

        Nodo actual = lista.cabeza;
        StringBuilder sb = new StringBuilder();
        while (actual != null) {
            sb.append(actual.nombre).append("\n");
            actual = actual.siguiente;
        }
        System.out.print(sb.toString());
    }
}