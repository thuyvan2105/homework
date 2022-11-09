package algorithm;

/**
 * Example: API error number
 *	 + status(integer number) 
 *					   ==> 500 --> Internal Error
 *	 + 				   ==> 404 --> Not found
 *	 + 				   ==> 400 --> Bad request
 *	 + 				   ==> ... --> unknown error 
 */

public class Ex03SwichCaseDemo {
	public static void main(String[] args) {
		int status = 500;

		String result = "";

		switch (status) {
		case 500:
			result = "Internal Error";
			break;

		case 404:
			result = "Not found";
			break;

		case 400:
			result = "Bad request";
			break;

		default:
			result = "Unknown error";
		}

		System.out.println("Status: " + result);

	}

}
