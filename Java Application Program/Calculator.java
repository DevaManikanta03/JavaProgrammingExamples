import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Calculator implements ActionListener{
	
	JFrame f = new JFrame("Calculator");
	JTextField input = new JTextField();
	
	//Buttons
	JButton nine = new JButton("9");
	JButton eight = new JButton("8");
	JButton seven = new JButton("7");
	JButton six = new JButton("6");
	JButton five = new JButton("5");
	JButton four = new JButton("4");
	JButton three = new JButton("3");
	JButton two = new JButton("2");
	JButton one = new JButton("1");
	JButton zero = new JButton("0");
	JButton dec = new JButton(".");
	JButton plus = new JButton("+");
	JButton minus = new JButton("-");
	JButton mul = new JButton("*");
	JButton equal = new JButton("=");
	JButton div = new JButton("÷");
	JButton zeros$2 = new JButton("00");
	JButton clear = new JButton("C");
	
	JButton exit = new JButton("Exit");

	Font fontFace = new Font("Product Sans", Font.BOLD, 25);
	float p = 0, q = 0;
	String oper = "", str1="";

	Calculator(){
		input.setBounds(30, 50, 350, 70);
		input.setFont(new Font("Product Sans", Font.BOLD, 35));
		input.setHorizontalAlignment(SwingConstants.RIGHT);
		input.setText("0");
		input.setEditable(false);

		//Setting Boundaries for Buttons
		nine.setBounds(30, 160, 50, 40);
		nine.setBackground(Color.LIGHT_GRAY);
		nine.addActionListener(this);
		
		eight.setBounds(100, 160, 50, 40);
		eight.setBackground(Color.LIGHT_GRAY);
		eight.addActionListener(this);

		seven.setBounds(170, 160, 50, 40);
		seven.setBackground(Color.LIGHT_GRAY);
		seven.addActionListener(this);

		plus.setBounds(240, 160, 50, 40);
		plus.setBackground(Color.LIGHT_GRAY);
		plus.addActionListener(this);

		clear.setBounds(310, 160, 70, 80);
		clear.setBackground(Color.LIGHT_GRAY);
		clear.addActionListener(this);

		six.setBounds(30, 210, 50, 40);
		six.setBackground(Color.LIGHT_GRAY);
		six.addActionListener(this);

		five.setBounds(100, 210, 50, 40);
		five.setBackground(Color.LIGHT_GRAY);
		five.addActionListener(this);

		four.setBounds(170, 210, 50, 40);
		four.setBackground(Color.LIGHT_GRAY);
		four.addActionListener(this);

		minus.setBounds(240, 210, 50, 40);
		minus.setBackground(Color.LIGHT_GRAY);
		minus.addActionListener(this);

		three.setBounds(30, 260, 50, 40);
		three.setBackground(Color.LIGHT_GRAY);
		three.addActionListener(this);

		two.setBounds(100, 260, 50, 40);
		two.setBackground(Color.LIGHT_GRAY);
		two.addActionListener(this);

		one.setBounds(170, 260, 50, 40);
		one.setBackground(Color.LIGHT_GRAY);
		one.addActionListener(this);

		mul.setBounds(240, 260, 50, 40);
		mul.setBackground(Color.LIGHT_GRAY);
		mul.addActionListener(this);

		equal.setBounds(310, 250, 70, 100);
		equal.setBackground(Color.LIGHT_GRAY);
		equal.addActionListener(this);

		exit.setBounds(280, 400, 100, 40);
		exit.setBackground(Color.GREEN);
		exit.setForeground(Color.BLACK);
		exit.addActionListener(this);

		dec.setBounds(30, 310, 50, 40);
		dec.setBackground(Color.LIGHT_GRAY);
		dec.addActionListener(this);

		zero.setBounds(100, 310, 50, 40);
		zero.setBackground(Color.LIGHT_GRAY);
		zero.addActionListener(this);

		zeros$2.setBounds(170, 310, 50, 40);
		zeros$2.setBackground(Color.LIGHT_GRAY);
		zeros$2.addActionListener(this);

		div.setBounds(240, 310, 50, 40);
		div.setBackground(Color.LIGHT_GRAY);
		div.addActionListener(this);

		//Setting font for the buttons
		zero.setFont(new Font("Product Sans", Font.BOLD, 23));
		nine.setFont(fontFace);
		eight.setFont(fontFace);

		seven.setFont(fontFace);
		six.setFont(fontFace);
		five.setFont(fontFace);
		
		four.setFont(fontFace);
		three.setFont(fontFace);
		two.setFont(fontFace);
		
		one.setFont(fontFace);
		zeros$2.setFont(new Font("Arial", Font.BOLD, 14)); //two zeros..
		dec.setFont(fontFace);

		plus.setFont(fontFace);
		minus.setFont(fontFace);
		
		mul.setFont(fontFace);
		div.setFont(fontFace);
		equal.setFont(new Font("Product Sans", Font.BOLD, 35));
		clear.setFont(fontFace);
		exit.setFont(new Font("Product Sans", Font.BOLD, 25));
		
		f.add(input);
		f.add(nine);
		f.add(eight);
		f.add(seven);
		f.add(plus);
		
		f.add(six);
		f.add(five);
		f.add(four);
		f.add(minus);

		f.add(clear);

		f.add(three);
		f.add(two);
		f.add(one);
		f.add(mul);
		
		f.add(dec);
		f.add(zero);
		f.add(zeros$2);
		f.add(div);

		f.add(equal);
		f.add(exit);

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(425, 500);	
	}

	public void actionPerformed(ActionEvent ae){
		String str = ae.getActionCommand();
		if(str.equals("+")){
			p=Float.parseFloat(input.getText());
			oper=str;
			input.setText(str1="");
		}
		else if(str.equals("-")){
			p=Float.parseFloat(input.getText());
			oper=str;
			input.setText(str1="");
		}
		else if(str.equals("*")){
			p=Float.parseFloat(input.getText());
			oper=str;
			input.setText(str1="");
		}
		else if(str.equals("÷")){
			p=Float.parseFloat(input.getText());
			oper=str;
			input.setText(str1="");
		}
		else if(str.equals("=")){
			str1="";
			if(oper.equals("+")){
				q=Float.parseFloat(input.getText());
				input.setText(String.valueOf(p+q));
			}
			else if(oper.equals("-")){
				q=Float.parseFloat(input.getText());
				input.setText(String.valueOf(p-q));
			}
			else if(oper.equals("*")){
				q=Float.parseFloat(input.getText());
				input.setText(String.valueOf(p*q));
			}
			else if(oper.equals("÷")){
				q=Float.parseFloat(input.getText());
				input.setText(String.valueOf(p/q));
			}
		}
		else if(str.equals("C")){
			p=0.0f;
			q=0.0f;
			str1="";
			input.setText("0");
		}
		else if(str.equals("Exit")){
			System.exit(0);
		}
		else{
			input.setText(str1.concat(str));
			str1 = input.getText();
		}
	}
	public static void main(String...S){
		new Calculator();
	}
}