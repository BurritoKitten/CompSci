import java.awt.*;
import javax.swing.*;

public class Panel extends JFrame
{
  public Panel()
  {
    super("window");

    Container c = getContentPane();
    c.setBackground(Color.WHITE);
    PanelDisplay chart = new PanelDisplay("Tami", "Brian", "Liz");
    PanelControls controls = new PanelControls(chart);
    //c.add(chart, BorderLayout.CENTER);
    c.add(controls, BorderLayout.SOUTH);
  }

  public static void main(String[] args)
  {
    Panel w = new Panel();
    w.setBounds(300, 300, 400, 400);
    w.setDefaultCloseOperation(EXIT_ON_CLOSE);
    w.setVisible(true);
  }
}

