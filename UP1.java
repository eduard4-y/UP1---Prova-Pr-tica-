//Faça um Programa que peça o raio de um círculo, calcule e mostre sua área. 

public class Main {
  public static void main(String[] args) {
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    System.out.print("Digite o raio do círculo: ");
    double raio = scanner.nextDouble();
    double area = Math.PI * Math.pow(raio, 2);
    System.out.println("A área do círculo é: " + area);
   }
  
 }
  ----------------------------------------------------------------------------------------------------------
 
 //Faça um Programa que converta metros para centímetros.
import java.util.Scanner;
public class ConverterMetrosCentimetros {
   
        public static void main(String[] args) {
            java.util.Scanner scanner = new java.util.Scanner(System.in);

            System.out.println("Digite o valor em metros: ");
            double metros = scanner.nextDouble();
            double centimetros = metros * 100;
            System.out.println(metros + " metros equivalem a " + centimetros + " centímetros.");

            scanner.close();


        }

    }
---------------------------------------------------------------------------------------------------------------
    import java.util.Scanner;
//Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.
        public class Main {

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Digite um valor: ");
                double valor = scanner.nextDouble();

                if (valor > 0) {
                    System.out.println("O valor " + valor + " é positivo.");
                } else if (valor < 0) {
                    System.out.println("O valor " + valor + " é negativo.");
                } else {
                    System.out.println("O valor " + valor + " é zero.");
                }

                scanner.close();
            }
        }
    ----------------------------------------------------------------------------------------------------------------
     
//Estrutura de Condição e Repetição nos ajuda a obter algumas vantagens. Elaborar um programa que efetue a leitura de valores positivos inteiros até que um valor negativo seja informado. Ao final, devem ser apresentados o maior e menor valores informados pelo usuário.
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero, maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;

        System.out.println("Digite valores positivos inteiros (digite um valor negativo para sair):");

        do {
            numero = scanner.nextInt();

            if (numero > 0) {
                if (numero > maior) {
                    maior = numero;
                }
                if (numero < menor) {
                    menor = numero;
                }
            }
        } while (numero >= 0);

        if (maior != Integer.MIN_VALUE && menor != Integer.MAX_VALUE) {
            System.out.println("O maior valor digitado foi: " + maior);
            System.out.println("O menor valor digitado foi: " + menor);
        } else {
            System.out.println("Nenhum valor positivo foi digitado.");
        }

        scanner.close();
    }
}
