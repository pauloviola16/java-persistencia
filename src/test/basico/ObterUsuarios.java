package teste.basico;

import modelo.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class ObterUsuarios {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();

        //OPÇÃO 1
        String jpql = "select u from Usuario u";
        TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);

        List<Usuario> usuarios = query.getResultList();

        // OPÇÃO 2

        List<Usuario> usuarios2 = em
                                .createQuery("select u from Usuario u", Usuario.class)
                                .getResultList();


        for (Usuario usuario : usuarios){
            System.out.println("O id é: " + usuario.getId() + " Nome do usuário: " + usuario.getNome());
        }

        em.close();
        emf.close();
    }
}
