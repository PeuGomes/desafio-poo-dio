import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso cursoUm = new Curso();
        cursoUm.setTitulo("Java");
        cursoUm.setDescricao("descrição curso java");
        cursoUm.setCargaHoraria(8);

        Curso cursoDois = new Curso();
        cursoDois.setTitulo("JavaScript");
        cursoDois.setDescricao("descrição curso javascript");
        cursoDois.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(cursoUm);
        bootcamp.getConteudos().add(cursoDois);
        bootcamp.getConteudos().add(mentoria);

        Dev devPedro = new Dev();
        devPedro.setNome("Pedro Ivo");
        devPedro.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Pedro: " + devPedro.getConteudosInscritos());

        devPedro.progredir();
        devPedro.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Pedro: " + devPedro.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Pedro: " + devPedro.getConteudosConcluidos() + " Concluído em: " +bootcamp.getDataFinal());
        System.out.println("XP: " + devPedro.calcularTotalXp());

        System.out.println("-------------------------------");

        Dev devPaulo = new Dev();
        devPaulo.setNome("Paulo Rocha");
        devPaulo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos  Paulo:" + devPaulo.getConteudosInscritos());
        devPaulo.progredir();
        devPaulo.progredir();
        devPaulo.progredir();
        System.out.println("-");
        System.out.println("Conteúdos  Paulo: " + devPaulo.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Paulo: " + devPaulo.getConteudosConcluidos()+ " Concluído em: " +bootcamp.getDataFinal());
        System.out.println("XP: " + devPaulo.calcularTotalXp());

    }
}