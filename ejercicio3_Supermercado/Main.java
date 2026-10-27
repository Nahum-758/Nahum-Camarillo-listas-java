/**
* Problema: Supermercado
* Autor: Camarillo Solano Ángel Nahúm
* Grupo: GTID244
* Fecha: 25/10/2026
* Descripción: Clase principal que imprime el ticket formateado y el costo total.
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
        double total = 0;

        for (int i = 0; i < n; i++) {
            linea = br.readLine();
            if (linea == null) break;
            int idxEspacio = linea.lastIndexOf(' ');
            String nombre = linea.substring(0, idxEspacio);
            double precio = Double.parseDouble(linea.substring(idxEspacio + 1));
            lista.insertarOrdenado(nombre, precio);
            total += precio;
        }

        Nodo actual = lista.cabeza;
        int index = 1;
        StringBuilder sb = new StringBuilder();
        while (actual != null) {
            sb.append(index).append(" | ").append(actual.nombre).append(" | ").append(actual.precio).append("\n");
            actual = actual.siguiente;
            index++;
        }
        sb.append(total);
        System.out.print(sb.toString());
    }
}