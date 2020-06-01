package beans;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Contrato {
    int fornecedor;
    int mes_inicio;
    int mes_fim;
    double valor;

    public Contrato(String fornecedor, String mes_inicio, String mes_fim, String valor) {
        this.fornecedor = Integer.parseInt(fornecedor);
        this.mes_inicio = Integer.parseInt(mes_inicio);
        this.mes_fim = Integer.parseInt(mes_fim);

        try {
            NumberFormat format = NumberFormat.getInstance(Locale.FRANCE);
            // tratar numeros com , ou .
            Number number = format.parse(valor);
            this.valor = number.doubleValue();
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    public void display(){
        System.out.printf("%s %s %s %s \n",
                this.fornecedor, this.mes_inicio, this.mes_fim, this.valor);
    }

    public int getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(int fornecedor) {
        this.fornecedor = fornecedor;
    }

    public int getMes_inicio() {
        return mes_inicio;
    }

    public void setMes_inicio(int mes_inicio) {
        this.mes_inicio = mes_inicio;
    }

    public int getMes_fim() {
        return mes_fim;
    }

    public void setMes_fim(int mes_fim) {
        this.mes_fim = mes_fim;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
