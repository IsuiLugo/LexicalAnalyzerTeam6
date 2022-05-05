//Clase para leer el archivo
package Clases;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Read {

    ArrayList<String> CadenasPorLinea = new ArrayList<String>();

    //Método para leer el archivo linea por linea
    public static String LeerArchivo() {
        String cadenaPorLinea = "";
        String cadena = "";
        String rutaDelArchivo = "C:\\Users\\hp\\Documents\\NetBeansProjects\\LexicalAnalyzerTeam6\\archivo.txt";
        try {
            FileReader lector = new FileReader(rutaDelArchivo);
            BufferedReader lectura = new BufferedReader(lector);
            //Lee cada linea del archivo
            cadenaPorLinea = lectura.readLine();
            int linea = 0;
            //Leer mientras el archivo no sea vacio
            while (cadenaPorLinea != null) {
                linea++;
                cadenaPorLinea = lectura.readLine();
                cadena = cadena + cadenaPorLinea;
            }
        } catch (FileNotFoundException ex) {
            System.err.println("Error File:\n" + ex);
        } catch (IOException ex) {
            System.err.println("Error IO:\n" + ex);
        }
        return cadena;
    }

    public static void main(String[] args) {
        String contenidoArchivo = LeerArchivo();
        System.out.println(contenidoArchivo);
    }

    //Método para guardar el contenido del archivo en lista
    public void guardaCadenas(String cadena) {
        CadenasPorLinea.add(cadena);
    }
}
