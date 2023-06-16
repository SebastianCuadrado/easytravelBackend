package pe.edu.upc.easytravelapi.services;

import pe.edu.upc.easytravelapi.entities.Hotels;
import java.util.List;


public interface IHotelsService {

    public void insert (Hotels hotels);
    List<Hotels> list();

    public void delete (int idHotels);
public Hotels listId(int idHotels);
}
