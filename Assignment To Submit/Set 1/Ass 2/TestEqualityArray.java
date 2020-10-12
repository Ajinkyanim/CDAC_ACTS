import java.util.Scanner;
public class TestEqualityArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 System.out.println("Enter the size of array:-- ");
		 int size = scan.nextInt(); 
		 
		 int [] array1 = new int[size];
		 int [] array2 = new int [size];
		 
		System.out.println("Enter the First Array :-   ");
		 for(int i = 0 ; i<array1.length ;i++)				//Take array1 from input
		 {			 array1[i] = scan.nextInt();      }
		 
		 System.out.println("Enter the Second Array :-   ");
		 for(int i = 0 ; i<array2.length ;i++)				//Take array2 from input
		 {			 array2[i] = scan.nextInt();      }

		 EqualityOfArray obj = new EqualityOfArray();
		 obj.check(array1 , array2 )	;
	}
}

//======================================output ===============================
/*    output :-
Enter the size of array:-- 
5
Enter the First Array :-   
1 2 3 4 5 
Enter the Second Array :-   
1 2 3 4 5 
Given Arrays are Same....!! 
 */

/*   output:-
 Enter the size of array:-- 
5
Enter the First Array :-   
1 2 3 4 5
Enter the Second Array :-   
1 2 2 2  2
Given Two Arrays are not Same...!!!*/
