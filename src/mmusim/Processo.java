/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mmusim;

/**
 *
 * @author tadeu
 */
public class Processo {
    private int enderecoBase;
    private int enderecoLimite;

    public Processo(int enderecoBase, int enderecoLimite) {
        this.enderecoBase = enderecoBase;
        this.enderecoLimite = enderecoLimite;
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
