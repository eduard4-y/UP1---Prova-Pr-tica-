//Faça um Programa que peça o raio de um círculo, calcule e mostre sua área. 

public class Main {
  public static void main(String[] args) {
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    System.out.print("Digite o raio do círculo: ");
    double raio = scanner.nextDouble();
    double area = Math.PI * Math.pow(raio, 2);
    System.out.println("A área do círculo é: " + area);
  }

  ----------------------------------------------------------------------------------------------------------
  }


import java.util.Scanner;
public class ConverterMetrosCentimetros {
    //Faça um Programa que converta metros para centímetros.

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
    
