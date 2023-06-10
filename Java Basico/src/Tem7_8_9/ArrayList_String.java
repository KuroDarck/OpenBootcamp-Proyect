package Tem7_8_9;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayList_String {

    public static void main(String[] args) {
        //Crea un ArrayList de tipo String, con 4 elementos.

        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("Hola");
        arrayList.add("Adios");
        arrayList.add("Feo");
        arrayList.add("Bonito");

        //Cópialo en una LinkedList.
        LinkedList<String> linkedList=new LinkedList<>(arrayList);
        // Recorre ambos mostrando únicamente el valor de cada elemento.
        System.out.println("Elementos de ArrayList:");
        for (String list:arrayList){
            System.out.println(list);
        }
        System.out.println("Elementos de LinkedList:");
        for (String list:linkedList){
            System.out.println(list);
        }
    }
}
