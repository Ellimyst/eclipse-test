public class Tree {

	private int height;
	private int modifier, base;
	
	
	
	public Tree(int b, int m) {
		base = b;
		modifier = m;
		height = base + Runner.rand.nextInt((2*modifier)+1)-modifier;
	}
	
	public String toString()
	{
		return height+"";
	}
	
	public int getHeight()
	{
		return height;
	}
	
	public void act()
	{
		Runner.newTrees.add(new Tree(height,modifier));
	}
}
