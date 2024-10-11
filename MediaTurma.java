/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mediaturma;
import java.util.Scanner;

/**
 *
 * @author MIKE
 */
public class MediaTurma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);

        // Pergunta ao usuário quantos alunos há na sala
        System.out.print("Quantos alunos tem na sala? ");
        int quantidadeAlunos = scanner.nextInt();

        // Inicializa variáveis
        double somaNotas = 0;
        int contador = 0;

        // Loop while para coletar as notas
        while (contador < quantidadeAlunos) {
            System.out.print("Digite a nota do aluno " + (contador + 1) + ": ");
            double nota = scanner.nextDouble();
            somaNotas += nota;
            contador++;
        }

        // Calcula e exibe a média
        double media = somaNotas / quantidadeAlunos;
        System.out.printf("A média da turma é: %.2f\n", media);
    }
    
}
