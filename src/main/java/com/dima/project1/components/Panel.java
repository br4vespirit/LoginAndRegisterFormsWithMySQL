package com.dima.project1.components;

import javax.swing.*;
import java.awt.*;

public abstract class Panel extends JPanel {

    private final CardLayout cardLayout;
    private final JPanel panel;

    public Panel(CardLayout cardLayout, JPanel panel){
        this.cardLayout = cardLayout;
        this.panel = panel;
        setLayout(null);
        initPanel();
    }

    abstract void initPanel();

    public CardLayout getCardLayout(){
        return cardLayout;
    }

    public JPanel getPanel(){
        return panel;
    }

    public void clean(){
        for (Component component: this.getComponents()){
            if (component instanceof JTextField) {
                ((JTextField) component).setText("");
            }
        }
    }
}