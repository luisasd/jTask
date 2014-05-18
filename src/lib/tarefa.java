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
public class tarefa {
    int id;
    String tarefa;
    String[] lista;
    
    public void setLista(String[] lista) {
        this.lista = lista;
    }
    
    public String[] getLista() {
        return this.lista;
    }
}
