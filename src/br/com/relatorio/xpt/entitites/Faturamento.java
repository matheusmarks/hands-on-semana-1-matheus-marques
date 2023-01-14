package br.com.relatorio.xpt.entitites;

import java.util.Objects;

public class Faturamento {

    private String company;

    private short mes;

    private int ano;

    private String data_parcela_1;

    private Double parcela1;

    private String data_parcela_2;

    private Double parcela2;

    private String data_parcela_3;

    private Double parcela3;

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

    public String getData_parcela_1() {
        return data_parcela_1;
    }

    public void setData_parcela_1(String data_parcela_1) {
        this.data_parcela_1 = data_parcela_1;
    }

    public Double getParcela1() {
        return parcela1;
    }

    public void setParcela1(Double parcela1) {
        this.parcela1 = parcela1;
    }

    public String getData_parcela_2() {
        return data_parcela_2;
    }

    public void setData_parcela_2(String data_parcela_2) {
        this.data_parcela_2 = data_parcela_2;
    }

    public Double getParcela2() {
        return parcela2;
    }

    public void setParcela2(Double parcela2) {
        this.parcela2 = parcela2;
    }

    public String getData_parcela_3() {
        return data_parcela_3;
    }

    public void setData_parcela_3(String data_parcela_3) {
        this.data_parcela_3 = data_parcela_3;
    }

    public Double getParcela3() {
        return parcela3;
    }

    public void setParcela3(Double parcela3) {
        this.parcela3 = parcela3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Faturamento that)) return false;
        return getCompany().equals(that.getCompany());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCompany());
    }
}
