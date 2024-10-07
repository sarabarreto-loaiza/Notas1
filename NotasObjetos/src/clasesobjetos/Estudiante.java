package clasesobjetos;

public class Estudiante {
   private String nombre;
   private float notaParcial1,notaParcial2, notaFinal;

    public Estudiante (String nombre){
        this.nombre = nombre;
    }

    public Estudiante (String nombre, float np1, float np2){
        this.nombre = nombre;
        this.notaParcial1 = np1;
        this.notaParcial2 = np2;
    }

    public void asignarnotaParcial1(float np1) {
        this.notaParcial1=np1;
    }

    public void  asignarnotaParcial2(float np2) {
        this.notaParcial2=np2;
    }

    public float obtenernotaParcial1() {
        return notaParcial1;

    }

    public float obtenernotaParcial2() {
        return notaParcial2;

    }


    public void calcularNotaFinal(){
        notaFinal = (notaParcial1 + notaParcial2 / 2);
    }

    public float obtenerNotaFinal(){
        return notaFinal;
    }

    public String obtenermensaje(){
        if (notaFinal <= 3) {
            return "Reprobo";
        }else {
            return "Aprobo";
        }
    }



}
