import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        GerenciadorFuncionarios gerenciador = new GerenciadorFuncionarios();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        Cores cor = new Cores(); // IMPORTAÇÃO DA CLASS DAS CORES #JOTA





        System.out.println
                ("\n\n     +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\n" +
                        "     |    ++++++++++ SISTEMA DE GERENCIAMENTO DE FUNCIONARIO ++++++++++    |\n" +
                        "     +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");

        while (continuar) {
            System.out.println(Cores.YELLOW_BOLD_BRIGHT + "\n     1. ADICIONAR"+ Cores.RESET + Cores.WHITE_BOLD +" Funcionário" + Cores.RESET);
            System.out.println(Cores.YELLOW_BOLD +"     2. LISTAR"+ Cores.RESET +" Funcionários");
            System.out.println(Cores.YELLOW_BOLD +"     3. EDITAR"+ Cores.RESET+" Funcionário");
            System.out.println(Cores.YELLOW_BOLD +"     4. REMOVER"+ Cores.RESET+" Funcionário");
            System.out.println(Cores.YELLOW_BOLD +"     5. LISTAR"+ Cores.RESET+" por Departamento");
            System.out.println(Cores.YELLOW_BOLD +"     6. SALARIO"+ Cores.RESET+" por Departamento");
            System.out.println(Cores.YELLOW_BOLD +"     7. SAIR"+ Cores.RESET);
            System.out.print(Cores.YELLOW_BOLD +"\n     Escolha uma das opção: "+ Cores.RESET);
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    Cores cor1 = new Cores();
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
                        System.out.println(Cores.RED_BOLD +"\n     OPS! Você não tem nenhum funcionário para EDITAR ;(" + Cores.RESET);
                        break;
                    }
                    System.out.print(Cores.YELLOW_BOLD +"     NOME DO FUNCIONÁRIO A SER EDITADO: " + Cores.RESET);
                    String nomeEdicao = scanner.next();
                    System.out.print(Cores.YELLOW_BOLD +"     NOVO NOME: "+ Cores.RESET);
                    String novoNome = scanner.next();
                    System.out.print(Cores.YELLOW_BOLD +"     NOVO SALÁRIO: "+ Cores.RESET);
                    double novoSalario = scanner.nextDouble();
                    System.out.print(Cores.YELLOW_BOLD +"     NOVO CARGO: "+ Cores.RESET);
                    String novoCargo = scanner.next();
                    System.out.print(Cores.YELLOW_BOLD +"     NOVO DEPARTAMENTO: "+ Cores.RESET);
                    String novoDepartamento = scanner.next();
                    gerenciador.editarFuncionario(nomeEdicao, novoNome, novoSalario, novoCargo, novoDepartamento);
                    break;
                case 4:
                    if (gerenciador.isEmpty()) {
                        System.out.println(Cores.RED_BOLD +"\n     OPS! Você não tem nenhum funcionário para REMOVER :(" + Cores.RESET);
                        break;
                    }
                    System.out.print("     NOME DO FUNCIONÁRIO A SER REMOVIDO: ");
                    String nomeRemocao = scanner.next();
                    gerenciador.removerFuncionario(nomeRemocao);
                    break;
                case 5:
                    if (gerenciador.isEmpty()) {
                        System.out.println(Cores.RED_BOLD +"\n     OPS! Você não tem nenhum funcionário para LISTAR :(" + Cores.RESET);
                        break;
                    }
                    System.out.print("     DEPARTAMENTO: ");
                    String departamentoLista = scanner.next();
                    gerenciador.listarPorDepartamento(departamentoLista);
                    break;
                case 6:
                    if (gerenciador.isEmpty()) {
                        System.out.println(Cores.RED_BOLD +"\n     OPS! Você não tem nenhum funcionário para LISTAR :(" + Cores.RESET);
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
