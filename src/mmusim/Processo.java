/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mmusim;

/**
 * Mantem os dados de um processo
 * @author tadeu
 */
public class Processo {   
    private int enderecoBase;
    private int enderecoLimite;
    /**
     * emMemoria indica se o processo esta na memoria principal(true) ou na 
     * memoria secundaria(false)
     */
    private boolean emMemoria;
    /**
     * Caso o processo esteja em swap (emMemoria==false) indica o endereco inicial
     * que os dados dos processo estao no disco
     */
    private int enderecoSwap;

    /**
     * Cria um novo processo carregado na memoria
     * @param enderecoBase endereço inicial onde o processo foi carregado
     * @param enderecoLimite endereço maximo acessivel pelo processo
     */
    public Processo(int enderecoBase, int enderecoLimite) {
        this.enderecoBase = enderecoBase;
        this.enderecoLimite = enderecoLimite;
        this.emMemoria = true;
        this.enderecoSwap = 0;
    }

    public int getEnderecoBase() {
        return enderecoBase;
    }

    public void setEnderecoBase(int enderecoBase) {
        this.enderecoBase = enderecoBase;
    }

    public int getEnderecoLimite() {
        return enderecoLimite;
    }

    public void setEnderecoLimite(int enderecoLimite) {
        this.enderecoLimite = enderecoLimite;
    }

    @Override
    public String toString() {
        return "Processo{" + "Base=" + enderecoBase + ", Limite=" + enderecoLimite + '}';
    }
    
    
}
