package Tem7_8_9;

import java.io.*;

public class InputStream_PrintStream {

    public static void main(String[] args) throws FileNotFoundException {

        InputStream archivo=new FileInputStream("C:\\Users\\DELL\\OneDrive\\Documentos\\Cursos\\Desarrollo Web\\OpenBootcamp-Proyect\\Java Basico\\src\\original");
        PrintStream archivo2=new PrintStream("C:\\Users\\DELL\\OneDrive\\Documentos\\Cursos\\Desarrollo Web\\OpenBootcamp-Proyect\\Java Basico\\src\\copia");
        InputStream_y_PrintStream(archivo,archivo2);


    }

    //Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros:
    // "fileIn" y "fileOut". La tarea de la función será realizar la copia del fichero
    // dado en el parámetro "fileIn" al fichero dado en "fileOut".
    public static void InputStream_y_PrintStream(InputStream fileIn, PrintStream fileOut){
        try {
            byte[] lectura=fileIn.readAllBytes();
            fileOut.write(lectura);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
