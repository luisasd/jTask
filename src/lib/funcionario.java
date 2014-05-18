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
public class funcionario {
    int id;
    String nome;
    String[] lista;
    
    public void setList(String[] f) {
        this.lista = f;
    }
    
    public String[] getList() {
        return this.lista;
    }
}
