import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso 1");
        curso1.setDescricao("Boas-Vindas ao Santander Code Girls");
        curso1.setCargaHoraria(1);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso 2");
        curso2.setDescricao("Conhecendo as oportunidades da DIO");
        curso2.setCargaHoraria(1);

        Curso curso3 = new Curso();
        curso3.setTitulo("Curso 3");
        curso3.setDescricao("Seja Protagonista nesse Bootcamp");
        curso3.setCargaHoraria(1);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria 1");
        mentoria1.setDescricao("Mentoria (live) Santander Code Girls | Aula Inaugural");
        mentoria1.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Santander Code Girls");
        bootcamp.setDescricao("Sejam todas bem-vindas ao Santander Bootcamp 2022! Comece sua jornada na trilha de Java, assista as aulas, faça os desafios de códigos e projetos e conclua as atividades. Todas as graduadas receberão certificado e terão chance de ingressar no mercado de trabalho!");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(curso3);
        bootcamp.getConteudos().add(mentoria1);

        Dev devLais = new Dev();
        devLais.setNome("Laís Kaori Yonemura Rodrigues");
        devLais.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Laís:" + devLais.getConteudosInscritos());
        devLais.progredir();
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
