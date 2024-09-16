
public class InputOutputPrototype{
	public void GetSources(InputRequest source, OutputRequest destination, String delimiter){	//user submits input source, output destination, delimiter
		//source of data
		InputRequest WhereFrom = source;
		
		if(Delimiter == null || Delimiter.isEmpty()){ //if the user doesn't provide a delimiter, use this
			delimiter = "/";
		}

		//where to send data to
		OutputRequest whereTo = Destination;
	}
}
