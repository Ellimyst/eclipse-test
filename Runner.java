import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Runner {

	public static Random rand = new Random();
	public static Scanner scan = new Scanner(System.in);
	public static ArrayList<Tree> trees, newTrees;
	public static ArrayList<Animal> animals, newAnimals; 

	public static void main(String[] args) {

		trees = new ArrayList<Tree>();
		animals = new ArrayList<Animal>();
		newTrees = new ArrayList<Tree>();
		newAnimals = new ArrayList<Animal>();

		Time time = new Time();

		for(int i = 0; i < 10; i++)
		{
			trees.add(new Tree(10,4));
		}

		for(int i = 0; i < 10; i++)
		{
			animals.add(new Animal(9,2));
		}
		
		System.out.println(Runner.trees);
		System.out.println(Runner.animals);
		
		

		while(true)
		{
			scan.nextLine();
			time.tick();
		}
	}

}
