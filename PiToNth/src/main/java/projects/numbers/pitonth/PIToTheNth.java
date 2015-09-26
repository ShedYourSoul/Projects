// Steven Cupit
// Pi to the Nth Digit

import java.lang.Math;

public class PIToTheNth
{
	private int numberOfDigits = 0;

	public boolean setNumberOfDigits(String numOfDig) throws NumberFormatException {

		if(Double.isNaN(Integer.valueOf(numOfDig).doubleValue())) {
		    return false;
		} else if (Integer.valueOf(numOfDig).intValue() > 15) {
			return false;
		} else if (Integer.valueOf(numOfDig).intValue() < 0) {
			return false;
		} else {
			numberOfDigits = Integer.valueOf(numOfDig).intValue();
			return true;
		}



	}

	public String getNewPI() {

		return Double.toString(Math.PI).substring(0, numberOfDigits + 2);
	}

}



