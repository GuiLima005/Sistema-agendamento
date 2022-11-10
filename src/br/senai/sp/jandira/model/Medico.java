package br.senai.sp.jandira.model;

import java.util.ArrayList;

public class Medico extends Pessoa {

    private static int contador = 300;
    private Integer codigo;
    private String crm;
    private ArrayList<Especialidade> especialidades;

    // Métodos de acesso
    
     public Medico(Integer codigo, String crm, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.crm = crm;
        this.contador = this.codigo;
    }
     
      private void atualizarCodigo() {
        contador++;
        this.codigo = contador;
    }
    
    public ArrayList<Especialidade> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(ArrayList<Especialidade> especialidades) {
        this.especialidades = especialidades;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Medico.contador = contador;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
     public String getMedicoSeperadoPorPontoEVirgula() {
        String medicoStr = this.codigo + ";" + this.getCrm() + ";" + this.getNome();
        return medicoStr;
    }

}
