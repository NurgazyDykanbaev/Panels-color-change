package view;

import controller.Controller;

import javax.swing.*;
import java.awt.*;

public class ControlPanel extends JPanel {

    public ControlPanel(JPanel jPanel){

        JButton redButton = new JButton("RED");
        JButton blueButten = new JButton("BLUE");
        JButton greenButten = new JButton("GREEN");

        this.setBackground(Color.GRAY);

        this.add(redButton);
        this.add(greenButten);
        this.add(blueButten);

        redButton.addActionListener(new Controller(jPanel,Color.RED));
        greenButten.addActionListener(new Controller(jPanel,Color.GREEN));
        blueButten.addActionListener(new Controller(jPanel,Color.BLUE));
    }
}
