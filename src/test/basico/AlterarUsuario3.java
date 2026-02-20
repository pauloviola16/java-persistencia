package teste.basico;

import modelo.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlterarUsuario3 {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Usuario usuario = em.find(Usuario.class, 5L);

        usuario.setNome("Leonardo");
        usuario.setEmail("Leonardo@gmail.com");
        em.detach(usuario); // FAZ COM QUE O CODIGO NÃO FUNCIONE SEM O MERGE
        em.merge(usuario);

        em.getTransaction().commit();

        em.close();
        emf.close();

    } }
