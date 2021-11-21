package br.com.dio;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        System.out.println("Elias Lobo");
        System.out.println("Elias Lobo");
        System.out.println("Elias Lobo");

        Livro livro = new Livro("Elias Lobo", 300);
        System.out.println(livro);
    }

}

class Livro {
    private String nome;
    private Integer numPagina;

    public Livro(String nome, Integer numPagina) {
        this.nome = nome;
        this.numPagina = numPagina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPagina() {
        return numPagina;
    }

    public void setNumPagina(Integer numPagina) {
        this.numPagina = numPagina;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPagina=" + numPagina +
                '}';
    }
}