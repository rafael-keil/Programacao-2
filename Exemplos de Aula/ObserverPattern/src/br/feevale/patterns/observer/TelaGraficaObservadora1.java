/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.feevale.patterns.observer;

import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 *
 * @author gabriel
 */
public class TelaGraficaObservadora1 extends JFrame implements Observador {

    private JTextArea txtArea;

    public TelaGraficaObservadora1() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        txtArea = new JTextArea();
        getContentPane().add(txtArea);
    }

    public void exibir(int x, int y) {
        setSize(300, 500);
        setLocation(x, y);
        setVisible(true);
    }

    public void adicionarLinha(String txt) {
        txtArea.append(txt + "\n");
    }

    @Override
    public void atualizar(String palavra) {
        adicionarLinha(palavra);
    }
}
