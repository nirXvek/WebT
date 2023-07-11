import java.util.Scanner;
public class PWArray{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[n];
		ArrayEx obj =new ArrayEx();
		obj.sumOfArray();
	}
}
class ArrayEx{
	void sumOfArray(){
		int sum=0;

		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i < arr.length;i++){
			sum +=arr[i];
		}
			System.out.println(sum);
	}
}
