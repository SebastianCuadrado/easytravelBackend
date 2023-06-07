package pe.edu.upc.easytravelapi.services;



import pe.edu.upc.easytravelapi.entities.Usuarios;

import java.util.List;

public interface IUsuarioService {
    public void insert(Usuarios usuarios);
    List<Usuarios> list();
    public void delete(int id);
    public Usuarios listId(int id);
}
