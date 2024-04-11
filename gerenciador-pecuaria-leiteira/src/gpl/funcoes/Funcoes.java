package gpl.funcoes;
import gpl.classes.Produtor;
import java.util.Scanner;

public class Funcoes {
    public static void listProdutores(int totalProdutores, Produtor[] produtores) {
        for (int i = 0; i < totalProdutores; i++) {
            System.out.println("[" + (i + 1) + "] " + produtores[i].getNome() + " ID: P" + produtores[i].getNdp());
        }
    }
}
