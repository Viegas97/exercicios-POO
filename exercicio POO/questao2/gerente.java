package questao2;

public class gerente extends empregado {
    private String nomeGerencia;

    public String getNomeGerencia() {
        return nomeGerencia;
    }

    public void setNomeGerencia(String nomeGerencia) {
        this.nomeGerencia = nomeGerencia;
    }
    public String toString() {
        return "Nome: "+getNome()+", Idade: "+getIdade()+", INSS do gerente: "+getValorInss()
                +", Nome da gerencia: "+getNomeGerencia()+", Matricula: "+getMatricula();
    }
}
