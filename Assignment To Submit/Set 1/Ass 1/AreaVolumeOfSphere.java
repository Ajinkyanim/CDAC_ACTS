
public class AreaVolumeOfSphere {	
	
	 double r;
	double area;
	double volume ;
	
	AreaVolumeOfSphere(double r)				//Constructor
	{        this.r = r ;			}
	

	public void calculateArea()					//method to calculate area of sphere
	{     area = 4*Math.PI*r*r;         }
	
	public  void calculateVolume()				// method to calculate volume of sphere
	{		volume = (4/3d)*Math.PI*r*r*r ; 	}
	
	public void displayDetails()
	{ 		System.out.println("Area of Sphere is :- "+area);    
	   System.out.println("Volume of Sphere is :- "+volume);   }
	
}
