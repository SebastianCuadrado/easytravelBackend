package pe.edu.upc.easytravelapi.services;

import pe.edu.upc.easytravelapi.entities.Hotels;
import pe.edu.upc.easytravelapi.entities.Servicios;

import java.util.List;

public interface IServiciosService {

public void insertar(Servicios servicio);
    public void eliminar(int idServicio);
List<Servicios>listar();
    public Servicios listId(int idServicio);
}
