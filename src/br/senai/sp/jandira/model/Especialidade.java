package br.senai.sp.jandira.model;

public class Especialidade {

    private static int contador = 100;
    private Integer codigo;
    private String nome;
    private String descricao;
    private static int quantidade;

    public Especialidade(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        atualizarCodigo();
    }

    private void atualizarCodigo() {
        this.codigo = contador;
        contador++;
    }
    
    public Especialidade() {
        atualizarCodigo();
        quantidade++;
    }

    //Método de acesso getters and setters
    public void setNome(String novoNome) {
        nome = novoNome;
    }

    public String getNome() {
        return nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public static int getContador() {
        return contador;
    }

    public static int getQuantidade() {
        return quantidade;
    }
}
