package PetShop;

public class PetShopClass {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.name = "Zoe";
		dog.breed = "Mixed-Breed";
		dog.gender = 'F';
		dog.age = 5;
		
		System.out.println("Name: " + dog.name);
		System.out.println("Breed: " + dog.breed);
		System.out.println("Gender: " + dog.gender);
		System.out.println("Age: " + dog.age);
	}

}
