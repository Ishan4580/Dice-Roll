
public class Die {
	
	private static final int NUMBER_OF_SIDES = 6;
    private int faceValue;

    public Die() {
        roll();
    }

    public void roll() {
        faceValue = 1 + (int) (Math.random() * NUMBER_OF_SIDES);
    }

    public int getFaceValue() {
        return faceValue;
    }
}
