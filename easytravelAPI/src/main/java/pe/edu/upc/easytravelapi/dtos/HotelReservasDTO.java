package pe.edu.upc.easytravelapi.dtos;

public class HotelReservasDTO {

    private String nombre;
    private int reservascount;

    public HotelReservasDTO() {
    }

    public HotelReservasDTO(String nombre, int reservascount) {
        this.nombre = nombre;
        this.reservascount = reservascount;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getReservascount() {
        return reservascount;
    }

    public void setReservascount(int reservascount) {
        this.reservascount = reservascount;
    }
}
