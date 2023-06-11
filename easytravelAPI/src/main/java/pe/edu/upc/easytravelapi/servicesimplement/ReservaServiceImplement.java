package pe.edu.upc.easytravelapi.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.easytravelapi.entities.Reserva;
import pe.edu.upc.easytravelapi.repositories.IReservaRepository;
import pe.edu.upc.easytravelapi.services.IReservaService;

import java.util.List;

@Service
public class  ReservaServiceImplement implements IReservaService {
    @Autowired
    private IReservaRepository irR;
    @Override
    public void insert(Reserva reserva) {
        irR.save(reserva);
    }

    @Override
    public List<Reserva> list() {
        return irR.findAll();
    }

    @Override
    public List<Reserva> findReservaByUserID(Integer idReserva) {
        return irR.findReservaByUserID(idReserva);
    }
}
