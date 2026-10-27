/**
* Problema: Comprando agua
* Autor: Camarillo Solano Ángel Nahúm
* Grupo: GTID244
* Fecha: 25/10/2026
* Descripción: Clase principal que lee los precios y muestra el menor costo.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String linea = br.readLine();
        if (linea == null) return;
        int n = Integer.parseInt(linea.trim());

        ListaSimple lista = new ListaSimple();
        linea = br.readLine();
        if (linea != null) {
            StringTokenizer st = new StringTokenizer(linea);
            while (st.hasMoreTokens()) {
                lista.insertar(Integer.parseInt(st.nextToken()));
            }
        }

        System.out.println(lista.obtenerMinimo());
    }
}