package Sorts;
import beans.Contrato;
import java.util.ArrayList;

public class MergeSort {

   /* ----------------------------------------------------------------------------------
    * -----------------------------       Merge Sort        ----------------------------
    * ----------------------------------------------------------------------------------
    *                                 Complexidade = nLogn
    * ---------------------------------------------------------------------------------- */

   public ArrayList<Contrato> Sort(ArrayList<Contrato> cont) {
      return doMergeSort(cont);
   }

   public ArrayList<Contrato> doMergeSort(ArrayList<Contrato> cont) {
      int middle;
      ArrayList<Contrato> left = new ArrayList<>();
      ArrayList<Contrato> right = new ArrayList<>();
      ArrayList<Contrato> numbers;
      numbers = cont;

      if (numbers.size() > 1) {
         middle = numbers.size() / 2;
         // copy the left half of numbers into left.
         for (int i = 0; i < middle; i++)
            left.add(numbers.get(i));

         // copy the right half of numbers into right.
         for (int j = middle; j < numbers.size(); j++)
            right.add(numbers.get(j));

         doMergeSort(left);
         doMergeSort(right);

         merge(numbers, left, right);
      }

      return numbers;
   }

   private static void merge(ArrayList<Contrato> numbers, ArrayList<Contrato> left, ArrayList<Contrato> right) {
      // set up a temporary arraylist to build the merge list
      ArrayList<Contrato> temp = new ArrayList<>();

      // set up index values for merging the two lists
      int numbersIndex = 0;
      int leftIndex = 0;
      int rightIndex = 0;

      while (leftIndex < left.size() && rightIndex < right.size()) {
         if (left.get(leftIndex).getValor() < right.get(rightIndex).getValor()) {
            numbers.set(numbersIndex, left.get(leftIndex));
            leftIndex++;
         } else {
            numbers.set(numbersIndex, right.get(rightIndex));
            rightIndex++;
         }
         numbersIndex++;
      }

      int tempIndex = 0;
      if (leftIndex >= left.size()) {
         temp = right;
         tempIndex = rightIndex;
      } else {
         temp = left;
         tempIndex = leftIndex;
      }

      for (int i = tempIndex; i < temp.size(); i++) {
         numbers.set(numbersIndex, temp.get(i));
         numbersIndex++;
      }
   }

}
