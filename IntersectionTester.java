/**
	@author Samantha Sturges
		CS 250
		Assignment 4, Problem 2
	Tests Intersection and IntersectionRunnable with threads.
*/
public class IntersectionTester
{
	public static void main(String[] args)
	{
		Intersection nextCar = new Intersection();	//New intersection object.
		final int REPETITIONS = 100;

		//Constructs four IntersectionRunnable objects
		IntersectionRunnable car1 = new IntersectionRunnable(
            nextCar, 1, REPETITIONS);
		IntersectionRunnable car2 = new IntersectionRunnable(
            nextCar, 2, REPETITIONS);
		IntersectionRunnable car3 = new IntersectionRunnable(
            nextCar, 3, REPETITIONS);
 		IntersectionRunnable car4 = new IntersectionRunnable(
            nextCar, 4, REPETITIONS);

		//Constructs four threads tat take the IntersectionRunnable objects as parameters.
      Thread t1 = new Thread(car1);
      Thread t2 = new Thread(car2);
      Thread t3 = new Thread(car3);
      Thread t4 = new Thread(car4);

      t1.start();
      t2.start();
      t3.start();
      t4.start();
	}
}