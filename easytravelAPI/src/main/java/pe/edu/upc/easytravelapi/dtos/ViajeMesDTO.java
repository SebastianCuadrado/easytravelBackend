package pe.edu.upc.easytravelapi.dtos;

public class ViajeMesDTO {
    private String nameMonth;
    private int viajeCount;

    public ViajeMesDTO() {
    }

    public ViajeMesDTO(String nameMonth, int viajeCount) {
        this.nameMonth = nameMonth;
        this.viajeCount = viajeCount;
    }

    public String getNameMonth() {
        return nameMonth;
    }

    public void setNameMonth(String nameMonth) {
        this.nameMonth = nameMonth;
    }

    public int getViajeCount() {
        return viajeCount;
    }

    public void setViajeCount(int viajeCount) {
        this.viajeCount = viajeCount;
    }
}
