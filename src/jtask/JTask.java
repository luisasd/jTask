/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtask;

import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import lib.funcionario;
import lib.tarefa;

/**
 *
 * @author Luis
 */
public class JTask {

    static URL imageURL = JTask.class.getResource("/lib/invoice-icon.png");
    static Image img = java.awt.Toolkit.getDefaultToolkit().getDefaultToolkit().createImage(imageURL);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            // Set System L&F
            UIManager.setLookAndFeel(
                    UIManager.getSystemLookAndFeelClassName());
        } catch (UnsupportedLookAndFeelException | ClassNotFoundException |
                InstantiationException | IllegalAccessException e) {
            // handle exception
        }
        Image imgIcon = null;
        try {
            imgIcon = javax.imageio.ImageIO.read(JTask.class.getResource("/lib/invoice-icon.png"));
        } catch (IOException ex) {
            Logger.getLogger(JTask.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        lib.funcionario f = new funcionario();
        String[] l = {"luis", "Sandra", "Gabriela"};
        f.setList(l);
        
        lib.tarefa t = new tarefa();
        String[] lstTarefas = {"Nova", "Emails"};
        t.setLista(lstTarefas);
        
        mainWindow w = new mainWindow();
        w.setIconImage(imgIcon);
        w.fillFunc(f.getList());
        w.fillTarefas(t.getLista());
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        w.setVisible(true);
    }

}
