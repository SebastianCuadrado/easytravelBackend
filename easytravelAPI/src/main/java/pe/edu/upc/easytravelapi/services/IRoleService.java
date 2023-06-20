package pe.edu.upc.easytravelapi.services;

import pe.edu.upc.easytravelapi.entities.Role;

import java.util.List;

public interface IRoleService {
    public void insert(Role role);

    List<Role> list();
}
