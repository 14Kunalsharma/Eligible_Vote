//Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
import java.util.*;
class Vote{
	public static void Age(int a){
		if(a>18){
		System.out.println("Is eligible to vote");
		} else{
		System.out.println("Is not eligible to vote");
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age: ");
		int a = sc.nextInt();
		Age(a);
		sc.close();
	}
}