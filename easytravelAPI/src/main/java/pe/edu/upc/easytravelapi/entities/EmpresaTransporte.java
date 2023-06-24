package pe.edu.upc.easytravelapi.entities;

import javax.persistence.*;

@Entity
@Table(name = "Empresa_Transporte")
public class EmpresaTransporte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEmpresa;
    @Column(name = "nombre", length = 40, nullable = false)
    private String nombre;
    @Column(name = "ruc", length = 11, nullable = false)
    private String ruc;
    @Column(name = "direccion", length = 30, nullable = false)
    private String direccion;
    @Column(name = "contacto", length = 50, nullable = false)
    private String contacto;
    @Column(name = "logo", length = 250)
    private String logo;

    public EmpresaTransporte() {
    }

    public EmpresaTransporte(int idEmpresa, String nombre, String ruc, String direccion, String contacto, String logo) {
        this.idEmpresa = idEmpresa;
        this.nombre = nombre;
        this.ruc = ruc;
        this.direccion = direccion;
        this.contacto = contacto;
        this.logo = logo;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
}
