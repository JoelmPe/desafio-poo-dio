import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);


    Curso curso2 = new Curso();
    curso2.setTitulo("Curso js");
    curso2.setDescricao("descrição curso js");
    curso2.setCargaHoraria(4);



        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("descriçao mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJoelma = new Dev();
        devJoelma.setNome("Joelma");
        devJoelma.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Joelma :" + devJoelma.getConteudoInscritos());
        devJoelma.progredir();
        System.out.println("____________________________________________");

        System.out.println("Conteudos Inscritos Joelma :" + devJoelma.getConteudoInscritos());
        System.out.println("Conteudos Concluidos de Joelma : " + devJoelma.getConteudosConcluidos());
        System.out.println("XP:" + devJoelma.calcularTotalXp());


        System.out.println("____________________________________________");

        Dev devWilliam = new Dev();
        devWilliam.setNome("William");
        devWilliam.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos William : " + devWilliam.getConteudoInscritos());
        devWilliam.progredir();
        devWilliam.progredir();
        System.out.println("____________________________________________");

        System.out.println("Conteudos Inscritos William : " + devWilliam.getConteudoInscritos());
        System.out.println("Conteudos Concluidos de William : " + devWilliam.getConteudosConcluidos());
        System.out.println("XP : " + devWilliam.calcularTotalXp());
    }
}
