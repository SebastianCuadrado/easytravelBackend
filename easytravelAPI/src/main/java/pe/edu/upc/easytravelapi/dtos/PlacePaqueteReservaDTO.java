package pe.edu.upc.easytravelapi.dtos;

public class PlacePaqueteReservaDTO {
    private String namePlace;
    private int PlaceReservaCount;

    public PlacePaqueteReservaDTO() {
    }

    public PlacePaqueteReservaDTO(String namePlace, int placeReservaCount) {
        this.namePlace = namePlace;
        this.PlaceReservaCount = placeReservaCount;
    }

    public String getNamePlace() {
        return namePlace;
    }

    public void setNamePlace(String namePlace) {
        this.namePlace = namePlace;
    }

    public int getPlaceReservaCount() {
        return PlaceReservaCount;
    }

    public void setPlaceReservaCount(int placeReservaCount) {
        this.PlaceReservaCount = placeReservaCount;
    }
}
