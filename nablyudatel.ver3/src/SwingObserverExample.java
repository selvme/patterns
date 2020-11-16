import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Admin on 26.09.2017.
 */
public class SwingObserverExample {
    private JFrame frame;

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    private void go(){
        frame = new JFrame();
        JButton button = new JButton("Жми");
        button.addActionListener(new Devil());
        button.addActionListener(new Angel());
        frame.add(BorderLayout.CENTER, button);
        frame.setTitle("Выбери что делать");
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    class Angel implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Не делай этого, пожалеешь!");
        }
    }

    class Devil implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Давай сделай это!");
        }
    }
}
