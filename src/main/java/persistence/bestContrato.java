package persistence;

import beans.Contrato;

import java.util.ArrayList;

public class bestContrato {
   // Complexidade: n^2
   public static ArrayList<Contrato> insertionSortContrato(ArrayList<Contrato> c) {
      int i, j;
      ArrayList<Contrato> array;
      array = c;
      for (i = 1; i < array.size(); i++) {
         Contrato tmp = array.get(i);
         j = i;
         while ((j > 0) && (array.get(j - 1).getValor() > tmp.getValor())) {
            array.set(j, array.get(j - 1));
            j--;
         }
         array.set(j, tmp);
      }

      for (i = 1; i < array.size(); i++) {
         Contrato tmp = array.get(i);
         j = i;
         while ((j > 0) && (array.get(j - 1).getFornecedor() > tmp.getFornecedor())) {
            array.set(j, array.get(j - 1));
            j--;
         }
         array.set(j, tmp);
      }
      return array;
   }
}
