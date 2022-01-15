package controller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {

    private JPanel jPanel;
    private Color color;

    public Controller(JPanel jPanel, Color color){
        this.jPanel = jPanel;
        this.color = color;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        jPanel.setBackground(color);
    }
}
