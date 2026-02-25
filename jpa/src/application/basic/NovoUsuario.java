package application.basic;

import entity.basic.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class NovoUsuario {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		User novoUser = new User("Leo", "leo@lanche.com.br");
		
		em.getTransaction().begin();
		em.persist(novoUser);
		em.getTransaction().commit();
		
		System.out.println("O Id gerado foi: " + novoUser.getId());
		
		em.close();
		emf.close();
	}
}
