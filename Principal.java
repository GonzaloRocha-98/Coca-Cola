import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Principal extends JFrame implements ActionListener{
  private JMenuBar mb;
  private JMenu menuOpciones, menuCalcular, menuAcercaDe, menuColorFondo;
  private JMenuItem miCalculo, miRojo, miNegro, miMorado, miElCreador, miSalir, miNuevo;
  private JLabel labelLogo, labelBienvenido, labelTitle, labelNombre, labelAPaterno, labelAMaterno, labelDepartamento, labelAntiguedad, labelResultado, labelFooter;
  private JTextField txtNombreTrabajador, txtAPaternoTrabajador, txtAMaternoTrabajador;
  private JComboBox comboDepartamento, comboAntiguedad;
  private JScrollPane scrollpane1;
  private JTextArea textarea1;

  public Principal(){
    setLayout(null);
    setTitle("Pantalla Principal");
    getContentPane().setBackground(new Color(255,0,0));
    setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
    
    mb = new JMenuBar();
    mb.setBackground(new Color(255,0,0));
    setJMenuBar(mb);
  
    menuOpciones = new JMenu("Opciones");
    menuOpciones.setBackground(new Color(255,0,0));
    menuOpciones.setFont(new Font("Andale Mono", 1, 14));
    menuOpciones.setForeground(new Color(255,255,255));
    mb.add(menuOpciones);

    menuCalcular = new JMenu("Calcular");
    menuCalcular.setBackground(new Color(255,0,0));
    menuCalcular.setFont(new Font("Andale Mono", 1, 14));
    menuCalcular.setForeground(new Color(255,255,255));
    mb.add(menuCalcular);

    menuAcercaDe = new JMenu("Acerca de");
    menuAcercaDe.setBackground(new Color(255,0,0));
    menuAcercaDe.setFont(new Font("Andale Mono", 1, 14));
    menuAcercaDe.setForeground(new Color(255,255,255));
    mb.add(menuAcercaDe);
    
    menuColorFondo = new JMenu("Color de Fondo");
    menuColorFondo.setFont(new Font("Andale Mono", 1, 14));
    menuColorFondo.setForeground(new Color(255,255,255));
    mb.add(menuColorFondo);

    miCalculo = new JMenu("Vacaciones");
    miCalculo.setFont(new Font("Andale Mono", 1, 14));
    miCalculo.setForeground(new Color(255,255,255));
    menuCalcular.add(miCalculo);
    miCalculo.addActionListener(this);

    miRojo = new JMenuItem("Rojo");
    miRojo.setFont(new Font("Andale Mono",1 ,14));
    miRojo.setForeground(new Color(255,0,0));
    menuColorFondo.add(miRojo);
    miRojo.addActionListener(this);

    miNegro = new JMenuItem("Negro");
    miNegro.setFont(new Font("Andale Mono",1 ,14));
    miNegro.setForeground(new Color(255,0,0));
    menuColorFondo.add(miNegro);
    miNegro.addActionListener(this);

    miMorado = new JMenuItem("Morado");
    miMorado.setFont(new Font("Andale Mono",1 ,14));
    miMorado.setForeground(new Color(255,0,0));
    menuColorFondo.add(miMorado);
    miMorado.addActionListener(this);

    miNuevo = new JMenuItem("Nuevo");
    miNuevo.setFont(new Font("Andale Mono", 1, 14));
    miNuevo.setForeground(new Color(255,0,0));
    menuOpciones.add(miNuevo);
    miNuevo.addActionListener(this);

    miElCreador = new JMenuItem("El creador");
    miElCreador.setFont(new Font("Andale Mono", 1, 14));
    miElCreador.setForeground(new Color(255,0,0));
    menuAcercaDe.add(miElCreador);
    miElCreador.addActionListener(this);

    miSalir = new JMenuItem("Salir");
    miSalir.setFont(new Font("Andale Mono", 1, 14));
    miSalir.setForeground(new Color(255,0,0));
    menuOpciones.add(miSalir);
    miSalir.addActionListener(this);

    ImageIcon imagen = new ImageIcon("images/logo-coca.png");
    labelLogo = new JLabel(imagen);
    labelLogo.setBounds(5,5,250,100);
    add(labelLogo);

    labelBienvenido = new JLabel("Bienvenido");
    labelBienvenido.setBounds(280,30,300,50);
    labelBienvenido.setFont(new Font("Andale Mono", 1, 32));
    labelBienvenido.setForeground(new Color(255,255,255));
    add(labelBienvenido);

    labelNombre = new JLabel("Nombre completo:");
    labelNombre.setBounds(25,188,180,25);
    labelNombre.setFont(new Font("Andale Mono",1,12));
    labelNombre.setForeground(new Color(255,255,255));
    add(labelNombre);

    txtNombreTrabajador = new JTextField();
    txtNombreTrabajador.setBounds(25,213,150,25);
    txtNombreTrabajador.setFont(new Font("Andale Mono", 1, 14));
    txtNombreTrabajador.setForeground(new Color(255,0,0));
    txtNombreTrabajador.setBackground(new Color(224,224,224));
    add(txtNombreTrabajador);

    labelAPaterno = new JLabel("Apellido Paterno");
    labelAPaterno.setBounds(25,248,180,25);
    labelAPaterno.setFont(new Font("Andale Mono", 1, 12));
    labelAPaterno.setForeground(new Color(255,255,255));
    add(labelAPaterno);

    txtAPaternoTrabajador = new JTextField();
    txtAPaternoTrabajador.setBounds(25,273,150,25);
    txtAPaternoTrabajador.setFont(new Font("Andale Mono", 1, 14));
    txtAPaternoTrabajador.setForeground(new Color(255,0,0));
    txtAPaternoTrabajador.setBackground(new Color(224,224,224));
    add(txtAPaternoTrabajador);

    labelAMaterno = new JLabel("Apellido Materno");
    labelAMaterno.setBounds(25,308,180,25);
    labelAMaterno.setFont(new Font("Andale Mono", 1, 12));
    labelAMaterno.setForeground(new Color(255,255,255));
    add(labelAMaterno);

    txtAMaternoTrabajador = new JTextField();
    txtAMaternoTrabajador.setBounds(25,334,150,25);
    txtAMaternoTrabajador.setFont(new Font("Andale Mono", 1, 14));
    txtAMaternoTrabajador.setForeground(new Color(255,0,0));
    txtAMaternoTrabajador.setBackground(new Color(224,224,224));
    add(txtAMaternoTrabajador);

    labelDepartamento = new JLabel("Seleccione el departamento");
    labelDepartamento.setBounds(220,188,180,25);
    labelDepartamento.setFont(new Font("Andale Mono", 1, 12));
    labelDepartamento.setForeground(new Color(255,255,255));
    add(labelDepartamento);

    comboDepartamento = new JComboBox();
    comboDepartamento.setBounds(220,213,220,25);
    comboDepartamento.setBackground(new Color(224,224,224));
    comboDepartamento.setFont(new Font("Andale Mono", 1, 14));
    comboDepartamento.setForeground(new Color(255,0,0));
    add(comboDepartamento);
    comboDepartamento.addItem(" ");
    comboDepartamento.addItem("Atencion al Cliente");
    comboDepartamento.addItem("Departamento de Logistica");
    comboDepartamento.addItem("Departamento de Gerencia");
    
    labelResultado = new JLabel("Resultado del calculo");
    labelResultado.setBounds(220,307,180,25);
    labelResultado.setFont(new Font("Andale Mono", 1, 12));
    labelResultado.setForeground(new Color(255,255,255));
    add(labelResultado);

    textarea1 = new JTextArea();
    textarea1.setEditable(false);
    textarea1.setBackground(new Color(224,224,224));
    textarea1.setFont(new Font("Andale Mono", 1, 11));
    textarea1.setForeground(new Color(255,0,0));
    scrollpane1 = new JScrollPane(textarea1);
    scrollpane1.setBounds(220,333,384,90);
    add(scrollpane1);

    labelFooter = new JLabel("2017 Coca-Cola Company | Todos los derechs reservados");
    labelFooter.setBounds(135,445,500,30);
    labelFooter.setFont(new Font("Andale Mono", 1, 12));
    labelFooter.setForeground(new Color(255,255,255));
    add(labelFooter);
  }

  public void actionPerformed (ActionEvent e){
    if(e.getSource() == miCalculo){
    
    }
    if(e.getSource() == miRojo){
    
    }
    if(e.getSource() == miNegro){
    
    }
    if(e.getSource() == miMorado){
    
    }
    if(e.getSource() == miNuevo){
    
    }
    if(e.getSource() == miSalir){
    
    }
    if(e.getSource() == miElCreador){
    
    }
  }

  public static void main (String args[]){
    Principal ventana = new Principal();
    ventana.setBounds(0,0,640,535);
    ventana.setVisible(true);
    ventana.setResizable(false);
    ventana.setLocationRelativeTo(null);
  }
}
