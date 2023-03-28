import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class App {
    public static void main(String[] args) throws Exception {
        //setting the frame and panel
       JPanel panel= new JPanel();
       JFrame frame=new JFrame();
       frame.setSize(500,700);
       frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       frame.add(panel);
       panel.setLayout(null);

       //user and password labels 
       JLabel userLabel = new JLabel("User");
       JTextField usertext=new JTextField("");
       usertext.setBounds(230,200,150,20);
       userLabel.setBounds(130,200,80,20);

       JLabel label2 = new JLabel("Password");
       JPasswordField userpassword=new JPasswordField();
       userpassword.setBounds(230,250,150,20);
       label2.setBounds(130,250,80,20);

       //setting the submit button and success message
       JButton button=new JButton("submit");
       button.setBounds(150,300,100,20);
       JLabel success=new JLabel("");
       success.setBounds(200,340,500,15);
       //handling different user inputs
       button.addActionListener(new databaseHandler(frame,usertext,userpassword,success)); 
    //setting the reset button
    JButton resetButton=new JButton("reset");
    resetButton.setBounds(260,300,100,20);
    resetButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          usertext.setText("");
          userpassword.setText("");
        }
    });
    
       panel.add(userLabel);
       panel.add(usertext);
       panel.add(label2);
       panel.add(success);
       panel.add(userpassword);
       panel.add(button);
       panel.add(resetButton);
       frame.setVisible(true);

    }
}
   

