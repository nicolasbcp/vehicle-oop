package exercicio;

import java.util.Scanner;

public class Veiculo {
    // Atributos
    private String marca;
    private String modelo;
    private String placa;
    private String cor;
    private float km;
    private boolean isLigado;
    private int litrosCombustivel;
    private int velocidade;
    private double preco;
    
    // Construct
    public Veiculo(String marca, String modelo, String placa, String cor, float 
            km, boolean isLigado, int litrosCombustivel, int velocidade, double 
                    preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.cor = cor;
        this.km = km;
        this.isLigado = isLigado;
        this.litrosCombustivel = litrosCombustivel;
        this.velocidade = velocidade;
        this.preco = preco;
    }
    
    // Métodos Especiais
    public String getMarca() {
        return marca;   
    } 
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public float getKm() {
        return km;
    }
    public void setKm(float km) {
        this.km = km;
    }
    public boolean isIsLigado() {
        return isLigado;
    }
    public void setIsLigado(boolean isLigado) {
        this.isLigado = isLigado;
    }
    public int getLitrosCombustivel() {
        return litrosCombustivel;
    }
    public void setLitrosCombustivel(int litrosCombustivel) {
        this.litrosCombustivel = litrosCombustivel;
    }
    public int getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    // Métodos Personalizados
    public void acelerar() {
        if (isLigado == true) {
            velocidade += 20;
            litrosCombustivel -= 1;
            System.out.println("Velocidade atual: " + velocidade + " KM/H.");
            System.out.println("Litros de combustível: " + litrosCombustivel +
                    "L.");
        } else {
            System.out.println("Primeiro ligue o veículo.");
        }
    }
    public void abastecer(int qtdLitros) {
        if (litrosCombustivel < 100) {
            qtdLitros = litrosCombustivel + qtdLitros; 
            System.out.println("Tanque está com " + qtdLitros + "L");
        } else { 
            System.out.println("Seu veículo está com o tanque cheio!");
        }
    }
    public void frear() {
        if (isLigado == true && velocidade > 0) {
            velocidade -= 10;
            System.out.println("Velocidade atual: " + velocidade);
        } else {
            System.out.println("Veículo desligado, freio desnecessário.");
        }
    }
    
    Scanner sc = new Scanner(System.in);
    
    public void pintar() {
        System.out.println("Qual cor deseja pintar seu veículo? ");
        String p = sc.nextLine().toLowerCase();
        if (cor != p) {
            System.out.print("Seu carro agora é da cor " + p + "!");
        } else {
            System.out.println("Não é possível pintar, o veículo já tem essa "
                    + "cor");
        }
    }
    public void ligar() {
        if (isLigado == true) {
            System.out.println("Veículo já está ligado.");
        } else {
            this.setIsLigado(true);
            System.out.println("Veículo ligado.");
        }
    }
    public void desligar() {
        if (isLigado == false) {
            System.out.println("Veículo já está desligado");
        } else {
            this.setIsLigado(false);
            System.out.println("Veículo desligado.");
        }
    }
}
