/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author marie
 */
public class Archivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        System.out.println("Favor de introducir el texto que desea guardar en el TXT");
        String entradaTeclado="";
        Scanner entradaEscaner = new Scanner(System.in);
       entradaTeclado= entradaEscaner.nextLine();
       String nombreArchivo="holamundo.txt";
        String ruta = "C:\\Users\\marie\\Documents\\TallerJava\\"+nombreArchivo;
        File archivo = new File(ruta);
        BufferedWriter bw;
  
        String cadena="";
        if(archivo.exists()) {
            bw = new BufferedWriter(new FileWriter(archivo));
            System.out.println("El archivo ya estaba creado");
            bw.write(entradaTeclado);
            
        } else {
            bw = new BufferedWriter(new FileWriter(archivo));
            System.out.println("Se ha creado un archivo nuevo llamado: "+nombreArchivo);
            bw.write(entradaTeclado);
            
        }
        bw.close();     
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        while((cadena = b.readLine())!=null) {
            System.out.println("Contenido del texto: "+cadena);
        }
        //Crear un archivo llamada holamundo.txt
        //crear la ruta /develop/projects/tallerJava
        //Guardar el archivo holamundo.txt en la ruta anterios
        //varificar si el archivo existe y si no crearlo
        //leer una cadena desde  consola y guardarla en el archivo holamundo.txt
        //leer archivo e imprimirlo en consola
       
    }
    
}
