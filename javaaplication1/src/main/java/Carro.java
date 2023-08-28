

public class Carro {

    private String carro;
    private String modelo;
    private int ano;
    private double velocidade;

    public Carro(double velocidadeInicial){
        this.velocidade = velocidadeInicial;
    }

    public String getCarro() {
        return carro;
    }
    public void setCarro(String carro) {
        this.carro = carro;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public String acelerar(double acelerar){

        if(acelerar > 0){
            this.velocidade = acelerar;
            return "Velocidade atual :" + acelerar  + " km/h";
        }else if (acelerar > 200){
            return "Velocidade atual não é permitida";
        }else{
            return "A velocidade dever ser sempre maior do que 0km/h.";
        }
        
    }

    public String frear(double frear){
        this.velocidade -= frear;
        return "Velocidade reduzida para " + velocidade + " km/h";
    }


}
