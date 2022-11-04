package Exercicio3;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*Variavel edição*/

        int numero, volume, triagem;
        String dataEdicao;

        /*variavel revista*/

        String tituloRevista;
        long issn;
        String peridiocidade;

        /*variavel Artigo*/
        String titulo, resumo, autores;

        tituloRevista = JOptionPane.showInputDialog("tituloRevista");
        issn = Long.parseLong(JOptionPane.showInputDialog("Issn"));
        peridiocidade = JOptionPane.showInputDialog("Periodicidade");

        numero = Integer.parseInt(JOptionPane.showInputDialog("NUMERO"));
        volume = Integer.parseInt(JOptionPane.showInputDialog("volume"));
        triagem = Integer.parseInt(JOptionPane.showInputDialog("triagem"));

        dataEdicao = JOptionPane.showInputDialog("DATA EDIÇÃ0");


        Edicao ed1 = new Edicao(numero, volume, dataEdicao, triagem);
        RevistaCientifica revista1 = new RevistaCientifica(tituloRevista, issn, peridiocidade, ed1);


        ArrayList<Artigo> atigos = new ArrayList<>();

        for (i = 0; i < 10; i++) {

            titulo = JOptionPane.showInputDialog("Digite o titulo do artigo");
            resumo = JOptionPane.showInputDialog("Digite o resumo");
            autores = JOptionPane.showInputDialog("Digite os autores");

            atigos.add(new Artigo(titulo, resumo, autores));
            ed1.addAtigo(atigos.get(i));
        }
    }

}




