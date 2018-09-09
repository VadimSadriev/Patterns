import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class DecoratorProgram {

	//Pattern decorator dynamicly gives object new possobilities and is a flexible alternative
	//to subclassing in the scope of extending functionality
	public static void main(String[] args) {
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription());
		Beverage beverage2 = new HouseBlend();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
		
		int c;
		
		try {
			InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("test.txt")));
			
			while ((c = in.read()) >= 0){
				System.out.println((char)c);
			}
			
			in.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
