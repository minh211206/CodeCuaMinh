import java.util.ArrayList;

public class Sach {
    private int id;
    private String tensach;
    private String tentacgia;
    private String tennhaxuatban;

    public Sach(int id, String tensach, String tentacgia, String tennhaxuatban) {
        this.id = id;
        this.tensach = tensach;
        this.tentacgia = tentacgia;
        this.tennhaxuatban = tennhaxuatban;
    }

    public int getId() {
        return id;
    }

    public String getTensach() {
        return tensach;
    }

    public String getTentacgia() {
        return tentacgia;
    }

    public String getTennhaxuatban() {
        return tennhaxuatban;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public void setTentacgia(String tentacgia) {
        this.tentacgia = tentacgia;
    }

    public void setTennhaxuatban(String tennhaxuatban) {
        this.tennhaxuatban = tennhaxuatban;
    }

    public void chitiet(){
        System.out.printf("%10s %10s %15s %20s %n",this.getId(),this.getTensach(),this.getTentacgia(),this.getTennhaxuatban());
    }
}
