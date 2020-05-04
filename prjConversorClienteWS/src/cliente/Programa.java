package cliente;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Conversor conversor = new ConversorService().getConversorPort();
        Scanner in = new Scanner(System.in);

        System.out.println("Bem-vindo ao Conversor de Temperaturas, digite: \n1 para digitar em Celsius: \n2 para digitar em Fahrenheit: ");
        int escolT = in.nextInt();

        System.out.println("Digite o valor da temperatura: ");
        int temp = in.nextInt();

        System.out.println(conversor.conversor(escolT,temp));
    }

}