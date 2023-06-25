package pe.edu.upc.easytravelapi.services;


import pe.edu.upc.easytravelapi.dtos.PlacePaqueteReservaDTO;
import pe.edu.upc.easytravelapi.entities.Place;

import java.util.List;

public interface IPlaceService {
    public void insert (Place place);
    List<Place> list();
    public void delete (int idPlace);
    public Place listId(int idPlace);
    public List<PlacePaqueteReservaDTO> getQuantityofPlaces();
}
