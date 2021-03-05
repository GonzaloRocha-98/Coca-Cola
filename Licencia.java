import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Licencia extends JFrame implements ChangeListener, ActionListener{
  private JLabel label1,label2;
  private JCheckBox check1;
  private JButton boton1, boton2;
  private JScrollPane scrollpane1;
  private JTextArea textarea1;

  public Licencia(){
    setLayout(null);
    setTitle ("Licencia de uso");
    setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
    label1 = new JLabel("TÉRMINOS Y CONDICIONES");
    label1.setBounds(215,5,200,30);
    label1.setFont(new Font("Andale Mono",1,14));
    label1.setForeground(new Color(0,0,0));
    add(label1);

    textarea1 = new JTextArea();
    textarea1.setEditable(false);
    textarea1.setFont(new Font("Andale Mono", 0, 9));
    textarea1.setText("\n\n          Terminos y condiciones\n\n" + 
			"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque\n 			interdum eros sit amet felis hendrerit, vel lobortis sapien vehicula. Sed 			ut aliquet sapien. In condimentum ligula id nisl ornare, at sagittis\n 			sapien lacinia. Pellentesque habitant morbi tristique senectus et netus 			et malesuada fames ac turpis egestas. Nullam urna dui, euismod a erat id, \n			sodales dignissim ligula. Donec a enim a leo consequat pharetra vel non\n 			ante. Sed sit amet velit vehicula ligula facilisis commodo sit amet sed 			metus. Nunc et urna faucibus diam venenatis lobortis non sed purus. \n			Mauris eget ultricies enim. Pellentesque hendrerit in massa non 			pretium.");
    scrollpane1 = new JScrollPane(textarea1);
    scrollpane1.setBounds(10,40,575,200);
    add(scrollpane1);
    
    check1 = new JCheckBox("Yo acepto");
    check1.setBounds(10,250,300,30);
    check1.addChangeListener(this);
    add(check1);

    boton1 = new JButton("Continuar");
    boton1.setBounds(10,290,100,30);
    boton1.addActionListener(this);
    boton1.setEnabled(false);
    add(boton1);

    boton2 = new JButton("No acepto");
    boton2.setBounds(120,290,100,30);
    boton2.addActionListener(this);
    boton2.setEnabled(true);
    add(boton2);

    ImageIcon image = new ImageIcon("images/coa-cola.png");
    label2 = new JLabel(image);
    label2.setBounds(315,135,300,300);
    add(label2);
  }

  public void stateChanged(ChangeEvent e){
       
  }

  public void actionPerformed(ActionEvent e){
    
  }

  public static void main (String args[]){
    Licencia licen = new Licencia();
    licen.setBounds(0,0,600,360);
    licen.setVisible(true);
    licen.setResizable(false);
    licen.setLocationRelativeTo(null);
  }
}
