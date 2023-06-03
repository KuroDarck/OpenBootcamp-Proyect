import java.math.RoundingMode;
public class tema_2 {

    public static void main(String[] args) {

        double producto=34.18;

        System.out.println("El ITBMS es: "+ivaOITBMS(producto)+ " de "+producto);

    }
    //Para este ejercicio tendréis que crear una función que reciba un precio y devuelva el precio con el IVA incluido.
    public static double ivaOITBMS(double precio){// en panamá es conocido como ITBMS
    return Math.round(precio*0.07);
    }


}
