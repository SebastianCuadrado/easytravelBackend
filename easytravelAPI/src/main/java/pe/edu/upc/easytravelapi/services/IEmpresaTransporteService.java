package pe.edu.upc.easytravelapi.services;

import pe.edu.upc.easytravelapi.entities.EmpresaTransporte;

import java.util.List;

public interface IEmpresaTransporteService {
    public void insert(EmpresaTransporte empresaTransporte);
    List<EmpresaTransporte> list();
    public void delete(int idEmpresa);
    public EmpresaTransporte listId(int idEmpresa);
}
