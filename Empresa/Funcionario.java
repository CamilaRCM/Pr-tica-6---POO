package Empresa;

import Empresa.Pessoa;

public class Funcionario extends Pessoa {
    
    private String departamento;
    private double salario;
    private String dataEntrada;
    private  String rG;
    boolean Status;
    private boolean status;

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getrG() {
        return rG;
    }

    public void setrG(String rG) {
        this.rG = rG;
    }

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean status) {
        Status = status;
    }

    public Funcionario(String departamento, double salario, String dataEntrada, String rG, boolean status) {
        super();
        this.departamento = departamento;
        this.salario = salario;
        this.dataEntrada = dataEntrada;
        this.rG = rG;
        Status = isStatus();
}
        public void bonificar(double bonus) { this.salario=this.salario + bonus;}

 public void demitir () {
        this.status=false;
    }

    public String mostrarDados(){
        return getNome() + "\n" + getEmail() + "\n" + getTelefone()+ "\n" +getrG() + "\n" + getDepartamento() +"\n" + getSalario() + "\n" + getDataEntrada() + "\n"+ isStatus();

    }
}


