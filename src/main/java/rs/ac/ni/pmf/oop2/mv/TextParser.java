package rs.ac.ni.pmf.oop2.mv;

public class TextParser
{
	Encoder _encoder;
	SaveEngine _saveEngine;
	String _encoded;

	public void setEncoder(Encoder encoder)
	{
		_encoder = encoder;
	}

	public void setSaveEngine(SaveEngine saveEngine){
		_saveEngine= saveEngine;
	}

	public String parse(String text)
	{
		String trimmed = text.trim();
		String encoded = _encoder.encode(trimmed);
		_encoded=encoded;
		return encoded;
	}

	public void save()
	{
		// Checks to see if there is text stored in object.
		if(_encoded == null){
			System.out.println("No information was parsed.");
		}else{
			_saveEngine.save(_encoded);
		}
	}
}
