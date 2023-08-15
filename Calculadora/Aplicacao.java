package Calculadora;

import java.util.*;

public class Aplicacao {

    public static void main(String[] args) {
        int op = 0;
        int valueOne, valueTwo;
        double value, taxaDesconto;

        Scanner input = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        System.out.println("1 - Somar\n2 - Multiplicar\n3 - Calcular desconto\n");
        System.out.print("Escolha uma operação: ");
        op = input.nextInt();

        switch(op){
            case 1:
                System.out.print("Insira o PRIMEIRO valor: ");
                valueOne = input.nextInt();
                System.out.print("Insira o SEGUNDO valor: ");
                valueTwo = input.nextInt();
                System.out.print("Resultado da soma: " + calc.Somar(valueOne, valueTwo));
            break;
            case 2:
                System.out.print("Insira o PRIMEIRO valor: ");
                valueOne = input.nextInt();
                System.out.print("Insira o SEGUNDO valor: ");
                valueTwo = input.nextInt();
                System.out.print("Resultado da multiplicacao: " + calc.Multiplicar(valueOne, valueTwo));
            break;
            case 3:
                System.out.print("Insira o valor: ");
                value = input.nextDouble();
                System.out.print("Insira o percentual de desconto (%): ");
                taxaDesconto = input.nextDouble();
                System.out.print("Valor com desconto: R$ " + calc.Desconto(value, taxaDesconto));
            break;
        }
    }
}
