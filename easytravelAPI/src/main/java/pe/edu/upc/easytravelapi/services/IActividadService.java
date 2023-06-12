package pe.edu.upc.easytravelapi.services;

import pe.edu.upc.easytravelapi.entities.Actividad;

import java.util.List;

public interface IActividadService {
    public void insert(Actividad actividad);
    public List<Actividad> list();
    public void delete(int idActividad);
    public Actividad listId(int idActividad);
}
