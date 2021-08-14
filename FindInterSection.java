package week1.day2;

public class FindInterSection {

	public static void main(String[] args) {
	int[] number1= {1,3,5,9,6,13};
	int[] number2= {2,4,18,6,23,12};
	for (int i = 0; i < number1.length; i++) 
	{
	for (int j = 0; j < number2.length; j++) {
		if (number1[i]==number2[j])
		{
			System.out.println("The InterSection of two arrays are: " + number1[i]);
		}
		
	}	
	}

	}

}
