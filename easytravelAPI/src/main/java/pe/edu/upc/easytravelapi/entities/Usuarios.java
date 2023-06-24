package pe.edu.upc.easytravelapi.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.net.PasswordAuthentication;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "usuarios")
public class Usuarios implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="nombre", length = 40, nullable = false)
    private String nombre;
    @Column(name="apellidos", length = 60, nullable = false)
    private String apellidos;
    @Column(name="email", length = 80, nullable = false)
    private String email;
    @Column(name="fechaNacimiento")
    private LocalDate fechaNacimiento;
    @Column(name="celular", length = 9, nullable = false)
    private String celular;
    @Column(name="ubicacion", length = 30, nullable = false)
    private String ubicacion;
    @Column(name="username", length = 30, nullable = false)
    private String username;
    @Column(name="password", length = 80, nullable = false)
    private String password;

    private Boolean enabled;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private List<Role> roles;

    public Usuarios() {
    }

    public Usuarios(Long id, String nombre, String apellidos, String email, LocalDate fechaNacimiento, String celular, String ubicacion, String username, String password, Boolean enabled, List<Role> roles) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        this.celular = celular;
        this.ubicacion = ubicacion;
        this.username = username;
        this.password = password;
        this.enabled = enabled;
        this.roles = roles;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}

