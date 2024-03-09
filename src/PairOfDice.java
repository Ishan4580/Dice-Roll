
public class PairOfDice {

	 private Die die1;
	    private Die die2;

	    public PairOfDice() {
	        die1 = new Die();
	        die2 = new Die();
	    }

	    public void roll() {
	        die1.roll();
	        die2.roll();
	    }

	    public int getTotal() {
	        return die1.getFaceValue() + die2.getFaceValue();
	    }

	    public int getDie1Value() {
	        return die1.getFaceValue();
	    }

	    public int getDie2Value() {
	        return die2.getFaceValue();
	    }
}
