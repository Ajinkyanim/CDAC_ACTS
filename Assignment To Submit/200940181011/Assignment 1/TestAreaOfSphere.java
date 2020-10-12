import java.util.Scanner; ; 
public class TestAreaOfSphere {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the radius of Sphere :-  ");
		double radius = scan.nextDouble();
		
		AreaVolumeOfSphere obj = new AreaVolumeOfSphere(radius);
		obj.calculateArea();
		obj.calculateVolume();
		obj.displayDetails();
	}

}
