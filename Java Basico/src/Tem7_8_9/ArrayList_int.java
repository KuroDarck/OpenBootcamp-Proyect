package Tem7_8_9;

import java.util.ArrayList;

public class ArrayList_int {

    public static void main(String[] args) {
        //Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10.
        ArrayList<Integer> entero=new ArrayList<Integer>();
        for (int i=1;i<=10;i++){
            entero.add(i);
        }
        /* A continuación, con otro bucle, recórrelo y elimina los numeros pares.
        for (int i=1;i<=entero.size();i++){
            if (entero.get(i)%2==0){
                entero.remove(i);
            }
        }
        // Por último, vuelve a recorrerlo y muestra el ArrayList final.
        for (int enter:entero) {
            System.out.println(enter);
        } */
        // Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas
        // el primer "for" de relleno.
        entero.removeIf(n->n%2==0);
        System.out.println(entero);
    }
}
