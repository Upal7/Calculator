package Calc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import org.mariuszgromada.math.mxparser.*;

class Calculator
{
	static JFrame frame;
	static JPanel buttonPanel;
	static JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bplus,bminus,bmul,bdiv,beq,bCE,bBs;
	static JTextField output;

	static String data="", result="";
	
	Calculator()
	{
		
		License.iConfirmNonCommercialUse("Upal Chattopadhyay"); //method to omit Warning along with a signature and to confirm the usage of the open source parser in a Non-Commercial manner
		
		frame=new JFrame("Calculator");
		frame.setSize(400,700);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		decorate();
		frame.setVisible(true);
		clicking();
	}

	public static void main(String args[])
	{
		new Calculator();
	}

	static void clicking()
	{
            try
            {
		b0.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
                                if(data.length()==1 && data.charAt(0)=='0' )
                                {
                                }
                                else
                                {
                                    data=data+"0";
                                    output.setText(data);
                                }
			}
		});

		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(data.length()==1 && data.charAt(0)=='0')	
					data="1";
				else
					data=data+"1";
				output.setText(data);
			}
		});

		b2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(data.length()==1 && data.charAt(0)=='0')	
					data="2";
				else
					data=data+"2";
				output.setText(data);
			}
		});

		b3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(data.length()==1 && data.charAt(0)=='0')	
					data="3";
				else
					data=data+"3";
				output.setText(data);
			}
		});

		b4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(data.length()==1 && data.charAt(0)=='0')	
					data="4";
				else
					data=data+"4";
				output.setText(data);
			}
		});

		b5.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(data.length()==1 && data.charAt(0)=='0')	
					data="5";
				else
					data=data+"5";
				output.setText(data);
			}
		});

		b6.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(data.length()==1 && data.charAt(0)=='0')	
					data="6";
				else
					data=data+"6";
				output.setText(data);
			}
		});

		b7.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(data.length()==1 && data.charAt(0)=='0')	
					data="7";
				else
					data=data+"7";
				output.setText(data);
			}
		});

		b8.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(data.length()==1 && data.charAt(0)=='0')	
					data="8";
				else
					data=data+"8";
				output.setText(data);
			}
		});

		b9.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(data.length()==1 && data.charAt(0)=='0')	
					data="9";
				else
					data=data+"9";
				output.setText(data);
			}
		});

		bplus.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
                                if(data.length()==0)
                                {
                                }
                                else if(data.charAt(data.length()-1)=='-' || data.charAt(data.length()-1)=='*' || data.charAt(data.length()-1)=='/' || data.charAt(data.length()-1)=='+')
                                {
                                    data=data.substring(0,data.length()-1);
                                    data=data+"+";
                                }
                                else
                                    data=data+"+";
                                
                                output.setText(data);
			}
		});

		bminus.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
                                if(data.length()==0)
                                {
                                }
                                else if(data.charAt(data.length()-1)=='+' || data.charAt(data.length()-1)=='*' || data.charAt(data.length()-1)=='/' || data.charAt(data.length()-1)=='-')
                                {
                                    data=data.substring(0,data.length()-1);
                                    data=data+"-";
                                }
                                else
                                    data=data+"-";
                                
                                output.setText(data);
			}
		});

		bmul.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
                                if(data.length()==0)
                                {
                                }
                                else if(data.charAt(data.length()-1)=='-' || data.charAt(data.length()-1)=='+' || data.charAt(data.length()-1)=='/' || data.charAt(data.length()-1)=='*')
                                {
                                    data=data.substring(0,data.length()-1);
                                    data=data+"*";
                                }
                                else
                                    data=data+"*";
                                
                              output.setText(data);
			}
		});

		bdiv.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
                                if(data.length()==0)
                                {
                                }
                                else if(data.charAt(data.length()-1)=='-' || data.charAt(data.length()-1)=='*' || data.charAt(data.length()-1)=='+' || data.charAt(data.length()-1)=='/')
                                {
                                    data=data.substring(0,data.length()-1);
                                    data=data+"/";
                                }
                                else
                                    data=data+"/";
                                
                                output.setText(data);
			}
		});

		bBs.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				data=data.substring(0,data.length()-1);
				output.setText(data);
			}
		});

		bCE.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				data="";
				output.setText(data);
			}
		});
                
        beq.addActionListener(new ActionListener()
        {
                public void actionPerformed(ActionEvent e)
                {
                        String exp=output.getText();
                        
                        if(exp.charAt(exp.length()-1)=='+' || exp.charAt(exp.length()-1)=='-' || exp.charAt(exp.length()-1)=='*' || exp.charAt(exp.length()-1)=='/')
                        {
                            JOptionPane.showMessageDialog(frame,"Invalid Expression","Error",JOptionPane.ERROR_MESSAGE);
                        }
                        else
                        {
                            Expression ex=new Expression(exp);
                            result=String.valueOf(ex.calculate());

                            output.setText(result);

                            data=result="";
                        }
                }
        });
            }
            catch(ArithmeticException e)
            {
                
            }
	}







	static void decorate()
	{
		b0=new JButton("0");
		b0.setBounds(10,600,140,50);
		b0.setFont(new Font("Arial",Font.BOLD,25)); //new Font(<Font Family in String>, <Font style object>, <size in int>);
		frame.add(b0);

		b1=new JButton("1");
		b1.setBounds(10,545,70,50);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		frame.add(b1);

		b2=new JButton("2");
		b2.setBounds(80,545,70,50);
		b2.setFont(new Font("Arial",Font.BOLD,25));
		frame.add(b2);

		b3=new JButton("3");
		b3.setBounds(150,545,70,50);
		b3.setFont(new Font("Arial",Font.BOLD,25));
		frame.add(b3);

		b4=new JButton("4");
		b4.setBounds(10,490,70,50);
		b4.setFont(new Font("Arial",Font.BOLD,25));
		frame.add(b4);

		b5=new JButton("5");
		b5.setBounds(80,490,70,50);
		b5.setFont(new Font("Arial",Font.BOLD,25));
		frame.add(b5);

		b6=new JButton("6");
		b6.setBounds(150,490,70,50);
		b6.setFont(new Font("Arial",Font.BOLD,25));
		frame.add(b6);

		b7=new JButton("7");
		b7.setBounds(10,435,70,50);
		b7.setFont(new Font("Arial",Font.BOLD,25));
		frame.add(b7);

		b8=new JButton("8");
		b8.setBounds(80,435,70,50);
		b8.setFont(new Font("Arial",Font.BOLD,25));
		frame.add(b8);

		b9=new JButton("9");
		b9.setBounds(150,435,70,50);
		b9.setFont(new Font("Arial",Font.BOLD,25));
		frame.add(b9);

		bCE=new JButton("CE");
		bCE.setBounds(10,380,70,50);
		bCE.setFont(new Font("Arial",Font.BOLD,25));
		frame.add(bCE);

		bplus=new JButton("+");
		bplus.setBounds(80,380,70,50);
		bplus.setFont(new Font("Arial",Font.BOLD,25));
		frame.add(bplus);

		bminus=new JButton("-");
		bminus.setBounds(150,380,70,50);
		bminus.setFont(new Font("Arial",Font.BOLD,25));
		frame.add(bminus);

		bmul=new JButton("*");
		bmul.setBounds(220,380,70,50);
		bmul.setFont(new Font("Arial",Font.BOLD,25));
		frame.add(bmul);

		bdiv=new JButton("/");
		bdiv.setBounds(220,435,70,50);
		bdiv.setFont(new Font("Arial",Font.BOLD,25));
		frame.add(bdiv);

		beq=new JButton("=");
		beq.setBounds(220,490,70,160);
		beq.setFont(new Font("Arial",Font.BOLD,25));
		frame.add(beq);

		bBs=new JButton("BS");
		bBs.setBounds(220,325,70,50);
		bBs.setFont(new Font("Arial",Font.BOLD,25));
		bBs.setBackground(Color.WHITE);
		frame.add(bBs);


		output=new JTextField();
		output.setBounds(10,250,280,70);
		output.setEditable(false);
		output.setFont(new Font("Arial",Font.BOLD,25));
		output.setHorizontalAlignment(JTextField.RIGHT);
		frame.add(output);
	}
}