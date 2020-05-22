import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calculator_ui implements ActionListener{
	
	JFrame frame = new JFrame("Calculator");
	JPanel panel = new JPanel(new FlowLayout());
	
	JTextArea text = new JTextArea(1,20);
	JButton but1 = new JButton("1");
	JButton but2 = new JButton("2");
	JButton but3 = new JButton("3");
	JButton but4 = new JButton("4");
	JButton but5 = new JButton("5");
	JButton but6 = new JButton("6");
	JButton but7 = new JButton("7");
	JButton but8 = new JButton("8");
	JButton but9 = new JButton("9");
	JButton but0 = new JButton("0");
	
	JButton butadd = new JButton("+");
	JButton butsub = new JButton("-");
	JButton butmulti = new JButton("*");
	JButton butdiv = new JButton("/");
	JButton buteq = new JButton("=");

	JButton butclear = new JButton("C");
	
	double number1,number2,result;
	int addc = 0,subc = 0, multic = 0,divc = 0; 
	
	public void ui() {
		frame.setVisible(true);
		frame.setSize(250,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.add(panel);
		
		panel.add(text);
		panel.add(but1);
		panel.add(but2);
		panel.add(but3);
		panel.add(but4);
		panel.add(but5);
		panel.add(but6);
		panel.add(but7);
		panel.add(but8);
		panel.add(but9);
		panel.add(but0);
		
		panel.add(butadd);
		panel.add(butsub);
		panel.add(butmulti);
		panel.add(butdiv);
		panel.add(buteq);
		panel.add(butclear);
	
		but1.addActionListener(this);
		but2.addActionListener(this);
		but3.addActionListener(this);
		but4.addActionListener(this);
		but5.addActionListener(this);
		but6.addActionListener(this);
		but7.addActionListener(this);
		but8.addActionListener(this);
		but9.addActionListener(this);
		but0.addActionListener(this);
		
		butadd.addActionListener(this);
		butsub.addActionListener(this);
		butmulti.addActionListener(this);
		butdiv.addActionListener(this);
		buteq.addActionListener(this);
		butclear.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object source = e.getSource();
		
		if(source==but1) 
			text.append("1");
		
		else if(source==but2) 
			text.append("2");
		
		else if(source==but3) 
			text.append("3");
		
		else if(source==but4) 
			text.append("4");
		
		else if(source==but5) 
			text.append("5");
		
		else if(source==but6) 
			text.append("6");
		
		else if(source==but7) 
			text.append("7");
		
		else if(source==but8) 
			text.append("8");
		
		else if(source==but9) 
			text.append("9");
		
		else if(source==but0) 
			text.append("0");
		
		else if(source==butadd) {
			number1 = number_reader();
			text.setText("");
			addc = 1;
			subc = 0;
			divc = 0;
			multic = 0;
		}
		else if(source == butsub) {
			number1 = number_reader();
			text.setText("");
			addc = 0;
			subc = 1;
			divc = 0;
			multic = 0;
		}
		else if(source == butdiv) {
			number1 = number_reader();
			text.setText("");
			addc = 0;
			subc = 0;
			divc = 1;
			multic = 0;
		}
		else if(source == butmulti) {
			number1 = number_reader();
			text.setText("");
			addc = 0;
			subc = 0;
			divc = 0;
			multic = 1;
		}
		else if(source == buteq) {
			number2 = number_reader();
			if(addc>0) {
				result = number1+number2;
				text.setText(Double.toString(result));
			}
			if(subc>0) {
				result = number1-number2;
				text.setText(Double.toString(result));
			}
			if(divc>0) {
				result = number1/number2;
				text.setText(Double.toString(result));
			}
			if(multic>0) {
				result = number1*number2;
				text.setText(Double.toString(result));
			}
		}
		else {
			text.setText("");
		}
		
	}

	public double number_reader() {
		Double num1;
		String s;
		s = text.getText();
		num1 = Double.valueOf(s);
		return num1;
	}
}

