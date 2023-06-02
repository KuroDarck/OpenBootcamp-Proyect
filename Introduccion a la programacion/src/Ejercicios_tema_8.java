public class Ejercicios_tema_8 {
    public static void main(String[] args) {
        //Crear un objeto persona en el main.

        Persona persona1=new Persona();

        //Utiliza los gets y sets para darle valores a las propiedades
        //edad, nombre y telefono, por último muéstralas por consola.
        persona1.setEdad(18);
        persona1.setNombre("Ricardo Herrera M");
        persona1.setTelefono("+507 6001-0000");

        System.out.println("El nombre es: "+persona1.getNombre()+"\nTiene: "+persona1.getEdad()+" años\n"+"Telefono #:"+ persona1.getTelefono());

    }
}

//Crear clase Persona.
class Persona{

    //Crear variables las privadas edad, nombre y telefono de la clase Persona.
    private int edad;
    private String nombre;
    private String telefono;

    //Crear gets y sets de cada propiedad.


    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return this.edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getTelefono() {
        return this.telefono;
    }
}
