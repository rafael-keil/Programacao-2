/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.feevale.patterns.observer;

/**
 *
 * @author gabriel
 */
public class ExecutaObserver {
    ConsoleObservador c1;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TelaGraficaObservadora1 t1 = new TelaGraficaObservadora1();
        t1.exibir(0,80);
        TelaGraficaObservadora1 t2 = new TelaGraficaObservadora1();
        t2.exibir(300,80);
        
        TelaGraficaObservadora2 t3 = new TelaGraficaObservadora2();
        t3.exibir(600,80);
        
        TelaGraficaObservadora2 t4 = new TelaGraficaObservadora2();
        t4.exibir(600,180);
        
        TelaGraficaObservadora2 t5 = new TelaGraficaObservadora2();
        t5.exibir(600,280);
        
        TelaGraficaObservadora2 t6 = new TelaGraficaObservadora2();
        t6.exibir(600,380);
        
        ConsoleObservador c1 = new ConsoleObservador();        
        
        GeradorPalavrasObservado g = new GeradorPalavrasObservado();
        
        g.registrarObservador(t1);
        g.registrarObservador(t2);
        g.registrarObservador(t3);
        g.registrarObservador(t4);
        g.registrarObservador(t5);
        g.registrarObservador(t6);
        g.registrarObservador(c1);
                
        g.iniciaGeracaoPalavras();
                        
    }
}
