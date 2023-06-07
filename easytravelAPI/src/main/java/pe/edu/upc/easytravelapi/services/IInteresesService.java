package pe.edu.upc.easytravelapi.services;

import pe.edu.upc.easytravelapi.entities.Intereses;
import pe.edu.upc.easytravelapi.entities.Usuarios;

import java.util.List;

public interface IInteresesService {
    public void insertar(Intereses intereses);
    List<Intereses> listar();
    List<Intereses> BuscarInteresPorIDUsuario(Integer id);
}
