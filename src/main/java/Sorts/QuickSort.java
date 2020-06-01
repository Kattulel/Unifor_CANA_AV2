package Sorts;

import beans.Contrato;

import java.util.ArrayList;
import java.util.Random;

public class QuickSort {

   /* ----------------------------------------------------------------------------------
    * -----------------------------      Quick Sort        -----------------------------
    * ----------------------------------------------------------------------------------
    *                                Complexidade = nLogn
    *                               n^2 normalmente
    * ---------------------------------------------------------------------------------- */

   public ArrayList<Contrato> Sort(ArrayList<Contrato> arr) {
      startQuickStart(arr, 0, arr.size() - 1);
      return arr;
   }

   public void startQuickStart(ArrayList<Contrato> arr, int start, int end) {
      int q;
      if (start < end) {
         q = partition(arr, start, end);
         startQuickStart(arr, start, q);
         startQuickStart(arr, q + 1, end);
      }
   }

   int partition(ArrayList<Contrato> arr, int start, int end) {

      int init = start;
      int length = end;

      Random r = new Random();
      int pivotIndex = nextIntInRange(start, end, r);
      double pivot = arr.get(pivotIndex).getValor();

      while (true) {
         while (arr.get(length).getValor() > pivot && length > start) {
            length--;
         }

         while (arr.get(init).getValor() < pivot && init < end) {
            init++;
         }

         if (init < length) {
            Contrato temp;
            temp = arr.get(init);
            arr.set(init, arr.get(length));
            arr.set(length, temp);
            length--;
            init++;
         } else {
            return length;
         }

      }

   }

   static int nextIntInRange(int min, int max, Random rng) {
      if (min > max) {
         throw new IllegalArgumentException("Cannot draw random int from invalid range [" + min + ", " + max + "].");
      }
      int diff = max - min;
      if (diff >= 0 && diff != Integer.MAX_VALUE) {
         return (min + rng.nextInt(diff + 1));
      }
      int i;
      do {
         i = rng.nextInt();
      } while (i < min || i > max);
      return i;
   }

}
