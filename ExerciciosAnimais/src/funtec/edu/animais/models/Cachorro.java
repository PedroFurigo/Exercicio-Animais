package funtec.edu.animais.models;

import java.util.Random;

public class Cachorro implements InterfaceAnimais{
	Random random = new Random();
	int passos = random.nextInt(11);
	
	public void emitSound() {
		System.out.println("Au Au ");
	}
	public void move() {
		System.out.println("O cachorro se moveu: " + passos);
	}
}