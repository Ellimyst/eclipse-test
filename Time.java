import java.util.ArrayList;

public class Time {

	public Time()
	{
		
	}
	
	public void tick()
	{
		for(int i = 0; i < Runner.animals.size(); i++)
		{
			if(Runner.animals.get(i).act())
			{
				Runner.animals.remove(i);
			}
		}
		
		for(int i = 0; i < Runner.trees.size(); i++)
		{
			Runner.trees.get(i).act();
		}
		
		for(Animal a : Runner.newAnimals)
		{
			Runner.animals.add(a);
		}
		
		for(Tree t : Runner.newTrees)
		{
			Runner.trees.add(t);
		}
		
		System.out.println(Runner.trees);
		System.out.println(Runner.animals);
	}

}
