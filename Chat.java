package advance;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class Chatbot extends JFrame {
	private static final long serialVersionUID = 1L;
	private JTextArea ca= new JTextArea();
	private JTextField cf=new JTextField();                                  
	private JButton b=new JButton();
	private JLabel l=new JLabel();

	Chatbot(){                                                                                    

		JFrame f=new JFrame();                                     
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);                      
		f.setVisible(true);
		f.setResizable(false);
		f.setLayout(null);
		f.setSize(400,400);
		f.getContentPane().setBackground(Color.black);
		f.setTitle("ChatBot");
		f.add(ca);
		f.add(cf);
		ca.setSize(350,310);
		ca.setLocation(1, 1);
		cf.setSize(300,20);
		cf.setLocation(1,320);
		f.add(b);
		l.setText("SEND");
		b.add(l);
		b.setSize(400,20);
		b.setLocation(300,320);

		b.addActionListener( new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{

				if(e.getSource()==b) {                          

					String text=cf.getText().toLowerCase();
					ca.setForeground(Color.gray);
					ca.append("You-->"+text+"\n");
					cf.setText("");

					if(text.contains("hi")) {                         // input Checking
						replyMeth("Hi there");
					}
					else if(text.contains("how are you")) 
					{
						replyMeth("I'm Good :).Thankyou for asking");
					}
					else if(text.contains("what is your name"))
 {
						replyMeth("My developer till now not able to select my name"+"\n"+ "she is little bit confuse");
					}
					else if(text.contains("gender")) {
						replyMeth("I'm Female.Don't Try to Flirt with me"+"\n"+"you Fell in love :)");
					}
					else if(text.contains("birthday")) {
						replyMeth("04-03-22");
					}
					else if(text.contains("Java is easy ")) {
						replyMeth("Not that much it depends upon your practise");
					}
					else if(text.contains("your best friend")) {
						replyMeth("my developer");
					}
					else if(text.contains("your love")) {
						replyMeth("Nature" +"\n"+"You should also have to love Nature ");
					}
					else if(text.contains("bye")) {
						replyMeth("Too Soon :( AnyWays"+"\n"+"STAY HOME STAY SAFE ");
					}
					else 
						replyMeth("I Can't Understand");
				}
			}
		});
	}
	public void replyMeth(String s) 
	{                          
		ca.append("ChatBot-->"+s+"\n");         
	}

	
}
public class Chat 
 {                                   

	public static void main(String[] args) 
	{            
          new Chatbot();                                  
	}

}