public class Curso {
    private int codigo;
    private String nome;
    private int cargaHoraria;

    Curso() {

    }

    Curso(int codigo, String nome, int cargaHoraria) {
        setCodigo(codigo);
        setNome(nome);
        setCargaHoraria(cargaHoraria);
    }

    int getCodigo() {
        return this.codigo;
    }

    String getNome() {
        return this.nome;
    }

    int getCargaHoraria() {
        return this.cargaHoraria;
    }

    void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    void setNome(String nome) {
        this.nome = nome;
    }

    void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    void exibeDadosCurso() {
        System.out.println("Código: " + getCodigo() +
                "\nCurso: " + getNome() +
                "\nCarga horária: " + getCargaHoraria());
    }
}
