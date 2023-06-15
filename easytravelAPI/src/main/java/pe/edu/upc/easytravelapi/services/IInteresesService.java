package pe.edu.upc.easytravelapi.services;

import pe.edu.upc.easytravelapi.entities.Intereses;

import java.util.List;

public interface IInteresesService {
    public void insertar(Intereses intereses);
    List<Intereses> listar();
    List<Intereses> BuscarInteresPorIDUsuario(Integer id);
    public void delete(int id);
    public Intereses listId(int id);
}
