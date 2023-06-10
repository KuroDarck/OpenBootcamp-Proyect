package Tem7_8_9;

public class reverse_text {
    public static void main(String[] args) {
        String empresion="Hola Mundo !";
        System.out.println(reverse(empresion));
    }
    public static String reverse(String texto) {
        String resuladoReverse="";
        for (int i=texto.length()-1;i>=0;i--) resuladoReverse += String.valueOf(texto.charAt(i));
        return resuladoReverse;
    }
}
