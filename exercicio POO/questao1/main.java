package questao1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha entre peixe e cachorro.");
        String animal = sc.nextLine();
        switch (animal) {
            case "cachorro" -> {
                cachorro dog = new cachorro();
                System.out.println("Nome do Cachorro: ");
                dog.setNome(sc.nextLine());
                System.out.println("Peso do Cachorro:");
                dog.setPeso(sc.nextDouble());
                System.out.println("Raça do cachorro:");
                sc.nextLine();
                dog.setRaca(sc.nextLine());
                System.out.println(dog);
            }
            case "peixe" -> {
                peixe peixe1 = new peixe();
                System.out.println("Nome do peixe:");
                peixe1.setNome(sc.nextLine());
                System.out.println("Habitat do peixe:");
                peixe1.setHabitat(sc.nextLine());
                System.out.println("Peso do peixe:");
                peixe1.setPeso(sc.nextDouble());
                System.out.println(peixe1);

            }
        }
    }
}