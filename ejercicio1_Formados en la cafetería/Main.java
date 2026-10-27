/**
* Problema: Formados en la cafetería
* Autor: Camarillo Solano Ángel Nahúm
* Grupo: GTID244
* Fecha: 25/10/2026
* Descripción: Resuelve el problema usando Main
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

        // Instanciamos usando ListaSimple
        ListaSimple colaTrabajadores = new ListaSimple();
        ListaSimple colaAlumnos = new ListaSimple();
        StringBuilder salida = new StringBuilder();

        for (int i = 0; i < n; i++) {
            linea = br.readLine();
            if (linea == null) break;
            StringTokenizer st = new StringTokenizer(linea);
            String evento = st.nextToken();

            if (evento.equals("LLEGA")) {
                String tipo = st.nextToken();
                String nombre = st.nextToken();
                if (tipo.equals("TRABAJADOR")) {
                    colaTrabajadores.insertarAlFinal(nombre); // Método correcto en ListaSimple
                } else if (tipo.equals("ALUMNO")) {
                    colaAlumnos.insertarAlFinal(nombre); // Método correcto en ListaSimple
                }
            } else if (evento.equals("ATIENDE")) {
                if (!colaTrabajadores.estaVacia()) {
                    salida.append(colaTrabajadores.eliminarDelFrente()).append("\n"); // Método en ListaSimple
                } else if (!colaAlumnos.estaVacia()) {
                    salida.append(colaAlumnos.eliminarDelFrente()).append("\n"); // Método en ListaSimple
                }
            }
        }
        System.out.print(salida);
    }
}