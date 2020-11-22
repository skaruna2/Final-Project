import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class World extends JFrame implements ActionListener {
	
	private JMenu x;
	private JButton aboutButton;
	private JMenuItem m1;
	
	public World()
	{			
        // create a menubar 
        JMenuBar mb = new JMenuBar(); 
  
        // create a menu 
        x = new JMenu("File"); 
        aboutButton = new JButton("About");
        
        // create menuitems 
        JMenuItem m1 = new JMenuItem("Load a Roster"); 
        JMenuItem m2 = new JMenuItem("Add Attendance"); 
        JMenuItem m3 = new JMenuItem("Save"); 
        JMenuItem m4 = new JMenuItem("Plot Data"); 
  
        // add menu items to menu 
        x.add(m1); 
        x.add(m2); 
        x.add(m3); 
        x.add(m4);
  
        aboutButton.addActionListener(this);
        m1.addActionListener(this);
        // add menu to menu bar 
        mb.add(x); 
        mb.add(aboutButton);
       
       
        // add menubar to frame 
        this.setJMenuBar(mb); 
         
        // set the size of the frame 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500); 
        this.setVisible(true); 
    } 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		World world = new World();
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		// if About Button is pressed, prints dialog box
		if(aboutButton.equals(e.getSource()) )
			{
				JOptionPane.showMessageDialog(this, "CSE 360 Final Project done by:"
						+ "\nWilliam Bowden" + "\nKyle Otstot" + "\nShawn Karunanayake"
						);
			}
		// JMenu File Menu buttons
		if(e.getActionCommand() == "Load a Roster")
		{
			System.out.println("Hello World");
			
			
	        // JTable
	        String data[][]={ {"101","Amit","670000"},    
	                {"102","Jai","780000"},    
	                {"101","Sachin","700000"}};    
				
	        String column[]={"ID","NAME","SALARY"};         
	        JTable jt=new JTable(data,column);    
	        jt.setBounds(30,40,200,300);          
	        JScrollPane sp=new JScrollPane(jt);  
			
	        // add JTable to frame
	        this.add(sp);
		}
		revalidate();
		repaint();
			
	}
	

}
