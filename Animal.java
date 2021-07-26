abstract class Animal{
	abstract void makesound();
	
}
class Dog extends Animal
{
	public void makeSound()
	{
		System.out.println("Bark bark.");
	}
}
class Cat extends Animal {
public void makeSound() {
	System.out.println("Meows");
}
}
class Main
{
	public static void main(String[]args)
}
	public Animal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Dog d1=new Dog();
d1.makeSound();
Cat c1=new Cat();
c1.makeSound();
	}

}
