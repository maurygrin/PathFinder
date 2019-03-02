package main;

import java.util.Scanner;
import java.io.*;

public class main {
	public long max_time = 3 * 60 * 1000;

	public static void main(String [] args) throws IOException{
		//String name = args[0];
		String name = "map.txt";
		Scanner map = new Scanner(new File(name));
		int count = 0;
		int fill = 0;
		int x = 0; int y = 0;
		int startX; int startY;
		int endX; int endY;
		int[][] array = new int[0][0];
		//while(true) {
		//if(args.length > 2) {
		//	System.out.println("Enter a map and the name of the algorithm.");
		//}
		//else if(args.length < 2) {
		//	System.out.println("Invalid input.");
		//}
		//	else if(map.exists() == false) {
		//		System.out.println("The entered file does not exist.");
		//	}
		//else {
		//	break;
		//}
		//}
		while(map.hasNext()) {
			String line = map.nextLine();
			String[] split = line.split(" ");
			if(count == 0) {
				x = Integer.parseInt(split[0]); 
				y = Integer.parseInt(split[1]);
				array = new int[x][y];
			}
			if(count == 1) {
				startX = Integer.parseInt(split[0]); 
				startY = Integer.parseInt(split[1]);
			}
			if(count == 2) {
				endX = Integer.parseInt(split[0]); 
				endY = Integer.parseInt(split[1]);
			}
			if(count > 2) {
				if(fill != y-2) {
					for(int col = 0; col < y; col++) {
						array[fill][col] = Integer.parseInt(split[col]); 
					}
					fill++;
				}
			}
			count++;
		}
		print(array);
		System.out.println("Cost of the path found: ");
		System.out.println("Number of nodes expanded: ");
		System.out.println("Maximum number of nodes held in memory: ");
		System.out.println("Runtime of the algorithm (milliseconds): ");
		System.out.println("Path sequence of coordinates: ");
	}

	public static void print(int[][] a){
		for(int row = 0; row < a.length; row++){
			for(int col = 0; col < a[row].length;col++){
				System.out.print(a[row][col]+"\t");
			}
			System.out.println();
		}
	}
}
