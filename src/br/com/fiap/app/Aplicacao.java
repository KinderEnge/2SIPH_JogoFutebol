package br.com.fiap.app;

import java.util.Random;

import br.com.fiap.model.Partida;
import br.com.fiap.model.Time;

public class Aplicacao {

	public static void main(String[] args) {
		Time sp = new Time();
		sp.setNome("São Paulo");
		Time cor = new Time();
		cor.setNome("Corinthians");
		Time pal = new Time();
		pal.setNome("Palmeiras");
		Time juv = new Time();
		juv.setNome("Juventus");
		
		Random rand = new Random();
		int gV = rand.nextInt(10);
		int gC = rand.nextInt(10);

		Partida p1 = new Partida(sp, cor, gC, gV);
		
	}

}
