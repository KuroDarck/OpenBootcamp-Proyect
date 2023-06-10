package Tem7_8_9;
import java.io.*;
import java.util.*;

public class Sorpréndenos{
    public static void main(String[] args) {
        try {
            Scanner lectura = new Scanner(System.in);
            System.out.println("Ingrese sus datos");
            System.out.print("Nombre: ");
            String nombre = lectura.nextLine();
            System.out.print("Apellido: ");
            String apellido = lectura.nextLine();
            System.out.print("Edad: ");
            int edad = lectura.nextInt();

            String saludo = "¡Hola " + nombre + " " + apellido + "! Espero que te encuentres muy bien. " +
                    "Quiero aprovechar este momento para enviarte un saludo especial y desearte un día lleno de " +
                    "alegría y bendiciones. Con " + edad + " años a tus espaldas, seguramente tienes un montón de " +
                    "experiencias y sabiduría acumulada, lo cual te convierte en alguien realmente especial.\n" +
                    "\n" +
                    "Que este nuevo día te brinde oportunidades maravillosas y te permita alcanzar todos tus " +
                    "objetivos. Recuerda que cada día es una nueva oportunidad para crecer, aprender y disfrutar de " +
                    "las cosas hermosas de la vida.\n" +
                    "\n" +
                    "¡Te deseo lo mejor en este día y en todos los que están por venir! ¡Que tengas un día " +
                    "espectacular y que todos tus sueños se hagan realidad!";

            // Escribir saludo en un archivo
            String rutaArchivo = "C:\\Users\\DELL\\OneDrive\\Documentos\\Cursos\\Desarrollo Web\\OpenBootcamp-Proyect\\Java Basico\\src\\Tem7_8_9\\mensaje";
            PrintStream escritura = new PrintStream(new FileOutputStream(rutaArchivo));
            escritura.print(saludo);
            escritura.close();
            System.out.println("El saludo se ha escrito correctamente en el archivo.");

            // Leer el archivo
            InputStream archivo = new FileInputStream(rutaArchivo);
            BufferedReader br = new BufferedReader(new InputStreamReader(archivo));
            String linea;
            List<String> lineasArchivo = new ArrayList<>();
            while ((linea = br.readLine()) != null) {
                lineasArchivo.add(linea);
            }
            archivo.close();

            // Imprimir contenido del archivo
            System.out.println("\nContenido del archivo:");
            for (String line : lineasArchivo) {
                System.out.println(line);
            }

            // Ejemplo de uso de HashMap y ArrayList
            Map<String, Integer> mapa = new HashMap<>();
            List<String> lista = new ArrayList<>();
            mapa.put("Uno", 1);
            mapa.put("Dos", 2);
            lista.add("Elemento 1");
            lista.add("Elemento 2");

            System.out.println("\nContenido del HashMap:");
            for (Map.Entry<String, Integer> entry : mapa.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

            System.out.println("\nContenido del ArrayList:");
            for (String element : lista) {
                System.out.println(element);
            }
        } catch (IOException e) {
            System.out.println("Error al manejar el archivo: " + e.getMessage());
        }
    }
}

