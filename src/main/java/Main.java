import persistence.ContratoDAO;
import util.FileReader;
import util.Timer;

public class Main {

    public static void main(String[] args) {
        // b) Matriz é mais eficiente que um array de objetos por não estar salvando um objeto na memoria, apenas os
        // valores.

        FileReader ler = new FileReader();

        // declaração do dao e leitura do arquivo.
        ContratoDAO dao = ler.read("medium.txt");
        Timer.Perf("MergeSort", dao::mergeSort);
        Timer.Perf("HeapSort", dao::heapSort);
        Timer.Perf("QuickSort", dao::quickSort);
        Timer.Perf("InsertionSort", dao::insertionSort);
        Timer.Perf("CustomSort", dao::melhorContrato);
    }

}
