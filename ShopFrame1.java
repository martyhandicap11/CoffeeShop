
/* O8/04/2014
  Created By Martin Cooney
  Second Semester Assessment
This programme takes in orders in a coffeeshop
and displays the prices and totals on a GUI, also
writes sales data to a File*/

/* Import clases from JAVA Library*/

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.Scanner;
/**
   This frame demonstrates how to install an action listener.
 */
 public class ShopFrame1 extends JFrame
 {
    Scanner scan=new Scanner(System.in);
   private static final int FRAME_WIDTH =400;
   private static final int FRAME_HEIGHT=400;
   private JButton coffeeButton1,teaButton2,sconeButton3,sandwichButton4,latteButton5,expressoButton6,totalPurchaseButton7,fileInputbutton8;
   private JLabel  coffeePrice1,teaPrice2,sconePrice3,sandwichPrice4,lattePrice5,expressoPrice6,label;
   private JTextField coffeeTotalbuttonA,teaTotalbuttonB,sconeTotalbuttonC,sandwichTotalbuttonD,latteTotalbuttonE,expressoTotalbuttonF,PurchaseTotalbuttonG,fileInputButtonH,inputI,inputJ,inputK;
   private int coffeeCounter1=0,teaCounter2=0,sconeCounter3=0,sandwichCounter4=0,latteCounter5=0,expressoCounter6=0,fileCounter=0;
   private double coffeeButton1price=3,teaButton2price=2,sconeButton3price=4,sandwichButton4price=3.50,latteButton5price=3,expressoButton6price=3,purchased=0;
   private double coffeeTotalbutton1,teaTotalbutton2,sconeTotalbutton3,sandwichTotalbutton4,latteTotalbutton5,expressoTotalbutton6;
   //private int field1;
   private String buttonText;

   public ShopFrame1()// Default Constructor
   {
     super( "Thurles Coffee Shop" );
     //setSize(100,100);1
	 JLabel label;
	 JLabel panel;
     createComponents ();
     setSize(FRAME_WIDTH, FRAME_HEIGHT);
   	 label = new JLabel("Welcome to Thurles Coffee Shop");  // construct a JLabel
   	 add(label, BorderLayout.NORTH);
   	 label.setBackground(Color.BLUE);


   }


   // Constructor to create different Components in the GUI
   private void createComponents()
   {
	 //Array list handling Combobox Data//

	 String[]menu1={"Black","With Milk","With Sugar","With Sugar &  Milk"};
     String[]menu2={"With Milk","With Sugar","With Sugar &  Milk"};
     String[]menu3={"Plain","Wheat"};
     String[]menu4={"Ham & Cheese","Toasted Special","Roast Beef","Turkey","Today's Special"};
     String[]menu5={"Cream","No Cream"};
     String[]menu6={"Cream","No Cream"};




      //Create new JPanel setting Layout and Colour//

      JPanel panel =new JPanel();
	  panel.setLayout(new GridLayout(0,2));
      panel.setBackground(Color.YELLOW);

       //Coffee Button Created//
      //paperBack = new JButton("HardBack");

	  coffeeButton1 = new JButton("Coffee");
	  coffeeButton1.setIcon(new ImageIcon("coffee.jpg"));
	  setSize(100,100);
	  coffeeTotalbuttonA=new JTextField( "0" );//TextField to allow totals to be displayed//
	  coffeeTotalbuttonA.setEditable(true);
	  panel.add(coffeeTotalbuttonA);
	  coffeeButton1.setBackground(Color.GREEN);
	  coffeePrice1   = new JLabel ("€3.00");
      JComboBox line1 = new JComboBox(menu1);//ComboBox to add different options with the product chosen//

      //Tea Button//

	  teaButton2 = new JButton("Tea");
	  teaButton2.setIcon(new ImageIcon("tea.jpg"));
	  teaButton2.setBackground(Color.GREEN);
	  teaPrice2   = new JLabel ("€2.00");
      JComboBox line2 = new JComboBox(menu2);//ComboBox to add different options with the product chosen//
      teaTotalbuttonB=new JTextField( "0" );//TextField to allow totals to be displayed//
	  teaTotalbuttonB.setEditable(true);
	  add(teaTotalbuttonB);


     //Scone Button//

	  sconeButton3 = new JButton("Scone");
	  sconeButton3.setIcon(new ImageIcon("scone.jpg"));
	  sconeButton3.setBackground(Color.GREEN);
	  sconePrice3   = new JLabel ("€4.00");
      JComboBox line3 = new JComboBox(menu3);//ComboBox to add different options with the product chosen//
      sconeTotalbuttonC=new JTextField( "0" );//TextField to allow totals to be displayed//
	  sconeTotalbuttonC.setEditable(true);
	  add(sconeTotalbuttonC);

      //Sandwich Button//

	  sandwichButton4 = new JButton("Sandwich");
	  sandwichButton4.setIcon(new ImageIcon("sandwich.jpg"));
	  sandwichButton4.setBackground(Color.GREEN);
	  sandwichPrice4   = new JLabel ("€3.50");
      JComboBox line4 = new JComboBox(menu4);   //ComboBox to add different options with the product chosen//
      sandwichTotalbuttonD=new JTextField( "0" );//TextField to allow totals to be displayed//
      sandwichTotalbuttonD.setEditable(true);
	  add(sandwichTotalbuttonD);

      //Latte Button//

	  latteButton5 = new JButton("Latte");
	  latteButton5.setIcon(new ImageIcon("latte.jpg"));
	  latteButton5.setBackground(Color.GREEN);
	  lattePrice5   = new JLabel ("€3.00");
      JComboBox line5 = new JComboBox(menu5);//ComboBox to add different options with the product chosen//
      latteTotalbuttonE=new JTextField( "0" );//TextField to allow totals to be displayed//
	  latteTotalbuttonE.setEditable(true);
	  add(latteTotalbuttonE);

      //Espresso  Button//

	  expressoButton6 = new JButton("Espresso");
	  expressoButton6.setIcon(new ImageIcon("espresso.jpg"));
	  expressoButton6.setBackground(Color.GREEN);
	  expressoPrice6   = new JLabel ("€3.00");
	  JComboBox line6 = new JComboBox(menu6);//ComboBox to add different options with the product chosen//
	  expressoTotalbuttonF=new JTextField( "0" );//TextField to allow totals to be displayed//
	  expressoTotalbuttonF.setEditable(true);
	  add(expressoTotalbuttonF);

      //TotalPurchaseButton//

	  totalPurchaseButton7 = new JButton("Total Purchased");
	  totalPurchaseButton7.setBackground(Color.GREEN);
      PurchaseTotalbuttonG=new JTextField( "0" );//TextField to allow totalpurchases to be displayed//
	  PurchaseTotalbuttonG.setEditable(true);
	  add(PurchaseTotalbuttonG);

      //fileInputbutton//

	  fileInputbutton8 = new JButton("File: Sales.txt Exit");
	  fileInputbutton8.setBackground(Color.GREEN);
	  fileInputButtonH=new JTextField( "0" );//TextField to allow totals to be displayed//

      //Add Buttons,TextFields and ComboBoxes to Panel//

           panel.add(coffeeButton1);

	       panel.add(coffeePrice1);
	       panel.add(line1);
	       panel.add(coffeeTotalbuttonA);

	       panel.add(teaButton2);
	       setSize(100,100);
	       panel.add(teaPrice2);
	       panel.add(line2);
	       panel.add(teaTotalbuttonB);

	       panel.add(sconeButton3);
	       setSize(100,100);
	       panel.add(sconePrice3);
	       panel.add(line3);
	       panel.add(sconeTotalbuttonC);

	       panel.add(sandwichButton4);
	       setSize(100,100);
	       panel.add(sandwichPrice4);
	       panel.add(line4);
	       panel.add(sandwichTotalbuttonD);

	       panel.add(latteButton5);
	       setSize(100,100);
	       panel.add(lattePrice5);
	       panel.add(line5);
	       panel.add(latteTotalbuttonE);

	       panel.add(expressoButton6);
	       setSize(100,100);
	       panel.add(expressoPrice6);
	       panel.add(line6);
	       panel.add(expressoTotalbuttonF);

	  	   panel.add(totalPurchaseButton7);
	       setSize(100,100);
	       panel.add(PurchaseTotalbuttonG);

	  	   panel.add(fileInputbutton8);
	       setSize(100,100);
	       panel.add(fileInputButtonH);
           add(panel);
     // Action Listeners to allow buttons to perform tasks//

	 ActionListener listener = new ShopListener();
     coffeeButton1.addActionListener(listener);//coffeeButton Listener

     ActionListener listener1 = new ShopListener1();
     teaButton2.addActionListener(listener1);//teaButton Listener

     ActionListener listener2 = new ShopListener2();
     sconeButton3.addActionListener(listener2);//sconeButton Listener

     ActionListener listener3 = new ShopListener3();
     sandwichButton4.addActionListener(listener3);//SandwichButton Listener

     ActionListener listener4 = new ShopListener4();
     latteButton5.addActionListener(listener4);//latteButton Listener

     ActionListener listener5 = new ShopListener5();
     expressoButton6.addActionListener(listener5);//expressoButton Listener

     ActionListener listener6 = new ShopListener6();
     totalPurchaseButton7.addActionListener(listener6);//totalPurchaseButton Listener

     ActionListener listener7 = new ShopListener7();
     fileInputbutton8.addActionListener(listener7);//fileInputButton Listener



     }
     // Inner Classes to Allow calculations and File Handling//
     public class ShopListener implements ActionListener
	 {


	   public void actionPerformed(ActionEvent event)
	   {
          //Do Calculations for Coffee//

          coffeeTotalbutton1=coffeeTotalbutton1+coffeeButton1price;
          coffeeCounter1++;
	      System.out.println("Coffee"+coffeeCounter1+"="+ coffeeTotalbutton1);
	      buttonText="    "+coffeeCounter1 + "      "+"Coffee"+"    "+coffeeTotalbutton1+"   ";
	      coffeeTotalbuttonA.setText(buttonText);

        }

     }
     public class ShopListener1 implements ActionListener
	 {
	   public void actionPerformed(ActionEvent event)
	   {
		   //Do Calculations for Tea//

		   teaTotalbutton2=teaTotalbutton2+teaButton2price;
	       teaCounter2++;
	       System.out.println("Tea"+teaCounter2+"="+ teaTotalbutton2);
	       buttonText="    "+teaCounter2 + "      "+"Tea" +"  " +teaTotalbutton2+"   ";
	       teaTotalbuttonB.setText(buttonText);

	   }
     }
     public class ShopListener2 implements ActionListener
	 {
	   public void actionPerformed(ActionEvent event)
	   {
		  //Do Calculations for Coffee//

		  sconeTotalbutton3=sconeTotalbutton3+sconeButton3price;
          sconeCounter3++;
	      System.out.println("Scone"+sconeCounter3+"="+ sconeTotalbutton3);
          buttonText="    "+sconeCounter3 + "      "+"Scone"+"    "+sconeTotalbutton3+"   ";
	      sconeTotalbuttonC.setText(buttonText);
	   }
     }
     public class ShopListener3 implements ActionListener
	 {
	   public void actionPerformed(ActionEvent event)
	   {
		  //Do Calculations for Sandwich//

		  sandwichTotalbutton4=sandwichTotalbutton4+sandwichButton4price;
          sandwichCounter4++;
	      System.out.println("Sandwich"+sandwichCounter4+"="+ sandwichTotalbutton4);
          buttonText="    "+sandwichCounter4 + "      "+"Sandwich"+"    "+sandwichTotalbutton4+"   ";
	      sandwichTotalbuttonD.setText(buttonText);
	   }
     }
     public class ShopListener4 implements ActionListener
	 {
	   public void actionPerformed(ActionEvent event)
	   {
		  //Do Calculations for Latte//

		  latteTotalbutton5=latteTotalbutton5+latteButton5price;
          latteCounter5++;
	      System.out.println("Latte"+latteCounter5+"="+ latteTotalbutton5);
	      buttonText="    "+latteCounter5 + "      "+"Latte"+"    "+latteTotalbutton5+"   ";
	      latteTotalbuttonE.setText(buttonText);
	   }

     }
     public class ShopListener5 implements ActionListener
	 {
	   public void actionPerformed(ActionEvent event)
	   {
		  //Do Calculations for Espresso//

		  expressoTotalbutton6=expressoTotalbutton6+expressoButton6price;
		  expressoCounter6++;
	      System.out.println("Expresso"+expressoCounter6+"="+ expressoTotalbutton6);
	      buttonText="    "+expressoCounter6 + "      "+"Expresso"+"    "+expressoTotalbutton6+"   ";
	      expressoTotalbuttonF.setText(buttonText);
	   }
     }

     public class ShopListener6 implements ActionListener
   	 {

	   public void actionPerformed(ActionEvent event)
	   {
		  //Do Calculations for Total Purchases//

          purchased=coffeeTotalbutton1+teaTotalbutton2+sconeTotalbutton3+sandwichTotalbutton4+latteTotalbutton5+expressoTotalbutton6;
          System.out.println("Total Purchased"+"="+ purchased);
          System.out.println("==========================================");

          buttonText="   "+"Final Total"+"    "+purchased + "      ";
	      PurchaseTotalbuttonG.setText(buttonText);
          coffeeTotalbuttonA.setText ("0");
          teaTotalbuttonB.setText ("0");
          sconeTotalbuttonC.setText ("0");
          sandwichTotalbuttonD.setText ("0");
          latteTotalbuttonE.setText ("0");
          expressoTotalbuttonF.setText ("0");
          fileInputButtonH.setText ("Next Purchase");
	   }
	 }
     public class ShopListener7 implements ActionListener
	 {
	   public void actionPerformed (ActionEvent event)
	   {


		try
		{


			//Prompt for the File Sales.txt//

		  Scanner console=new Scanner (System.in);
		  System.out.print("Input file:");
		  String inputFileName=console.next();
		  System.out.print("Output file:");
		  String outputFileName=console.next();

			//Construct the Scanner and PrintWriter objects for reading and writing

		  File inputFile=new File(inputFileName);
		  Scanner in=new Scanner(inputFile);
		  FileWriter out=new FileWriter(inputFileName);
		  FileWriter outFile = new FileWriter("Sales.txt",true);

          out.write("\n***********Purchase Record*************\n");

          out.write("\n"+coffeeCounter1+"Coffee"+"="+ coffeeTotalbutton1+"\n");
          out.write("\n"+teaCounter2+"Tea"+"="+ teaTotalbutton2+"\n");
          out.write("\n"+sconeCounter3+"Scone"+"="+ sconeTotalbutton3+"\n");
          out.write("\n"+sandwichCounter4+"Sandwich"+"="+ sandwichTotalbutton4+"\n");
          out.write("\n"+latteCounter5+"Latte"+"="+ latteTotalbutton5+"\n");
          out.write("\n"+expressoCounter6+"Exspresso"+"="+ expressoTotalbutton6+"\n");

          out.write("\n==========================================\n");

          out.write("\n"+"Final Total"+"="+ purchased+"\n");

			out.close();

		}
		catch(IOException exception)
		{
			System.out.println("The file name selected is not valid");
		}



        //Setting counters back to zero when totalPurchaseButton is clicked//

        coffeeCounter1=0;
        teaCounter2=0;
        sconeCounter3=0;
        sandwichCounter4=0;
        latteCounter5=0;
        expressoCounter6=0;
        coffeeTotalbutton1=0;
        teaTotalbutton2=0;
        sconeTotalbutton3=0;
        sandwichTotalbutton4=0;
        latteTotalbutton5=0;
        expressoTotalbutton6=0;
        purchased=0;
        fileCounter++;
        System.out.println("Next Customer");
        buttonText="    "+purchased + "    ";
	    fileInputButtonH.setText(buttonText);

        System.exit(0);
	  }


	 }


}

