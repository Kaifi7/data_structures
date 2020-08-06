package graphs;

import java.util.ArrayList;
import java.util.Arrays;

public class Transitive_closure {
	
	private int vertices;
	private ArrayList<Integer>adjList[];
	private int tc[][];
	public Transitive_closure(int vertices) {
		this.vertices = vertices;
		this.tc = new int[this.vertices][this.vertices];
		initAdjList();
	}
	private void initAdjList() {
		adjList = new ArrayList[vertices];
		for(int i=0; i<vertices; i++) {
			adjList[i] = new ArrayList<>();
		}
	}
	public void addEdge(int u, int v) {
		adjList[u].add(v);
	}
	public void transitiveClosure() {
		for(int i=0; i<vertices; i++) {
			dfsUtil(i, i);
		}
		for(int i=0; i<vertices; i++) {
			System.out.println(Arrays.toString(tc[i]));
		}
	}
	private void dfsUtil(int s, int v) {
		tc[s][v]=1;
		for(int adj : adjList[v]) {
			if(tc[s][adj]==0) {
				dfsUtil(s,adj);
			}
		}
	}
	public static void main(String[] args) {
		Transitive_closure t = new Transitive_closure(4);
		t.addEdge(0, 1);
		t.addEdge(0, 2);
		t.addEdge(1, 2);
		t.addEdge(2, 0);
		t.addEdge(2, 3);
		t.addEdge(3, 3);
		System.out.println("Transitive closure of matrix is : ");
		t.transitiveClosure();
	}

}
