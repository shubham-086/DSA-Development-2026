import java.util.ArrayList;
import java.util.PriorityQueue;

public class MST {
	static class Edge {
		int src, dest, wt;

		Edge(int src, int dest, int wt) {
			this.src = src;
			this.dest = dest;
			this.wt = wt;
		}
	}

	static class Pair implements Comparable<Pair> {
		int node, cost;

		Pair(int node, int dis) {
			this.node = node;
			this.cost = dis;
		}

		@Override
		public int compareTo(Pair p) {
			return this.cost - p.cost;
		}
	}

	static void primsAlgo(ArrayList<Edge>[] graph, int src, int V) {
		PriorityQueue<Pair> pq = new PriorityQueue<>();
		boolean[] vis = new boolean[V];
		pq.add(new Pair(src, 0));

		int mstCost = 0;

		while (!pq.isEmpty()) {
			Pair curr = pq.poll();
			if (!vis[curr.node]) {
				vis[curr.node] = true;
				mstCost += curr.cost;
			}
			for (Edge e : graph[curr.node]) {
				if (!vis[e.dest]) {
					pq.add(new Pair(e.dest, e.wt));
				}
			}
		}

		System.out.println(mstCost);
	}

	public static void main(String[] args) {
		int vertex = 5;
		ArrayList<Edge>[] graph = new ArrayList[vertex];

		for (int i = 0; i < graph.length; i++) {
			graph[i] = new ArrayList<>();
		}

		graph[0].add(new Edge(0, 1, 2));
		graph[0].add(new Edge(0, 3, 6));
		graph[1].add(new Edge(1, 0, 2));
		graph[1].add(new Edge(1, 2, 3));
		graph[1].add(new Edge(1, 4, 8));
		graph[2].add(new Edge(2, 1, 3));
		graph[2].add(new Edge(2, 3, 7));
		graph[3].add(new Edge(3, 0, 6));
		graph[3].add(new Edge(3, 2, 7));
		graph[3].add(new Edge(3, 4, 5));
		graph[4].add(new Edge(4, 1, 8));
		graph[4].add(new Edge(4, 3, 5));

		primsAlgo(graph, 0, vertex);
	}
}
