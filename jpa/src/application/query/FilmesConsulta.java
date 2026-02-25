package application.query;

import config.DAO;
import entity.many_to_many.Ator;
import entity.many_to_many.Filme;

import java.util.List;

public class FilmesConsulta {

	public static void main(String[] args) {
		
		DAO<Filme> dao = new DAO<>(Filme.class);
		List<Filme> filmes = dao.consultar(
				"obterFilmesComNotaMaiorQue", "nota", 8.5);
		
		for(Filme filme: filmes) {
			System.out.println(filme.getNome() 
					+ " => " + filme.getNota());
			
			for(Ator ator: filme.getAtores()) {
				System.out.println(ator.getNome());
			}
		}
	}
}
