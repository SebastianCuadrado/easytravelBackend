package pe.edu.upc.easytravelapi.dtos;

public class ViajeEmpresaTransporteDTO {
    private String nameEmpresa;
    private int viajeCount;

    public ViajeEmpresaTransporteDTO() {
    }

    public ViajeEmpresaTransporteDTO(String nameEmpresa, int viajeCount) {
        this.nameEmpresa = nameEmpresa;
        this.viajeCount = viajeCount;
    }

    public String getNameEmpresa() {
        return nameEmpresa;
    }

    public void setNameEmpresa(String nameEmpresa) {
        this.nameEmpresa = nameEmpresa;
    }

    public int getViajeCount() {
        return viajeCount;
    }

    public void setViajeCount(int viajeCount) {
        this.viajeCount = viajeCount;
    }
}
