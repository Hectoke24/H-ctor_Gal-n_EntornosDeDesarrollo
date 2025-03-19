public class HG_Rectangulo {
    private int id;
    private double ladoA;
    private double ladoB;
    private String Color;

    public HG_Rectangulo() {

    }

    public HG_Rectangulo(int id, double ladoA, double ladoB, String Color) {
        this.id = id;
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.Color = Color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getladoA() {
        return ladoA;
    }

    public void setladoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getladoB() {
        return ladoB;
    }

    public void setladoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    @Override
    public String toString() {
        return "HG_Rectangulo{" + "id=" + id + ", ladoA=" + ladoA + "ladoB" + ladoB + ", color='" + Color + '\'' + '}';

    }

}
