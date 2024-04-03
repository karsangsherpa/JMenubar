import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
public class MyFrame extends JFrame implements ActionListener{
    JFrame frame;
    JMenuBar menuBar;
    JMenu fileMenu;
    JMenu editMenu;
    JMenu helpMenu;
    JMenuItem loadItem;
    JMenuItem saveItem;
    JMenuItem exitItem;
    ImageIcon loadIcon;

MyFrame() {
frame = new JFrame();
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setSize(500,500);
this.setLayout(new FlowLayout());

loadIcon = new ImageIcon();

menuBar = new JMenuBar();
JMenu fileMenu = new JMenu("file");
JMenu editMenu = new JMenu("edit");
JMenu helpMenu = new JMenu("help");




JMenuItem loadItem = new JMenuItem("load");
JMenuItem saveItem = new JMenuItem("save");
JMenuItem exitItem = new JMenuItem("exit");

loadItem.addActionListener(this);
saveItem.addActionListener(this);
exitItem.addActionListener(this);

fileMenu.setMnemonic(KeyEvent.VK_F);
editMenu.setMnemonic(KeyEvent.VK_E);
helpMenu.setMnemonic(KeyEvent.VK_H);

loadItem.setMnemonic(KeyEvent.VK_L);
saveItem.setMnemonic(KeyEvent.VK_S);
exitItem.setMnemonic(KeyEvent.VK_E);

fileMenu.add(loadItem);
fileMenu.add(saveItem);
fileMenu.add(exitItem);

menuBar.add(fileMenu);
menuBar.add(editMenu);
menuBar.add(helpMenu);


this.setJMenuBar(menuBar);
this.setVisible(true);
}
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == loadItem){
            System.out.println("Okay you're loaded bro");
        }
        if(e.getSource() == saveItem){
            System.out.println("Okay you're saved bro");
        }
        if(e.getSource() == exitItem){
            System.exit(0);
        }
    }

}
