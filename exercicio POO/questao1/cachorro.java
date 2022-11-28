package questao1;

public class cachorro extends Animal {

    private String raca;

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String toString() {

        return "Nome: " + getNome() + ", Raça: " + getRaca()+", Peso: "+getPeso();
    }
}
