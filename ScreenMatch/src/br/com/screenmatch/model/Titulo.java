/*
 Agora é com você! Faça o mesmo procedimento que eu fiz na aula, criando o projeto ScreenMatch no IntelliJ, 
sendo que nele você deve criar a classe Filme, contendo os atributos nome, anoDeLancamento, duracaoEmMinutos, 
incluidoNoPlano, somaDasAvaliacoes e totalDeAvaliacoes, além de também conter os métodos exibeFichaTecnica, avalia e pegaMedia.

Além disso, crie também uma outra classe contendo o método main, no qual você deve criar um objeto Filme, preencher 
seus atributos e chamar seus métodos.
 */
package br.com.screenmatch.model;

/**
 *
 * @author sabri
 */
public class Titulo {

        private String nome;
        private int anoDeLancamento;
        private int duracaoEmMinutos;
        private boolean incluidoNoPlano;
        private double somaDasAvaliacoes;
        private int totalDeAvaliacoes;

        public void exibeFichaTecnica() {
            System.out.println("Nome do filme: " +nome);
            System.out.println("Ano de lançamento: " +anoDeLancamento);
            System.out.println("Duração em minutos: " +duracaoEmMinutos);
            System.out.println("Incluído no plano: " +incluidoNoPlano);
        }

        public void avalia(double nota) {
            somaDasAvaliacoes += nota;
            totalDeAvaliacoes++;
        }

        public double pegaMedia() {
            return somaDasAvaliacoes / totalDeAvaliacoes;
        }

        public String getNome() {
            return this.nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getAnoDeLancamento() {
            return this.anoDeLancamento;
        }

        public void setAnoDeLancamento(int anoDeLancamento) {
            this.anoDeLancamento = anoDeLancamento;
        }

        public boolean getIncluidoNoPlano() {
            return this.incluidoNoPlano;
        }

        public void setIncluidoNoPlano(boolean incluidoNoPlano) {
            this.incluidoNoPlano = incluidoNoPlano;
        }

        public int getDuracaoEmMinutos() {
            return this.duracaoEmMinutos;
        }

        public void setDuracaoEmMinutos(int duracaoEmMinutos) {
            this.duracaoEmMinutos = duracaoEmMinutos;
        }

        public int getTotalDeAvaliacoes() {
            return this.totalDeAvaliacoes;
        }        }