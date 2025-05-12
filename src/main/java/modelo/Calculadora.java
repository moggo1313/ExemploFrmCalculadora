package modelo;

public class Calculadora {

    private double ValorA;
    private double ValorB;

    public Calculadora() {
        this(0, 0);
    }

    public Calculadora(double ValorA, double ValorB) {
        this.ValorA = ValorA;
        this.ValorB = ValorB;
    }

    public double getValorA() {
        return ValorA;
    }

    public void setValorA(double ValorA) {
        this.ValorA = ValorA;
    }

    public double getValorB() {
        return ValorB;
    }

    public void setValorB(double ValorB) {
        this.ValorB = ValorB;
    }

    public double getSoma() {
        return (ValorA + ValorB);
    }

    public double getDiferenca() {
        return (ValorA - ValorB);
    }

    public double getProduto() {
        return (ValorA * ValorB);
    }

    public double getQuociente() {
        return (ValorA / ValorB);
    }
}
