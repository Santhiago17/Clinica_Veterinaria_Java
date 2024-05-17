import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Animal> animais = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Sistema de Cadastro de Animais");
            System.out.println("1. Cadastrar novo animal");
            System.out.println("2. Listar animais cadastrados");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarAnimal(scanner);
                    break;
                case 2:
                    listarAnimais();
                    break;
                case 3:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }

    private static void cadastrarAnimal(Scanner scanner) {
        System.out.print("Nome do animal: ");
        String nome = scanner.nextLine();

        System.out.print("Espécie do animal: ");
        String especie = scanner.nextLine();

        System.out.print("Raça do animal: ");
        String raca = scanner.nextLine();

        System.out.print("Idade do animal: ");
        int idade = scanner.nextInt();
        scanner.nextLine();  // Consumir nova linha

        System.out.print("O animal já foi castrado? (true/false): ");
        boolean castrado = scanner.nextBoolean();
        scanner.nextLine();  // Consumir nova linha

        System.out.print("Sexo do animal: ");
        String sexo = scanner.nextLine();

        Animal animal = new Animal(nome, especie, castrado, idade, raca, sexo);
        animais.add(animal);
        System.out.println("Animal cadastrado com sucesso!");
    }

    private static void listarAnimais() {
        if (animais.isEmpty()) {
            System.out.println("Nenhum animal cadastrado.");
        } else {
            System.out.println("Animais cadastrados:");
            for (Animal animal : animais) {
                System.out.println(animal);
            }
        }
    }
}
