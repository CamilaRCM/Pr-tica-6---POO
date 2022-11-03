package Empresa;

import javax.swing.*;

public class Main {

    Funcionario[] funcionarios = new Funcionario[10];
    Funcionario func;

    Empresa emp1;

    String nome, email, telefone, departamento, dataEntrada, rG, nomeEmp, cnpj;

    int qdtFunc;
    double salario;
    boolean status;

    for(int i=0; i<10; i++) {
        nome= JOptionPane.showInputDialog("nome");
        telefone = JOptionPane.showInputDialog("Telefone");
        email = JOptionPane.showInputDialog("email");
        departamento = JOptionPane.showInputDialog("departamento");
        dataEntrada=JOptionPane.showInputDialog("DataEntrada");
        rG =JOptionPane.showInputDialog("RG");
        salario=Double.parseDouble (JOptionPane.showInputDialog("salario"));

        func = new Funcionario(departamento, salario, dataEntrada, rG, status);
        funcionarios [i] = func ;
    }

    nomeEmp = JOptionPane.showInputDialog("Digite o nomenome");
    cnpj = JOptionPane.showInputDialog("Digite CNPJ");
    qdtFunc = Integer.parseInt (JOptionPane.showInputDialog("qtdFunc"));

    emp1 = new Empresa (nomeEmp,cnpj,qdtFunc);

    for (Funcionario func1:funcionarios) {
        emp1.addFunc(func1);
        System.out.println (func1.mostrarDados());


}

}
