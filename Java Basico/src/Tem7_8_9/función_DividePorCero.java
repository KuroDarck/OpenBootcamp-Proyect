package Tem7_8_9;

public class función_DividePorCero {

    public static void main(String[] args) {

       DividePorCero(10);

    }

    //Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException que será capturada por su llamante (desde "main", por ejemplo). Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".
    public static int DividePorCero(int a) throws ArithmeticException {
        try {
            return a / 0;
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Esto no puede hacerse");
        }finally {
            System.out.println("Demo de código");
        }
    }
}
