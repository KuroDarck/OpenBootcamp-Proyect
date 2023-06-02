public class Ejercicios_tema_4 {

    public static void main(String[] args) {
        int numeroIf=2;
        clasificarNumero(numeroIf);

        int numeroWhile=0;
        aumetaLimite(numeroWhile);

        int numeroDoWhile=2;
        dowhileAumentar(numeroDoWhile);

        aumentarFor();

        int switchEstacion=1;
        mostrarEstacionDelAnio(switchEstacion);




    }
    //Usando un if, crear una condición que compare si la variable numeroIf
    // es positivo, negativo, o 0.
    public static void clasificarNumero(int a){
        if (a<0){
            System.out.println("El numero: "+a+" es Negativo");
        } else if (a>=1) {
            System.out.println("El numero: "+a+" es Positivo");
        }else{
            System.out.println("El numero es: "+a);
        }
    }

    //Crea un bucle While, este bucle tendrá que tener como condición que la variable
    // numeroWhile sea inferior a 3
    public static void aumetaLimite(int a){
        while (a<3){
            System.out.println("El Nuemor: "+a+" aumento");
            a++;
        }
    }
    //Para el bucle Do While, deberás crear la misma estructura que en el While,
    // pero solo se debe ejecutar una vez.
    public static void dowhileAumentar(int a){
        do {
            System.out.println("Solo se ejecuta una ves: "+a);
            a++;
        }while (a<3);
    }
    //Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0
    // y su condición será que la variable sea igual o menor que 3, se irá incrementando
    // en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.
public static void aumentarFor(){
        for (int numeroFor=0;numeroFor<=3;numeroFor++){
            System.out.println("El Nuemor: "+numeroFor+" aumento");
        }
}

//Por último, para el Switch, deberás crear la variable estacion, y distintos
// case para las cuatro estaciones del año. Dependiendo del valor de la variable
// estacion se deberá mandar un mensaje por consola informando de la estación en la que está.
// También habrá que poner un default para cuando el valor de la variable no sea una estación.

public static void mostrarEstacionDelAnio(int a){
        switch (a){
            case 1:
                System.out.println("Estamos en: Primavera");
                break;
            case 2:
                System.out.println("Estamos en: Verano");
                break;
            case 3:
                System.out.println("Estamos en: Otoño");
                break;
            case 4:
                System.out.println("Estamos en: Invierno");
                break;
            default:
                System.out.println("No hay estacion equivalente al numero ingresado ");
                break;
        }

}

}


