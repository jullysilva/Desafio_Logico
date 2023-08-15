# Desafio prático lógico de programação

### Questão 1
Resposta: C) Falso

### Questão 2
```
public class Main
{
	public static void main(String[] args) {
	    int A = 10;
	    int B = 20;
	    int aux;
	    
	    aux = B;
	    B = A;
	    A = aux;
	    
		System.out.println("Valor A: " + A + " Valor B: " + B);
	}
}
```

### Questão 3
```
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    
	    double salario;
	    double newSalario;
	    float percent;
	    
		System.out.print("Qual o seu salário atual? ");
		salario = input.nextDouble();
		
		System.out.print("E qual o percentual de reajuste (%)? ");
		percent = input.nextFloat();
		
		newSalario = salario + ((percent/100) * salario);
		
		System.out.printf("Novo Salario:  %.2f", newSalario);
	}
}
```

### Questão 4
O resultado final é 30. 
Tanto a variável _me_, quanto a _ma_, recebem o valor da variável _B_, ou seja, 30.

### Questão 5
Resultado é:
```
2 4
```

### Questão 6
A resposta correta é:
```
a) A primeira chamada da “funcao_A” com o argumento 2 provoca uma segunda chamada da “funcao_A” com o argumento 1.
```

### Questão 7
A reposta correta é:
```
b) Apenas I e II.
```
### Questão 8

Arquivo ```Calculadora.java```
```
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
```

Arquivo ```Aplicacao.java```
```
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
```