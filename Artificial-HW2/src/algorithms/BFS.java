package algorithms;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Queue;

public class BFS {
	Node start;
	Node end;

	public BFS(Node startN, Node endN) {
		this.start = startN;
		this.end = endN;
	}

	public boolean solve() {
		if(this.start.equals(end)) {
			System.out.println("Solved");
			System.out.println(start);
		}

		Queue<Node> queue = new LinkedList<>();
		ArrayList<Node> visited = new ArrayList<>();
		queue.add(this.start);
		visited.add(start);

		while(!queue.isEmpty()){
			Node current = queue.remove();
			if(current.equals(this.end)) {
				System.out.println(visited);
				return true;
			}
			else{
				if(current.getChildren().isEmpty())
					return false;
				else
					queue.addAll(current.getChildren());
			}
			visited.add(current);
		}
		return false;
	}
}
