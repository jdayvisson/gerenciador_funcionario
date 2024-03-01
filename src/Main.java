import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciadorFuncionarios gerenciador = new GerenciadorFuncionarios();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        System.out.println
                ("\n\n     +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\n" +
                        "     |    ********** SISTEMA DE GERENCIAMENTO DE FUNCIONARIO **********    |\n" +
                        "     +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");

        while (continuar) {
            System.out.println("\n     1. Adicionar Funcionário");
            System.out.println("     2. Listar Funcionários");
            System.out.println("     3. Editar Funcionário");
            System.out.println("     4. Remover Funcionário");
            System.out.println("     5. Listar por Departamento");
            System.out.println("     6. Salario por Departamento");
            System.out.println("     7. Sair");
            System.out.print("\n     Escolha uma das opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("     NOME: ");
                    String nome = scanner.next();
                    System.out.print("     CPF: ");
                    int cpf = Integer.parseInt(scanner.next());
                    System.out.print("     SALÁRIO: ");
                    int salario = Integer.parseInt(scanner.next());
                    System.out.print("     MATRICULA: ");
                    int matricula = Integer.parseInt(scanner.next());
                    System.out.print("     CARGO: ");
                    String cargo = scanner.next();
                    System.out.print("     DEPARTAMENTO: ");
                    String departamento = scanner.next();
                    gerenciador.adicionarFuncionario(new Funcionario(nome, cpf, salario, matricula, cargo, departamento));
                    break;
                case 2:
                    gerenciador.listarFuncionarios();
                    break;
                case 3:
                    if (gerenciador.isEmpty()) {
                        System.out.println("\n     Você ainda não cadastrou nenhum funcionário.");
                        break;
                    }
                    System.out.print("     NOME DO FUNCIONÁRIO A SER EDITADO: ");
                    String nomeEdicao = scanner.next();
                    System.out.print("     NOVO NOME: ");
                    String novoNome = scanner.next();
                    System.out.print("     NOVO SALÁRIO: ");
                    double novoSalario = scanner.nextDouble();
                    System.out.print("     NOVO CARGO: ");
                    String novoCargo = scanner.next();
                    System.out.print("     NOVO DEPARTAMENTO: ");
                    String novoDepartamento = scanner.next();
                    gerenciador.editarFuncionario(nomeEdicao, novoNome, novoSalario, novoCargo, novoDepartamento);
                    break;
                case 4:
                    if (gerenciador.isEmpty()) {
                        System.out.println("\n     Você ainda não cadastrou nenhum funcionário.");
                        break;
                    }
                    System.out.print("     NOME DO FUNCIONÁRIO A SER REMOVIDO: ");
                    String nomeRemocao = scanner.next();
                    gerenciador.removerFuncionario(nomeRemocao);
                    break;
                case 5:
                    if (gerenciador.isEmpty()) {
                        System.out.println("\n     Você ainda não cadastrou nenhum funcionário.");
                        break;
                    }
                    System.out.print("     DEPARTAMENTO: ");
                    String departamentoLista = scanner.next();
                    gerenciador.listarPorDepartamento(departamentoLista);
                    break;
                case 6:
                    if (gerenciador.isEmpty()) {
                        System.out.println("\n     Você ainda não cadastrou nenhum funcionário.");
                        break;
                    }
                    System.out.print("     DEPARTAMENTO: ");
                    departamento = scanner.next();
                    gerenciador.salarioPorDepartamento(departamento);
                    break;
                case 7:
                    System.out.println("\n     PROGRAMA FINALIZADO! \n     OBRIGADO!");
                    continuar = false;
                    break;
                default:
                    System.out.println("     OPÇÃO INVÁLIDA!");
                    break;
            }
        }

        scanner.close();
    }
}
