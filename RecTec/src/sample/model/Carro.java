package sample.model;

public class Carro {
    private String tipo;
    private String marca;
    private String cor;

    public Carro() { }

    public Carro(String tipo, String marca, String cor) {
        this.tipo = tipo;
        this.marca = marca;
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String toString() {
        return "Carro: " + tipo
                + ", Marca: " + marca
                + ", Cor: " + cor;
    }
}
