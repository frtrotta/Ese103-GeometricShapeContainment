package ese103;

import geometricshapes.*;

public class Ese103 {

	public static void main(String[] args) {
		Circle circleArray[] =  new Circle[3];
		Triangle triangleArray[] =  new Triangle[2];
		
		circleArray[0] = new Circle(0, 0, 1);
		circleArray[1] = new Circle(0.5, 0.5, 0.5);
		circleArray[2] = new Circle(1, 1, 1);
		
		triangleArray[0] = new Triangle(0, 0, 1);
		triangleArray[1] = new Triangle(-2, -2, 4);
		
		Circle c;
		Triangle t;
		
		System.out.println("I cerchi contengono i triangoli?");
		for(int i=0; i<circleArray.length; i++) {
			c = circleArray[i];
			for(int j=0; j<triangleArray.length; j++) {
				t = triangleArray[j];
				if(c.contains(t))
					System.out.println(c + " contiene " + t);
				else
					System.out.println(c + " NON contiene " + t);
				}
		}
		
		System.out.println("\nI triangoli contengono i cerchi?");
		for(int j=0; j<triangleArray.length; j++) {
			t = triangleArray[j];
			for(int i=0; i<circleArray.length; i++) {
				c = circleArray[i];
			
				if(t.contains(c))
					System.out.println(t + " contiene " + c);
				else
					System.out.println(t + " NON contiene " + c);
				}
		}
	}

}
