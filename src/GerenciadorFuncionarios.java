import java.util.ArrayList;
import java.util.List;

public class GerenciadorFuncionarios {
    private List<Funcionario> funcionarios;
    private List<Departamento> departamentos;

    public GerenciadorFuncionarios() {
        this.funcionarios = new ArrayList<>();
        this.departamentos = new ArrayList<>();
    }

    Cores cor = new Cores(); // IMPORTAÇÃO DA CLASS DAS CORES #JOTA

    public boolean isEmpty() {
        return this.funcionarios.isEmpty();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        this.funcionarios.add(funcionario);
    }

    public boolean listarFuncionarios() {
        if (funcionarios.isEmpty()) {
            Cores Cor = null;
            System.out.println(Cores.RED_BOLD +"\n     OPS! Você não tem nenhum funcionário CADASTRADO ;(" + Cores.RESET);
        }
        else {
            for (Funcionario funcionario : funcionarios) {
                System.out.println(funcionario);
            }
        }
        return false;
    }

    public void editarFuncionario(String nome, String novoNome, double novoSalario, String novoCargo, String novoDepartamento) {
        if (funcionarios.isEmpty()) {
            System.out.println("     Você ainda não cadastrou nenhum funcionário.");
            return;
        }

        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getNome().equalsIgnoreCase(nome)) {
                funcionario.setNome(novoNome);
                funcionario.setSalario(novoSalario);
                funcionario.setCargo(novoCargo);
                funcionario.setDepartamento(novoDepartamento);
                break;
            }
        }
    }


    public void removerFuncionario(String nome) {
        if (funcionarios.isEmpty()) {
            System.out.println(Cores.RED_BOLD +"\n     OPS! Você não tem nenhum funcionário CADASTRADO :(" + Cores.RESET);
            return;
        }
        funcionarios.removeIf(funcionario -> funcionario.getNome().equalsIgnoreCase(nome));
    }

    public void listarPorDepartamento(String departamento) {
        if (funcionarios.isEmpty()) {
            System.out.println(Cores.RED_BOLD +"\n     OPS! Você não tem nenhum funcionário CADASTRADO :(" + Cores.RESET);
            return;
        }
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getDepartamento().equalsIgnoreCase(departamento)) {
                System.out.println(funcionario);
            }
        }
    }

    public void salarioPorDepartamento(String departamento) {
        if (funcionarios.isEmpty()) {
            System.out.println(Cores.RED_BOLD +"\n     OPS! Você não tem nenhum funcionário CADASTRADO :(" + Cores.RESET);
            return;
        }
        double total = 0;
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getDepartamento().equalsIgnoreCase(departamento)) {
                total += funcionario.getSalario();
                System.out.println("     " + funcionario.getNome() + ": R$" + funcionario.getSalario());

            }
        }
        System.out.println("     O salario total do departamento: R$ " + total);
    }

    public void adicionarDepartamento(Departamento departamento) {
        this.departamentos.add(departamento);
    }

    public void listarDepartamentos() {
        for (Departamento departamento : departamentos) {
            System.out.println(departamento);
        }
    }
}
