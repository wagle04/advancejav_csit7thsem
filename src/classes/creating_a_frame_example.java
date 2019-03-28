
package classes;
import javax.swing.*;

public class creating_a_frame_example {
    public static void main(String[] args){
        SimpleFrame frame=new SimpleFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class SimpleFrame extends JFrame{
    public SimpleFrame(){
        setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
    }
    public static final int DEFAULT_WIDTH=300;
    public static final int DEFAULT_HEIGHT=200;
}