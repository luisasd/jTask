/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lib;

/**
 *
 * @author Luis
 */
public class cliente {
    int id;
    String nome;
    String[] lista;
    
    public void setList(String[] lst) {
        this.lista = lst;
    }
    
    public String[] getLista() {
        return this.lista;
    }
}
