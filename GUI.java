import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class GUI extends JFrame{
    private static final int WIDTH = 500;
    private static final int HEIGHT = 500;

    public GUI(){

        setTitle("Data Management System");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        Container pane = getContentPane();
        pane.setLayout(new GridLayout(5, 3));


        JButton buttonAdd = new JButton("Add");
        pane.add(buttonAdd);
        JButton buttonDelete = new JButton("Delete");
        pane.add(buttonDelete);
        JButton buttonUpdate = new JButton("Update");
        pane.add(buttonUpdate);
        JButton buttonDisplay = new JButton("Display");
        pane.add(buttonDisplay);
    }

    public static void main(String[] args){
        //GUI gui = new GUI();

    }


}
