import java.util.*;
import java.io.*;
public class Main{

	public static double Solve(int n,int p){
		double d=0.00;
		int left=0,right=0,mid;

		while(left<right){
			mid=(left+right)/2;

			if(mid*mid==n){
				d=mid;
				break;
			}

			if(mid*mid<n){
				left=mid+1;
				d=mid;
			}

			else{
				right=mid-1;
			}
		}

		double dob=0.1;

		for(int i=0;i<p;i++){
			while(d*d<=n){
				d+=dob;
			}

				d=d-dob;
		dob=dob/10;
		}

	return d;
	
		
	}
	public static void main(String[] args){
		int n=10;
		int p=3;

		double print=Solve(n,p);
		System.out.println(print);
		
	}
}