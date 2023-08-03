package funtec.edu.animais.models;

import java.util.Random;

public class Passaro {
	Random random = new Random();
	int passos = random.nextInt(11);
	
	public void emitSound() {
		System.out.println("Bem TIVÍ");
	}
	public void move() {
		System.out.println("Pássaro se moveu: " + passos);		
	}
}