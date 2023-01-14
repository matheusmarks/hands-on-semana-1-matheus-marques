package br.com.relatorio.xpt.entitites;

import java.util.Objects;

public class Notas {

    private String company;

    private short mes;

    private int ano;

    private Double valor;

    private String data_emissao;

    private Long nota;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public short getMes() {
        return mes;
    }

    public void setMes(short mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getData_emissao() {
        return data_emissao;
    }

    public void setData_emissao(String data_emissao) {
        this.data_emissao = data_emissao;
    }

    public Long getNota() {
        return nota;
    }

    public void setNota(Long nota) {
        this.nota = nota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Notas notas)) return false;
        return getCompany().equals(notas.getCompany()) && Objects.equals(getData_emissao(), notas.getData_emissao());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCompany(), getData_emissao());
    }
}
