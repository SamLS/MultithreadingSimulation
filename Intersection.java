import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
	@author Samantha Sturges
		CS 250
		Assignment 4, Problem 2
*/
public class Intersection
{
//	int countCars = 0;
	private int clearRoad = 10;
	private Lock lightChangeLock;

	/**
		Makes a new intersection for cars to pass
	*/
	public Intersection()
	{
		lightChangeLock = new ReentrantLock();
	}

	/**
		Locks the threads for a countdown of 10. Prints out which car is going.
		@param carNumber the "car" (thread) that is in control.
		@throws InterruptedException throws exception
	*/
	public void turnGreen(int carNumber) throws InterruptedException
	{
		lightChangeLock.lock();
		try{
			System.out.println("Light turned green by road " + carNumber + "\n" +
								"Waiting for road " + carNumber + " car to clear intersection.");
			while (clearRoad != 0)
			{
				System.out.print("" + clearRoad-- + " ");
			}
			System.out.println("\n");
//			countCars++;
//			System.out.println(countCars); Tests if all 400 cars go through.
		}
		finally {
			clearRoad = 10;					//Clears the road
			lightChangeLock.unlock();		//Unlocks the threads.
		}
	}
}