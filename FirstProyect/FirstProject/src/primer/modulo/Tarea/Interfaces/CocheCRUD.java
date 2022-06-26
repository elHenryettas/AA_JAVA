package primer.modulo.Tarea.Interfaces;

public class CocheCRUD implements CocheCRUDImpl {
    @Override
    public String save() {
        return "save";
    }

    @Override
    public String findAll() {
        return "findAll";
    }

    @Override
    public String delete() {
        return "delete";
    }
    
}
