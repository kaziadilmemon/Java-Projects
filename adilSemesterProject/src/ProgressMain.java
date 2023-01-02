class ProgressClass extends Thread {
    public void run(){
        try {
            ProgressBar progress=new ProgressBar();
        }
        catch (Exception e){
            System.out.println("hello world");
        }
    }
}
public class ProgressMain {
    public static void main(String args[]){
        ProgressClass progressThread =new ProgressClass();
        progressThread.start();
        System.out.println("Progress Thread "+progressThread.getId());
    }
}
