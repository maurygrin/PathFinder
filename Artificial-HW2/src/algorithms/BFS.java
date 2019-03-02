package algorithms;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Queue;

import javax.xml.soap.Node;

public class BFS {
	Node start;
	Node end;
	
	public BFS(Node startN, Node endN) {
		this.start = startN;
		this.end = endN;
	}
	
	public boolean solve() {
		if(this.startN.equals(end)) {
			System.out.println("Solved");
			System.out.println(start);
		}
		
		Queue<node> queue = new LinkedList<>();
		ArrayList<Node> visited = new ArrayList<>();
		queue.add(this.start);
		visited.add(start);
		
		while(!queue.isEmpty()) {
			Node 
		}
	}
}
