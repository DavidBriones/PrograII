package sample;

public class Hora {

    int horas;
    int minutos;
    int segundos;
    Cronometro cronometro;

    public Hora(){}

    public Hora(int horas){
        this.horas = horas;
    }

    public Hora(int horas, int minutos){
        this.horas = horas;
        this.minutos = minutos;
    }

    public Hora(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }


    public void imprimirHora(){

    }

    public Hora sumar(Hora hora1, Hora hora2){
        return suma(hora1, hora2);
    }

    public static Hora suma(Hora hora1, Hora hora2){
        Hora suma = null;
        return suma;
    }

}
