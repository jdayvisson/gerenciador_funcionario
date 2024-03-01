import java.util.ArrayList;
import java.util.List;

public class GerenciadorFuncionarios {
    private List<Funcionario> funcionarios;
    private List<Departamento> departamentos;

    public GerenciadorFuncionarios() {
        this.funcionarios = new ArrayList<>();
        this.departamentos = new ArrayList<>();
    }

    public boolean isEmpty() {
        return this.funcionarios.isEmpty();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        this.funcionarios.add(funcionario);
    }

    public void listarFuncionarios() {
        if (funcionarios.isEmpty()) {
            System.out.println("\n     Você ainda não cadastrou nenhum funcionário.");
        }
        else {
            for (Funcionario funcionario : funcionarios) {
                System.out.println(funcionario);
            }
        }
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
            System.out.println("     Você ainda não cadastrou nenhum funcionário.");
            return;
        }
        funcionarios.removeIf(funcionario -> funcionario.getNome().equalsIgnoreCase(nome));
    }

    public void listarPorDepartamento(String departamento) {
        if (funcionarios.isEmpty()) {
            System.out.println("     Você ainda não cadastrou nenhum funcionário.");
            return;
        }
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getDepartamento().equalsIgnoreCase(departamento)) {
                System.out.println(funcionario);
            }
        }
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
