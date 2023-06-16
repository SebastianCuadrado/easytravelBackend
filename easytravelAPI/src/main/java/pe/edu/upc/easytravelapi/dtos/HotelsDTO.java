package pe.edu.upc.easytravelapi.dtos;

public class HotelsDTO {

    private int idHotels;
    private String nombre;
    private String precio_noche;
    private String ciudad;
    private String valoracion_promedio;
    private int estrellas;

    public int getIdHotels() {
        return idHotels;
    }

    public void setIdHotels(int idHotels) {
        this.idHotels = idHotels;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio_noche() {
        return precio_noche;
    }

    public void setPrecio_noche(String precio_noche) {
        this.precio_noche = precio_noche;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getValoracion_promedio() {
        return valoracion_promedio;
    }

    public void setValoracion_promedio(String valoracion_promedio) {
        this.valoracion_promedio = valoracion_promedio;
    }

    public int getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }
}
