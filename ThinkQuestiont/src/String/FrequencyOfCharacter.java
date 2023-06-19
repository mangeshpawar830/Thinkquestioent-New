package String;

public class FrequencyOfCharacter {
	public static void main(String[] args) throws Exception {
		int count=0;
		try {
			try {
				count++;
				try {
					count++;
					throw new Exception();
				}catch(Exception e) {
					count++;
					throw e;
				}
			}catch(Exception e) {
				count++;
				throw e;
			}
		}catch(Exception e) {
			count++;
			throw e;
		}
		
	}

	}

//try catch finally block with array example
//write code to show try with multiple catch
//write code to create custom exception to show string invalid name exception

