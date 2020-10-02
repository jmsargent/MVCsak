package MVC;
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;

public class View extends JFrame{


    GridLayout grid = new GridLayout(3,3);

    JPanel panel = new JPanel(grid);



    JButton plusButton = new JButton("+");
    JButton minusButton = new JButton("-");
    JButton equalsButton = new JButton("=");

    JTextField equationField = new JTextField();


    panel.add(plusButton);
}
