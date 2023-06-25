package pe.edu.upc.easytravelapi.dtos;

public class PaqueteHotelPlaceDTO {
    private String nombre;
    private float precio;
    private String namePlace;

    public PaqueteHotelPlaceDTO() {
    }

    public PaqueteHotelPlaceDTO(String nombre, float precio, String namePlace) {
        this.nombre = nombre;
        this.precio = precio;
        this.namePlace = namePlace;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getNamePlace() {
        return namePlace;
    }

    public void setNamePlace(String namePlace) {
        this.namePlace = namePlace;
    }
}
