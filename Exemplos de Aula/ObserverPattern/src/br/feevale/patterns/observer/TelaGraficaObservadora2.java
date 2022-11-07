/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.feevale.patterns.observer;

import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author gabriel
 */
public class TelaGraficaObservadora2 extends JFrame implements Observador {

    private JTextField txt;

    public TelaGraficaObservadora2() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        txt = new JTextField();
        getContentPane().add(txt);
    }

    public void exibir(int x, int y) {
        setSize(100, 50);
        setLocation(x, y);
        setVisible(true);
    }

    @Override
    public void atualizar(String palavra) {
        txt.setText(palavra);
    }
}
