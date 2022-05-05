import java.util.*;
class Sorting{
	static void insertionSort(int a1[]){
	int n=a1.length;
	for(int i=1;i<n;i++){
		int k=a1[i];
		int j=i-1;
		while(j>=0 && a1[j]>k){
			a1[j+1]=a1[j];
			j--;
		}
		a1[j+1]=k;
	}
    }
	
	static void display(int a1[]){
		int n=a1.length;
	
	for(int i=0;i<n;i++){
		System.out.println(a1[i]);
	}
	}
	
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int a1[]=new int[sc.nextInt()];
		for(int i=0;i<a1.length;i++){
			a1[i]=sc.nextInt();
		}
		
		insertionSort(a1);
		display(a1);
		
	}
	
}