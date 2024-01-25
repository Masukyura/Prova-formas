package Formas

public class main {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(5);
        Retangulo retangulo = new Retangulo(4, 6);
        Triangulo triangulo = new Triangulo(3, 4, 5, 4, 5);
        Circulo circulo = new Circulo(2);

        exibirResultados("Quadrado", quadrado);
        exibirResultados("Retângulo", retangulo);
        exibirResultados("Triângulo", triangulo);
        exibirResultados("Círculo", circulo);
    }

    private static void exibirResultados(String nomeFigura, FiguraGeometrica figura) {
        System.out.println("----- " + nomeFigura + " -----");
        System.out.println("Área: " + figura.calcularArea());
        System.out.println("Perímetro: " + figura.calcularPerimetro());
        System.out.println();
    }
}
