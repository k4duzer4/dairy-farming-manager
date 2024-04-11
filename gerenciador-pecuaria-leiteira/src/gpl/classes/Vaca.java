package gpl.classes;
import gpl.classes.Produtor;
import java.util.Random;
import java.util.Scanner;

public class Vaca {
    Random random = new Random();
    int idVaca = random.nextInt(90000) + 10000; // Identidade do Gado
    String raca;
    String faseGado;
    double producaoLeite;
    Produtor dono;

    //get e setters

    public void setIdVaca(int idVaca) {
        this.idVaca = idVaca;
    }
    public int getIdVaca() {
        return idVaca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    public String getRaca() {
        return raca;
    }

    public void setFaseGado(String faseGado) {
        this.faseGado = faseGado;
    }
    public String getFaseGado() {
        return faseGado;
    }

    public void setProducaoLeite(double producaoLeite) {
        this.producaoLeite = producaoLeite;
    }
    public double getProducaoLeite() {
        return producaoLeite;
    }

    public void setDono(Produtor dono) {
        this.dono = dono;
    }
    public Produtor getDono() {
        return dono;
    }

    public void cadastrarVaca(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ID da Vaca: V" + idVaca);
        System.out.println("Raça: ");
        this.setRaca(sc.nextLine());
        System.out.println("Faixa Etária: ");
        this.setFaseGado(sc.nextLine());
    }

}
