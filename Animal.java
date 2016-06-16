
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

}
