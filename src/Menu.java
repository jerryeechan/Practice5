import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by jerry on 2017/3/28.
 */
public class Menu {
    private JProgressBar progressBar;
    private JButton startBtn;
    private JButton pauseBtn;
    private JPanel root;
    private JLabel progressLabel;
    HeavyComputationSimulator simulator;
    public Menu() {
        simulator = new HeavyComputationSimulator(progressBar,progressLabel);
        startBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO:start the busy task
            }
        });
        pauseBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //pause or resume
                //update GUI with SwingUtilities.invokeLater
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Menu");
        frame.setContentPane(new Menu().root);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
