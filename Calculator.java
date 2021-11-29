import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

/**
 * 
 * 
 * @author tanvirakhtershakib
 *
 *
 */

public class Calculator   {

	JFrame myframe= new JFrame("Calculator");
	JTextArea mytext=new JTextArea();
	String stringno1="";
	String stringno2="";
	String [] statement;
	int number1=0;
	int number2=0;
	String stringTotal="";
	int totalvalue=0;

	JButton button0=new JButton("0");
	JButton button1=new JButton("1");
	JButton button2=new JButton("2");
	JButton button3=new JButton("3");
	JButton button4=new JButton("4");
	JButton button5=new JButton("5");
	JButton button6=new JButton("6");
	JButton button7=new JButton("7");
	JButton button8=new JButton("8");
	JButton button9=new JButton("9");

	JButton buttonEqual=new JButton("=");
	JButton buttonDivide=new JButton("/");
	JButton buttonMult=new JButton("*");
	JButton buttonAdd=new JButton("+");
	JButton buttonSubt=new JButton("-");
	JButton buttonClear=new JButton("C");
	JButton buttonMemories=new JButton("Save");          
	JButton call=new JButton("Recall");


	public Calculator()
	{

		myframe.setSize(340,470);
		myframe.setVisible(true);
		myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myframe.setLayout(null);
		mytext.setSize(310, 50);
		mytext.setLocation(5, 5);



		button0.setSize(230, 50);
		button0.setLocation(5, 310);
		button0.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0){

				mytext.append("0");

			}

		});



		button1.setSize(70, 50);
		button1.setLocation(5, 250);
		button1.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0)
			{
				mytext.append("1");
			}

		});

		button2.setSize(70, 50);
		button2.setLocation(85, 250);
		button2.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0){

				mytext.append("2");

			}

		});



		button3.setSize(70, 50);
		button3.setLocation(165, 250);
		button3.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0)
			{
				mytext.append("3");
			}

		});



		button4.setSize(70, 50);
		button4.setLocation(5, 190);
		button4.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0)
			{
				mytext.append("4");
			}

		});



		button5.setSize(70, 50);
		button5.setLocation(85, 190);
		button5.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0)
			{
				mytext.append("5");
			}

		});

		button6.setSize(70, 50);
		button6.setLocation(165, 190);
		button6.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0){

				mytext.append("6");

			}

		});


		button7.setSize(70, 50);
		button7.setLocation(5, 130);
		button7.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0)
			{
				mytext.append("7");
			}

		});

		button8.setSize(70, 50);
		button8.setLocation(85, 130);
		button8.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0)
			{
				mytext.append("8");
			}

		});

		button9.setSize(70, 50);
		button9.setLocation(165, 130);
		button9.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0)
			{
				mytext.append("9");
			}

		});



		buttonDivide.setSize(70, 50);
		buttonDivide.setLocation(245, 130);
		buttonDivide.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0)
			{
				mytext.append("/");
			}

		});


		buttonMult.setSize(70, 50);
		buttonMult.setLocation(245, 190);
		buttonMult.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0)
			{
				mytext.append("*");
			}

		});



		buttonAdd.setSize(70, 50);
		buttonAdd.setLocation(245, 250);
		buttonAdd.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0)
			{
				mytext.append("+");
			}

		});



		buttonSubt.setSize(70, 50);
		buttonSubt.setLocation(245, 310);
		buttonSubt.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0)
			{
				mytext.append("-");
			}

		});


		buttonClear.setActionCommand("clear");
		buttonClear.setSize(70, 50);
		buttonClear.setLocation(245, 70);
		buttonClear.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0){

				if (arg0.getActionCommand().equals("clear"))

				{
					mytext.setText("");
				}
			}

		});



		buttonMemories.setSize(110,50);
		buttonMemories.setLocation(125,70);
		buttonMemories.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0){

				BufferedWriter bw = null;

				try {
					File file = new File("/Users/tanvirakhtershakib/Desktop/Calmem/recall.txt");
					FileWriter fw = new FileWriter(file);
					bw = new BufferedWriter(fw);
					bw.write(mytext.getText());
					bw.newLine();
					System.out.println("Memory saved Successfully");
				}

				catch (IOException ioe)
				{
					ioe.printStackTrace();
				}

				finally
				{
					try{
						if(bw!=null)
							bw.close();
					}

					catch(Exception ex)
					{
						System.out.println("Error in closing the BufferedWriter"+ex);
					}
				}
			}
		});



		call.setSize(110,50);
		call.setLocation(5,70);
		call.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0){
				{
					try
					{
						BufferedReader in = new BufferedReader(new FileReader(new File("/Users/tanvirakhtershakib/Desktop/Calmem/recall.txt")));
						System.out.println("Memory showing");
						int line = 0;

						for (String x = in.readLine(); x != null; x = in.readLine())
						{
							line++;
							mytext.setText(x);;
						}

					}

					catch (IOException e)
					{
						System.out.println("File I/O error!");
					} 
				}
			} });


		buttonEqual.setSize(310, 50);
		buttonEqual.setLocation(5, 370);
		buttonEqual.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0)
			{
				if(mytext.getText().contains("+"))
				{
					statement=mytext.getText().split("\\+");
					stringno1=statement[0];
					stringno2=statement[1];
					number1=Integer.parseInt(stringno1);
					number2=Integer.parseInt(stringno2);
					totalvalue=number1+number2;
					stringTotal=Integer.toString(totalvalue);
					mytext.setText(stringTotal);                                           
				}

				else if(mytext.getText().contains("-"))
				{
					statement=mytext.getText().split("\\-");
					stringno1=statement[0];
					stringno2=statement[1];
					number1=Integer.parseInt(stringno1);
					number2=Integer.parseInt(stringno2);
					totalvalue=number1-number2;
					stringTotal=Integer.toString(totalvalue);
					mytext.setText(stringTotal);
				}

				else if(mytext.getText().contains("*"))

				{
					statement=mytext.getText().split("\\*");
					stringno1=statement[0];
					stringno2=statement[1];                       
					number1=Integer.parseInt(stringno1);
					number2=Integer.parseInt(stringno2);             
					totalvalue=number1*number2;
					stringTotal=Integer.toString(totalvalue);
					mytext.setText(stringTotal);
				}

				else if(mytext.getText().contains("/"))

				{

					statement=mytext.getText().split("\\/");
					stringno1=statement[0];
					stringno2=statement[1];
					number1=Integer.parseInt(stringno1);
					number2=Integer.parseInt(stringno2);
					totalvalue=number1/number2;
					stringTotal=Integer.toString(totalvalue);
					mytext.setText(stringTotal);
				}
			}
		});


		myframe.add(mytext);
		myframe.add(button0);
		myframe.add(button1);
		myframe.add(button2);
		myframe.add(button3);
		myframe.add(button4);
		myframe.add(button5);
		myframe.add(button6);
		myframe.add(button7);
		myframe.add(button8);
		myframe.add(button9);
		myframe.add(buttonDivide);
		myframe.add(buttonMult);
		myframe.add(buttonSubt);
		myframe.add(buttonAdd);
		myframe.add(buttonEqual);
		myframe.add(buttonClear);
		myframe.add(buttonMemories);
		myframe.add(call);

	}

	public static void main(String[] args)
	{
		new Calculator();
	}



}
