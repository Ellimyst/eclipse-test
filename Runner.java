import java.util.ArrayList;
import java.util.Random;

public class Runner {
	
	public static Random rand = new Random();

	public static void main(String[] args) {
		
		ArrayList<Tree> trees = new ArrayList<Tree>();
		ArrayList<Animal> animals = new ArrayList<Animal>();
		
		Time time = new Time(trees, animals);
		
		for(int i = 0; i < 10; i++)
		{
			trees.add(new Tree(10,4));
		}
		
		for(int i = 0; i < 5; i++)
		{
			animals.add(new Animal(9,2));
		}
		
		
		
		System.out.println(trees);
		System.out.println(animals);
	}

}
