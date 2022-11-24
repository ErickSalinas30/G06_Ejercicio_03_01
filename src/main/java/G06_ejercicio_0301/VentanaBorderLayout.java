/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package G06_ejercicio_0301;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

/**
 *
 * @author Erick Salinas
 */
public class VentanaBorderLayout extends JFrame {
    private List<JPanel> jPanelList;

    public VentanaBorderLayout() throws HeadlessException {
                
        this.setTitle("BorderLayout");
        this.setSize(300, 165);
        this.setLocation(600, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarPaneles();
        this.setContentPane(this.jPanelList.get(20));
        this.setVisible(true);

    }

    public void iniciarPaneles() {
        this.jPanelList = new ArrayList<>();
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());

        this.jPanelList.get(0).setBackground(Color.lightGray);
        this.jPanelList.get(0).setBorder(new BevelBorder(BevelBorder.RAISED));
        this.jPanelList.get(0).add(new JLabel("Boton 1"));
        this.jPanelList.get(0).setBounds(new Rectangle(3, 3, 280, 35));

        this.jPanelList.get(1).setBackground(Color.lightGray);
        this.jPanelList.get(1).setBorder(new BevelBorder(BevelBorder.RAISED));
        this.jPanelList.get(1).add(new JLabel("Boton 3"));
        this.jPanelList.get(1).setBounds(new Rectangle(3, 40, 105, 35));

        this.jPanelList.get(2).setBackground(Color.lightGray);
        this.jPanelList.get(2).add(new JLabel("Boton 5"));
        this.jPanelList.get(2).setBorder(new BevelBorder(BevelBorder.RAISED));
        this.jPanelList.get(2).setBounds(new Rectangle(177, 40, 105, 35));

        this.jPanelList.get(3).setBackground(Color.lightGray);
        this.jPanelList.get(3).add(new JLabel("2"));
        this.jPanelList.get(3).setBorder(new BevelBorder(BevelBorder.RAISED));
        this.jPanelList.get(3).setBounds(new Rectangle(108, 40, 69, 35));

        this.jPanelList.get(4).setBackground(Color.lightGray);
        this.jPanelList.get(4).add(new JLabel("Boton 4"));
        this.jPanelList.get(4).setBorder(new BevelBorder(BevelBorder.RAISED));
        this.jPanelList.get(4).setBounds(new Rectangle(3, 80, 280, 35));

        this.jPanelList.get(5).setBackground(Color.red);
        this.jPanelList.get(5).setBounds(new Rectangle(80, 30, 20, 20));

        this.jPanelList.get(6).setBackground(Color.white);
        this.jPanelList.get(6).setBounds(new Rectangle(100, 30, 5, 20));

        this.jPanelList.get(7).setBackground(Color.white);
        this.jPanelList.get(7).setBounds(new Rectangle(80, 50, 25, 5));

        this.jPanelList.get(8).setBackground(Color.BLUE);
        this.jPanelList.get(8).setBounds(new Rectangle(105, 30, 10, 60));

        this.jPanelList.get(9).setBackground(Color.white);
        this.jPanelList.get(9).setBounds(new Rectangle(115, 30, 5, 20));

        this.jPanelList.get(10).setBackground(Color.red);
        this.jPanelList.get(10).setBounds(new Rectangle(120, 30, 70, 20));

        this.jPanelList.get(11).setBackground(Color.white);
        this.jPanelList.get(11).setBounds(new Rectangle(115, 50, 75, 5));

        this.jPanelList.get(12).setBackground(Color.blue);
        this.jPanelList.get(12).setBounds(new Rectangle(80, 55, 110, 10));

        this.jPanelList.get(14).setBackground(Color.white);
        this.jPanelList.get(14).setBounds(new Rectangle(80, 65, 25, 5));

        this.jPanelList.get(15).setBackground(Color.red);
        this.jPanelList.get(15).setBounds(new Rectangle(80, 70, 20, 20));

        this.jPanelList.get(16).setBackground(Color.white);
        this.jPanelList.get(16).setBounds(new Rectangle(115, 65, 75, 5));

        this.jPanelList.get(17).setBackground(Color.white);
        this.jPanelList.get(17).setBounds(new Rectangle(115, 65, 5, 25));

        this.jPanelList.get(18).setBackground(Color.white);
        this.jPanelList.get(18).setBounds(new Rectangle(100, 65, 5, 25));

        this.jPanelList.get(19).setBackground(Color.red);
        this.jPanelList.get(19).setBounds(new Rectangle(120, 70, 70, 20));

        this.jPanelList.get(20).setLayout(null);
        this.jPanelList.get(20).add(this.jPanelList.get(5));
        this.jPanelList.get(20).add(this.jPanelList.get(6));
        this.jPanelList.get(20).add(this.jPanelList.get(7));
        this.jPanelList.get(20).add(this.jPanelList.get(8));
        this.jPanelList.get(20).add(this.jPanelList.get(9));
        this.jPanelList.get(20).add(this.jPanelList.get(10));
        this.jPanelList.get(20).add(this.jPanelList.get(11));
        this.jPanelList.get(20).add(this.jPanelList.get(12));
        this.jPanelList.get(20).add(this.jPanelList.get(13));
        this.jPanelList.get(20).add(this.jPanelList.get(14));
        this.jPanelList.get(20).add(this.jPanelList.get(15));
        this.jPanelList.get(20).add(this.jPanelList.get(16));
        this.jPanelList.get(20).add(this.jPanelList.get(17));
        this.jPanelList.get(20).add(this.jPanelList.get(18));
        this.jPanelList.get(20).add(this.jPanelList.get(19));
        this.jPanelList.get(20).add(this.jPanelList.get(0));
        this.jPanelList.get(20).add(this.jPanelList.get(1));
        this.jPanelList.get(20).add(this.jPanelList.get(2));
        this.jPanelList.get(20).add(this.jPanelList.get(3));
        this.jPanelList.get(20).add(this.jPanelList.get(4));

    }
}
