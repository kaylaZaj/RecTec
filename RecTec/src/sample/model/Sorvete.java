package sample.model;

    //classe
public class Sorvete {

    //atributos
       private String nome;
       private String sabor;
       private double preco;

       public Sorvete(){ }

       public Sorvete(String nome, String sabor,  double preco){
           this.nome = nome;
           this.sabor = sabor;
           this.preco = preco;

       }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getSabor() {
            return sabor;
        }

        public void setSabor(String sabor) {
            this.sabor = sabor;
        }

        public double getPreco() {
            return preco;
        }

        public void setPreco(double preco) {
            this.preco = preco;
        }

        public String toString(){
            return  "Sorvete: " + nome
                    + ", Sabor: " + sabor
                    + ", Preço: " + preco;
        }
    }
