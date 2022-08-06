import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição do curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("Descrição do curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria 1");
        mentoria1.setDescricao("Mentoria do curso Java");
        mentoria1.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devLais = new Dev();
        devLais.setNome("Laís Kaori Yonemura Rodrigues");
        devLais.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Laís:" + devLais.getConteudosInscritos());
        devLais.progredir();
        devLais.progredir();
        devLais.progredir();
        System.out.println("Conteúdos Inscritos Laís:" + devLais.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Laís:" + devLais.getConteudosConcluidos());
        System.out.println("XP Total:"+ devLais.calcularTotalXp());

        Dev devLiliane = new Dev();
        devLiliane.setNome("Liliane Terumi Yonemura Rodrigues");
        devLiliane.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Liliane:" + devLiliane.getConteudosInscritos());
        devLiliane.progredir();
        System.out.println("Conteúdos Inscritos Liliane:" + devLiliane.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Liliane:" + devLiliane.getConteudosConcluidos());
        System.out.println("XP Total:"+ devLiliane.calcularTotalXp());

        Dev devGiovana = new Dev();
        devGiovana.setNome("Giovana Mayumi Yonemura Rodrigues");
        devGiovana.progredir();
        System.out.println("Conteúdos Inscritos Giovana:" + devGiovana.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Giovana:" + devGiovana.getConteudosConcluidos());
        System.out.println("XP Total:"+ devGiovana.calcularTotalXp());
    }
}
