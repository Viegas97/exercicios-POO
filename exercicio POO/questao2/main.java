package questao2;

import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;


public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Você é cliente, gerente ou funcionario? ");
        String escolha = sc.nextLine();
        switch (escolha) {
            case "cliente":
                cliente client = new cliente();

                System.out.println("Qual o nome do cliente?");
                client.setNome(sc.nextLine());

                System.out.println("Qual a idade do cliente?");
                client.setIdade(sc.nextInt());

                System.out.println("Qual o sexo do cliente?");
                sc.nextLine();
                client.setSexo(sc.nextLine());

                System.out.println("Valor da dívida: ");
                client.setValorDivida(sc.nextDouble());

                System.out.println("Ano de Nascimento do cliente: ");
                client.setAnoNascim(sc.nextInt());

                System.out.println(client);
                break;

            case "gerente":
                gerente gent = new gerente();

                System.out.println("Nome do gerente:");
                gent.setNome(sc.nextLine());

                System.out.println("Idade do gerente:");
                gent.setIdade(sc.nextInt());

                System.out.println("Matricula:");
                sc.nextLine();
                gent.setMatricula(sc.nextLine());

                System.out.println("Nome da gerência: ");
                gent.setNomeGerencia(sc.nextLine());

                System.out.println("Qual o salário do gerente?");
                gent.setSalario(sc.nextDouble());

                System.out.println(gent);
                break;

            case "funcionario":
                vendedor func = new vendedor();
                System.out.println("Nome do funcionario:");
                func.setNome(sc.nextLine());

                System.out.println("Salário do funcionário: ");
                func.setSalario(sc.nextInt());

                System.out.println("valor das vendas:");
                func.setValorVendas(sc.nextDouble());

                System.out.println("Quantidade de vendas: ");
                func.setQntVendas(sc.nextInt());

                System.out.println(func);
                break;
        }
    }
}
