package atividade;

import java.util.Scanner;

/**
 * Método principal para execução do programa, com notas definidas pelo usuário.
 */
public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o nome do aluno
        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        // Solicita as notas do aluno
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        System.out.print("Digite a quarta nota: ");
        double nota4 = scanner.nextDouble();

        // Cria o objeto Aluno com os valores fornecidos
        Aluno aluno = new Aluno(nome, nota1, nota2, nota3, nota4);

        // Calcula a média usando o método da classe Aluno
        double media = aluno.calcularMedia();

        // Verifica a situação do aluno (Aprovado/Reprovado)
        String resultado = aluno.verificarAprovacao(media);

        // Exibe os resultados
        System.out.println("\nResultado Final:");
        System.out.println("Aluno: " + aluno.nome);
        System.out.printf("Média: %.2f\n", media);
        System.out.println("Situação: " + resultado);

        scanner.close();
    }
}