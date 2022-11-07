/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.feevale.patterns.observer;

/**
 *
 * @author gabriel
 */
public class ConsoleObservador implements Observador{

    @Override
    public void atualizar(String palavra) {
        System.out.println(palavra);
    }
    
}
