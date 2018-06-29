import java.util.Random;

import javax.swing.JOptionPane;

public class skillpracticeworksheet {
		public static void main(String[] args) {

		skillpracticeworksheet skills = new skillpracticeworksheet();
		          	skills.skill1();
		          	skills.skill2();
		          	skills.skill3();
		          	skills.skill4();
		          	skills.skill5();
		}

		void skill1() {
		// Use pop-ups for the following.
		// Ask the user how many dimes they have

String dime=JOptionPane.showInputDialog("How many dimes?");
int j=Integer.parseInt(dime);
JOptionPane.showMessageDialog(null, "You have "+j*10+" cents");


		// Tell them how many cents they have (hint multiply by 10)




		// Ask the user how tall they are (inches)
String hi=JOptionPane.showInputDialog("how tall are you.......in inches");
int g=Integer.parseInt(hi);
if(g<36) {
	JOptionPane.showMessageDialog(null, "EAT WHEATIES");
}

		// If they are shorter than 36 inches, tell them to eat their Wheaties




		}

		void skill2() { // Write a loop to print every third number between 1 and 30 to the console 

for(int p=1;p<31;p++) {
	if(p%3==0) {
	System.out.println(p);
	}
	}





		}

		void skill3() { // Get a random number that is less than 20 and print it to the console 
Random r=new Random();
int ran=r.nextInt(20);
System.out.println(ran);

Random y=new Random();
int ya=y.nextInt(10);
System.out.println(ya);

JOptionPane.showMessageDialog(null, Math.abs(ran-ya));
		// Get another random number that is less than 10 and print it to the console 



		// Using a pop-up, tell the user the difference between the numbers // Hint: use subtraction 



		}

		void skill4() { // In a pop-up, ask the user for the city they live in 

String Sans=JOptionPane.showInputDialog("City?");
if(Sans.equals("San Diego")) {
	JOptionPane.showMessageDialog(null, "finest city and stuf");
}
else {
	JOptionPane.showMessageDialog(null, "move to diegooo");
}
		// If they answered "San Diego", tell them they live in America's Finest City 



		// Otherwise, tell them to move to San Diego 

int cars=3;

		// Create a variable - cars - and initialize it to the number of cars your family has. // If there are 0 cars, use a pop-up to display, "I bet you use public transportation." 
if(cars==1) {
	JOptionPane.showMessageDialog(null, "its a cool car");
}

if(cars>1) {
	JOptionPane.showMessageDialog(null, cars*4);
}
		// If there is 1 car, use a pop-up to display the make/model of the car 



		// If there is more than 1 car, use a pop-up to display how many wheels the // cars have between them. 



		}

		void skill5() { // In a pop-up, ask the user for the name of their school 

String school=JOptionPane.showInputDialog("what is a school");
JOptionPane.showMessageDialog(null, "Your school, "+school+", is a great school");
		// In another pop-up, tell the user, that their school is a fantastic school. // You must include the name of the school in the message. 



		}
		}

