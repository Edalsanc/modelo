package Principal;

import modelo.Curso;
import modelo.Estudiante;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList <Object>cursos;
        cursos = new ArrayList<>();

        Estudiante e = new Estudiante( JOptionPane.showInputDialog("Ingrese su nombre"),
                JOptionPane.showInputDialog("Ingrese su apellido"),
                JOptionPane.showInputDialog("Ingrese su codigo"));

        JOptionPane.showMessageDialog(null, "Su nombre es: "+ e.getNombre()+
                "\n Su apellido es: "+ e.getApellido()+
                "\n Su codigo es: "+ e.getCodigo());

        for (int i = 0; i <5 ; i++) {


            Curso c = new Curso(JOptionPane.showInputDialog("Ingrese  codigo del curso "),
                    JOptionPane.showInputDialog("Ingrese nombre del curso "),
                    Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de creditos ")),
                    Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota")));

            cursos.add(c);

        }

        for (int i = 0; i <cursos.size() ; i++) {

            System.out.println(cursos.get(i));
        }

    }
}
