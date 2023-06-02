public class Ejercicios_tema_3 {

    public static void main(String[] args) {

        //Llamar a la función en el main y darle valores.
        System.out.println("El resultado entero es: "+Sumar(10,20,30));

        System.out.println("El resultado double es: "+Sumar(10.5,20.3,3.0));

        //Crear un objeto miCoche en el main y añadirle una puerta.
        coche miCoche=new coche();
        miCoche.incremetarPuertas();

        //Mostrar el número de puertas que tiene el objeto.
        System.out.println("El coche tiene "+miCoche.getPuertas() +" Puertas" );
    }


//Crear una función con tres parámetros que sean números que se suman entre sí.
    public static int Sumar(int a,int b,int c){
        return a+b+c;
    }

    public static double Sumar(double a,double b,double c){
        return a+b+c;
    }
}

//miCoche
class coche{
    //Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
    private int puertas=3;

    //Una función que incremente el número de puertas que tiene el coche.
    public void incremetarPuertas(){
        this.puertas++;
    }

    public int getPuertas() {
        return puertas;
    }
}
