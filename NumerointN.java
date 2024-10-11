/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numerointn;
import java.util.Scanner;

/**
 *
 * @author MIKE
 */
public class NumerointN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário um número inteiro N
        System.out.print("Digite um número inteiro N: ");
        int N = scanner.nextInt();

        // Imprime os números de 1 até N
        for (int i = 1; i <= N; i++) {
            System.out.println(i);
    }
  }
}