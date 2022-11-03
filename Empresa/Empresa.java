package Empresa;

public class Empresa {

    private String nomeEmpresa;
    private String cnpj;
    private int qtde_de_funcionario;

    Funcionario[] funcionarios;
    private int count = 0;

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public int getQtde_de_funcionario() {
        return qtde_de_funcionario;
    }

    public void setQtde_de_funcionario(int qtde_de_funcionario) {
        this.qtde_de_funcionario = qtde_de_funcionario;
    }

    public Empresa(String nomeEmpresa, String cnpj, int qtde_de_funcionario) {
        this.nomeEmpresa = nomeEmpresa;
        this.cnpj = cnpj;


        if (qtde_de_funcionario <= 100) {
            this.qtde_de_funcionario = qtde_de_funcionario;
            funcionarios = new Funcionario[qtde_de_funcionario];
        } else {
            this.qtde_de_funcionario = 100;
            funcionarios = new Funcionario[100];
        }
    }

        public void addFunc (Funcionario func) {
            funcionarios [count]=func;
            count++;

        }
    }
