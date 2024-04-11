package gpl.classes;
import java.util.Random;
import java.util.Scanner;

//Classe Produtor
public class Produtor {
    Random random = new Random();

    String nome;
    String endereco;
    int idade;
    int ndp = random.nextInt(90000) + 10000;
    public int quantidadeGado;
    Vaca[] gado;
    double receitaTotal;

    //get e setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setNdp(int ndp) {
    }
    public int getNdp() {
        return ndp;
    }

    public int getQuantidadeGado() {
        return quantidadeGado;
    }

    public void setQuantidadeGado(int quantidadeGado) {
        this.quantidadeGado = quantidadeGado;
    }

    public Vaca[] getGado() {
        return gado;
    }

    public void setGado(Vaca[] gado) {
        this.gado = gado;
    }
    // Métodos


    //Cadastrar Produtor
    public void cadastrarProdutor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n[CADASTRO DE PRODUTOR]");
        System.out.println("Digite o nome do produtor: ");
        nome = sc.nextLine();
        System.out.println("Digite o nome da fazenda: ");
        endereco = sc.nextLine();
        System.out.println("Digite a idade do produtor: ");
        idade = sc.nextInt();
        System.out.println("Digite a quantidade de animais produtores de leite que esse produtor tem: ");
        quantidadeGado = sc.nextInt();
        gado = new Vaca[quantidadeGado];
    }

    public void cadastrarGado() {
        for (int i = 0; i < quantidadeGado; i++) {
            gado[i] = new Vaca();
            System.out.println("\n[CADASTRO DE VACA]");
            System.out.println("Vaca [" + (i+1) + "]");
            gado[i].cadastrarVaca();
        }
    }

    public void imprimirProdutor(){
        System.out.println("\n[DADOS DO PRODUTOR]");
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Idade: " + idade);
        System.out.println("ID do Produtor: P" + ndp);
        System.out.println("Quantidade de gado: " + quantidadeGado);
        System.out.println("Receita: " + receitaTotal);
    }

    public void imprimirGado(){
        for (int i = 0; i < quantidadeGado; i++) {
            System.out.println("\nVaca [" + (i+1) + "]");
            System.out.println("ID: V" + gado[i].getIdVaca());
            System.out.println("Raça: " + gado[i].getRaca());
            System.out.println("Fase: " + gado[i].getFaseGado());
            System.out.println("Produção de Leite: " + gado[i].getProducaoLeite());
        }
    }

    public void cadastrarProducao() {
        Scanner scp = new Scanner(System.in);
        for (int i = 0; i < quantidadeGado; i++) {
            System.out.println("\n[PRODUÇÃO DE LEITE]");
            System.out.println("\nVaca [" + (i+1) + "]");
            System.out.println("- ID V"+gado[i].idVaca);
            System.out.println("- Litros produzidos: ");
            gado[i].producaoLeite = scp.nextDouble();
        }
    }
    public void receitaProdutor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o preço do Leite? ");
        double preco = sc.nextDouble();
        for (int i = 0; i < quantidadeGado; i++) {
            double producaoLeiteVaca = gado[i].getProducaoLeite();
            double receitaVaca = producaoLeiteVaca * preco;
            receitaTotal += receitaVaca;
        }
        System.out.println("[RECEITA DO PRODUTOR]");
        System.out.println("Receita Total: R$" + receitaTotal);
        }
    }



