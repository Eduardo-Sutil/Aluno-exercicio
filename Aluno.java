public class Aluno {
    public int matricula;
    private String nome;
    private Curso curso;
    private Sala sala;

    public Aluno() {
    }

    Aluno(int matricula, String nome, Curso curso, Sala sala) {
        setMatricula(matricula);
        setNome(nome);
        setCurso(curso);
        setSala(sala);
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

    Curso getcurso() {
        return this.curso;
    }

    Sala getSala() {
        return this.sala;
    }

    void setNome(String nome) {
        this.nome = nome;
    }

    void setCurso(Curso curso) {
        this.curso = curso;
    }

    void setSala(Sala sala) {
        this.sala = sala;
    }

    void exibeDadosAluno() {
        System.out.println("Nome: " + getnome() +
                "\nMatrícula: " + getMatricula() +
                "\nCurso: " + getcurso() +
                "\nSala: " + getSala());
    }
}