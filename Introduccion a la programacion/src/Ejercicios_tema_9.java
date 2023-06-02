public class Ejercicios_tema_9 {

    public static void main(String[] args) {
        Cliente newCliente=new Cliente(15,"Ramon","+507 6666-6666",12);
        System.out.println(newCliente);

        Trabajador newTrabajador=new Trabajador(15,"Ramon","+507 6666-6666",12);
        System.out.println(newTrabajador);
    }

}

//Crear clase Persona.
class Person {

    //Crear variables privada edad, nombre y teléfono de la clase Persona.
    private int edad;
    private String nombre;
    private String telefono;
    
    public Person(int edad,String nombre,String telefono){
        this.edad=edad;
        this.nombre=nombre;
        this.telefono=telefono;
    }

    @Override
    public String toString() {
        return "Persona{" +", Nombre='" + nombre +
                "Edad=" + edad + '\'' +
                ", Teléfono='" + telefono + '\'' +
                '}';
    }
}

//Una vez creada la clase, crea una nueva clase Cliente que herede de Persona,
// esta nueva clase tendrá la variable credito solo para esa clase.
class Cliente extends Person{
    private int credito;
    
    public Cliente(int edad,String nombre, String telefono,int credito){
        super(edad,nombre,telefono);
        this.credito=credito;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "credito=" + credito +" "+
                  super.toString() +"} ";
    }
}

//Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona,
// y con una variable salario que solo tenga la clase Trabajador.

class Trabajador extends Person{
    double salario;
    public Trabajador(int edad, String nombre, String telefono,double salario) {
        super(edad, nombre, telefono);
        this.salario=salario;
    }

    @Override
    public String toString() {
        return "Trabajador{" +
                "salario=" + salario +" "+
                super.toString() +"} ";
    }
}
