package teste.basico;

import modelo.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlterarUsuario2 {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Usuario usuario = em.find(Usuario.class, 5L);
        usuario.setNome("Leonardo");
        usuario.setEmail("Leonardo@gmail.com");
       // em.merge(usuario);
       // MESMO SEM O MERGE ELE FAZ A ALTERAÇÃO PORQUE NO MOMENTO ESTÁ NO ESTADO GERENCIADO, PARA NAO ACONTECER DEVEMOS MUDAR PARA NÃO GERENCIADO
        // VAMOS FAZER ISSO NA CLASSE ALTERAR USUARIO3

        em.getTransaction().commit();

        em.close();
        emf.close();

    }
}
