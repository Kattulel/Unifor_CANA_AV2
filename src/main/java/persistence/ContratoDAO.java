package persistence;

import beans.Contrato;
import java.util.ArrayList;
import java.util.List;
import Sorts.*;

public class ContratoDAO {
    private static ArrayList<Contrato> contratos = new ArrayList<>();
    // m * ( n^2 + n ) / 2 -> limite inferior de leitura
    private final InsertionSort insertion = new InsertionSort();
    private final MergeSort merge = new MergeSort();
    private final HeapSort heap = new HeapSort();
    private final QuickSort quick = new QuickSort();

    private int meses;
    private int fornecedores;

    public int getMeses() { return meses; }
    public int getFornecedores() { return fornecedores; }
    public Contrato get(int index) { return contratos.get(index); }

    public void add(String fornecedor, String mes_inicio, String mes_fim, String valor){
        contratos.add(new Contrato(fornecedor, mes_inicio, mes_fim, valor));
    }

    public void set(String meses, String fornecedores){
        this.meses = Integer.parseInt(meses);
        this.fornecedores = Integer.parseInt(fornecedores);
    }

    public void display(){
        for (Contrato c : contratos){
            System.out.println("Fornecedor: " + c.getFornecedor() +
                    " Inicio: "+ c.getMes_inicio() +
                    " Fim: " + c.getMes_fim() +
                    " Valor: " + c.getValor());
        }
    }

    public void display2(List<Contrato> lista){
        for (Contrato c : lista){
            String info = c.getMes_inicio() + " --> " + c.getMes_fim() + " = R$ " + c.getValor();
            System.out.println(info);
        }
    }

    public void melhorContrato() {
        ArrayList<Contrato> ordenado = bestContrato.insertionSortContrato(contratos);

        for(Contrato o : ordenado){
            System.out.println(o.getFornecedor() + " " + o.getMes_inicio() + " " + o.getMes_fim() + " " + o.getValor());
        }
    }

    public void insertionSort() {
        ArrayList<Contrato> aux = new ArrayList<>(contratos);
        ArrayList<Contrato> ordenado = insertion.Sort(aux);
    }

    public void mergeSort() {
        ArrayList<Contrato> aux = new ArrayList<>(contratos);
        ArrayList<Contrato> ordenado = merge.Sort(aux);
    }

    public void heapSort() {
        ArrayList<Contrato> aux = new ArrayList<>(contratos);
        ArrayList<Contrato> ordenado = heap.Sort(aux);
    }

    public void quickSort() {
        ArrayList<Contrato> aux = new ArrayList<>(contratos);
        ArrayList<Contrato> ordenado = quick.Sort(aux);
    }

    public void insertionSortDebug() {
        ArrayList<Contrato> aux = new ArrayList<>(contratos);
        ArrayList<Contrato> ordenado = insertion.Sort(aux);

        for(Contrato o : ordenado){
            System.out.printf("%s %s %s %s\n", o.getFornecedor(), o.getMes_inicio(), o.getMes_fim(), o.getValor());
        }
    }

    public void mergeSortDebug() {
        ArrayList<Contrato> aux = new ArrayList<>(contratos);
        ArrayList<Contrato> ordenado = merge.Sort(aux);

        for(Contrato o : ordenado){
            System.out.printf("%s %s %s %s\n", o.getFornecedor(), o.getMes_inicio(), o.getMes_fim(), o.getValor());
        }
    }

    public void heapSortDebug() {
        ArrayList<Contrato> aux = new ArrayList<>(contratos);
        ArrayList<Contrato> ordenado = heap.Sort(aux);
        for(Contrato o : ordenado){
            System.out.printf("%s %s %s %s\n", o.getFornecedor(), o.getMes_inicio(), o.getMes_fim(), o.getValor());
        }
    }

    public void quickSortDebug() {
        ArrayList<Contrato> aux = new ArrayList<>(contratos);
        ArrayList<Contrato> ordenado = quick.Sort(aux);
        for(Contrato o : ordenado){
            System.out.printf("%s %s %s %s\n", o.getFornecedor(), o.getMes_inicio(), o.getMes_fim(), o.getValor());
        }
    }



}
