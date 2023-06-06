import desafio.dominio.Bootcamp;
import desafio.dominio.Curso;
import desafio.dominio.Dev;
import desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do Curso Java");
        curso1.setCargaHoraria(160);


        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Python");
        curso2.setDescricao("Descrição do Curso Python");
        curso2.setCargaHoraria(150);

        /*
        System.out.println(curso1);
        System.out.println(curso2);
        */

        Mentoria mentoria1 = new Mentoria();

        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descrição mentoria Java");
        mentoria1.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria Python");
        mentoria2.setDescricao("Descrição mentoria Python");
        mentoria2.setData(LocalDate.now());

        /*
        System.out.println(mentoria1);
        System.out.println(mentoria2);
         */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java developer");
        bootcamp.setDescricao("Descrição do Boot");
        bootcamp.getConteudosBootcamp().add(curso1);
        bootcamp.getConteudosBootcamp().add(curso2);
        bootcamp.getConteudosBootcamp().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome("Ronnie");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos: " + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("Conteudos inscritos: " + dev1.getConteudosInscritos());
        System.out.println("Conteudos concluidos: " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularTotalXp());

        Dev dev2 = new Dev();
        dev2.setNome("João");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos: " + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("Conteudos inscritos: " + dev2.getConteudosInscritos());
        System.out.println("Conteudos concluidos: " + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXp());


    }

}
