public class Main {
    public static void main(String[] args) {
        // Instanciamos un rectángulo y un círculo
        HG_Circulo circulo1 = new HG_Circulo(3, 0, "verde");
        HG_Rectangulo rectangulo1 = new HG_Rectangulo(3, 3, 0, "rojo");

        // Calculamos las áreas y la diferencia
        double areaCirculo = calcularAreaCirculo(circulo1);
        double areaRectangulo = calcularAreaRectangulo(rectangulo1);
        double diferencia = calcularDiferencia(areaRectangulo, areaCirculo);

        // Imprimimos los resultados
        imprimirResultados(rectangulo1, circulo1, diferencia, areaCirculo, areaRectangulo);
    }

    // Método para calcular el área del círculo
    public static double calcularAreaCirculo(HG_Circulo circulo) {
        double radio = circulo.getRadio();
        return radio * radio * 3.14159265;
    }

    // Método para calcular el área del rectángulo
    public static double calcularAreaRectangulo(HG_Rectangulo rectangulo) {
        double ladoA = rectangulo.getladoA();
        double ladoB = rectangulo.getladoB();
        return ladoA * ladoB;
    }

    // Método para calcular la diferencia de áreas
    public static double calcularDiferencia(double area1, double area2) {
        return area1 - area2;
    }

    // Método para imprimir los resultados
    public static void imprimirResultados(HG_Rectangulo rectangulo, HG_Circulo circulo,
            double diferencia, double areaCirculo, double areaRectangulo) {
        System.out.println("Área rectángulo: " + areaRectangulo);
        System.out.println("Área círculo: " + areaCirculo);
        System.out.println("Diferencia áreas: " + diferencia);
        System.out.println("Rectángulo: " + rectangulo);
        System.out.println("Círculo: " + circulo);
    }
}
