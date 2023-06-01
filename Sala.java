public class Sala {
    private int numero;
    private int andar;
    private int capacidade;

    Sala() {

    }

    Sala(int numero, int andar, int capacidade) {
        setNumero(numero);
        setAndar(andar);
        setCapacidade(capacidade);
    }

    int getNumero() {
        return this.numero;
    }

    int getAndar() {
        return this.andar;
    }

    int getCapacidade() {
        return this.capacidade;
    }

    void setNumero(int numero) {
        this.numero = numero;
    }

    void setAndar(int andar) {
        this.andar = andar;
    }

    void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    void exibeDadosSala() {
        System.out.println("Número: " + getNumero() +
                "\nAndar: " + getAndar() +
                "\nCapacidade: " + getCapacidade());
    }

}
