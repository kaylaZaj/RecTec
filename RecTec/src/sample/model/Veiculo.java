package sample.model;

public class Veiculo {

    private int velocidade;
    private String placa;

    public Veiculo(String placa){
        this.placa = placa;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String toString(){
        return "Placa: " + placa
                + " com a velocidade: " + velocidade;
    }
}


