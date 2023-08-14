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

