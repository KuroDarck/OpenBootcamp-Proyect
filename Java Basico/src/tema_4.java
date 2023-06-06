public class tema_4 {

    public static void main(String[] args) {
        //Desde una clase Main: crearéis objetos de cada una
        SmartDevice device=new SmartDevice(1, "Smart TV", "ABC123", "Sony", 999.99);

        SmartPhone phone=new SmartPhone(2, "Mi SmartPhone", "Mo1X3", "Samsung", 999.99, "Android", "6.5 pulgadas");

        SmartWatch watch=new SmartWatch(3, "SmartWatch XYZ", "A1B4C", "Apple", 199.99, "play music", "sport");

        System.out.println("El equipo con ID: "+device.getDevice_id()+" ,el nombre: "+device.getDevice_name()
                +" ,el modelo: "+device.getDevice_model()+" l,a marca: "+device.getDevice_marca()+
                " ,el precio: "+device.getDevice_precio());//imprimir sus valores por consola.

        System.out.println("El equipo con ID: "+phone.getDevice_id()+" ,el nombre: "+phone.getDevice_name()
                +" ,el modelo: "+phone.getDevice_model()+" ,la marca: "+phone.getDevice_marca()+
                " ,el precio: "+phone.getDevice_precio()+" ,el sistema operativo: "+phone.getPhone_sistema_operativo()
        +" y el Tamaño de pantalla: "+phone.getPhone_tamanio_pantalla());//imprimir sus valores por consola.

        System.out.println("El equipo con ID: "+watch.getDevice_id()+" ,el nombre: "+watch.getDevice_name()
                +" ,el modelo: "+watch.getDevice_model()+" ,a marca: "+watch.getDevice_marca()+
                " ,el precio: "+watch.getDevice_precio()+" ,la notificacion: "+watch.getWatch_notificacion()+" y el estado: "+watch.getWatch_actividad() );//imprimir sus valores por consola.

    }
}

//En este ejercicio tendréis que crear una clase SmartDevice.
class SmartDevice{ //Agregaréis atributos tal cual tendrían esos objetos en la realidad.

    private int device_id;
    private String device_name;
    private String device_model;
    private String device_marca;
    private double device_precio;
    public SmartDevice(){

    };//Crear constructor vacío
    public SmartDevice(int device_id,String device_name,String device_model,String device_marca,double device_precio){
        this.device_id=device_id;
        this.device_name=device_name;
        this.device_model=device_model;
        this.device_marca=device_marca;
        this.device_precio=device_precio;
    }

    public int getDevice_id() {
        return device_id;
    }

    public String getDevice_name() {
        return device_name;
    }

    public String getDevice_model() {
        return device_model;
    }

    public String getDevice_marca() {
        return device_marca;
    }

    public double getDevice_precio() {
        return device_precio;
    }
}
// Dentro crearéis las clases hijas: SmartPhone.
class SmartPhone extends SmartDevice{//Agregaréis atributos tal cual tendrían esos objetos en la realidad.
    private String phone_sistema_operativo;
    private String phone_tamanio_pantalla;
    public SmartPhone(){

    };//Crear constructor vacío
    public SmartPhone(int device_id, String device_name,String device_model,String device_marca,double device_precio,String phone_sistema_operativo,String phone_tamanio_pantalla){
        super( device_id, device_name, device_model, device_marca, device_precio);
        this.phone_sistema_operativo=phone_sistema_operativo;
        this.phone_tamanio_pantalla=phone_tamanio_pantalla;
    }

    public String getPhone_sistema_operativo() {
        return phone_sistema_operativo;
    }

    public String getPhone_tamanio_pantalla() {
        return phone_tamanio_pantalla;
    }
}

// Dentro crearéis las clases hijas: SmartWatch.
class SmartWatch extends SmartDevice{//Agregaréis atributos tal cual tendrían esos objetos en la realidad. private String phone_sistema_operativo;
    private String Watch_notificacion;
    private String Watch_actividad;
    public SmartWatch(){

    };//Crear constructor vacío
    public SmartWatch(int device_id, String device_name,String device_model,String device_marca,double device_precio,String Watch_notificacion,String Watch_actividad){
        super( device_id, device_name, device_model, device_marca, device_precio);
        this.Watch_notificacion=Watch_notificacion;
        this.Watch_actividad=Watch_actividad;
    }

    public String getWatch_notificacion() {
        return Watch_notificacion;
    }

    public String getWatch_actividad() {
        return Watch_actividad;
    }
}


