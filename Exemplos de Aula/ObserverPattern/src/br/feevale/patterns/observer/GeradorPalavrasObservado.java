/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.feevale.patterns.observer;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gabriel
 */
public class GeradorPalavrasObservado implements AssuntoObservavel{
    String palavras[] = {"teste","design","pattern","java","programa",
        "computador","classe","objeto"};
    String palavraSorteada = "";
    List<Observador> observadores = new ArrayList<Observador>();
    public static Boolean continuar = true;
    @Override
    public void registrarObservador(Observador obj) {
        observadores.add(obj);
    }

    @Override
    public void removerObservador(Observador obj) {
        observadores.remove(obj);
    }

    @Override
    public void notificarObservadores() {
        for(Observador o:observadores){
            o.atualizar(palavraSorteada);
        }
    }
    
    public void iniciaGeracaoPalavras(){
        int posPalavra = 0;
        while(continuar){
            posPalavra = (int)(Math.random() * palavras.length);
            palavraSorteada = palavras[posPalavra];
            notificarObservadores();
            try {
                Thread.sleep((int)(Math.random() * 2000));
            } catch (InterruptedException ex) {
                System.err.println(ex.getMessage());
            }
        }
    }
    
}
