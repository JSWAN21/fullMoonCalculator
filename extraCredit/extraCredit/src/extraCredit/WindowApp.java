//Jakob_Swanson_
package extraCredit;

import java.awt.EventQueue; //Here and below are all the imports i have for the JFrame elements.
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
public class WindowApp { //This is the class for the window application
	private JFrame frame; //this is creating the JFrame "frame"
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) { //Here is the "main" method for running the window application
		EventQueue.invokeLater(new Runnable() { //Here is an "event" being ran
			public void run() { //Here is the run method being created
				try {
					WindowApp window = new WindowApp(); //While the event que is running it will "try" and run the new windowApp window
					window.frame.setVisible(true); //This is setting the windowApp frame to visible so the user can see it
				} catch (Exception e) { //This is catching the try statement if it fails to run
					e.printStackTrace(); //If it fails to run it will then printStackTrace
				}
			}
		});
	}
	/**
	 * Create the application.
	 */
	public WindowApp() { //This here is the WindowApp method
		initialize(); //Here we have it initialize the content of the frame
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() { //This is the initialize method being created for the JFrame
		frame = new JFrame(); //here is the newly created Jframe "frame"
		frame.getContentPane().setBackground(new Color(84, 157, 221)); //This is setting the background to a specific color
		frame.setForeground(Color.GRAY); //This is setting the foreground to the color gray
		frame.getContentPane().setForeground(Color.BLACK); //here we are getting a content panel from the frame and setting the foreground color to black
		frame.setBounds(100, 100, 600, 449); //This is setting the location of the frame and the boundaries it has
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //This ensures that the Jframe closes once you hit close
		frame.getContentPane().setLayout(null); //This is setting the layout to null settings		
//label		
		JLabel label = new JLabel("Full Moon Calculator"); //Here is the JLabel i created to present the title of my program
		label.setForeground(SystemColor.inactiveCaptionBorder); //This here is setting the color of my JLabel
		label.setFont(new Font("Copperplate", Font.PLAIN, 14)); //This is setting the font to the text i created as well as the size of the text
		label.setBounds(205, 21, 173, 16); //This here sets the boundaries and location of my JLabel onto the JFrame
		frame.getContentPane().add(label); //Lastly this is getting a contentPane for the JFrame and adding the new "label" JLabel to it so that it is visible to the user.
	
//Text Area
		JTextArea strV0TextBox = new JTextArea(); //Here is the new TextArea being created to hold text that i will later output through the switch statement
		strV0TextBox.setForeground(new Color(105, 105, 105)); //This line is setting the foreground RGB color of strV0TextBox
	    strV0TextBox.setFont(new Font("Hiragino Mincho ProN", Font.PLAIN, 13)); //Here this is setting the font and size of the textboxe's text
	    strV0TextBox.setBounds(103, 145, 391, 270); //This sets the boundaries and size of the text area
		frame.getContentPane().add(strV0TextBox); //This is getting a content pane to put on the JFrame as well as putting the text area on it so it is visible to user.
//Enter button
		JButton button = new JButton("ENTER"); //Here we are creating the button JButton that will be connected to the text field so that the users input is directed to the switch statement
		button.setBackground(new Color(255, 255, 255)); //Here i am setting the background color of the button
		button.setFont(new Font("Telugu MN", Font.PLAIN, 12)); //This is setting the font and size
		button.setForeground(new Color(0, 0, 0)); //Here is the foreground color being set
		button.setBounds(354, 91, 89, 24); //Here is the boundaries and size of the button being set
		frame.getContentPane().add(button); //This is adding the button Jbutton to a content pane on the JFrame
//TextField
		final JTextField tf = new JTextField(""); //This is creating the JTextField "tf" that will be used for our user input
		tf.setHorizontalAlignment(SwingConstants.CENTER); //This is setting the horizontal alignment of the text field
		tf.setBounds(220, 88, 130, 26); //This is setting the boundaries of the field
		frame.getContentPane().add(tf); //This is adding "tf" to a content pane so that the user sees it and can interact
		tf.setColumns(10);	 //This is setting the columns size
//Text Pane		
		JTextPane txtpnEnterAYear = new JTextPane(); //This is creating the JTextPane "txtpnEnterAYear" that will hold our message to the user to see 
		txtpnEnterAYear.setBackground(new Color(84, 157, 221)); //This sets the background color // The line below is setting a text message to be seen by the user
		txtpnEnterAYear.setText("Enter a year between 1990-2050 to see that years full moon cycle as well\n   as if the market was up or down on those dates in the last five years");
		txtpnEnterAYear.setBounds(70, 39, 484, 40); //This sets the boundaries/location of the text panel
		frame.getContentPane().add(txtpnEnterAYear); //This is adding the text panel the a content panel so that it is visible to user
//Button Action Listener		
		button.addActionListener(new ActionListener(){ //This is the action listener for the button 
		    @Override
		    public void actionPerformed(ActionEvent e) { //this is creating the "actionPerformed" method for the action listener to interact with
		        String yeah = tf.getText(); //here the String "yeah" is created so that it can get the input from the Text Field "tf"
		        int strV0TextBox2 = Integer.parseInt(yeah); //This is creating the integer "strV0TextBox2" to turn the String "yeah" into a integer so that the switch statement can read the user input
//Switch Statement	
//Here below i have the switch statement, what i did was made individual cases for each year from 1990-2050. For every year there is text connected with the dates of full moons.
//Once a case is inputed the text is then set to the "strV0TextBox" JTextArea so that the user will see the information they requested
				switch (strV0TextBox2) { //This is the switch statement that is taking input from the text field "tf"
				case 1990:// This is the first case made so that when the user inputs "1990" it will give the following text to the text box "strV0TextBox"
			           strV0TextBox.setText("Thursday, 11 January 1990, 05:56:48 am\n"
			           		+ "Friday, 9 February 1990, 08:15:42 pm\n"
			           		+ "Sunday, 11 March 1990, 11:58:30 am\n"
			           		+ "Tuesday, 10 April 1990, 05:18:30 am\n"
			           		+ "Wednesday, 9 May 1990, 09:30:48 pm\n"
			           		+ "Friday, 8 June 1990, 01:01:06 pm\n"
			           		+ "Sunday, 8 July 1990, 03:23:30 am\n"
			           		+ "Monday, 6 August 1990, 04:19:24 pm\n"
			           		+ "Wednesday, 5 September 1990, 03:45:36 am\n"
			           		+ "Thursday, 4 October 1990, 01:01:48 pm\n"
			           		+ "Friday, 2 November 1990, 10:48:18 pm\n"
			           		+ "Sunday, 2 December 1990, 08:49:42 am\n"
			           		+ "Monday, 31 December 1990, 07:35:12 pm");
			           break;	
			        case 1991:
			        	strV0TextBox.setText("Wednesday, 30 January 1991, 07:09:42 am\n"
			        			+ "Thursday, 28 February 1991, 07:24:36 pm\n"
			        			+ "Saturday, 30 March 1991, 08:17:24 am\n"
			        			+ "Sunday, 28 April 1991, 10:58:30 pm\n"
			        			+ "Tuesday, 28 May 1991, 01:36:36 pm\n"
			        			+ "Thursday, 27 June 1991, 04:58:24 am\n"
			        			+ "Friday, 26 July 1991, 08:24:24 pm\n"
			        			+ "Sunday, 25 August 1991, 11:07:12 am\n"
			        			+ "Tuesday, 24 September 1991, 12:40:00 am\n"
			        			+ "Wednesday, 23 October 1991, 12:08:12 pm\n"
			        			+ "Thursday, 21 November 1991, 11:56:18 pm\n"
			        			+ "Saturday, 21 December 1991, 11:23:12 am");
			        	break; 	
			        case 1992:
			        	strV0TextBox.setText("Sunday, 19 January 1992, 10:28:30 pm\n"
			        			+ "Tuesday, 18 February 1992, 09:04:06 am\n"
			        			+ "Wednesday, 18 March 1992, 07:17:48 pm\n"
			        			+ "Friday, 17 April 1992, 06:42:30 am\n"
			        			+ "Saturday, 16 May 1992, 06:02:36 pm\n"
			        			+ "Monday, 15 June 1992, 06:49:42 am\n"
			        			+ "Tuesday, 14 July 1992, 09:06:18 pm\n"
			        			+ "Thursday, 13 August 1992, 12:27:12 pm\n"
			        			+ "Saturday, 12 September 1992, 04:16:36 am\n"
			        			+ "Sunday, 11 October 1992, 07:03:00 pm\n"
			        			+ "Tuesday, 10 November 1992, 10:20:06 am\n"
			        			+ "Thursday, 10 December 1992, 12:40:42 am");
			        	break;
			        	
			        case 1993:
			        	strV0TextBox.setText("Friday, 8 January 1993, 01:37:12 pm\n"
			        			+ "Sunday, 7 February 1993, 12:55:24 am\n"
			        			+ "Monday, 8 March 1993, 10:45:54 am\n"
			        			+ "Tuesday, 6 April 1993, 08:43:18 pm\n"
			        			+ "Thursday, 6 May 1993, 05:33:42 am\n"
			        			+ "Friday, 4 June 1993, 03:02:12 pm\n"
			        			+ "Sunday, 4 July 1993, 01:45:06 am\n"
			        			+ "Monday, 2 August 1993, 02:09:36 pm\n"
			        			+ "Wednesday, 1 September 1993, 04:32:54 am\n"
			        			+ "Thursday, 30 September 1993, 07:53:48 pm\n"
			        			+ "Saturday, 30 October 1993, 01:37:36 pm\n"
			        			+ "Monday, 29 November 1993, 07:30:48 am\n"
			        			+ "Wednesday, 29 December 1993, 12:05:24 am");
			        	break;
			        	
			        case 1994:
			        	strV0TextBox.setText("Thursday, 27 January 1994, 02:22:48 pm\n"
			        			+ "Saturday, 26 February 1994, 02:15:00 am\n"
			        			+ "Sunday, 27 March 1994, 01:09:30 pm\n"
			        			+ "Monday, 25 April 1994, 09:45:00 pm\n"
			        			+ "Wednesday, 25 May 1994, 05:39:24 am\n"
			        			+ "Thursday, 23 June 1994, 01:33:06 pm\n"
			        			+ "Friday, 22 July 1994, 10:15:54 pm\n"
			        			+ "Sunday, 21 August 1994, 08:46:54 am\n"
			        			+ "Monday, 19 September 1994, 10:00:30 pm\n"
			        			+ "Wednesday, 19 October 1994, 01:17:48 pm\n"
			        			+ "Friday, 18 November 1994, 07:57:00 am\n"
			        			+ "Sunday, 18 December 1994, 03:17:06 am");
			        	break;

			        case 1995:
			        	strV0TextBox.setText("Monday, 16 January 1995, 09:26:18 pm\n"
			        			+ "Wednesday, 15 February 1995, 01:15:24 pm\n"
			        			+ "Friday, 17 March 1995, 02:25:36 am\n"
			        			+ "Saturday, 15 April 1995, 02:08:12 pm\n"
			        			+ "Sunday, 14 May 1995, 10:48:06 pm\n"
			        			+ "Tuesday, 13 June 1995, 06:03:30 am\n"
			        			+ "Wednesday, 12 July 1995, 12:49:18 pm\n"
			        			+ "Thursday, 10 August 1995, 08:15:30 pm\n"
			        			+ "Saturday, 9 September 1995, 05:36:36 am\n"
			        			+ "Sunday, 8 October 1995, 04:51:48 pm\n"
			        			+ "Tuesday, 7 November 1995, 08:20:30 am\n"
			        			+ "Thursday, 7 December 1995, 02:26:54 am");
			        	break;
			        case 1996:
			        	strV0TextBox.setText("Friday, 5 January 1996, 09:50:54 pm\n"
			        			+ "Sunday, 4 February 1996, 04:57:36 pm\n"
			        			+ "Tuesday, 5 March 1996, 10:22:42 am\n"
			        			+ "Thursday, 4 April 1996, 02:06:54 am\n"
			        			+ "Friday, 3 May 1996, 01:48:12 pm\n"
			        			+ "Saturday, 1 June 1996, 10:46:54 pm\n"
			        			+ "Monday, 1 July 1996, 05:58:06 am\n"
			        			+ "Tuesday, 30 July 1996, 12:35:12 pm\n"
			        			+ "Wednesday, 28 August 1996, 07:52:12 pm\n"
			        			+ "Friday, 27 September 1996, 04:50:48 am\n"
			        			+ "Saturday, 26 October 1996, 04:11:12 pm\n"
			        			+ "Monday, 25 November 1996, 05:09:54 am\n"
			        			+ "Tuesday, 24 December 1996, 09:41:00 pm\n"
			        			+ "");
			        	break;
			        case 1997:
			        	strV0TextBox.setText("Thursday, 23 January 1997, 04:10:42 pm\n"
			        			+ "Saturday, 22 February 1997, 11:26:42 am\n"
			        			+ "Monday, 24 March 1997, 05:45:12 am\n"
			        			+ "Tuesday, 22 April 1997, 10:33:30 pm\n"
			        			+ "Thursday, 22 May 1997, 11:13:24 am\n"
			        			+ "Friday, 20 June 1997, 09:08:48 pm\n"
			        			+ "Sunday, 20 July 1997, 05:20:18 am\n"
			        			+ "Monday, 18 August 1997, 12:55:24 pm\n"
			        			+ "Tuesday, 16 September 1997, 08:50:30 pm\n"
			        			+ "Thursday, 16 October 1997, 05:45:42 am\n"
			        			+ "Friday, 14 November 1997, 03:11:36 pm\n"
			        			+ "Sunday, 14 December 1997, 03:37:06 am");
			        	break;
			        case 1998:
			        	strV0TextBox.setText("Monday, 12 January 1998, 06:23:42 pm\n"
			        			+ "Wednesday, 11 February 1998, 11:22:36 am\n"
			        			+ "Friday, 13 March 1998, 05:34:12 am\n"
			        			+ "Sunday, 12 April 1998, 12:23:30 am\n"
			        			+ "Monday, 11 May 1998, 04:29:24 pm\n"
			        			+ "Wednesday, 10 June 1998, 06:18:18 am\n"
			        			+ "Thursday, 9 July 1998, 06:00:54 pm\n"
			        			+ "Saturday, 8 August 1998, 04:09:36 am\n"
			        			+ "Sunday, 6 September 1998, 01:21:24 pm\n"
			        			+ "Monday, 5 October 1998, 10:11:54 pm\n"
			        			+ "Wednesday, 4 November 1998, 06:18:12 am\n"
			        			+ "Thursday, 3 December 1998, 04:19:12 pm");
			        	break;
			        case 1999:
			        	strV0TextBox.setText("Saturday, 2 January 1999, 03:49:30 am\n"
			        			+ "Sunday, 31 January 1999, 05:06:30 pm\n"
			        			+ "Tuesday, 2 March 1999, 07:58:30 am\n"
			        			+ "Thursday, 1 April 1999, 12:48:54 am\n"
			        			+ "Friday, 30 April 1999, 04:54:36 pm\n"
			        			+ "Sunday, 30 May 1999, 08:39:54 am\n"
			        			+ "Monday, 28 June 1999, 11:37:30 pm\n"
			        			+ "Wednesday, 28 July 1999, 01:24:48 pm\n"
			        			+ "Friday, 27 August 1999, 01:47:48 am\n"
			        			+ "Saturday, 25 September 1999, 12:51:06 pm\n"
			        			+ "Sunday, 24 October 1999, 11:02:24 pm\n"
			        			+ "Tuesday, 23 November 1999, 08:03:42 am\n"
			        			+ "Wednesday, 22 December 1999, 06:31:18 pm");
			        	break;
			        case 2000:
			        	strV0TextBox.setText("Friday, 21 January 2000, 05:40:24 am [**]\n"
			        			+ "Saturday, 19 February 2000, 05:26:42 pm\n"
			        			+ "Monday, 20 March 2000, 05:44:24 am\n"
			        			+ "Tuesday, 18 April 2000, 07:41:30 pm\n"
			        			+ "Thursday, 18 May 2000, 09:34:24 am\n"
			        			+ "Saturday, 17 June 2000, 12:27:00 am\n"
			        			+ "Sunday, 16 July 2000, 03:55:12 pm\n"
			        			+ "Tuesday, 15 August 2000, 07:12:36 am\n"
			        			+ "Wednesday, 13 September 2000, 09:36:48 pm\n"
			        			+ "Friday, 13 October 2000, 10:53:00 am\n"
			        			+ "Saturday, 11 November 2000, 10:14:36 pm\n"
			        			+ "Monday, 11 December 2000, 10:02:48 am");
			        	break;
			        case 2001:
			        	strV0TextBox.setText("Tuesday, 9 January 2001, 09:24:24 pm [**]\n"
			        			+ "Thursday, 8 February 2001, 08:11:42 am\n"
			        			+ "Friday, 9 March 2001, 06:23:06 pm\n"
			        			+ "Sunday, 8 April 2001, 05:21:54 am\n"
			        			+ "Monday, 7 May 2001, 03:52:30 pm\n"
			        			+ "Wednesday, 6 June 2001, 03:39:18 am\n"
			        			+ "Thursday, 5 July 2001, 05:03:48 pm\n"
			        			+ "Saturday, 4 August 2001, 07:55:42 am\n"
			        			+ "Sunday, 2 September 2001, 11:43:00 pm\n"
			        			+ "Tuesday, 2 October 2001, 03:48:48 pm\n"
			        			+ "Thursday, 1 November 2001, 06:41:00 am\n"
			        			+ "Friday, 30 November 2001, 09:49:00 pm\n"
			        			+ "Sunday, 30 December 2001, 11:40:30 am");
			        	break;
			        case 2002:
			        	strV0TextBox.setText("Monday, 28 January 2002, 11:50:30 pm\n"
			        			+ "Wednesday, 27 February 2002, 10:16:42 am\n"
			        			+ "Thursday, 28 March 2002, 07:24:54 pm\n"
			        			+ "Saturday, 27 April 2002, 04:59:54 am\n"
			        			+ "Sunday, 26 May 2002, 01:51:12 pm\n"
			        			+ "Monday, 24 June 2002, 11:42:24 pm\n"
			        			+ "Wednesday, 24 July 2002, 11:07:00 am\n"
			        			+ "Friday, 23 August 2002, 12:29:12 am\n"
			        			+ "Saturday, 21 September 2002, 03:59:12 pm\n"
			        			+ "Monday, 21 October 2002, 09:20:00 am\n"
			        			+ "Wednesday, 20 November 2002, 02:33:42 am\n"
			        			+ "Thursday, 19 December 2002, 08:10:12 pm");
			        	break;
			        case 2003:
			        	strV0TextBox.setText("Saturday, 18 January 2003, 11:47:36 am\n"
			        			+ "Monday, 17 February 2003, 12:51:06 am\n"
			        			+ "Tuesday, 18 March 2003, 11:34:30 am\n"
			        			+ "Wednesday, 16 April 2003, 09:35:42 pm\n"
			        			+ "Friday, 16 May 2003, 05:35:54 am\n"
			        			+ "Saturday, 14 June 2003, 01:15:54 pm\n"
			        			+ "Sunday, 13 July 2003, 09:21:24 pm\n"
			        			+ "Tuesday, 12 August 2003, 06:48:12 am\n"
			        			+ "Wednesday, 10 September 2003, 06:36:12 pm\n"
			        			+ "Friday, 10 October 2003, 09:27:24 am\n"
			        			+ "Sunday, 9 November 2003, 02:13:18 am [**]\n"
			        			+ "Monday, 8 December 2003, 09:36:42 pm");
			        	break;
			        case 2004:
			        	strV0TextBox.setText("Wednesday, 7 January 2004, 04:40:06 pm\n"
			        			+ "Friday, 6 February 2004, 09:46:54 am\n"
			        			+ "Sunday, 7 March 2004, 12:14:12 am\n"
			        			+ "Monday, 5 April 2004, 01:02:42 pm\n"
			        			+ "Tuesday, 4 May 2004, 10:33:24 pm [**]\n"
			        			+ "Thursday, 3 June 2004, 06:19:36 am\n"
			        			+ "Friday, 2 July 2004, 01:08:54 pm\n"
			        			+ "Saturday, 31 July 2004, 08:05:06 pm\n"
			        			+ "Monday, 30 August 2004, 04:22:12 am\n"
			        			+ "Tuesday, 28 September 2004, 03:09:18 pm\n"
			        			+ "Thursday, 28 October 2004, 05:07:24 am [**]\n"
			        			+ "Friday, 26 November 2004, 09:07:12 pm\n"
			        			+ "Sunday, 26 December 2004, 04:06:18 pm");
			        	break;
			        case 2005:
			        	strV0TextBox.setText("Tuesday, 25 January 2005, 11:32:18 am\n"
			        			+ "Thursday, 24 February 2005, 05:53:42 am\n"
			        			+ "Friday, 25 March 2005, 09:58:30 pm\n"
			        			+ "Sunday, 24 April 2005, 12:06:30 pm\n"
			        			+ "Monday, 23 May 2005, 10:18:12 pm\n"
			        			+ "Wednesday, 22 June 2005, 06:13:48 am\n"
			        			+ "Thursday, 21 July 2005, 01:00:12 pm\n"
			        			+ "Friday, 19 August 2005, 07:53:00 pm\n"
			        			+ "Sunday, 18 September 2005, 04:00:48 am\n"
			        			+ "Monday, 17 October 2005, 02:13:36 pm\n"
			        			+ "Wednesday, 16 November 2005, 01:57:30 am\n"
			        			+ "Thursday, 15 December 2005, 05:15:30 pm");
			        	break;
			        case 2006:
			        	strV0TextBox.setText("Saturday, 14 January 2006, 10:48:06 am\n"
			        			+ "Monday, 13 February 2006, 05:44:12 am\n"
			        			+ "Wednesday, 15 March 2006, 12:35:24 am\n"
			        			+ "Thursday, 13 April 2006, 06:40:06 pm\n"
			        			+ "Saturday, 13 May 2006, 08:51:06 am\n"
			        			+ "Sunday, 11 June 2006, 08:03:06 pm\n"
			        			+ "Tuesday, 11 July 2006, 05:01:54 am\n"
			        			+ "Wednesday, 9 August 2006, 12:54:00 pm\n"
			        			+ "Thursday, 7 September 2006, 08:42:00 pm\n"
			        			+ "Saturday, 7 October 2006, 05:12:48 am\n"
			        			+ "Sunday, 5 November 2006, 01:58:18 pm\n"
			        			+ "Tuesday, 5 December 2006, 01:24:48 am");
			        	break;
			        case 2007:
			        	strV0TextBox.setText("Wednesday, 3 January 2007, 02:57:24 pm\n"
			        			+ "Friday, 2 February 2007, 06:45:18 am\n"
			        			+ "Sunday, 4 March 2007, 12:17:06 am [**]\n"
			        			+ "Monday, 2 April 2007, 07:15:00 pm\n"
			        			+ "Wednesday, 2 May 2007, 12:09:24 pm\n"
			        			+ "Friday, 1 June 2007, 03:03:36 am\n"
			        			+ "Saturday, 30 June 2007, 03:48:42 pm\n"
			        			+ "Monday, 30 July 2007, 02:47:42 am\n"
			        			+ "Tuesday, 28 August 2007, 12:35:06 pm\n"
			        			+ "Wednesday, 26 September 2007, 09:45:06 pm\n"
			        			+ "Friday, 26 October 2007, 06:51:30 am\n"
			        			+ "Saturday, 24 November 2007, 03:29:48 pm\n"
			        			+ "Monday, 24 December 2007, 02:15:36 am");
			        	break;
			        case 2008:
			        	strV0TextBox.setText("Tuesday, 22 January 2008, 02:34:42 pm\n"
			        			+ "Thursday, 21 February 2008, 04:30:30 am [**]\n"
			        			+ "Friday, 21 March 2008, 07:39:54 pm\n"
			        			+ "Sunday, 20 April 2008, 12:25:24 pm\n"
			        			+ "Tuesday, 20 May 2008, 04:11:24 am\n"
			        			+ "Wednesday, 18 June 2008, 07:30:24 pm\n"
			        			+ "Friday, 18 July 2008, 09:59:00 am\n"
			        			+ "Saturday, 16 August 2008, 11:16:24 pm\n"
			        			+ "Monday, 15 September 2008, 11:13:24 am\n"
			        			+ "Tuesday, 14 October 2008, 10:02:24 pm\n"
			        			+ "Thursday, 13 November 2008, 07:17:18 am\n"
			        			+ "Friday, 12 December 2008, 05:37:06 pm");
			        	break;
			        case 2009:
			        	strV0TextBox.setText("Sunday, 11 January 2009, 04:26:36 am\n"
			        			+ "Monday, 9 February 2009, 03:49:00 pm\n"
			        			+ "Wednesday, 11 March 2009, 03:37:36 am\n"
			        			+ "Thursday, 9 April 2009, 04:55:42 pm\n"
			        			+ "Saturday, 9 May 2009, 06:01:18 am\n"
			        			+ "Sunday, 7 June 2009, 08:11:36 pm\n"
			        			+ "Tuesday, 7 July 2009, 11:21:18 am\n"
			        			+ "Thursday, 6 August 2009, 02:54:42 am\n"
			        			+ "Friday, 4 September 2009, 06:02:30 pm\n"
			        			+ "Sunday, 4 October 2009, 08:10:00 am\n"
			        			+ "Monday, 2 November 2009, 08:13:48 pm\n"
			        			+ "Wednesday, 2 December 2009, 08:30:18 am\n"
			        			+ "Thursday, 31 December 2009, 08:12:36 pm [*]");
			        	break;
			        case 2010:
			        	strV0TextBox.setText("Saturday, 30 January 2010, 07:17:36 am\n"
			        			+ "Sunday, 28 February 2010, 05:37:54 pm\n"
			        			+ "Tuesday, 30 March 2010, 04:25:24 am\n"
			        			+ "Wednesday, 28 April 2010, 02:18:30 pm\n"
			        			+ "Friday, 28 May 2010, 01:07:18 am\n"
			        			+ "Saturday, 26 June 2010, 01:30:24 pm\n"
			        			+ "Monday, 26 July 2010, 03:36:36 am\n"
			        			+ "Tuesday, 24 August 2010, 07:04:36 pm\n"
			        			+ "Thursday, 23 September 2010, 11:17:12 am\n"
			        			+ "Saturday, 23 October 2010, 03:36:30 am\n"
			        			+ "Sunday, 21 November 2010, 06:27:24 pm\n"
			        			+ "Tuesday, 21 December 2010, 09:13:30 am [**]");
			        	break;
			        case 2011:
			        	strV0TextBox.setText("Wednesday, 19 January 2011, 10:21:24 pm\n"
			        			+ "Friday, 18 February 2011, 09:35:42 am\n"
			        			+ "Saturday, 19 March 2011, 07:10:06 pm\n"
			        			+ "Monday, 18 April 2011, 04:44:00 am\n"
			        			+ "Tuesday, 17 May 2011, 01:08:42 pm\n"
			        			+ "Wednesday, 15 June 2011, 10:13:36 pm [**]\n"
			        			+ "Friday, 15 July 2011, 08:39:36 am\n"
			        			+ "Saturday, 13 August 2011, 08:57:30 pm\n"
			        			+ "Monday, 12 September 2011, 11:26:42 am\n"
			        			+ "Wednesday, 12 October 2011, 04:05:42 am\n"
			        			+ "Thursday, 10 November 2011, 09:16:06 pm\n"
			        			+ "Saturday, 10 December 2011, 03:36:24 pm [**]");
			        	break;
			        case 2012:
			        	strV0TextBox.setText("Monday, 9 January 2012, 08:30:06 am\n"
			        			+ "Tuesday, 7 February 2012, 10:53:48 pm\n"
			        			+ "Thursday, 8 March 2012, 10:39:30 am\n"
			        			+ "Friday, 6 April 2012, 09:18:42 pm\n"
			        			+ "Sunday, 6 May 2012, 05:35:06 am\n"
			        			+ "Monday, 4 June 2012, 01:11:36 pm [*]\n"
			        			+ "Tuesday, 3 July 2012, 08:51:54 pm\n"
			        			+ "Thursday, 2 August 2012, 05:27:30 am\n"
			        			+ "Friday, 31 August 2012, 03:58:06 pm\n"
			        			+ "Sunday, 30 September 2012, 05:18:36 am\n"
			        			+ "Monday, 29 October 2012, 08:49:30 pm\n"
			        			+ "Wednesday, 28 November 2012, 03:46:00 pm\n"
			        			+ "Friday, 28 December 2012, 11:21:12 am\n"
			        			+ "\n"
			        			+ "");
			        	break;
			        case 2013:
			        	strV0TextBox.setText("Sunday, 27 January 2013, 05:38:24 am\n"
			        			+ "Monday, 25 February 2013, 09:26:06 pm\n"
			        			+ "Wednesday, 27 March 2013, 10:27:18 am\n"
			        			+ "Thursday, 25 April 2013, 09:57:06 pm [*]\n"
			        			+ "Saturday, 25 May 2013, 06:25:00 am\n"
			        			+ "Sunday, 23 June 2013, 01:32:18 pm\n"
			        			+ "Monday, 22 July 2013, 08:15:36 pm\n"
			        			+ "Wednesday, 21 August 2013, 03:44:36 am\n"
			        			+ "Thursday, 19 September 2013, 01:12:54 pm\n"
			        			+ "Saturday, 19 October 2013, 01:37:42 am\n"
			        			+ "Sunday, 17 November 2013, 04:15:48 pm\n"
			        			+ "Tuesday, 17 December 2013, 10:28:06 am");
			        	break;
			        case 2014:
			        	strV0TextBox.setText("Thursday, 16 January 2014, 05:52:12 am\n"
			        			+ "Saturday, 15 February 2014, 12:53:00 am\n"
			        			+ "Sunday, 16 March 2014, 06:08:24 pm\n"
			        			+ "Tuesday, 15 April 2014, 09:42:18 am [**]\n"
			        			+ "Wednesday, 14 May 2014, 09:15:54 pm\n"
			        			+ "Friday, 13 June 2014, 06:11:30 am\n"
			        			+ "Saturday, 12 July 2014, 01:24:54 pm\n"
			        			+ "Sunday, 10 August 2014, 08:09:24 pm\n"
			        			+ "Tuesday, 9 September 2014, 03:38:12 am\n"
			        			+ "Wednesday, 8 October 2014, 12:50:36 pm [**]\n"
			        			+ "Thursday, 6 November 2014, 11:22:54 pm\n"
			        			+ "Saturday, 6 December 2014, 01:26:48 pm");
			        	break;
			        case 2015:
			        	strV0TextBox.setText("Monday, 5th January 2015, 05:53:15 am\n"
			        			+ "Wednesday, 4th February 2015, 12:08:55 am\n"
			        			+ "Thursday, 5th March 2015, 07:05:23 pm\n"
			        			+ "Saturday, 4th April 2015, 02:05:34 pm [**]\n"
			        			+ "Monday, 4th May 2015, 05:42:05 am\n"
			        			+ "Tuesday, 2nd June 2015, 06:19:02 pm\n"
			        			+ "Thursday, 2nd July 2015, 04:19:35 am\n"
			        			+ "Friday, 31st July 2015, 12:42:54 pm\n"
			        			+ "Saturday, 29th August 2015, 08:35:12 pm\n"
			        			+ "Monday, 28th September 2015, 04:50:31 am [**]\n"
			        			+ "Tuesday, 27th October 2015, 01:05:08 pm\n"
			        			+ "Wednesday, 25th November 2015, 11:44:15 pm\n"
			        			+ "Friday, 25th December 2015, 12:11:28 pm");
			        	break;
			        case 2016:
			        	strV0TextBox.setText("Sunday, 24th January 2016, 02:45:48 am\n"
			        			+ "Monday, 22nd February 2016, 07:19:54 pm\n"
			        			+ "Wednesday, 23rd March 2016, 01:00:54 pm\n"
			        			+ "Friday, 22th April 2016, 07:23:42 am\n"
			        			+ "Saturday, 21st May 2016, 11:14:30 pm\n"
			        			+ "Monday, 20th June 2016, 01:02:24 pm\n"
			        			+ "Wednesday, 20th July 2016, 12:56:36 am\n"
			        			+ "Thursday, 18th August 2016, 11:26:36 am\n"
			        			+ "Friday, 16th September 2016, 09:05:06 pm\n"
			        			+ "Sunday, 16th October 2016, 06:23:06 am\n"
			        			+ "Monday, 14th November 2016, 02:52:06 pm  //  DJIA: ^\n"
			        			+ "Wednesday, 14th December 2016, 01:05:36 am  //  DJIA: v");
			        	break;
			        case 2017:
			        	strV0TextBox.setText("Thursday, 12 January 2017, 12:33:58 pm  //  DJIA: ^\n"
			        			+ "Saturday, 11 February 2017, 01:32:53 am  //  DJIA: ?\n"
			        			+ "Sunday, 12 March 2017, 03:53:48 pm  //  DJIA: ?\n"
			        			+ "Tuesday, 11 April 2017, 08:08:07 am  //  DJIA: v\n"
			        			+ "Wednesday, 10 May 2017, 11:42:30 pm  //  DJIA: ^\n"
			        			+ "Friday, 9 June 2017, 03:09:36 pm  //  DJIA: ^\n"
			        			+ "Sunday, 9 July 2017, 06:06:34 am  //  DJIA: ?\n"
			        			+ "Monday, 7 August 2017, 08:10:37 pm  //  DJIA: ^\n"
			        			+ "Wednesday, 6 September 2017, 09:02:49 am  //  DJIA: ^\n"
			        			+ "Thursday, 5 October 2017, 08:40:08 pm  //  DJIA: ^\n"
			        			+ "Saturday, 4 November 2017, 06:22:55 am  //  DJIA: ?\n"
			        			+ "Sunday, 3 December 2017, 04:46:59 pm  //  DJIA: ?");
			        	break;
			        case 2018:
			        	strV0TextBox.setText("Tuesday, 2 January 2018, 3:24:05 am pm  //  DJIA: ^\n"
			        			+ "Wednesday, 31 January 2018, 2:26:44 pm  //  DJIA: ^\n"
			        			+ "Friday, 2 March 2018, 1:51:21 am  //  DJIA: v\n"
			        			+ "Saturday, 31 March 2018, 2:36:52 pm  //  DJIA: v\n"
			        			+ "Monday, 30 April 2018, 2:58:12 am  //  DJIA: ?\n"
			        			+ "Tuesday, 29 May 2018, 4:19:34 pm  //  DJIA: ^\n"
			        			+ "Thursday, 28 June 2018, 6:52:58 am  //  DJIA: ^\n"
			        			+ "Friday, 27 July 2018, 10:20:21 pm  //  DJIA: v\n"
			        			+ "Sunday, 26 August 2018, 1:56:11 pm  //  DJIA: ?\n"
			        			+ "Tuesday, 25 September 2018, 4:52:25 am  //  DJIA: v\n"
			        			+ "Wednesday, 24 October 2018, 6:45:12 pm  //  DJIA: v\n"
			        			+ "Friday, 23 November 2018, 6:39:12 am  //  DJIA: ^\n"
			        			+ "Saturday, 22 December 2018, 6:48:35 pm  //  DJIA: ?");
			        	break;
			        case 2019:
			        	strV0TextBox.setText("Monday, 21 January 2019, 6:16:05  //  DJIA: v\n"
			        			+ "Tuesday, 19 February 2019, 4:53:35 pm  //  DJIA: ^\n"
			        			+ "Thursday, 21 March 2019, 2:42:52 am  //  DJIA: ^\n"
			        			+ "Friday, 19 April 2019, 1:12:11 pm  //  DJIA: ?\n"
			        			+ "Saturday, 18 May 2019, 11:11:21 pm  //  DJIA: ?\n"
			        			+ "Monday, 17 June 2019, 10:30:40 am  //  DJIA: ^\n"
			        			+ "Tuesday, 16 July 2019, 11:38:13 pm  //  DJIA: v\n"
			        			+ "Thursday, 15 August 2019, 2:29:15 pm  //  DJIA: ^\n"
			        			+ "Saturday, 14 September 2019, 6:32:46 am  //  DJIA: ?\n"
			        			+ "Sunday, 13 October 2019, 11:07:52 pm  //  DJIA: ?\n"
			        			+ "Tuesday, 12 November 2019, 2:34:24 pm  //  DJIA: =\n"
			        			+ "Thursday, 12 December 2019, 6:12:16 am  //  DJIA: ^");
			        	break;
			        case 2020:
			        	strV0TextBox.setText("Friday, 10 January 2020, 8:21:18  //  DJIA: v\n"
			        			+ "Sunday, 9 February 2020, 8:33:17 am  //  DJIA: ?\n"
			        			+ "Monday, 9 March 2020, 6:47:44 pm  //  DJIA: v\n"
			        			+ "Wednesday, 8 April 2020, 4:35:05 am  //  DJIA: v\n"
			        			+ "Thursday, 7 May 2020, 12:45:13 pm  //  DJIA: ^\n"
			        			+ "Friday, 5 June 2020, 9:12:23 pm  //  DJIA: ^\n"
			        			+ "Sunday, 5 July 2020, 6:44:25 am  //  DJIA: ?\n"
			        			+ "Monday, 3 August 2020, 5:58:46 pm  //  DJIA: ^\n"
			        			+ "Wednesday, 2 September 2020, 07:22:04 am  //  DJIA: ^\n"
			        			+ "Thursday, 1 October 2020, 11:05:15 pm  //  DJIA: ^\n"
			        			+ "Saturday, 31 October 2020, 3:49:09 pm  //  DJIA: ?\n"
			        			+ "Monday, 30 November 2020, 10:29:41 am  //  DJIA: v\n"
			        			+ "Wednesday, 30 December 2020, 4:28:13 am  //  DJIA: ^");
			        	break;
			        case 2021:
			        	strV0TextBox.setText("Thursday * 28 January 2021 * 8:16:13 pm  //  DJIA: ^\n"
			        			+ "Saturday * 27 February 2021 * 9:17:19 am  //  DJIA: ?\n"
			        			+ "Sunday * 28 March 2021 * 8:48:10 pm  //  DJIA: ?\n"
			        			+ "Tuesday * 27 April 2021 * 5:31:32 am  //  DJIA: ^\n"
			        			+ "Wednesday * 26 May 2021 * 1:13:52 pm  //  DJIA: ^\n"
			        			+ "Thursday * 24 June 2021 * 8:39:41 pm  //  DJIA: ^\n"
			        			+ "Saturday * 24 July 2021 * 4:36:53 am  //  DJIA: ?\n"
			        			+ "Sunday * 22 August 2021 * 2:01:57 pm  //  DJIA: ^\n"
			        			+ "Tuesday * 21 September 2021 * 1:54:41 am  //  DJIA: v\n"
			        			+ "Wednesday * 20 October 2021 * 4:56:40 pm  //  DJIA: ^\n"
			        			+ "Friday * 19 November 2021 * 9:57:27 am  //  DJIA: ?\n"
			        			+ "Sunday * 19 December 2021 * 5:35:30 am  //  DJIA: ?");
			        	break;
			        case 2022:
			        	strV0TextBox.setText("Tuesday, 18 January 2022, 12:48:30 am\n"
			        			+ "Wednesday, 16 February 2022, 05:56:30 pm\n"
			        			+ "Friday, 18 March 2022, 08:17:36 am\n"
			        			+ "Saturday, 16 April 2022, 08:55:06 pm\n"
			        			+ "Monday, 16 May 2022, 06:14:12 am\n"
			        			+ "Tuesday, 14 June 2022, 01:51:48 pm\n"
			        			+ "Wednesday, 13 July 2022, 08:37:42 pm\n"
			        			+ "Friday, 12 August 2022, 03:35:48 am\n"
			        			+ "Saturday, 10 September 2022, 11:59:06 am\n"
			        			+ "Sunday, 9 October 2022, 10:55:00 pm\n"
			        			+ "Tuesday, 8 November 2022, 12:02:12 pm\n"
			        			+ "Thursday, 8 December 2022, 05:08:12 am");
			        	break;
			        case 2023:
			        	strV0TextBox.setText("Saturday, 7 January 2023, 12:07:54 am\n"
			        			+ "Sunday, 5 February 2023, 07:28:36 pm\n"
			        			+ "Tuesday, 7 March 2023, 01:40:24 pm\n"
			        			+ "Thursday, 6 April 2023, 06:34:36 am\n"
			        			+ "Friday, 5 May 2023, 07:34:06 pm\n"
			        			+ "Sunday, 4 June 2023, 05:41:48 am\n"
			        			+ "Monday, 3 July 2023, 01:38:42 pm\n"
			        			+ "Tuesday, 1 August 2023, 08:31:42 pm\n"
			        			+ "Thursday, 31 August 2023, 03:35:42 am\n"
			        			+ "Friday, 29 September 2023, 11:57:36 am\n"
			        			+ "Saturday, 28 October 2023, 10:24:06 pm\n"
			        			+ "Monday, 27 November 2023, 10:16:24 am\n"
			        			+ "Wednesday, 27 December 2023, 01:33:12 am");
			        	break;
			        case 2024:
			        	strV0TextBox.setText("Thursday, 25 January 2024, 06:54:00 pm\n"
			        			+ "Saturday, 24 February 2024, 01:30:24 pm\n"
			        			+ "Monday, 25 March 2024, 08:00:24 am\n"
			        			+ "Wednesday, 24 April 2024, 01:49:00 am\n"
			        			+ "Thursday, 23 May 2024, 03:53:12 pm\n"
			        			+ "Saturday, 22 June 2024, 03:07:54 am\n"
			        			+ "Sunday, 21 July 2024, 12:17:12 pm\n"
			        			+ "Monday, 19 August 2024, 08:25:48 pm\n"
			        			+ "Wednesday, 18 September 2024, 04:34:30 am\n"
			        			+ "Thursday, 17 October 2024, 01:26:24 pm\n"
			        			+ "Friday, 15 November 2024, 10:28:36 pm\n"
			        			+ "Sunday, 15 December 2024, 10:01:42 am\n"
			        			+ "");
			        	break;
			        case 2025:
			        	strV0TextBox.setText("Monday, 13 January 2025, 11:26:54 pm\n"
			        			+ "Wednesday, 12 February 2025, 02:53:24 pm\n"
			        			+ "Friday, 14 March 2025, 07:54:42 am\n"
			        			+ "Sunday, 13 April 2025, 02:22:18 am\n"
			        			+ "Monday, 12 May 2025, 06:56:00 pm\n"
			        			+ "Wednesday, 11 June 2025, 09:43:54 am\n"
			        			+ "Thursday, 10 July 2025, 10:36:48 pm\n"
			        			+ "Saturday, 9 August 2025, 09:55:06 am\n"
			        			+ "Sunday, 7 September 2025, 08:08:54 pm\n"
			        			+ "Tuesday, 7 October 2025, 05:47:42 am\n"
			        			+ "Wednesday, 5 November 2025, 02:19:18 pm\n"
			        			+ "Friday, 5 December 2025, 12:14:06 am");
			        	break;
			        case 2026:
			        	strV0TextBox.setText("Saturday, 3 January 2026, 11:02:54 am\n"
			        			+ "Sunday, 1 February 2026, 11:09:18 pm\n"
			        			+ "Tuesday, 3 March 2026, 12:37:54 pm\n"
			        			+ "Thursday, 2 April 2026, 04:12:00 am\n"
			        			+ "Friday, 1 May 2026, 07:23:12 pm\n"
			        			+ "Sunday, 31 May 2026, 10:45:12 am\n"
			        			+ "Tuesday, 30 June 2026, 01:56:42 am\n"
			        			+ "Wednesday, 29 July 2026, 04:35:42 pm\n"
			        			+ "Friday, 28 August 2026, 06:18:36 am\n"
			        			+ "Saturday, 26 September 2026, 06:49:06 pm\n"
			        			+ "Monday, 26 October 2026, 05:11:54 am\n"
			        			+ "Tuesday, 24 November 2026, 03:53:36 pm\n"
			        			+ "Thursday, 24 December 2026, 02:28:18 am");
			        	break;
			        case 2027:
			        	strV0TextBox.setText("Friday, 22 January 2027, 01:17:24 pm\n"
			        			+ "Sunday, 21 February 2027, 12:23:42 am\n"
			        			+ "Monday, 22 March 2027, 11:43:48 am\n"
			        			+ "Wednesday, 21 April 2027, 12:27:12 am\n"
			        			+ "Thursday, 20 May 2027, 12:59:06 pm\n"
			        			+ "Saturday, 19 June 2027, 02:44:24 am\n"
			        			+ "Sunday, 18 July 2027, 05:45:00 pm\n"
			        			+ "Tuesday, 17 August 2027, 09:28:42 am\n"
			        			+ "Thursday, 16 September 2027, 01:03:36 am\n"
			        			+ "Friday, 15 October 2027, 03:47:06 pm\n"
			        			+ "Sunday, 14 November 2027, 04:26:00 am\n"
			        			+ "Monday, 13 December 2027, 05:08:48 pm");
			        	break;
			        case 2028:
			        	strV0TextBox.setText("Wednesday, 12 January 2028, 05:03:06 am\n"
			        			+ "Thursday, 10 February 2028, 04:03:48 pm\n"
			        			+ "Saturday, 11 March 2028, 02:06:06 am\n"
			        			+ "Sunday, 9 April 2028, 12:26:42 pm\n"
			        			+ "Monday, 8 May 2028, 09:49:00 pm\n"
			        			+ "Wednesday, 7 June 2028, 08:08:48 am\n"
			        			+ "Thursday, 6 July 2028, 08:10:48 pm\n"
			        			+ "Saturday, 5 August 2028, 10:09:54 am\n"
			        			+ "Monday, 4 September 2028, 01:47:36 am\n"
			        			+ "Tuesday, 3 October 2028, 06:25:00 pm\n"
			        			+ "Thursday, 2 November 2028, 10:17:24 am\n"
			        			+ "Saturday, 2 December 2028, 02:40:18 am\n"
			        			+ "Sunday, 31 December 2028, 05:48:36 pm");
			        	break;
			        case 2029:
			        	strV0TextBox.setText("Tuesday, 30 January 2029, 07:03:42 am\n"
			        			+ "Wednesday, 28 February 2029, 06:10:18 pm\n"
			        			+ "Friday, 30 March 2029, 04:26:30 am\n"
			        			+ "Saturday, 28 April 2029, 12:36:48 pm\n"
			        			+ "Sunday, 27 May 2029, 08:37:30 pm\n"
			        			+ "Tuesday, 26 June 2029, 05:22:24 am\n"
			        			+ "Wednesday, 25 July 2029, 03:35:48 pm\n"
			        			+ "Friday, 24 August 2029, 03:51:18 am\n"
			        			+ "Saturday, 22 September 2029, 06:29:18 pm\n"
			        			+ "Monday, 22 October 2029, 11:27:36 am\n"
			        			+ "Wednesday, 21 November 2029, 05:03:00 am\n"
			        			+ "Thursday, 20 December 2029, 11:46:30 pm");
			        	break;
			        case 2030:
			        	strV0TextBox.setText("Saturday, 19 January 2030, 04:54:24 pm\n"
				        		+ "Monday, 18 February 2030, 07:19:48 am\n"
				        		+ "Tuesday, 19 March 2030, 06:56:30 pm\n"
				        		+ "Thursday, 18 April 2030, 05:20:06 am\n"
				        		+ "Friday, 17 May 2030, 01:19:12 pm\n"
				        		+ "Saturday, 15 June 2030, 08:41:00 pm\n"
				        		+ "Monday, 15 July 2030, 04:12:00 am\n"
				        		+ "Tuesday, 13 August 2030, 12:44:24 pm\n"
				        		+ "Wednesday, 11 September 2030, 11:18:00 pm\n"
				        		+ "Friday, 11 October 2030, 12:46:54 pm\n"
				        		+ "Sunday, 10 November 2030, 04:30:18 am\n"
				        		+ "Monday, 9 December 2030, 11:40:30 pm");
				        break;
			        case 2031:
			        	strV0TextBox.setText("Wednesday, 8 January 2031, 07:25:54 pm\n"
				        		+ "Friday, 7 February 2031, 01:46:12 pm\n"
				        		+ "Sunday, 9 March 2031, 05:29:42 am\n"
				        		+ "Monday, 7 April 2031, 07:21:24 pm\n"
				        		+ "Wednesday, 7 May 2031, 05:39:54 am\n"
				        		+ "Thursday, 5 June 2031, 01:58:36 pm\n"
				        		+ "Friday, 4 July 2031, 09:01:24 pm\n"
				        		+ "Sunday, 3 August 2031, 03:45:36 am\n"
				        		+ "Monday, 1 September 2031, 11:20:30 am\n"
				        		+ "Tuesday, 30 September 2031, 08:57:54 pm\n"
				        		+ "Thursday, 30 October 2031, 08:32:42 am\n"
				        		+ "Saturday, 29 November 2031, 12:18:30 am\n"
				        		+ "Sunday, 28 December 2031, 06:33:06 pm");
				        break;
			        case 2032:
			        	strV0TextBox.setText("Tuesday, 27 January 2032, 01:52:30 pm\n"
				        		+ "Thursday, 26 February 2032, 08:43:18 am\n"
				        		+ "Saturday, 27 March 2032, 01:46:18 am\n"
				        		+ "Sunday, 25 April 2032, 05:09:42 pm\n"
				        		+ "Tuesday, 25 May 2032, 04:37:18 am\n"
				        		+ "Wednesday, 23 June 2032, 01:32:36 pm\n"
				        		+ "Thursday, 22 July 2032, 08:51:36 pm\n"
				        		+ "Saturday, 21 August 2032, 03:46:54 am\n"
				        		+ "Sunday, 19 September 2032, 11:30:18 am\n"
				        		+ "Monday, 18 October 2032, 08:58:12 pm\n"
				        		+ "Wednesday, 17 November 2032, 07:42:06 am\n"
				        		+ "Thursday, 16 December 2032, 09:49:00 pm");
				        break;
			        case 2033:
			        	strV0TextBox.setText("Saturday, 15 January 2033, 02:07:06 pm\n"
				        		+ "Monday, 14 February 2033, 08:04:12 am\n"
				        		+ "Wednesday, 16 March 2033, 02:37:30 am\n"
				        		+ "Thursday, 14 April 2033, 09:17:24 pm\n"
				        		+ "Saturday, 14 May 2033, 12:42:48 pm\n"
				        		+ "Monday, 13 June 2033, 01:19:18 am\n"
				        		+ "Tuesday, 12 July 2033, 11:28:36 am\n"
				        		+ "Wednesday, 10 August 2033, 08:07:42 pm\n"
				        		+ "Friday, 9 September 2033, 04:20:36 am\n"
				        		+ "Saturday, 8 October 2033, 12:58:12 pm\n"
				        		+ "Sunday, 6 November 2033, 09:32:06 pm\n"
				        		+ "Tuesday, 6 December 2033, 08:22:06 am");
				        break;
			        case 2034:
			        	strV0TextBox.setText("Wednesday, 4 January 2034, 08:47:06 pm\n"
				        		+ "Friday, 3 February 2034, 11:04:36 am\n"
				        		+ "Sunday, 5 March 2034, 03:10:12 am\n"
				        		+ "Monday, 3 April 2034, 09:18:54 pm\n"
				        		+ "Wednesday, 3 May 2034, 02:15:48 pm\n"
				        		+ "Friday, 2 June 2034, 05:54:06 am\n"
				        		+ "Saturday, 1 July 2034, 07:44:36 pm\n"
				        		+ "Monday, 31 July 2034, 07:54:30 am\n"
				        		+ "Tuesday, 29 August 2034, 06:49:18 pm\n"
				        		+ "Thursday, 28 September 2034, 04:56:54 am\n"
				        		+ "Friday, 27 October 2034, 02:42:36 pm\n"
				        		+ "Saturday, 25 November 2034, 11:32:12 pm\n"
				        		+ "Monday, 25 December 2034, 09:54:30 am");
				        break;
			        case 2035:
			        	strV0TextBox.setText("Tuesday, 23 January 2035, 09:16:36 pm\n"
				        		+ "Thursday, 22 February 2035, 09:54:00 am\n"
				        		+ "Friday, 23 March 2035, 11:42:12 pm\n"
				        		+ "Sunday, 22 April 2035, 03:20:48 pm\n"
				        		+ "Tuesday, 22 May 2035, 06:25:54 am\n"
				        		+ "Wednesday, 20 June 2035, 09:37:30 pm\n"
				        		+ "Friday, 20 July 2035, 12:36:54 pm\n"
				        		+ "Sunday, 19 August 2035, 03:00:24 am\n"
				        		+ "Monday, 17 September 2035, 04:23:36 pm\n"
				        		+ "Wednesday, 17 October 2035, 04:35:36 am\n"
				        		+ "Thursday, 15 November 2035, 02:48:54 pm\n"
				        		+ "Saturday, 15 December 2035, 01:33:12 am");
				        break;
			        case 2036:
			        	strV0TextBox.setText("Sunday, 13 January 2036, 12:16:12 pm\n"
				        		+ "Monday, 11 February 2036, 11:08:48 pm\n"
				        		+ "Wednesday, 12 March 2036, 10:09:30 am\n"
				        		+ "Thursday, 10 April 2036, 10:22:36 pm\n"
				        		+ "Saturday, 10 May 2036, 10:09:36 am\n"
				        		+ "Sunday, 8 June 2036, 11:02:00 pm\n"
				        		+ "Tuesday, 8 July 2036, 01:19:24 pm\n"
				        		+ "Thursday, 7 August 2036, 04:49:00 am\n"
				        		+ "Friday, 5 September 2036, 08:45:36 pm\n"
				        		+ "Sunday, 5 October 2036, 12:15:12 pm\n"
				        		+ "Tuesday, 4 November 2036, 01:44:18 am\n"
				        		+ "Wednesday, 3 December 2036, 03:08:36 pm");
				        break;
			        case 2037:
			        	strV0TextBox.setText("Friday, 2 January 2037, 03:35:18 am\n"
				        		+ "Saturday, 31 January 2037, 03:04:12 pm\n"
				        		+ "Monday, 2 March 2037, 01:28:12 am\n"
				        		+ "Tuesday, 31 March 2037, 11:53:36 am\n"
				        		+ "Wednesday, 29 April 2037, 08:54:00 pm\n"
				        		+ "Friday, 29 May 2037, 06:24:12 am\n"
				        		+ "Saturday, 27 June 2037, 05:20:00 pm\n"
				        		+ "Monday, 27 July 2037, 06:15:12 am\n"
				        		+ "Tuesday, 25 August 2037, 09:09:24 pm\n"
				        		+ "Thursday, 24 September 2037, 01:31:48 pm\n"
				        		+ "Saturday, 24 October 2037, 06:36:36 am\n"
				        		+ "Sunday, 22 November 2037, 10:35:18 pm\n"
				        		+ "Tuesday, 22 December 2037, 02:38:42 pm");
				        break;
			        case 2038:
			        	strV0TextBox.setText("Thursday, 21 January 2038, 05:00:00 am\n"
				        		+ "Friday, 19 February 2038, 05:09:30 pm\n"
				        		+ "Sunday, 21 March 2038, 03:09:36 am\n"
				        		+ "Monday, 19 April 2038, 11:36:06 am\n"
				        		+ "Tuesday, 18 May 2038, 07:23:36 pm\n"
				        		+ "Thursday, 17 June 2038, 03:30:36 am\n"
				        		+ "Friday, 16 July 2038, 12:48:18 pm\n"
				        		+ "Saturday, 14 August 2038, 11:56:54 pm\n"
				        		+ "Monday, 13 September 2038, 01:24:30 pm\n"
				        		+ "Wednesday, 13 October 2038, 05:21:54 am\n"
				        		+ "Thursday, 11 November 2038, 11:27:12 pm\n"
				        		+ "Saturday, 11 December 2038, 06:30:30 pm");
				        break;
			        case 2039:
			        	strV0TextBox.setText("Monday, 10 January 2039, 12:45:36 pm\n"
				        		+ "Wednesday, 9 February 2039, 04:39:18 am\n"
				        		+ "Thursday, 10 March 2039, 05:35:00 pm\n"
				        		+ "Saturday, 9 April 2039, 03:52:48 am\n"
				        		+ "Sunday, 8 May 2039, 12:20:06 pm\n"
				        		+ "Monday, 6 June 2039, 07:47:42 pm\n"
				        		+ "Wednesday, 6 July 2039, 03:03:30 am\n"
				        		+ "Thursday, 4 August 2039, 10:56:42 am\n"
				        		+ "Friday, 2 September 2039, 08:23:36 pm\n"
				        		+ "Sunday, 2 October 2039, 08:23:18 am\n"
				        		+ "Monday, 31 October 2039, 11:36:18 pm\n"
				        		+ "Wednesday, 30 November 2039, 05:49:36 pm\n"
				        		+ "Friday, 30 December 2039, 01:37:48 pm");
				        break;
			        case 2040:
			        	strV0TextBox.setText("Sunday, 29 January 2040, 08:54:42 am\n"
				        		+ "Tuesday, 28 February 2040, 01:59:36 am\n"
				        		+ "Wednesday, 28 March 2040, 04:11:42 pm\n"
				        		+ "Friday, 27 April 2040, 03:37:54 am\n"
				        		+ "Saturday, 26 May 2040, 12:47:06 pm\n"
				        		+ "Sunday, 24 June 2040, 08:19:24 pm\n"
				        		+ "Tuesday, 24 July 2040, 03:05:42 am\n"
				        		+ "Wednesday, 22 August 2040, 10:09:42 am\n"
				        		+ "Thursday, 20 September 2040, 06:42:48 pm\n"
				        		+ "Saturday, 20 October 2040, 05:49:54 am\n"
				        		+ "Sunday, 18 November 2040, 08:06:12 pm\n"
				        		+ "Tuesday, 18 December 2040, 01:15:48 pm");
				        break;
			        case 2041:
			        	strV0TextBox.setText("Thursday, 17 January 2041, 08:11:24 am\n"
				        		+ "Saturday, 16 February 2041, 03:21:18 am\n"
				        		+ "Sunday, 17 March 2041, 09:19:12 pm\n"
				        		+ "Tuesday, 16 April 2041, 01:00:42 pm\n"
				        		+ "Thursday, 16 May 2041, 01:52:24 am\n"
				        		+ "Friday, 14 June 2041, 11:58:48 am\n"
				        		+ "Saturday, 13 July 2041, 08:00:54 pm\n"
				        		+ "Monday, 12 August 2041, 03:04:42 am\n"
				        		+ "Tuesday, 10 September 2041, 10:23:54 am\n"
				        		+ "Wednesday, 9 October 2041, 07:02:42 pm\n"
				        		+ "Friday, 8 November 2041, 05:43:30 am\n"
				        		+ "Saturday, 7 December 2041, 06:42:18 pm");
				        break;
			        case 2042:
			        	strV0TextBox.setText("Monday, 6 January 2042, 09:54:00 am\n"
				        		+ "Wednesday, 5 February 2042, 02:57:48 am\n"
				        		+ "Thursday, 6 March 2042, 09:10:00 pm\n"
				        		+ "Saturday, 5 April 2042, 03:16:00 pm\n"
				        		+ "Monday, 5 May 2042, 07:48:36 am\n"
				        		+ "Tuesday, 3 June 2042, 09:48:18 pm\n"
				        		+ "Thursday, 3 July 2042, 09:09:24 am\n"
				        		+ "Friday, 1 August 2042, 06:33:24 pm\n"
				        		+ "Sunday, 31 August 2042, 03:02:24 am\n"
				        		+ "Monday, 29 September 2042, 11:34:24 am\n"
				        		+ "Tuesday, 28 October 2042, 08:48:30 pm\n"
				        		+ "Thursday, 27 November 2042, 07:06:06 am\n"
				        		+ "Friday, 26 December 2042, 06:42:48 pm");
				        break;
			        case 2043:
			        	strV0TextBox.setText("Sunday, 25 January 2043, 07:56:42 am\n"
				        		+ "Monday, 23 February 2043, 10:58:00 pm\n"
				        		+ "Wednesday, 25 March 2043, 03:26:24 pm\n"
				        		+ "Friday, 24 April 2043, 08:23:06 am\n"
				        		+ "Sunday, 24 May 2043, 12:37:00 am\n"
				        		+ "Monday, 22 June 2043, 03:20:42 pm\n"
				        		+ "Wednesday, 22 July 2043, 04:24:18 am\n"
				        		+ "Thursday, 20 August 2043, 04:04:36 pm\n"
				        		+ "Saturday, 19 September 2043, 02:47:06 am\n"
				        		+ "Sunday, 18 October 2043, 12:55:48 pm\n"
				        		+ "Monday, 16 November 2043, 10:52:36 pm\n"
				        		+ "Wednesday, 16 December 2043, 09:02:06 am");
				        break;
			        case 2044:
			        	strV0TextBox.setText("Thursday, 14 January 2044, 07:51:12 pm\n"
				        		+ "Saturday, 13 February 2044, 07:41:48 am\n"
				        		+ "Sunday, 13 March 2044, 08:41:12 pm\n"
				        		+ "Tuesday, 12 April 2044, 10:39:12 am\n"
				        		+ "Thursday, 12 May 2044, 01:16:42 am\n"
				        		+ "Friday, 10 June 2044, 04:16:12 pm\n"
				        		+ "Sunday, 10 July 2044, 07:22:06 am\n"
				        		+ "Monday, 8 August 2044, 10:14:00 pm\n"
				        		+ "Wednesday, 7 September 2044, 12:24:30 pm\n"
				        		+ "Friday, 7 October 2044, 01:30:06 am\n"
				        		+ "Saturday, 5 November 2044, 01:26:48 pm\n"
				        		+ "Monday, 5 December 2044, 12:34:00 am");
				        break;
			        case 2045:
			        	strV0TextBox.setText("Tuesday, 3 January 2045, 11:20:30 am\n"
				        		+ "Wednesday, 1 February 2045, 10:05:36 pm\n"
				        		+ "Friday, 3 March 2045, 08:52:42 am\n"
				        		+ "Saturday, 1 April 2045, 07:43:06 pm\n"
				        		+ "Monday, 1 May 2045, 06:52:18 am\n"
				        		+ "Tuesday, 30 May 2045, 06:52:30 pm\n"
				        		+ "Thursday, 29 June 2045, 08:15:54 am\n"
				        		+ "Friday, 28 July 2045, 11:10:42 pm\n"
				        		+ "Sunday, 27 August 2045, 03:07:48 pm\n"
				        		+ "Tuesday, 26 September 2045, 07:11:36 am\n"
				        		+ "Wednesday, 25 October 2045, 10:31:18 pm\n"
				        		+ "Friday, 24 November 2045, 12:43:36 pm\n"
				        		+ "Sunday, 24 December 2045, 01:49:18 am");
				        break;
			        case 2046:
			        	strV0TextBox.setText("Monday, 22 January 2046, 01:51:24 pm\n"
				        		+ "Wednesday, 21 February 2046, 12:44:24 am\n"
				        		+ "Thursday, 22 March 2046, 10:27:00 am\n"
				        		+ "Friday, 20 April 2046, 07:21:12 pm\n"
				        		+ "Sunday, 20 May 2046, 04:15:24 am\n"
				        		+ "Monday, 18 June 2046, 02:10:06 pm\n"
				        		+ "Wednesday, 18 July 2046, 01:55:06 am\n"
				        		+ "Thursday, 16 August 2046, 03:50:12 pm\n"
				        		+ "Saturday, 15 September 2046, 07:39:30 am\n"
				        		+ "Monday, 15 October 2046, 12:41:24 am\n"
				        		+ "Tuesday, 13 November 2046, 06:04:30 pm\n"
				        		+ "Thursday, 13 December 2046, 10:55:30 am");
				        break;
			        case 2047:
			        	strV0TextBox.setText("Saturday, 12 January 2047, 02:21:24 am\n"
				        		+ "Sunday, 10 February 2047, 03:39:54 pm\n"
				        		+ "Tuesday, 12 March 2047, 02:37:06 am\n"
				        		+ "Wednesday, 10 April 2047, 11:35:24 am\n"
				        		+ "Thursday, 9 May 2047, 07:24:36 pm\n"
				        		+ "Saturday, 8 June 2047, 03:05:00 am\n"
				        		+ "Sunday, 7 July 2047, 11:33:54 am\n"
				        		+ "Monday, 5 August 2047, 09:38:36 pm\n"
				        		+ "Wednesday, 4 September 2047, 09:54:18 am\n"
				        		+ "Friday, 4 October 2047, 12:42:06 am\n"
				        		+ "Saturday, 2 November 2047, 05:58:12 pm\n"
				        		+ "Monday, 2 December 2047, 12:55:12 pm\n"
				        		+ "");
				        break;
			        case 2048:
			        	strV0TextBox.setText("Wednesday, 1 January 2048, 07:57:12 am\n"
				        		+ "Friday, 31 January 2048, 01:14:24 am\n"
				        		+ "Saturday, 29 February 2048, 03:38:12 pm\n"
				        		+ "Monday, 30 March 2048, 03:04:30 am\n"
				        		+ "Tuesday, 28 April 2048, 12:13:00 pm\n"
				        		+ "Wednesday, 27 May 2048, 07:57:18 pm\n"
				        		+ "Friday, 26 June 2048, 03:08:12 am\n"
				        		+ "Saturday, 25 July 2048, 10:34:00 am\n"
				        		+ "Sunday, 23 August 2048, 07:07:12 pm\n"
				        		+ "Tuesday, 22 September 2048, 05:46:36 am\n"
				        		+ "Wednesday, 21 October 2048, 07:25:00 pm\n"
				        		+ "Friday, 20 November 2048, 12:19:36 pm\n"
				        		+ "Sunday, 20 December 2048, 07:39:18 am");
				        break;
			        case 2049:
			        	strV0TextBox.setText("Tuesday, 19 January 2049, 03:29:12 am\n"
				        		+ "Wednesday, 17 February 2049, 09:47:30 pm\n"
				        		+ "Friday, 19 March 2049, 01:23:24 pm\n"
				        		+ "Sunday, 18 April 2049, 02:04:48 am\n"
				        		+ "Monday, 17 May 2049, 12:13:48 pm\n"
				        		+ "Tuesday, 15 June 2049, 08:26:54 pm\n"
				        		+ "Thursday, 15 July 2049, 03:29:42 am\n"
				        		+ "Friday, 13 August 2049, 10:19:36 am\n"
				        		+ "Saturday, 11 September 2049, 06:04:24 pm\n"
				        		+ "Monday, 11 October 2049, 03:53:18 am\n"
				        		+ "Tuesday, 9 November 2049, 04:38:00 pm\n"
				        		+ "Thursday, 9 December 2049, 08:28:06 am");
				        break;
			        case 2050:
			        	strV0TextBox.setText("Saturday, 8 January 2050, 02:39:06 am\n"
				        		+ "Sunday, 6 February 2050, 09:47:30 pm\n"
				        		+ "Tuesday, 8 March 2050, 04:23:18 pm\n"
				        		+ "Thursday, 7 April 2050, 09:12:12 am\n"
				        		+ "Friday, 6 May 2050, 11:26:12 pm\n"
				        		+ "Sunday, 5 June 2050, 10:51:12 am\n"
				        		+ "Monday, 4 July 2050, 07:51:00 pm\n"
				        		+ "Wednesday, 3 August 2050, 03:20:30 am\n"
				        		+ "Thursday, 1 September 2050, 10:30:54 am\n"
				        		+ "Friday, 30 September 2050, 06:31:48 pm\n"
				        		+ "Sunday, 30 October 2050, 04:16:00 am\n"
				        		+ "Monday, 28 November 2050, 04:09:48 pm\n"
				        		+ "Wednesday, 28 December 2050, 06:15:36 am");
				        break;		        	
				}		        
		    }});		
		}
	}