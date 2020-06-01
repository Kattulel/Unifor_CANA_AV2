package Sorts;

import beans.Contrato;

import java.util.ArrayList;

public class InsertionSort {

   /* ----------------------------------------------------------------------------------
    * -----------------------------     Insertion Sort      ----------------------------
    * ----------------------------------------------------------------------------------
    *                                 Complexidade = n^2
    * ---------------------------------------------------------------------------------- */

   public ArrayList<Contrato> Sort(ArrayList<Contrato> c) {
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
      return array;
   }

}
