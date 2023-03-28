import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class homePage extends JFrame {
    public homePage()
    {
      setSize(500,700);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      JPanel panel=new JPanel();
      panel.setLayout(null);
      add(panel);
      JLabel title=new JLabel("Wecome user!");
      title.setBounds(150,200,500,200);
      title.setFont(new Font("Arial", Font.BOLD,24));
      panel.add(title);
      setVisible(true);
    }
};
