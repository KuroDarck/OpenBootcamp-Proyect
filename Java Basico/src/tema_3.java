public class tema_3 {

    public static void main(String[] args) {
        String textoFinal = "El";
        String[] textArray = new String[]{"Hola", "mundo", "!"};
        String textSimple="# Programador.";

        //En este ejercicio tenéis que crear un bucle que permita concatenar textos

        for (String texto : textArray) {
            textoFinal += " " + texto;
        }
        textoFinal+=" " + textSimple;

        //e imprima el resultado final por consola.
        System.out.println(textoFinal);
    }
}


