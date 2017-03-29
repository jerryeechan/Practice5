import javax.swing.*;

/**
 * Created by jerry on 2017/3/28.
 */
public class HeavyComputationSimulator implements Runnable {

    private JProgressBar progressBar;
    private JLabel label;
    public HeavyComputationSimulator(JProgressBar bar,JLabel label)
    {
        //TODO:initial the thread and assign variables

    }
    Thread t;
    public void start(){
        //TODO:start the thread

    }
    public void resume()
    {
        //TODO:
    }
    public void pause()
    {
        //TODO:

    }
    boolean isExcuting;
    int count = 0;
    @Override
    public void run() {
        //TODO: call pretendToBeBusy and update count inside a loop
        //remember to check isExcuting before calling the methods
        //The loop should break when count to 100
        //!!Put Swing GUI modification inside SwingUtilities.invokeLater
    }
    void pretendToBeBusy()
    {
        //Just imagine you are doing some heavy computation work
        //simulate by Thread.sleep, yeah, do nothing for milliseconds

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        /*
        for(int i=0;i<1000;i++)
        {
            for(int j=0;j<60;j++)
            {
                char c = (char)(int)(Math.random()*100);
                System.out.print(c);
            }
            System.out.println("");

        }*/

    }
}
