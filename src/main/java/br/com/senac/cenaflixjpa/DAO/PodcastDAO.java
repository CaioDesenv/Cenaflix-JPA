
package br.com.senac.cenaflixjpa.DAO;

import Util.JPAUtil;
import br.com.senac.cenaflixjpa.persistencia.Cadastro_Podcast;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;

public class PodcastDAO {
    
    public void cadastrar(Cadastro_Podcast p){
          EntityManager em = JPAUtil.getEntityManager();
          try {
              em.getTransaction().begin();
              em.persist(p);
              em.getTransaction().commit();
          }catch(Exception e){
              em.getTransaction().rollback();
              throw e;
          }
          finally{
              JPAUtil.closeEtityManager();
          }
      }
    
        public List<Cadastro_Podcast> listar(String filtroProdutor) {
       EntityManager em = JPAUtil.getEntityManager();
       List<Cadastro_Podcast> podcastList = null;
       try {
           String jpqlQuery = "SELECT p FROM Cadastro_Podcast p " +
                   "WHERE (:produtor is null OR p.produtor LIKE :produtor)";

           Query consulta = em.createQuery(jpqlQuery);

           consulta.setParameter("produtor", filtroProdutor.isEmpty() ? null : "%" + filtroProdutor + "%");

           podcastList = consulta.getResultList();
       } finally {
           em.close();
       }
       return podcastList;
    }
        
        public void excluir(int id){
      EntityManager em = JPAUtil.getEntityManager();
      try{
          Cadastro_Podcast p = em.find(Cadastro_Podcast.class, id);
          if(p != null){
              em.getTransaction().begin();
              em.remove(p);
              em.getTransaction().commit();
          }
      }catch(Exception e){
          em.getTransaction().rollback();
          throw e;
      }
      finally{
          JPAUtil.closeEtityManager();
      }
    }
}
