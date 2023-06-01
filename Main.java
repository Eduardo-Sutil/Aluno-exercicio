public class Main {
    public static void main(String[] args) {

        Curso ads = new Curso(1, "Análise e Desenvolvimento de Sistemas", 160);

        Sala s1 = new Sala(102, 1, 30);

        Aluno a1 = new Aluno(1, "eduardo", ads, s1);

        a1.exibeDadosAluno();
        ads.exibeDadosCurso();
        s1.exibeDadosSala();

    }
}
