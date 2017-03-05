import java.util.Scanner;


public class AstrologicalSign
{
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		String month = sanitizedMonth(console);
		int day = sanitizedDay(console);
		console.close();
		System.out.println("Your sign is " + getSign(month, day) + "!");
	}
	public static String getSign(String m,int d)
	{
		String sign="Oops!  Somehow you tricked me!";
		if((m.equals("march") && (d>=21)) || (m.equals("april") && (d<=19)))
			sign="Aries";
		if((m.equals("april") && (d>=20)) || (m.equals("may") && (d<20)))
			sign="Taurus";
		if((m.equals("may") && (d>=21)) || (m.equals("june") && (d<20)))
			sign="Gemini";
		if((m.equals("june") && (d>=21)) || (m.equals("july") && (d<22)))
			sign="Cancer";
		if((m.equals("july") && (d>=23)) || (m.equals("august") && (d<22)))
			sign="Leo";
		if((m.equals("august") && (d>=23)) || (m.equals("september") && (d<22)))
			sign="Virgo";
		if((m.equals("september") && (d>=23)) || (m.equals("october") && (d<22)))
			sign="Libra";
		if((m.equals("october") && (d>=23)) || (m.equals("november") && (d<21)))
			sign="Scorpio";
		if((m.equals("november") && (d>=22)) || (m.equals("december") && (d<21)))
			sign="Sagittarius";
		if((m.equals("december") && (d>=22)) || (m.equals("january") && (d<19)))
			sign="Capricorn";
		if((m.equals("january") && (d>=20)) || (m.equals("february") && (d<18)))
			sign="Aquarius";
		if((m.equals("february") && (d>=19)) || (m.equals("march") && (d<20)))
			sign="Pisces";
		return sign;
	}
	public static String sanitizedMonth(Scanner x)
	{
		System.out.println("What month were you born in?");
		for(;;)
		{
			String month = x.next();
			switch(month.toLowerCase())
			{
			case "january":
			case "february":
			case "march":
			case "april":
			case "may":
			case "june":
			case "july":
			case "august":
			case "september":
			case "october":
			case "november":
			case "december":
				return month.toLowerCase();	
			default:
			System.out.println("Your input could not be processed!");
			}
		}
	}
	public static int sanitizedDay(Scanner x)
	{
		System.out.println("What day in the month were you born on?");
		for(;;)
		{
			int day;
			try{
				day=Integer.parseInt(x.next());
				if(day>31 || day<=0)
					errorOutput();
				else
					return day;
			}
			catch(NumberFormatException e){
			errorOutput();	
			}
		}
	}
}
