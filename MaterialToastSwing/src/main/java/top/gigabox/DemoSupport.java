package top.gigabox;

import top.gigabox.supportcomponent.toast.MaterialTost;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * Hello world!
 *
 */
public class DemoSupport{
    public static void main( String[] args ) {
        final JFrame frame = new JFrame("Support Component android");
        JPanel panel = new JPanel();

        class ActionDemoToast extends AbstractAction{

            public ActionDemoToast(){
                putValue(Action.NAME, "Evanesco");
                putValue(Action.SHORT_DESCRIPTION, "Demo Toast");
            }

            public void actionPerformed(ActionEvent e) {
                //Static metod
                MaterialTost.makeText(frame, "avada kedavra button", MaterialTost.NORMAL).display();

                //Object metod
                MaterialTost materialTost = MaterialTost.makeText(frame, "avada kedavra button", MaterialTost.LONG, MaterialTost.SUCCESS, MaterialTost.TOP);
                materialTost.setForeground(Color.BLACK);
                materialTost.display();

            }
        }
        JButton button = new JButton();
        button.setAction(new ActionDemoToast());
        panel.add(button);
        frame.setContentPane(panel);
        frame.setSize(new Dimension(150, 150));
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
