package pe.edu.upc.easytravelapi.services;

import pe.edu.upc.easytravelapi.entities.Paquete;

import java.util.List;

public interface IPaqueteService {
    public void insert(Paquete paquete);
    List<Paquete> list();
    List<Paquete> findPaqueteByPrecioGreaterThan(float precio);
    public void delete(int idPaquete);
    public Paquete listId(int idPaquete);

}
