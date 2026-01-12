package br.com.agenda.aplicacao;

import br.com.agenda.dao.ContatoDAO;
import br.com.agenda.model.Contato;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        ContatoDAO contatoDao = new ContatoDAO();
        Contato contato = new Contato();

        contato.setNome("João");
        contato.setIdade(78);
        contato.setDataCadastro(new Date());

        //contatodao.save(contato);

        // Atualizar o contato
        Contato c1 = new Contato();
        c1.setNome("Jõao da Silva");
        c1.setIdade(37);
        c1.setDataCadastro(new Date());
        c1.setId(5);

        // contatodao.update(c1);

        //Deletar o contato pelo o seu numero de ID
        contatoDao.deleteByID(2);

        //Visualisação dos registros do baco de dados TODOS
        for(Contato c: contatoDao.getContatos()) {
            System.out.println("Contato: "+ c.getNome());
        }
    }
}
