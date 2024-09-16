
public class InputOutputPrototype{
	public void getSources(inputRequest source, outputRequest destination, String delimiter){	//user submits input source, output destination, delimiter
		//source of data
		inputRequest whereFrom = source;
		
		if(delimiter == null || delimiter.isEmpty()){ //if the user doesn't provide a delimiter, use this
			delimiter = "/";
		}

		//where to send data to
		outputRequest whereTo = destination;
	}
}