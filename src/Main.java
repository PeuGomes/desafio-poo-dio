import br.com.dio.desafio.dominio.Curso;
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

        System.out.println(cursoUm);
        System.out.println(cursoDois);
        System.out.println(mentoria);
    }
}