package curso.java.aula36;

import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        Contato contato = new Contato();// --> objeto do tipo contato
        contato.setNome("Alencar");
        // contato.setEndereco("Rua Antonio Joaquim de Freitas"); -->primeiro cria
        // objeto endereco
        // contato.setTelefone("9999999999"); --> primeiro cria objeto telefone
        // criando objeto endereço

        Endereco end = new Endereco();// --> obejto do tipo endereço
        end.setNomeRua("Rua Antônio Joaquim de Freitas");
        end.setComplemento("casa");
        end.setCidade("Florianópolis");
        // set o endereco no contato
        contato.setEndereco(end);

        // criando objeto telefone
        Telefone tel = new Telefone();// --> objeto do tipo telefone
        tel.setTipo("Celular");
        tel.setDdd("48");
        tel.setNumero("999999999");

        Telefone tel1 = new Telefone();
        tel1.setTipo("Casa");
        tel1.setDdd("48");
        tel1.setNumero("8888-8888");
        // Para criar um novo telefone, precisar fazer os mesmo procedimento acima

        Telefone[] telefones = new Telefone[2];
        telefones[0] = tel;
        telefones[1] = tel1;
        // set o telefone no contato
        contato.setTelefones(telefones);

        System.out.println(contato.getNome());
        if (contato.getEndereco() != null) {
            System.out.println(contato.getEndereco().getCidade());
            System.out.println(contato.getEndereco().getNomeRua());
        }
        for (Telefone t : contato.getTelefones()) {
            System.out.println(t.getDdd() + " " + t.getNumero());
        }

        System.out.println("-----------------------------------------------------------------------Exercicio01");

        Scanner scan = new Scanner(System.in);

        System.out.println("Nome da Agenda: ");
        String nome = scan.nextLine();

        Exercicio01 agenda = new Exercicio01();
        ContatoExercicio[] contatos = new ContatoExercicio[3];

        for(int i =0; i < 3; i ++){
            System.out.println("Entre com as informações do contatos: " + (i+1));
            ContatoExercicio c = new ContatoExercicio();
                
            System.out.println("Informe o Nome: ");
            nome = scan.nextLine();
            c.setNome(nome);

            System.out.println("Informe o Telefone: ");
            String telefone = scan.nextLine();
            c.setTelefone(telefone);

            System.out.println("Informe o E-mail: ");
            String email = scan.nextLine();
            c.setEmail(email);

            contatos[i] = c;

        }

        agenda.setContatos(contatos);

        if(agenda != null){
            System.out.println(agenda.obterInfo());
        }
    }
}
