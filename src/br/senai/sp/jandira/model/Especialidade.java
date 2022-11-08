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

    public Especialidade(Integer codigo, String nome, String descricao) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.contador = this.codigo;
    }

    private void atualizarCodigo() {
        contador++;
        this.codigo = contador;
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

    public String getEspecialidadeSeperadoPorPontoEVirgula() {
        String especialidadeStr = this.codigo + ";" + this.nome + ";" + this.descricao;
        return especialidadeStr;
    }
}
