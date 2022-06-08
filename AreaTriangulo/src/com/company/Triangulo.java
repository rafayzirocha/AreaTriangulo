package com.company;

//import sun.security.x509.OtherName;

import javax.swing.*;

public class Triangulo {
    private double base, altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void solicitaDados(){
        this.altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do triângulo: "));
        if ( this.altura < 0 )
            JOptionPane.showInputDialog("Não é possivel inserir valores negativos, digite 0 para cancelar!");
        this.base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do triângulo: "));
        if ( this.base < 0 )
            JOptionPane.showInputDialog("Não é possivel inserir valores negativos, digite 0 para cancelar!");
    }

    public void mostrarArea(){
            double area = base * altura / 2;
            JOptionPane.showMessageDialog(null, "Área do triângulo é: " + area);
        }

    public void mostrarDados(){
            JOptionPane.showMessageDialog(null, "A base é: " + this.base + "\nA altura é: " + this.altura);
        }
}
