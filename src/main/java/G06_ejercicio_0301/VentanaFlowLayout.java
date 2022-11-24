/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package G06_ejercicio_0301;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


/**
 *
 * @author Erick Salinas
 */
public class VentanaFlowLayout extends JFrame{
    
    private List<JPanel> jPanelList;
    private List<JLabel> jLabelList;
       
    
    public VentanaFlowLayout () throws HeadlessException {
        
        this.setTitle("FlowLayout");
        this.setSize(425, 100);
        this.setLocation(200, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarPanels();
        this.iniciarLabels();
        this.setContentPane(this.jPanelList.get(0));
        this.setVisible(true);
    }
    
    private void iniciarPanels(){
        this.jPanelList=new ArrayList<>();
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        
        this.jPanelList.get(0).setBackground(Color.white);
           
        this.jPanelList.get(0).add(this.jPanelList.get(1));
        this.jPanelList.get(0).add(this.jPanelList.get(2));
        this.jPanelList.get(0).add(this.jPanelList.get(3));
        this.jPanelList.get(0).add(this.jPanelList.get(4));
        this.jPanelList.get(0).add(this.jPanelList.get(5));
        
        
    }
    
    public void iniciarLabels(){
        this.jLabelList = new ArrayList<>();
        this.jLabelList.add(new JLabel("Button 1"));
        this.jLabelList.add(new JLabel("2"));
        this.jLabelList.add(new JLabel("Button 3"));
        this.jLabelList.add(new JLabel("Long-name Button 4"));
        this.jLabelList.add(new JLabel("Button 5"));
        
        this.jPanelList.get(1).add(this.jLabelList.get(0));
        this.jPanelList.get(2).add(this.jLabelList.get(1));
        this.jPanelList.get(3).add(this.jLabelList.get(2));
        this.jPanelList.get(4).add(this.jLabelList.get(3));
        this.jPanelList.get(5).add(this.jLabelList.get(4));
        
         
        
    }
    
}
