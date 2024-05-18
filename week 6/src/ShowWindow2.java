import javax.swing. *;
import java.awt.*;

public class ShowWindow2 {

    public static void main(String[] args) {
        // declare our variables (int data type)
        // JLabel variables
        JLabel myLabel1 = new JLabel();
        JLabel myLabel2 = new JLabel();

        // JTextField variables
        JTextField myTextField1 = new JTextField();
        JTextField myTextField2 = new JTextField();


// we are going to make them CONSTANTS

        final int WINDOW_WIDTH = 300;
        final int WINDOW_HEIGHT = 230;

        // create a window

        JFrame window = new JFrame();
        //Scanner input = new scanner(System.In)
        // set the title
        window.setTitle("My Simple Window");

        //setting the size of our window
        window.setSize(WINDOW_WIDTH,WINDOW_HEIGHT);

        // add components
        window.getContentPane().setBackground(Color.orange);
    // for your window background color
        window.setLocation(300,230);

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        myLabel1 =new JLabel("My First Big Label!");
        myLabel1.setBounds(50,45,321,25);
        myLabel1.setFont(new Font("Times New Roman", Font.ITALIC, 14));

        myTextField1 = new JTextField(10);
        myTextField1.setBounds(50,75,100,25);


        myLabel2=new JLabel("My Second Big Label!");
        myLabel2.setBounds(50,105,321,20);
        myLabel2.setFont(new Font("Times New Roman", Font.BOLD, 20));


        myTextField2 = new JTextField(10);
        myTextField2.setBounds(50,130,100,25);

        window.add(myLabel1);
        window.add(myLabel2);
        window.add(myTextField1);
        window.add(myTextField2);
        window.setLayout(null);






        //close the window & exit the program

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // display the window LOL or see nothing
        // displaying the window is a boolean
        window.setVisible(true);
    }
}
