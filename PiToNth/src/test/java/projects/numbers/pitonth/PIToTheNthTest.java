import junit.framework.TestCase;

public class PIToTheNthTest extends TestCase
{
    private PIToTheNth p;
    protected void setUp()
    {
        p = new PIToTheNth();
    }

	public void testCanary() {

		assertEquals(1, 1);
	}

	public void testReturnCorrectNumberOfDigits() {
		p.setNumberOfDigits("3");
		String newPI = p.getNewPI();
		String correctPI = "3.141";
		assertEquals(correctPI, newPI);
	}


	public void testIsANumber() {


		try {
            assertEquals(p.setNumberOfDigits("Test"), true);
        }
        catch (NumberFormatException ex)
        {

        }
	}

	public void testIsNumberTooLong() {


		assertEquals(p.setNumberOfDigits("16"), false);
	}
}
