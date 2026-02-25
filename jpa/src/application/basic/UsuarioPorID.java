package application.basic;

import entity.basic.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UsuarioPorID {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();

		User user = em.find(User.class, 7L);
		System.out.println(user.getNome());
		
		em.close();
		emf.close();
	}
}
