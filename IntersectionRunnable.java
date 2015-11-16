/**
	@author Samantha Sturges
		CS 250
		Assignment 4, Problem 2
*/
public class IntersectionRunnable implements Runnable
{
	private static final int DELAY = 5;
	private Intersection light;
	private int car;
	private int count;

	/**
		Constructs an intersection runnable.
		@param aLight the intersection object.
		@param aCar the road that is running.
		@param aCount the amount of cars to pass through.
	*/
	public IntersectionRunnable(Intersection aLight, int aCar, int aCount)
	{
		car = aCar;
		light = aLight;
		count = aCount;
	}

	/**
		Runs the intersection for count amount of times and calls sleep on the current thread for 5 seconds.
	*/
	public void run()
	{
		try{
			for (int i = 0; i < count; i++)
			{
				light.turnGreen(car);
				Thread.sleep(DELAY);
			}
		} catch (InterruptedException exception){};
	}
}