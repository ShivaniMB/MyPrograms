import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class Calculator extends Applet implements ActionListener
{
	float a,b,d;
	char c;
	TextField t1 = new TextField();
	Button b1 = new Button("1");
	Button b2 = new Button("2");
	Button b3 = new Button("3");
	Button b4 = new Button("4");
	Button b5 = new Button("5");
	Button b6 = new Button("6");
	Button b7 = new Button("7");
	Button b8 = new Button("8");
	Button b9 = new Button("9");
	Button b0 = new Button("0");
	Button b10 = new Button("*");
	Button b11 = new Button("/");
	Button b12 = new Button(".");
	Button b13 = new Button("=");
	Button b14 = new Button("-");
	Button b15 = new Button("+");
	Button b16 = new Button("CLR");
	
	public void init()
	{
		setLayout(null);
		t1.setBounds(20,20,280,80);
		add(t1);
		b1.setBounds(20,120,80,80);
		add(b1);
		b1.addActionListener(this);
		b2.setBounds(120,120,80,80);
		add(b2);
		b2.addActionListener(this);
		b3.setBounds(220,120,80,80);
		add(b3);
		b3.addActionListener(this);
		b4.setBounds(20,220,80,80);
		add(b4);
		b4.addActionListener(this);
		b5.setBounds(120,220,80,80);
		add(b5);
		b5.addActionListener(this);
		b6.setBounds(220,220,80,80);
		add(b6);
		b6.addActionListener(this);
		b7.setBounds(20,320,80,80);
		add(b7);
		b7.addActionListener(this);
		b8.setBounds(120,320,80,80);
		add(b8);
		b8.addActionListener(this);
		b9.setBounds(220,320,80,80);
		add(b9);
		b9.addActionListener(this);
		b0.setBounds(320,320,80,80);
		add(b0);
		b0.addActionListener(this);
		b10.setBounds(20,420,80,80);
		add(b10);
		b10.addActionListener(this);
		b11.setBounds(120,420,80,80);
		add(b11);
		b11.addActionListener(this);
		b12.setBounds(220,420,80,80);
		add(b12);
		b12.addActionListener(this);
		b13.setBounds(320,420,80,80);
		add(b13);
		b13.addActionListener(this);
		b14.setBounds(320,220,80,80);
		add(b14);
		b14.addActionListener(this);
		b15.setBounds(320,120,80,80);
		add(b15);
		b15.addActionListener(this);
		b16.setBounds(320,20,80,80);
		add(b16);
		b16.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			t1.setText(t1.getText()+"1");
		}
		if(ae.getSource()==b2)
		{
			t1.setText(t1.getText()+"2");
		}
		if(ae.getSource()==b3)
		{
			t1.setText(t1.getText()+"3");
		}
		if(ae.getSource()==b4)
		{
			t1.setText(t1.getText()+"4");
		}
		if(ae.getSource()==b5)
		{
			t1.setText(t1.getText()+"5");
		}
		if(ae.getSource()==b6)
		{
			t1.setText(t1.getText()+"6");
		}
		if(ae.getSource()==b7)
		{
			t1.setText(t1.getText()+"7");
		}
		if(ae.getSource()==b8)
		{
			t1.setText(t1.getText()+"8");
		}
		if(ae.getSource()==b9)
		{
			t1.setText(t1.getText()+"9");
		}
		if(ae.getSource()==b0)
		{
			t1.setText(t1.getText()+"0");
		}
		if(ae.getSource()==b12)
		{
			t1.setText(t1.getText()+".");
		}
		if(ae.getSource()==b10)
		{	
			c = '*';
			a = Float.parseFloat(t1.getText());
			t1.setText(null);	
		}
		if(ae.getSource()==b11)
		{
			c = '/';
			a = Float.parseFloat(t1.getText());
			t1.setText(null);	
		}
		if(ae.getSource()==b14)
		{
			c= '-';
			a = Float.parseFloat(t1.getText());
			t1.setText(null);	
		}
		if(ae.getSource()==b15)
		{	
			c= '+';
			a = Float.parseFloat(t1.getText());
			t1.setText(null);	
		}
		if(ae.getSource()==b16)
		{
			t1.setText(null);
		}
		if(ae.getSource()==b13)
		{
			b = Float.parseFloat(t1.getText());
			if(c == '*')
			{
				d = a*b;
				t1.setText(""+d);
			}
			if(c == '+')
			{
				d = a+b;
				t1.setText(""+d);
			}
			if(c == '-')
			{
				d = a-b;
				t1.setText(""+d);
			}
			if(c == '/')
			{
				d = a/b;
				t1.setText(""+d);
			}	
		}
	}			
}
/* <applet code="Calculator.class" width="420" height="510">
</applet>
*/