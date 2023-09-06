
package br.com.senac.cenaflixjpa.persistencia;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Cadastro_Podcast {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String produtor;
    private String nome_episodio;
    private int n_episodio;
    private int duracao_episodio;
    private String url_episodio;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProdutor() {
        return produtor;
    }

    public void setProdutor(String produtor) {
        this.produtor = produtor;
    }

    public String getNome_episodio() {
        return nome_episodio;
    }

    public void setNome_episodio(String nome_episodio) {
        this.nome_episodio = nome_episodio;
    }

    public int getN_episodio() {
        return n_episodio;
    }

    public void setN_episodio(int n_episodio) {
        this.n_episodio = n_episodio;
    }

    public int getDuracao_episodio() {
        return duracao_episodio;
    }

    public void setDuracao_episodio(int duracao_episodio) {
        this.duracao_episodio = duracao_episodio;
    }

    public String getUrl_episodio() {
        return url_episodio;
    }

    public void setUrl_episodio(String url_episodio) {
        this.url_episodio = url_episodio;
    }
    
  }
