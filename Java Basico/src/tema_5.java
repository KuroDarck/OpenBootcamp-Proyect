public class tema_5 {

    public static void main(String[] args) {

        //Desde una clase Main, Crear un objeto de tipo CocheCRUDImpl
        MiClase coche=new MiClase();
        //llamar a cada uno de los métodos.
        coche.save();
        coche.findAll();
        coche.delete();
    }

}

class MiClase extends CocheCRUDImpl {//  La clase MiClase extiende la clase abstracta CocheCRUDImpl.
    }



//Crear una implementación CocheCRUDImpl que implemente la interfaz CocheCRUD.
abstract class CocheCRUDImpl implements CocheCRUD{

    //simplemente impriman por consola el nombre del propio método.
    @Override
    public void save() {
        System.out.println("Este es el método: save()");
    }
    @Override
    public void findAll() {
        System.out.println("Este es el método: findAll()");
    }
    @Override
    public void delete() {
        System.out.println("Este es el método: delete()");
    }
}



interface CocheCRUD{//Crear una interfaz CocheCRUD.

    //Como métodos de CocheCRUD podemos poner: save() findAll() delete()
    void save();
    void findAll();
    void delete();

}
