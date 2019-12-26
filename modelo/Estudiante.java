package modelo;

public class Estudiante {
    private String nombre;
    private String apellido;
    private String codigo;

    public Estudiante() {
    }

    public Estudiante(String nombre, String apellido, String codigo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigo = codigo;
         }

        public boolean curso(Curso curso){

            return true;
        }

        public double calcularPromedio(){

            return 0.0;
        }

        public boolean estudianteEstaPrueba(){
        return true;
        }

        public boolean tieneCursosCompletos(){

        return true;

        }
        public Curso buscarCurso(String codigoCurso){
            Curso c = new Curso();
        return c;
        }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
