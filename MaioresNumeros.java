/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maioresnumeros;
import java.util.Scanner;

/**
 *
 * @author MIKE
 */
public class MaioresNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);


        int maior = Integer.MIN_VALUE;
        int segundoMaior = Integer.MIN_VALUE;

        int contador = 0;

        while (contador < 10) {
            System.out.print("Digite o número " + (contador + 1) + ": ");
            int numero = scanner.nextInt();

            if (numero > maior) {
                segundoMaior = maior;
                maior = numero;
            } else if (numero > segundoMaior) {
                segundoMaior = numero;
            }

            contador++;
        }

        System.out.println("O maior número é: " + maior);
        System.out.println("O segundo maior número é: " + segundoMaior);
    }
    
}
