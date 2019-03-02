package algorithms;

import java.util.ArrayList;

public class A_Star {
	int map[][];
	Node start, end;
	
	public A_Star(int map[][], int startX, int startY, int endX, int endY) {
		this.map = map;
		start = new Node(startX, startY);
		end = new Node(endX, endY);
	}
}
