
public class Animal {

	private int height;
	private int modifier, base;
	
	
	
	public Animal(int b, int m) {
		base = b;
		modifier = m;
		height = base + Runner.rand.nextInt((2*modifier)+1)-modifier;
	}
	
	public String toString()
	{
		return height+"";
	}
	
	public boolean act()
	{
		boolean b = true;
		
		for(int i = 0; i < Runner.trees.size()&&b; i++)
		{
			if(Runner.trees.get(i).getHeight() < height)
			{
				Runner.trees.remove(i);
				b = false;
			}
		}
		
		if(!b)
		{
			Runner.newAnimals.add(new Animal(height,modifier));
		}
		
		return b;
	}
	

}
