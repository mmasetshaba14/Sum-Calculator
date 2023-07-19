package za.ac.tut.ui;

import static java.awt.AWTEventMulticaster.add;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame {
    //labels
    private JLabel headingLab;
    private JLabel firstNumLab;
    private JLabel secondNumLab;
    private JLabel operatrionLab;
    private JLabel sumLab;
            
    //textfield
    private JTextField firstNumTextF;
    private JTextField secondNumTextF;
    private JTextField sumTextF;
            
    //buttons
    private JButton but1;
    private JButton but2;
    private JButton but3;
            
    //panels 
    private JPanel headingPan;
    private JPanel firstNumPan;
    private JPanel secondNumPan;
    private JPanel sumPan;
    private JPanel btnsPan;
    private JPanel mainPan;
    private JPanel sumCollective;
    private JPanel operationPan;
    
    //comboBox
    private JComboBox operatrionCombo;
     
    
   
    public Calculator(){
        
        setTitle("Calculator");
        setDefaultLookAndFeelDecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //create labels
        headingLab = new JLabel("Sum Calculator");
        firstNumLab = new JLabel("First Number: ");
        secondNumLab = new JLabel("Second Number: ");
        operatrionLab = new JLabel("Math Opration: ");
        sumLab = new JLabel("Sum: ");
        
                
        //create textFileds 
        firstNumTextF = new JTextField(10);
        secondNumTextF = new JTextField(10);
        sumTextF = new JTextField(10);
        sumTextF.setEditable(false);
        
        //create buttons
        but1 = new JButton("OK");
        but2 = new JButton("CLEAR");
        but3 = new JButton("EXIT");
        
        //create comboBox
        String [] OP = {"Addition","Subtraction","Multiplication","Divison"};
        operatrionCombo = new JComboBox(OP);
        
        
        //create panels
        headingPan = new JPanel(new FlowLayout(FlowLayout.CENTER));
        firstNumPan = new JPanel(new FlowLayout(FlowLayout.LEFT));
        secondNumPan = new JPanel(new FlowLayout(FlowLayout.LEFT));
        operationPan = new JPanel(new FlowLayout(FlowLayout.LEFT));
        sumPan = new JPanel(new FlowLayout(FlowLayout.LEFT));   
        btnsPan = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        
       
        mainPan = new JPanel(new BorderLayout());
        sumCollective = new JPanel(new GridLayout(3,1,1,1));
        
        headingPan.add(headingLab);
        
        firstNumPan.add(firstNumLab);
        firstNumPan.add(firstNumTextF);
        
        secondNumPan.add(secondNumLab);
        secondNumPan.add(secondNumTextF );
        
        operationPan.add(operatrionLab);
        operationPan.add(operatrionCombo);
        
        sumPan.add(sumLab);
        sumPan.add( sumTextF);
        
        sumCollective.add(firstNumPan);  //--> first collective panel
        sumCollective.add(secondNumPan);
        sumCollective.add(sumPan);
        
        btnsPan.add(but1);
        btnsPan.add(but2);
        btnsPan.add(but3);
        
        mainPan.add(headingLab, BorderLayout.NORTH);
        mainPan.add(sumCollective, BorderLayout.CENTER);
        mainPan.add(operationPan, BorderLayout.EAST);
        
        mainPan.add(btnsPan, BorderLayout.SOUTH);
        
        add(mainPan);
        pack();
        setVisible(true);
    }
    
}
