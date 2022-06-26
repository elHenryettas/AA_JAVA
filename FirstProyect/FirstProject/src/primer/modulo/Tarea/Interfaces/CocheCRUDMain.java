package primer.modulo.Tarea.Interfaces;

public class CocheCRUDMain {
    public static void main(String[] args) {
        CocheCRUD cocheCrud = new CocheCRUD();
        System.out.println(cocheCrud.save());
        System.out.println(cocheCrud.findAll());
        System.out.println(cocheCrud.delete());
    }
}
