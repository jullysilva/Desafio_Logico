package Calculadora;

public class Calculadora{
    private int numberOne;
    private int numberTwo;

    public Calculadora(){
        this.numberOne = 0;
        this.numberTwo = 0;
    }

    private int Soma(){
        return numberOne + numberTwo;
    } 

    public int Somar(int valueOne, int valueTwo){
        if (valueOne < 0 || valueTwo < 0) {
            throw new IllegalArgumentException("Os números devem ser inteiros positivos.");
        }
        else{
            this.numberOne = valueOne;
            this.numberTwo = valueTwo;
            return Soma();
        }
    }

    public int Multiplicar(int valueOne, int valueTwo){
        if (valueTwo < 0) {
            throw new IllegalArgumentException("O segundo número deve ser positivo!");
        }
        else{
            this.numberOne = valueOne;
            this.numberTwo = valueTwo;
            return numberOne * numberTwo;
        }
    }
    

    public double Desconto(double value, double percent){
        if (value < 0 || percent < 0) {
            throw new IllegalArgumentException("Os números devem ser positivos.");
        }
        return value - (value * (percent/100));
    }
}