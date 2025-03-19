public class Main {
    public static void main(String[] args) {
        // Instanciamos un cuadrado y un círculo
        HG_Circulo Circulo1 = new HG_Circulo(3, 0, "verde");
        HG_Rectangulo Rectangulo1 = new HG_Rectangulo(3, 3, 0, "rojo");

        // Calcula área cuadrado LadoA * LadoB
        double ladoA = Rectangulo1.getladoA();
        double ladoB = Rectangulo1.getladoB();
        double area1 = ladoA * ladoB;
        System.out.println("Área cuadrado: " + area1);

        // Calcula área círculo pi * R^2
        double radio1 = Circulo1.getRadio();
        double area2 = radio1 * radio1 * 3.14;
        System.out.println("Área círculo: " + area2);

        // Diferencia entre áreas de cuadrado y círculo
        double diferencia = area1 - area2;
        System.out.println("Diferencia áreas: " + diferencia);

        // Imprimir datos
        System.out.println("Rectángulo: " + Rectangulo1);
        System.out.println("Círculo: " + Circulo1);
        System.out.println("Diferencia: " + diferencia);
    }
}
