package top.gigabox;

import mdlaf.MaterialLookAndFeel;
import top.gigabox.supportcomponent.toast.MaterialToast;

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
            UIManager.setLookAndFeel(new MaterialLookAndFeel());
            JDialog.setDefaultLookAndFeelDecorated(true);
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
                MaterialToast.makeText(component, "avada kedavra button", MaterialToast.NORMAL).display();

                //Object metod
                MaterialToast materialTost = MaterialToast.makeText(component, "avada kedavra button", MaterialToast.LONG, MaterialToast.SUCCESS, MaterialToast.TOP);
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
