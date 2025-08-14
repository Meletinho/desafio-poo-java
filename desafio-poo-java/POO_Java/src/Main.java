import br.com.dio.desafio.Bootcamp;
import br.com.dio.desafio.Curso;
import br.com.dio.desafio.Dev;
import br.com.dio.desafio.Mentoria;
import java.time.LocalDate;

public class Main {
        public static void main(String[] args) {

            Curso curso1 = new Curso();
            curso1.setTitulo("curso java");
            curso1.setDescricao("descrição curso java");
            curso1.setCargaHoraria(8);

            Curso curso2 = new Curso();
            curso2.setTitulo("curso JS");
            curso2.setDescricao("descrição curso JS");
            curso2.setCargaHoraria(4);

            Mentoria mentoria = new Mentoria();
            mentoria.setTitulo("mentoria java");
            mentoria.setDescricao("descrição mentoria java");
            mentoria.setData(LocalDate.now());

            Bootcamp bootcamp = new Bootcamp();
            bootcamp.setNome("Bootcamp Java Developer");
            bootcamp.setDescricao("Descrição Bootcamp Java Developer");
            bootcamp.getConteudos().add(curso1);
            bootcamp.getConteudos().add(curso2);
            bootcamp.getConteudos().add(mentoria);

            Dev devMeletinho = new Dev();
            devMeletinho.setNome("Meletinho");
            devMeletinho.inscreverBootcamp(bootcamp);
            System.out.println("Conteúdos Inscritos Meletinho:" + devMeletinho.getConteudosInscritos());
            devMeletinho.progredir();
            devMeletinho.progredir();
            System.out.println("-");
            System.out.println("Conteúdos Inscritos Camila:" + devMeletinho.getConteudosInscritos());
            System.out.println("Conteúdos Concluídos Camila:" + devMeletinho.getConteudosConcluidos());
            System.out.println("XP:" + devMeletinho.calcularTotalXp());


           System.out.println("-------");

            Dev devJoao = new Dev();
            devJoao.setNome("Joao");
            devJoao.inscreverBootcamp(bootcamp);
            System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
            devJoao.progredir();
            devJoao.progredir();
            devJoao.progredir();
            System.out.println("-");
            System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
            System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
            System.out.println("XP:" + devJoao.calcularTotalXp());


        }
    }