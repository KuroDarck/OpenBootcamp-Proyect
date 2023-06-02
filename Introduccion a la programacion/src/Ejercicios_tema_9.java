public class Ejercicios_tema_9 {

    public static void main(String[] args) {
        Cliente newCliente=new Cliente(15,"Ramon","+507 6666-6666",100.50);
        System.out.println("Cliente\nNombre: "+newCliente.getNombre()+"\nEdad: "+newCliente.getEdad()+"\nTelefono: "+newCliente.getTelefono()+"\nCreditos: "+newCliente.getCredito()+"$");
        System.out.println("\n**************************************************************************\n");
        Trabajador newTrabajador=new Trabajador(25,"Roman","+507 6336-6666",300.25);
        System.out.println("Trabajador\nNombre: "+newTrabajador.getNombre()+"\nEdad: "+newTrabajador.getEdad()+"\nTelefono: "+newTrabajador.getTelefono()+"\nSalario: "+newTrabajador.getSalario()+"$");
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

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

}

//Una vez creada la clase, crea una nueva clase Cliente que herede de Persona,
// esta nueva clase tendrá la variable credito solo para esa clase.
class Cliente extends Person{
    private double credito;
    
    public Cliente(int edad,String nombre, String telefono,double credito){
        super(edad,nombre,telefono);
        this.credito=credito;
    }

    public double getCredito() {
        return credito;
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

    public double getSalario() {
        return salario;
    }
}
