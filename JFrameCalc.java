import java.awt.event.ActionEvent;
import javax.swing.JDialog;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.*;
public class JFrameCalc extends JFrame{

	char c;
    static double a=0,b=0,result=0;
    static int operator=0;
	
	JFrameCalc(){
		setSize(350,500);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setBackground(new java.awt.Color(230, 230, 250));
		setResizable(false);
		
		JTextField tf = new JTextField();
		tf.setFont(new Font("Dialog", 2, 34));
		tf.setHorizontalAlignment(JTextField.RIGHT);
		tf.setBackground(new java.awt.Color(72, 209, 204));
		tf.setBounds(50, 50, 300, 80);
		
		JButton b1 = new JButton("<html><font color = white>1");
		JButton b2 = new JButton("<html><font color = white>2");
		JButton b3=new JButton("<html><font color = white>3");
		JButton b4=new JButton("<html><font color = white>4");
		JButton b5=new JButton("<html><font color = white>5");
		JButton b6=new JButton("<html><font color = white>6");
		JButton b7=new JButton("<html><font color = white>7");
		JButton b8=new JButton("<html><font color = white>8");
		JButton b9=new JButton("<html><font color = white>9");
		JButton b0=new JButton("<html><font color = white>0");
		JButton bolu=new JButton("<html><font color = white>/");
		JButton kob=new JButton("<html><font color = white>*");
		JButton minus=new JButton("<html><font color = white>-");
		JButton plus=new JButton("<html><font color = white>+");
		JButton nuk=new JButton("<html><font color = white>.");
		JButton pro=new JButton("<html><font color = white>%");
		JButton sqrt=new JButton("<html><font color = white>√");
		JButton ten=new JButton("<html><font color = white>=");
		JButton AC=new JButton("<html><font color = white>AC");
		JButton C=new JButton("<html><font color = white>C");
        
        tf.setBounds(40,5,260,80);
        b7.setBounds(40,100,50,40);
        b8.setBounds(110,100,50,40);
        b9.setBounds(180,100,50,40);
        bolu.setBounds(250,100,50,40);
        
        b4.setBounds(40,170,50,40);
        b5.setBounds(110,170,50,40);
        b6.setBounds(180,170,50,40);
        kob.setBounds(250,170,50,40);
        
        b1.setBounds(40,240,50,40);
        b2.setBounds(110,240,50,40);
        b3.setBounds(180,240,50,40);
        minus.setBounds(250,240,50,40);
        
        nuk.setBounds(40,310,50,40);
        b0.setBounds(110,310,50,40);
        ten.setBounds(180,310,50,40);
        plus.setBounds(250,310,50,40);
        
        C.setBounds(40,380,50,40);
        AC.setBounds(110,380,50,40);
        pro.setBounds(180,380,50,40);
        sqrt.setBounds(250,380,50,40);

		
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().length()<10)
					tf.setText(tf.getText()+"1");
				
			}
		});
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().length()<10)
					tf.setText(tf.getText()+"2");
				
			}
		});
		
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().length()<10)
					tf.setText(tf.getText()+"3");
				
			}
		});
		b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().length()<10)
					tf.setText(tf.getText()+"4");
				
			}
		});
		b5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().length()<10)
					tf.setText(tf.getText()+"5");
				
			}
		});
		
		b6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().length()<10)
					tf.setText(tf.getText()+"6");
				
			}
		});
		
		b7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().length()<10)
					tf.setText(tf.getText()+"7");
				
			}
		});
		b8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().length()<10)
					tf.setText(tf.getText()+"8");
				
			}
		});
	b9.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().length()<10)
					tf.setText(tf.getText()+"9");
				
			}
		});
	b0.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if(tf.getText().length()<10)
				tf.setText(tf.getText()+"0");
			
		}
	});
	nuk.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			  if(e.getSource()==nuk)
		            tf.setText(tf.getText().concat("."));
			
		}
	});
    plus.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			  if(e.getSource()==plus)
		        {
		            a=Double.parseDouble(tf.getText());
		            operator=1;
		            tf.setText("");
		        } 
			
		}
	});
    minus.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==minus)
	        {
	            a=Double.parseDouble(tf.getText());
	            operator=2;
	            tf.setText("");
	        }
			
		}
	});
	kob.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			  if(e.getSource()==kob)
		        {
		            a=Double.parseDouble(tf.getText());
		            operator=3;
		            tf.setText("");
		        }
		}
	});
    bolu.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==bolu)
	        {
	            a=Double.parseDouble(tf.getText());
	            operator=4;
	            tf.setText("");
	        }
			
		}
	});
    pro.addActionListener(new ActionListener() {
		
 		@Override
 		public void actionPerformed(ActionEvent e) {
 			if(e.getSource()==pro)
 	        {
 	            a=Double.parseDouble(tf.getText());
 	            operator=5;
 	            tf.setText("");
 	        }
 			
 		}
 	});
 sqrt.addActionListener(new ActionListener() {
		
 		@Override
 		public void actionPerformed(ActionEvent e) {
 			if(e.getSource()==sqrt)
 	        {
 	            a=Double.parseDouble(tf.getText());
 	            operator=6;
 	            tf.setText("");
 	        }
 			
 		}
 	});
    ten.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==ten)
	        {
	            b=Double.parseDouble(tf.getText());
	        
	            switch(operator)
	            {
	                case 1: result=a+b;
	                    break;
	        
	                case 2: result=a-b;
	                    break;
	        
	                case 3: result=a*b;
	                    break;
	        
	                case 4: result=a/b;
	                    break;
	                    
	                case 5: result=a*b/100;
                        break;
                        
	                case 6: result=Math.sqrt(a);
                        break;
	        
	                default: result=0;
	            }
	        
	            tf.setText(""+result);
	        }

			
		}
	});
    C.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==C)
	            tf.setText("");
			
		}
	});
    AC.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
		    if(e.getSource()==AC)
	        {
	            String s=tf.getText();
	            tf.setText("");
	            for(int i=0;i<s.length()-1;i++)
	            tf.setText(tf.getText()+s.charAt(i));
	        }        
	    }
    	
		
	});

    b7.setBounds(40,100,50,40);
    b8.setBounds(110,100,50,40);
    b9.setBounds(180,100,50,40);
    bolu.setBounds(250,100,50,40);
    
    b4.setBounds(40,170,50,40);
    b5.setBounds(110,170,50,40);
    b6.setBounds(180,170,50,40);
    kob.setBounds(250,170,50,40);
    
    b1.setBounds(40,240,50,40);
    b2.setBounds(110,240,50,40);
    b3.setBounds(180,240,50,40);
    minus.setBounds(250,240,50,40);
    
    b0.setBounds(40,310,50,40);
    nuk.setBounds(110,310,50,40);
    ten.setBounds(180,310,50,40);
    plus.setBounds(250,310,50,40);
    
    AC.setBackground(new java.awt.Color(70, 130, 180));
    C.setBackground(new java.awt.Color(70, 130, 180));
    b1.setBackground(new java.awt.Color(112, 128, 144));
    b2.setBackground(new java.awt.Color(112, 128, 144));
    b3.setBackground(new java.awt.Color(112, 128, 144));
    b4.setBackground(new java.awt.Color(112, 128, 144));
    b5.setBackground(new java.awt.Color(112, 128, 144));
    b6.setBackground(new java.awt.Color(112, 128, 144));
    b7.setBackground(new java.awt.Color(112, 128, 144));
    b8.setBackground(new java.awt.Color(112, 128, 144));
    b9.setBackground(new java.awt.Color(112, 128, 144));
    b0.setBackground(new java.awt.Color(112, 128, 144));
    ten.setBackground(new java.awt.Color(169, 169, 169));
    nuk.setBackground(new java.awt.Color(169, 169, 169));
    sqrt.setBackground(new java.awt.Color(169, 169, 169));
    pro.setBackground(new java.awt.Color(169, 169, 169));
    bolu.setBackground(new java.awt.Color(169, 169, 169));
    kob.setBackground(new java.awt.Color(169, 169, 169));
    minus.setBackground(new java.awt.Color(169, 169, 169));
    plus.setBackground(new java.awt.Color(169, 169, 169));
    
    


		add(tf);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(b0);
        add(bolu);
        add(kob);
        add(minus);
        add(nuk);
        add(b0);
        add(ten);
        add(plus);
        add(AC);
        add(C);
        add(pro);
        add(sqrt);
		setVisible(true);
	}
	public static void main(String[] args) {
		
		new JFrameCalc();
	}

}
