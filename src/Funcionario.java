public class Funcionario {
    private String nome;
    private int cpf;
    private double salario;
    private int matricula;
    private String cargo;
    private String departamento;

    public Funcionario(String nome, int cpf, double salario, int matricula, String cargo, String departamento) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.matricula = matricula;
        this.cargo = cargo;
        this.departamento = departamento;
    }
    Cores cor = new Cores(); // IMPORTAÇÃO DA CLASS DAS CORES #JOTA

    /* Getters e Setters */
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = Integer.parseInt(Integer.toString(Integer.parseInt(Integer.toString(cpf))));
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "\n     ...DADOS DO FUNCIONÁRIO...\n" +
                "\n     ++++++++++++++++++" +
                "\n     NOME ----------->> " + nome +
                "\n     CPF ------------>> " + cpf +
                "\n     SALÁRIO -------->> " + salario +
                "\n     MATRICULA ------>> " + matricula +
                "\n     CARGO ------>> " + cargo +
                "\n     DEPARTAMENTO --->> " + departamento +
                "\n     ++++++++++++++++++";
    }
}
