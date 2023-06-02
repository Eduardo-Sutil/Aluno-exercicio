public class Aluno {
    public int matricula;
    private String nome;

    public Aluno() {
    }

    Aluno(int matricula, String nome, Curso curso, Sala sala) {
        setMatricula(matricula);
        setNome(nome);
    }

    int setMatricula(int matricula) {
        return this.matricula = matricula;
    }

    int getMatricula() {
        return this.matricula;
    }

    String getnome() {
        return this.nome;
    }

    void setNome(String nome) {
        this.nome = nome;
    }

    void exibeDadosAluno() {
        System.out.println("Nome: " + getnome() +
                "\nMatrícula: " + getMatricula());
    }
}