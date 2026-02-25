package application.basic;

import entity.basic.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AtualizarUsuarioEntidadeGerenciada {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		User user = em.find(User.class, 7L);
		user.setNome("Leonardo Leitao");
		
		// em.merge(usuario);
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
}
