package pe.edu.upc.easytravelapi.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.easytravelapi.dtos.PlacePaqueteReservaDTO;
import pe.edu.upc.easytravelapi.entities.Place;
import pe.edu.upc.easytravelapi.repositories.IPlaceRepository;
import pe.edu.upc.easytravelapi.services.IPlaceService;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlaceServiceImplement implements IPlaceService {
    @Autowired
    private IPlaceRepository ipR;

    @Override
    public void insert(Place place) {
        ipR.save(place);
    }

    @Override
    public List<Place> list() {
        return ipR.findAll();
    }

    @Override
    public void delete(int idPlace) {
        ipR.deleteById(idPlace);
    }

    @Override
    public Place listId(int idPlace) {
        return ipR.findById(idPlace).orElse(new Place());
    }

    @Override
    public List<PlacePaqueteReservaDTO>getQuantityofPlaces(){
        List<String[]> PlaceReservaCount=ipR.getQuantityofPlaces();
        List<PlacePaqueteReservaDTO> PlacePaqueteReservaDTOs = new ArrayList<>();

        for (String[] data: PlaceReservaCount) {
            PlacePaqueteReservaDTO dto = new PlacePaqueteReservaDTO();
            dto.setNamePlace(data[0]);
            dto.setPlaceReservaCount(Integer.parseInt(data[1]));
            PlacePaqueteReservaDTOs.add(dto);
        }
        return PlacePaqueteReservaDTOs;
    }
}
