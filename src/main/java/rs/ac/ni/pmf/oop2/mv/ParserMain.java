package rs.ac.ni.pmf.oop2.mv;

public class ParserMain
{
	public static void main(String[] args)
	{
		TextParser textParser = new TextParser();
		textParser.setEncoder(new UpperCaseEncoder());
		textParser.setSaveEngine(new SaveToFile());

		textParser.parse("    avafadogjoidfv  fgkdfopgfdp    ");
		textParser.save();
	}
}
