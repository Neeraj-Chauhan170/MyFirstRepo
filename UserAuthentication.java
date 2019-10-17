public class UserAuthentication extends Applet implements ActionListener
{
 TextField name,pass,display;
 Button b1,b2;
 public void init()
 {
 Label n=new Label("Name:",Label.CENTER);
 Label p=new Label("password:",Label.CENTER);
 name=new TextField(20);
 pass=new TextField(20);
display=new TextField(40);
 pass.setEchoChar('*');
 b1=new Button("OK");
 b2=new Button("Reset");
 add(n);
 add(name);
 add(p);
 add(pass);
add(display);
 add(b1);
 add(b2);
b1.addActionListener(this);
b2.addActionListener(this);
 n.setBounds(70,90,90,60);
 p.setBounds(70,130,90,60);
 name.setBounds(280,100,90,20);
 pass.setBounds(200,140,90,20);
 b1.setBounds(100,260,70,40);
 b2.setBounds(180,260,70,40);
 }
 public void actionPerformed(ActionEvent e)
{
 if(e.getActionCommand().equals("OK"))
{
String up=name.getText()+" "+pass.getText();
display.setText(up);
}
 else
{
name.setText("");
pass.setText("");
}
 }
 public void paint(Graphics g)
 {
 repaint();
 }
}