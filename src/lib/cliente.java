
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
