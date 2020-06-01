package util;

import persistence.ContratoDAO;
import persistence.contratoMatriz;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileReader {
    private final ContratoDAO dao = new ContratoDAO(); // Arraylist
    private final contratoMatriz dao2 = new contratoMatriz(); // Matriz

    public ContratoDAO read(String filename) {
        boolean set = false;
        try {
            File myObj = new File(filename);
            Scanner file = new Scanner(myObj);
            String[] cfg = file.nextLine().split(" ");
            Path path = Paths.get(myObj.getName());
            long lines = Files.lines(path).count();
            System.out.printf("Configuração:\n\t-> Meses: %s\n\t-> Fornecedores: %s", cfg[0], cfg[1]);
            System.out.printf("\n\t-> Tamanho: %s\n\t-> Arquivo: %s\n", lines, myObj.getName());
            System.out.println("---------------------------------");
            // Definir configuração
            dao.set(cfg[0], cfg[1]);

            while (file.hasNextLine()) {
                String[] data = file.nextLine().split(" ");
                // Adicionar valores no Arraylist
                dao.add(data[0], data[1], data[2], data[3]);
                // Adicionar valores na Matriz
                dao2.setVal(data[0], data[1], data[2], data[3]);
            }
            file.close();
        } catch (Exception e) {
            System.out.println("Erro ao ler arquivo.");
            e.printStackTrace();
        }
        return dao;
        // return dao2 (se vc quiser usar os dados em Matriz)
    }

}
