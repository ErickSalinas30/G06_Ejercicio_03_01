/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package G06_ejercicio_0301;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Erick Salinas
 */
public class VentanaGridLayout extends JFrame  {
    
    public List<JPanel> jPanelList;
    public List<JButton> jButtonList;

public VentanaGridLayout(String title) throws HeadlessException {
        this.setTitle("GridLayout");
        this.setSize(350, 150);
        this.setResizable(false);
        this.setLocation(60, 80);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarPanel();
        this.iniciarButton();
        this.setContentPane(this.jPanelList.get(0));
        this.setVisible(true);
    }

    public void iniciarPanel(){
        this.jPanelList=new ArrayList<>();
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
                
        this.jPanelList.get(0).setLayout(new GridLayout(3,5));
        
        this.jPanelList.get(5).add(this.jPanelList.get(1));

    }

    public void iniciarButton(){
        this.jButtonList=new ArrayList<>();

        this.jButtonList.add(new JButton ("Button 1"));
        this.jButtonList.add(new JButton( "2"));
        this.jButtonList.add(new JButton ("Button 3"));
        this.jButtonList.add(new JButton ("Long-Name Button 4") );
        this.jButtonList.add(new JButton ("Button 5"));
        
        this.jPanelList.get(0).add(this.jButtonList.get(0));
        this.jPanelList.get(0).add(this.jButtonList.get(1));
        this.jPanelList.get(0).add(this.jButtonList.get(2));
        this.jPanelList.get(0).add(this.jButtonList.get(3));
        this.jPanelList.get(0).add(this.jButtonList.get(4));
    }
}


    