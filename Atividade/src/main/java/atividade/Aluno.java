package atividade;

/**
 * Representa um aluno com quatro notas e fornece métodos para calcular a média aritmética e verificar se sua situação é aprovado ou reprovado.
 */
public class Aluno {

    /** Nome do aluno. */
    public String nome;

    /** Primeira nota do aluno. */
    public double nota1;

    /** Segunda nota do aluno. */
    public double nota2;

    /** Terceira nota do aluno. */
    public double nota3;

    /** Quarta nota do aluno. */
    public double nota4;

    /**
     * Constrói um objeto Aluno com o nome e quatro notas.
     *
     * @param nome  O nome do aluno.
     * @param nota1 A primeira nota do aluno.
     * @param nota2 A segunda nota do aluno.
     * @param nota3 A terceira nota do aluno.
     * @param nota4 A quarta nota do aluno.
     */
    public Aluno(String nome, double nota1, double nota2, double nota3, double nota4) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }

    /**
     * Calcula a média aritmética das quatro notas do aluno.
     *
     * @return A média aritmética das quatro notas.
     */
    public double calcularMedia() {
        return (nota1 + nota2 + nota3 + nota4) / 4;
    }

    /**
     * Verifica a situação do aluno com base na média calculada.
     * A média mínima para aprovação é 6.0.
     *
     * @param media A média do aluno.
     * @return {@code "Aprovado"} se a média é maior ou igual a 6.0, ou {@code "Reprovado"} caso contrário.
     */
    public String verificarAprovacao(double media) {
        if (media >= 6.0) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
}