package modelo;

public class Curso {

    private String codigoCurso;
    private String nombreCurso;
    private int creditos;
    private double notas;

    public Curso() {
    }

    public Curso(String codigoCurso, String nombreCurso, int creditos, double notas) {
        this.codigoCurso = codigoCurso;
        this.nombreCurso = nombreCurso;
        this.creditos = creditos;
        this.notas = notas;
    }

    public String getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(String codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public double getNotas() {
        return notas;
    }

    public void setNotas(double notas) {
        this.notas = notas;
    }

    public boolean estaCalificado(){

        return true;
    }
}
