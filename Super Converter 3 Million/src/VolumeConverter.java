import java.util.Scanner;

public class VolumeConverter
	{

		public static void volumeConverter()
			{
				
				String [] unit = new String[6];
				unit[0] = "Liters";
				unit[1] = "Milliliters";
				unit[2] = "Ounces";
				unit[3] = "Pints";
				unit[4] = "Quarts";
				unit[5] = "Gallons";
				
				//User Input
				Scanner userInput = new Scanner(System.in);

				//Initial Unit
				System.out.println("Which unit are you converting from?");
				for(int i = 0; i < unit.length; i++)
					{
						System.out.println((i + 1) + " " + unit[i]);
					}
				int initialUnit = userInput.nextInt();
				
				//Final Units
			
				System.out.println("Which unit are you converting to?");
				for(int i = 0; i < unit.length; i++)
					{
						System.out.println((i + 1) + " " + unit[i]);
					}
				int finalUnit = userInput.nextInt();
				
				//Conversions
				
				if(initialUnit == finalUnit)
					{
						System.out.println("How many " + unit[initialUnit - 1] + " would you like to convert to " + unit[finalUnit - 1] + "?" );
						double num = userInput.nextDouble();
						System.out.println("Well, there is no need for conversion, they are the same unit!");
					}
				else
					{
						System.out.println("How many " + unit[initialUnit - 1] + " would you like to convert to " + unit[finalUnit - 1] + "?" );
					}
				
				double num = userInput.nextDouble();
				
				//Liters
				if(initialUnit == 1 && finalUnit == 2)
					{
						double convert = num*1000;
						System.out.println("There are " + convert + " milliliters in " + num + " liters.");
					}
				
				else if(initialUnit == 1 && finalUnit == 3)
					{
						double convert = num*33.184;
						System.out.println("There are " + convert + " ounces in " + num + " liters.");
						
					}
				
				else if(initialUnit == 1 && finalUnit == 4)
					{
						double convert = num*2.113;
						System.out.println("There are " + convert + " pints in " + num + " liters.");
					}
				
				else if(initialUnit == 1 && finalUnit == 5)
					{
						double convert = num*1.057;
						System.out.println("There are " + convert + " quarts in " + num + " liters.");
					}
				
				else if(initialUnit == 1 && finalUnit == 6)
					{
						double convert = num*0.264;
						System.out.println("There are " + convert + " gallons in " + num + " liters.");
					}
				
				
				//Milliliters
				if(initialUnit == 2 && finalUnit == 1)
					{
						double convert = num/1000;
						System.out.println("There are " + convert + " liters in " + num + " milliliters.");
					}
				
				else if(initialUnit == 2 && finalUnit == 3)
					{
						double convert = num/29.574;
						System.out.println("There are " + convert + " ounces in " + num + " milliliters.");
						
					}
				
				else if(initialUnit == 2 && finalUnit == 4)
					{
						double convert = num/473.176;
						System.out.println("There are " + convert + " pints in " + num + " milliliters.");
					}
				
				else if(initialUnit == 2 && finalUnit == 5)
					{
						double convert = num/946.353;
						System.out.println("There are " + convert + " quarts in " + num + " milliliters.");
					}
				
				else if(initialUnit == 2 && finalUnit == 6)
					{
						double convert = num/3785.412;
						System.out.println("There are " + convert + " gallons in " + num + " milliliters.");
					}

			}

	}
