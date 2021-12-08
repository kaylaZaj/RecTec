package sample.model;

public class Aluno {

    private String nome;
    private String curso;
    private String sala;
    private String ano;

    public Aluno(){ }

    public Aluno(String nome, String curso, String sala, String ano){
        this.nome = nome;
        this.curso = curso;
        this.sala = sala;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String toString() {
        return "Aluno: " + nome
                + ", Curso: " + curso
                + ", Sala: " + sala
                + ", Ano: " + ano;
    }
}


