import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Animal> animais = new ArrayList<>();
    private static List<Consulta> consultas = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Sistema de Cadastro de Animais");
            System.out.println("1. Cadastrar novo animal");
            System.out.println("2. Listar animais cadastrados");
            System.out.println("3. Marcar consulta");
            System.out.println("4. Listar consultas marcadas");
            System.out.println("5. Listar cadastro geral");
            System.out.println("6. Sair");
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
                    cadastrarConsulta(scanner);
                    break;
                case 4:
                    listarConsultas();
                    break;
                case 5:
                    continuar = false;
                    break;
                case 6:
                    listarCadastroGeral();
                    break;
                    default:
                    System.out.println("Opção inválida.");
            }
            System.out.println();
            System.out.println("Pressione Enter para continuar...");
            scanner.nextLine();
            System.out.println("\n".repeat(15));
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
        scanner.nextLine();

        System.out.print("O animal já foi castrado? (Sim/Não): ");
        String castrado = scanner.nextLine();

        System.out.print("Sexo do animal: ");
        String sexo = scanner.nextLine();

        System.out.print("Nome do tutor do animal: ");
        String nomeTutor = scanner.nextLine();

        System.out.print("Telefone do tutor do animal: ");
        String telefoneTutor = scanner.nextLine();

        Tutor tutor = new Tutor(nomeTutor, telefoneTutor);

        Animal animal = new Animal(nome, especie, castrado, idade, raca, sexo,tutor);
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

    private static void cadastrarConsulta(Scanner scanner) {
        if (animais.isEmpty()) {
            System.out.println("Nenhum animal cadastrado. Cadastre um animal primeiro.");
            return;
        }

        System.out.println("Animais cadastrados:");
        for (int i = 0; i < animais.size(); i++) {
            System.out.println((i + 1) + ". " + animais.get(i));
        }
        System.out.print("Escolha o número do animal para a consulta: ");
        int indiceAnimal = scanner.nextInt();
        scanner.nextLine();

        if (indiceAnimal < 1 || indiceAnimal > animais.size()) {
            System.out.println("Número inválido.");
            return;
        }

        Animal animal = animais.get(indiceAnimal - 1);

        System.out.println("Motivo da consulta:");
        System.out.println("1. Consultas preventivas");
        System.out.println("2. Vacinação");
        System.out.println("3. Cirurgias de esterilização");
        System.out.println("4. Exames laboratoriais");
        System.out.println("5. Sair");
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();
        scanner.nextLine();

        String motivo;
        switch (opcao) {
            case 1:
                motivo = "Consultas preventivas";
                break;
            case 2:
                motivo = "Vacinação";
                break;
            case 3:
                motivo = "Cirurgias de esterilização";
                break;
            case 4:
                motivo = "Exames laboratoriais";
                break;
            case 5:
                System.out.println("Saindo do agendamento de consulta.");
                return;
            default:
                System.out.println("Opção inválida.");
                return;
        }

        Consulta consulta = new Consulta(motivo, animal);
        consultas.add(consulta);
        System.out.println("Consulta marcada com sucesso: " + consulta);
    }

    private static void listarConsultas() {
        if (consultas.isEmpty()) {
            System.out.println("Nenhuma consulta marcada.");
        } else {
            System.out.println("Consultas marcadas:");
            for (Consulta consulta : consultas) {
                System.out.println(consulta);
            }
        }
    }

    private static void listarCadastroGeral() {
        System.out.println("Animais cadastrados:");
        for (Animal animal : animais) {
            System.out.println(animal);
        }

        System.out.println("Consultas marcadas:");
        for (Consulta consulta : consultas) {
            System.out.println(consulta);
        }
    }

}
