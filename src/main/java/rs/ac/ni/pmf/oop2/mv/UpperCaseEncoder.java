package rs.ac.ni.pmf.oop2.mv;

public class UpperCaseEncoder implements Encoder
{
	@Override
	public String encode(final String input)
	{
		return input.toUpperCase();
	}
}
