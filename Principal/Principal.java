package Principal;

import modelo.Estudiante;
import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {

        Estudiante e = new Estudiante( JOptionPane.showInputDialog("Ingrese su nombre"),
                JOptionPane.showInputDialog("Ingrese su apellido"),
                JOptionPane.showInputDialog("Ingrese su codigo"));

        JOptionPane.showMessageDialog(null, "Su nombre es: "+ e.getNombre()+
                "\n Su apellido es: "+ e.getApellido()+
                "\n Su codigo es: "+ e.getCodigo());



    }
}
