package pe.edu.upc.easytravelapi.services;

import pe.edu.upc.easytravelapi.entities.Viaje;

import java.util.List;

public interface IViajeService {
    public void insert(Viaje viaje);
    public List<Viaje> list();
    public void delete(int idViaje);
    public Viaje listId(int idViaje);
}
