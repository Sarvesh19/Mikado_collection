import java.util.*;

abstract class Animal
{
	public abstract void fillStomach();
	public abstract void makeSound();
};
class Dog extends Animal
{
	public  void fillStomach()
	{
		System.out.println("Dog is eating Meat");
	}
	public  void makeSound()
	{
		System.out.println("Dog is barking");
	}
};
class Cat extends Animal
{
	public  void fillStomach()
	{
		System.out.println("Cat is drinking Milk");
	}
	public  void makeSound()
	{
		System.out.println("Cat is Meowing");
	}
};
public class GenericsDemo
{
	public static void main(String args[])
	{
		//List<Dog> dogs = new List<Dog>();

		//List<Dog> dogs = new ArrayList<Dog>();

		//List<Animal> dogs = new ArrayList<Dog>();

		//List<? extends Animal> dogs = new ArrayList<Dog>();
			//dogs.add(new Dog());

		//List<? super Dog> dogs = new ArrayList<Dog>();
			//dogs.add(new Dog());
			//Animal animal = dogs.get(0);
			//dogs.add(new Cat());

		


		Rental<Car> rentals = new	Rental<Car>();
		rentals.addRental(new Car());
		System.out.println(rentals.getRental());



		//List<Dog> animals = new List<Dog>();
		//List<Dog> dogs = new ArrayList<Dog>();
		//List<Animal> dogs = new ArrayList<Dog>();
		//List<? extends Animal> dogs = new ArrayList<Dog>();
		//dogs.add(new Dog());
		//List<? super Dog> dogs = new ArrayList<Dog>();
		//dogs.add(new Dog());
		//dogs.add(new Cat());
		//List<?> dogs = new ArrayList<Dog>();
		//List<? extends Object> dogs = new ArrayList<Dog>();
		//List<Object> dogs = new ArrayList<Dog>();


	}
};
class Rental<T>
{
	List<T> rentals = new ArrayList<T>();

	public void addRental(T rental)
	{
		rentals.add(rental);
	}
	public T getRental()
	{
		return rentals.get(0);
	}
};
class Car
{
	public String toString(){
		return "This is My Car";
	}
};
