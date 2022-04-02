package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {


    private int cargaHoraria;

    @Override
    public double calcularXp() {
        return 0;
    }

    public Curso() {
    }



    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo()+ '\'' +
                ", descrição='" + getDescricao()+ '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }


}
