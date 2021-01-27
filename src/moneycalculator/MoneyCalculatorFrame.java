package moneycalculator;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import moneycalculator.model.Currency;
import moneycalculator.ui.MoneyDialog;
import moneycalculator.ui.MoneyDisplay;
import moneycalculator.ui.swing.SwingMoneyDialog;
import moneycalculator.ui.swing.SwingMoneyDisplay;

public class MoneyCalculatorFrame extends JFrame{
    private final Currency[] currencies;
    
    private MoneyDialog moneyDialog;
    private MoneyDisplay moneyDisplay;

    public MoneyCalculatorFrame(Currency[] currencies) {
        this.currencies = currencies;
        this.setTitle("MONEY CALCULATOR...");
        this.setSize(400, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        this.add(moneyDialog(), BorderLayout.NORTH);
        this.add(toolbar(), BorderLayout.CENTER);
        this.add(moneyDisplay(), BorderLayout.SOUTH);
        
        this.setVisible(true);
    }

    private Component moneyDialog() {
        SwingMoneyDialog dialog = new SwingMoneyDialog(currencies);
        this.moneyDialog = dialog;
        return dialog;
    }

    private Component toolbar() {
        JPanel panel = new JPanel();
        panel.add(createButton());
        return panel;
    }

    private Component moneyDisplay() {
        SwingMoneyDisplay display = new SwingMoneyDisplay();
        this.moneyDisplay = display;
        return display;
    }

    private JButton createButton() {
        JButton button = new JButton("calculate");
        button.addActionListener(calculate());
        return button;
    }

    private ActionListener calculate() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        };
    }
    
    
}
