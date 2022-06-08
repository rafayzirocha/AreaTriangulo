package com.company;

import javax.swing.*;

public class Principal {

    public static void main(String[] args) {
        Triangulo tri  = new Triangulo(0.0,0.0);

        int op;

        do{
            op = Integer.parseInt(JOptionPane.showInputDialog(
                    "Digite: \n1 - Solicitar Dados \n2 - Mostrar Área \n3 - Mostrar Dados \n0 - Sair"));

            switch (op){
                case 1:
                    tri.solicitaDados();
                    break;
                case 2:
                    tri.mostrarArea();
                    break;
                case 3:
                    tri.mostrarDados();
                    break;
                case 0:
                    JOptionPane.showMessageDialog(
                            null, "Finalizando o programa..." );
                    break;
                default:
                    JOptionPane.showMessageDialog(
                            null, "Opção Inválida..." );
                    break;
            }
        }
        while(op!=0);
    }
}