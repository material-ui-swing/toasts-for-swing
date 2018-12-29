package top.gigabox;

import top.gigabox.supportcomponent.toast.MaterialTost;

import javax.swing.*;
import javax.swing.plaf.metal.MetalLookAndFeel;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * Hello world!
 *
 */
public class DemoSupport{

    public static void main( String[] args ) {
        try {
            UIManager.setLookAndFeel(new MetalLookAndFeel());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        JFrame frame = new JFrame("Support Component android");
        JPanel panel = new JPanel();

        class ActionDemoToast extends AbstractAction{

            JFrame component;

            public ActionDemoToast(JFrame component){
                this();
                this.component = component;
            }

            private ActionDemoToast(){
                putValue(Action.NAME, "Evanesco");
                putValue(Action.SHORT_DESCRIPTION, "Demo Toast");
            }

            public void actionPerformed(ActionEvent e) {
                //Static metod
                MaterialTost.makeText(component, "avada kedavra button", MaterialTost.NORMAL).display();

                //Object metod
                MaterialTost materialTost = MaterialTost.makeText(component, "avada kedavra button", MaterialTost.LONG, MaterialTost.SUCCESS, MaterialTost.TOP);
                materialTost.setForeground(Color.BLACK);
                materialTost.display();

            }
        }
        JButton button = new JButton();
        button.setAction(new ActionDemoToast(frame));
        panel.add(button);
        frame.setContentPane(panel);
        frame.setSize(new Dimension(150, 150));
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
