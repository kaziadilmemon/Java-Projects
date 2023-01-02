import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class MainThread extends Thread {
    JFrame frame1;
    public MainThread(JFrame frame1){
        this.frame1=frame1;
    }
    public void run(){
        try {
            new Curr_Convert().setVisible(true);
            frame1.setVisible(false);
        }
        catch (Exception e){
            System.out.println("hello world");
        }
    }
}
public class ProgressBar  {
    JFrame frame1;
    JProgressBar progress;
    JButton button;
    JPanel panel;
    public ProgressBar(){
        frame1=new JFrame();
        progress=new JProgressBar();
        button=new JButton();
        panel=new JPanel();
        panel.setBounds(0,0,300,300);
        //progress.setAlignmentX(JFrame.TOP_ALIGNMENT);
        //progress.setAlignmentY(JFrame.TOP_ALIGNMENT);
        progress.setValue(100);
        progress.setStringPainted(true);
        // progress.setSize(620,50);
        progress.setBounds(0,100,620,50);

        button.setText("Click to Continue...");
        button.setBounds(200,300,200,50);
        button.setVisible(false);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               System.out.println("hello");
               MainThread mainthread=new MainThread(frame1);
               mainthread.start();
               System.out.println("main frame thread "+mainthread.getId());
               //creating object of curr_convertor

            }
        });

        frame1.add(progress);
        //frame1.add(panel);
        frame1.add(button);
        frame1.setTitle("Loading page");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(620,420);
        frame1.setLayout(null);
        frame1.setVisible(true);
        fill();
    }
    public void fill(){
        try {
            int counter=0;
            while(counter<=100){
                progress.setValue(counter);
                Thread.sleep(50);
                counter+=1;
            }
            progress.setString("Done!");
            //frame1.add(button);
            //panel.add(button);
            button.setVisible(true);
        }
        catch(Exception e){
            System.out.println("an Error occured");
        }
    }
}
