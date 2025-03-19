public class HG_Circulo {
    private int id;
    private double Radio;
    private String Color;

    public HG_Circulo() {

    }

    public HG_Circulo(int id, double Radio, String Color) {
        this.id = id;
        this.Radio = Radio;
        this.Color = Color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getRadio() {
        return Radio;
    }

    public void setRadio(double radio) {
        this.Radio = radio;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    @Override

    public String toString() {
        return "HG_Circulo{" + "id=" + id + ", radio=" + Radio + ", color='" + Color + '\'' + '}';
    }

}
