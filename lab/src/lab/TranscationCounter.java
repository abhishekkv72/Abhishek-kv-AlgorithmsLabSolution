package lab;

import java.util.Scanner;

public class TranscationCounter {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of transcations");
		
		int noOfTranscations = sc.nextInt();
		
		int arr[] = new int[noOfTranscations];
		
		System.out.println("Enter the transcation values");
		
		for(int i = 0; i < arr.length; i++) {
			arr[1] = sc.nextInt();
		}
		
		System.out.println("Enter the no of targets to be achieved");
		
		int noOfTargets = sc.nextInt();
		
		while (noOfTargets != 0) {
			System.out.println("Enter value of target");
			long targetValue = sc.nextInt();
			boolean isTargetAchieved = false;
			
			long sum=0;
			for(int i=0; i<arr.length; i++) {
				sum=sum+arr[i];
				if(sum>=targetValue) {
					System.out.println("Target is achieved at--"+(i+1));
					isTargetAchieved = true;
				break;
				
				}
			
			}
			
			if (isTargetAchieved == false) {
				System.out.println("Your target is not Achieved");
			}
		}
		}
		
		
		
}
