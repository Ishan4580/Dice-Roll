
public class RollTheDice {

	  public static void main(String[] args) {
	        PairOfDice dice = new PairOfDice();
	        dice.roll();

	        System.out.println("The first die comes up " + dice.getDie1Value());
	        System.out.println("The second die comes up " + dice.getDie2Value());
	        System.out.println("Your total roll is " + dice.getTotal());
	    }
}
