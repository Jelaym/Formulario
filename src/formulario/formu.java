package formulario;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * 
 * @author Touchier
 */
public class formu implements ActionListener{
    private JFrame _Windows;
    private Container _Cont;
    private JLabel _Nombre, _Escuela, _App, _Apm;
    private JTextField _DNomber, _DEscuela, _DApp, _DApm;
    private JButton _Enviar;
    
    public formu(){
        ventana();
        contenido();
    }
    public void ventana(){
        _Windows= new JFrame("Formulario");
        _Windows.setBounds(200, 200, 700, 500);
        _Windows.setLocationRelativeTo(null);
        _Windows.setResizable(false);
        _Windows.setLayout(null);
        _Cont= _Windows.getContentPane();
        _Windows.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    public void mostrar(){
        _Windows.setVisible(true);
    }
    public void contenido(){
        //JButtons
        _Enviar= new JButton("Enviar");
        _Enviar.setBounds(150, 300, 200, 60);
        _Enviar.setForeground(Color.BLACK);
        _Enviar.addActionListener(this);
        _Enviar.setVisible(true);
        
        
        //JLabels
        _Nombre= new JLabel("Nombre: ");
        _Nombre.setBounds(100, 50, 205, 60);
        _Nombre.setForeground(Color.BLACK);
        _Nombre.setVisible(true);
        _Cont.add(_Nombre);
        
        _App= new JLabel("Apellido Paterno: ");
        _App.setBounds(100, 100, 205, 60);
        _App.setForeground(Color.BLACK);
        _App.setVisible(true);
        _Cont.add(_App);
        
        _Apm= new JLabel("Apellido Materno: ");
        _Apm.setBounds(100, 150, 205, 60);
        _Apm.setForeground(Color.BLACK);
        _Apm.setVisible(true);
        _Cont.add(_Apm);
        
        _Escuela= new JLabel("Escuela: ");
        _Escuela.setBounds(100, 200, 205, 60);
        _Escuela.setForeground(Color.BLACK);
        _Escuela.setVisible(true);
        
        //JTextFields
        _DNomber= new JTextField();
        _DNomber.setBounds(200, 70, 200, 20);
        _DNomber.setVisible(true);
        
        _DEscuela= new JTextField();
        _DEscuela.setBounds(200, 120, 200, 20);
        _DEscuela.setVisible(true);
        
        _DApp= new JTextField();
        _DApp.setBounds(200, 170, 200, 20);
        _DApp.setVisible(true);
        
        _DApm= new JTextField();
        _DApm.setBounds(200, 220, 200, 20);
        _DApm.setVisible(true);
        
        _Cont.add(_Escuela);
        _Cont.add(_DNomber);
        _Cont.add(_DEscuela);
        _Cont.add(_DApp);
        _Cont.add(_DApm);
        _Cont.add(_Enviar);
    }

    public void agregar(){
        bd base= new bd();
        try{
            base.state();
            base.agregar(_DNomber.getText(), _DApp.getText(), _DEscuela.getText(), _DApm.getText());
            JOptionPane.showMessageDialog(null, "Registro con exito!");
            _DNomber.setText(""); 
            _DApp.setText(""); 
            _DEscuela.setText(""); 
            _DApm.setText(""); 
        }catch(Exception a){
            JOptionPane.showMessageDialog(null, "Registro con exito!", "Mensaje de error", JOptionPane.ERROR_MESSAGE);
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == _Enviar){
            agregar();
            
        }
    }
}
