/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.feevale.patterns.observer;

/**
 *
 * @author gabriel
 */
public interface AssuntoObservavel {
    public void registrarObservador(Observador obj);
    public void removerObservador(Observador obj);
    public void notificarObservadores();
}
