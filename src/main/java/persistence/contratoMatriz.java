package persistence;

import java.text.NumberFormat;
import java.util.Locale;

public class contratoMatriz {
    Double [][][] contratos = new Double[121][121][121];

    public void setVal(String fornecedor, String mes_inicio, String mes_fim, String valor){
        int f = Integer.parseInt(fornecedor);
        int mi = Integer.parseInt(mes_inicio);
        int mf = Integer.parseInt(mes_fim);
        double val=0;
        try {
            NumberFormat format = NumberFormat.getInstance(Locale.FRANCE);
            // tratar numeros com , ou .
            Number number = format.parse(valor);
            val = number.doubleValue();
        } catch (Exception e){
            System.out.println("deu pau");
        }
        contratos[f][mi][mf] = val;
    }

    public void showPos(int f, int mi, int mf){
        System.out.println(contratos[f][mi][mf]);
    }

}
