package gpl;
import gpl.classes.Produtor;
import gpl.funcoes.Funcoes;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Produtor[] produtores = new Produtor[5];
        int totalProdutores = 0;
        while (true) {
            System.out.println("\n--------------------------");
            System.out.println("---------- MENU ----------");
            System.out.println("--------------------------");
            System.out.println("\n[1] Cadastrar Produtor");
            System.out.println("[2] Cadastrar Gado");
            System.out.println("[3] Dados dos Produtores");
            System.out.println("[4] Dados do Gado");
            System.out.println("[5] Cadastrar Produção de Leite");
            System.out.println("[6] Receita dos Produtores");
            System.out.println("\n[0] Sair\n");

            System.out.print("> ");

            int opcao = sc.nextInt();

                switch (opcao) {
                    case 0:
                        System.out.println("Encerrando programa...");
                        return;

                    case 1:
                        if (totalProdutores < produtores.length) {
                            Produtor novoProdutor = new Produtor();
                            novoProdutor.cadastrarProdutor();
                            produtores[totalProdutores] = novoProdutor;
                            totalProdutores++;
                            System.out.println("Produtor cadastrado com sucesso!");
                        } else {
                            System.out.println("Limite de produtor alcançado!");
                        }
                        break;

                    case 2:
                        if (totalProdutores == 0) {
                            System.out.println("Nenhum produtor cadastrado");
                        } else {
                            System.out.println("\n[CADASTRO DE GADO]");
                            System.out.println("Escolha o produtor para o qual deseja cadastrar o gado: ");

                            Funcoes.listProdutores(totalProdutores, produtores);

                            int escolhaProdutor = sc.nextInt();
                            if (escolhaProdutor >= 1 && escolhaProdutor <= totalProdutores) {
                                int indexProdutor = escolhaProdutor - 1;
                                produtores[indexProdutor].cadastrarGado();
                            }
                        }
                        break;

                    case 3:
                        if (totalProdutores == 0) {
                            System.out.println("Nenhum produtor cadastrado");
                        } else {
                            System.out.println("[DADOS DOS PRODUTORES]");
                            Funcoes.listProdutores(totalProdutores, produtores);
                            int escolhaProdutor = sc.nextInt();
                            produtores[escolhaProdutor - 1].imprimirProdutor();
                            break;
                        }

                    case 4:
                        if (totalProdutores == 0) {
                            System.out.println("Nenhum produtor cadastrado");
                        } else {
                            System.out.println("[DADOS DO GADO]");
                            Funcoes.listProdutores(totalProdutores, produtores);
                            int escolhaProdutor2 = sc.nextInt();
                            produtores[escolhaProdutor2 - 1].imprimirGado();
                            break;
                        }
                    case 5:
                        if (totalProdutores == 0) {
                            System.out.println("Nenhum produtor cadastrado");
                        } else {
                            System.out.println("[CADASTRAR PRODUÇÃO DE LEITE]");
                            Funcoes.listProdutores(totalProdutores, produtores);
                            int escolhaProdutor3 = sc.nextInt();
                            produtores[escolhaProdutor3 - 1].cadastrarProducao();
                            break;
                        }
                    case 6:
                        if (totalProdutores == 0) {
                            System.out.println("Nenhum produtor cadastrado");
                        } else {
                            System.out.println("[RECEITA DO PRODUTOR]");
                            Funcoes.listProdutores(totalProdutores, produtores);
                            int escolhaProdutor4 = sc.nextInt();
                            produtores[escolhaProdutor4 - 1].receitaProdutor();
                        }
                        break;
                    default:
                        System.out.println("Opção inválida!");
            }
        }
    }
}
