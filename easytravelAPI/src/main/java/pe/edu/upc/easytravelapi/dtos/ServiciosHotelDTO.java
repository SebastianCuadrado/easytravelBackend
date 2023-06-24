package pe.edu.upc.easytravelapi.dtos;

public class ServiciosHotelDTO {

    private String nombre;

    private int serviceCount;

    public ServiciosHotelDTO() {
    }

    public ServiciosHotelDTO(String nombre, int serviceCount) {
        this.nombre = nombre;
        this.serviceCount = serviceCount;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getServiceCount() {
        return serviceCount;
    }

    public void setServiceCount(int serviceCount) {
        this.serviceCount = serviceCount;
    }
}
