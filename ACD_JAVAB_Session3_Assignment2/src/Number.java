//Session3_Assignment2 : 31.4.2016
//Author: Kamakshi Abbi
import java.util.Scanner;
public class Number {
	int num;
	public Number(int num){
		this.num = num;
	}

	public boolean checkPrime(){
		for (int i = 1; i < num; i++) {
			if(num%i == 0){
				if(i!= 1 && i!=num){
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = input.nextInt();
		Number obj = new Number(num);
		input.close();
		if(obj.checkPrime()){
			System.out.println(num+ " is a prime number");
		}
		else{
			System.out.println(num + " is not a prime number");
		}
	}
}
