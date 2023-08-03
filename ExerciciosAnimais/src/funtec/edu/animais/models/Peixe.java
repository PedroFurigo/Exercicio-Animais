package funtec.edu.animais.models;

import java.util.Random;

public class Peixe {
	Random random = new Random();
	int passos = random.nextInt(11);
	
	public void emitSound() {
		System.out.println("glub glub"); 
	}
	public void move() {
		System.out.println("Peixe se moveu: " + passos);
	}
}