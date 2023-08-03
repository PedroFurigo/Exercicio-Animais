package funtec.edu.animais.models;


public class Zoologico {
	public static void main(String[] args) {
		Cachorro dog = new Cachorro();
		Passaro bemtivi = new Passaro();
		Peixe tilapia = new Peixe();
		
		dog.emitSound();
		dog.move();
		bemtivi.emitSound();
		bemtivi.move();
		tilapia.emitSound();
		tilapia.move();
	}
}