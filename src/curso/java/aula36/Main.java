package curso.java.aula36;

public class Main {
    public static void main(String[] arg){
        Contato contato = new Contato();
        contato.setNome("Alencar");
        //contato.setEndereco("Rua Antonio Joaquim de Freitas"); -->primeiro cria objeto endereco
        // contato.setTelefone("9999999999"); --> primeiro cria objeto telefone
        // criando objeto endereço
        Endereco end = new Endereco();
        end.setNomeRua("Rua Antônio Joaquim de Freitas");
        end.setComplemento("casa");
        end.setCidade("Florianópolis");
        // set o endereco no contato
        contato.setEndereco(end);

        // criando objeto telefone
        Telefone tel = new Telefone();
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
        //set o telefone no contato
        contato.setTelefones(telefones);

        System.out.println(contato.getNome());
        System.out.println(contato.getEndereco().getNomeRua());
            for(Telefone t : contato.getTelefones()) {
                System.out.println(t.getDdd() + " " + t.getNumero());
            }
    }
}
