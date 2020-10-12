
public class EqualityOfArray {
 int flag = 0 ;
	
	public void check(int [] array1 , int[] array2)
	{
	     for (int i= 0 ; i<array1.length ;i++ )
	     {
	    	 if(array1[i] != array2[i])
	    		 {  flag++; break; }
	     }
	     if(flag!=0)
	    	 System.out.println("Given Two Arrays are not Same...!!!");
	     else
	    	 System.out.println("Given Arrays are Same....!!");
	}

}
