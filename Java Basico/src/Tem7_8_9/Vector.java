package Tem7_8_9;

public class Vector {
    public static void main(String[] args) {
        //Crea un "Vector" del tipo de dato que prefieras
        java.util.Vector<Integer> numeros=new java.util.Vector<>();
        //añádele 5 elementos.
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        // Elimina el 2o y 3er elemento
        numeros.remove(2);
        numeros.remove(3);
        // muestra el resultado final.
        System.out.println(numeros);

        //Indica cuál es el problema de utilizar un Vector con la capacidad por defecto
        // si tuviésemos 1000 elementos para ser añadidos al mismo.
        //R: El redimensionamiento pasará una gran factura en el rendimiento
    }
}
