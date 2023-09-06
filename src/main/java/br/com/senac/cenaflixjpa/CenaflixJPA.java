
package br.com.senac.cenaflixjpa;

import br.com.senac.cenaflixjpa.DAO.PodcastDAO;
import br.com.senac.cenaflixjpa.persistencia.Cadastro_Podcast;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.util.List;


public class CenaflixJPA {
    public static void main(String[] args) {
    EntityManagerFactory fabricaEntidade = Persistence.createEntityManagerFactory("CenaflixJPA");
    EntityManager manager = fabricaEntidade.createEntityManager(); 
    }
}
/*
 
produtor varchar(20) not null,
nome_episodio varchar(100) not null,
n_episodio int(4) not null,
duracao_episodio int(4) not null,
url_episodio varchar(200) not null
*/
