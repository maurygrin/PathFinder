package algorithms;

import java.util.ArrayList;

public class Node {
	private int nodeX;
	private int nodeY;
	private Node left;
	private Node right;
	
	public Node(int nodeX, int nodeY) {
		this.nodeX = nodeX;
		this.nodeY = nodeY;
	}
	
	public Node(Node l, Node r) {
		this.left = l;
		this.right = r;
	}
	
	public int getX() {
		return nodeX;
	}
	
	public int getY() {
		return nodeY;
	}
	
	public ArrayList<Node> getChildren(){
        ArrayList<Node> cNodes = new ArrayList<>();
        if(this.left != null)
        {
            cNodes.add(left);
        }
        if(this.right != null) {
            cNodes.add(right);
        }
        return cNodes;
    }
	
	public boolean remove(Node x) {
		return false;
	}
}
