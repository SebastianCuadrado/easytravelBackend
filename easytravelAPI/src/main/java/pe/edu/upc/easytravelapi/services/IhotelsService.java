package pe.edu.upc.easytravelapi.services;

import org.springframework.stereotype.Service;
import pe.edu.upc.easytravelapi.entities.hotels;
import java.util.List;

@Service
public interface IhotelsService {

    public void insert (hotels hotel);
    List<hotels> list();
}
