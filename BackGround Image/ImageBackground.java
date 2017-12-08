import javax.swing.*;
import java.awt.*;
import java.io.*;

 public class ImageBackground extends JFrame
 {


   private JTextField text;
   private JPanel panel;
   private JLabel header;
   private FlowLayout move;
   public ImageBackground()// Default Constructor
   {
           super( "Image Background Sample" );
		       //setSize(100,100);1
		        createComponents();
	             /*JLabel label;
	             label = new JLabel();
				 add(label, BorderLayout.NORTH);
				 label.setBackground(Color.GREEN);  //Setting Background Color//
				 label.setOpaque(true);
                 add(label);*/

				 /*setLayout(new BorderLayout());
				 JLabel background=new JLabel(new ImageIcon("manutd.jpg"));//Setting an Image as Background//
				 background.setOpaque(true);
				 add(background);
	             background.setLayout(new FlowLayout());*/

                 /*JLabel label;
				 label = new JLabel(new ImageIcon("manutd.jpg"));// Adding Image to Frame//
				 add(label, BorderLayout.NORTH);
				 label.setBackground(Color.GREEN); //Setting Background Color//
				 label.setOpaque(true);
                 add(label);*/


                 /*JLabel label;
				 label = new JLabel(new ImageIcon("manutd.jpg"));// Adding Image to Frame//
                 Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
                 setBounds(0,0,d.width,d.height);
                 add(label);*/                               // Setting Frame to open in Full Screen//



   }

   private void createComponents()
   {

                  JPanel panel =new JPanel();
	              panel.setLayout(new FlowLayout());

                  JLabel label;
				  label = new JLabel(new ImageIcon("manutd.jpg"));// Adding Image to Frame//
				  add(label, BorderLayout.NORTH);
				  label.setBackground(Color.GREEN); //Setting Background Color//
				  label.setVisible(true);
 				  panel.add(label);
 				  //add(panel);



	              JLabel header =new JLabel("Manchester United");
                  header.setVisible(true);
                  panel.add(header);
                  add(panel);
   }
}