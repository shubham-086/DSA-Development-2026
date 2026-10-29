import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class GraphAlgo {
	static class Edge {
		int src, dest, wt;

		Edge(int src, int dest, int wt) {
			this.src = src;
			this.dest = dest;
			this.wt = wt;
		}
	}

	static class Pair implements Comparable<Pair> {
		int node, dis;

		Pair(int node, int dis) {
			this.node = node;
			this.dis = dis;
		}

		@Override
		public int compareTo(Pair p) {
			return this.dis - p.dis;
		}
	}

	static void topologicalSort(ArrayList<Edge>[] graph) {
		int[] indegree = new int[graph.length];

		for (int i = 0; i < graph.length; i++) {
			for (Edge e : graph[i]) {
				indegree[e.dest]++;
			}
		}

		Queue<Integer> q = new LinkedList<>();

		for (int i = 0; i < graph.length; i++) {
			if (indegree[i] == 0) {
				q.offer(i);
			}
		}

		while (!q.isEmpty()) {
			int curr = q.poll();
			System.out.print(curr + " ");

			for (Edge e : graph[curr]) {
				indegree[e.dest]--;

				if (indegree[e.dest] == 0) {
					q.offer(e.dest);
				}
			}
		}
	}

	static void dijkastra(ArrayList<Edge>[] graph, int src) {
		PriorityQueue<Pair> pq = new PriorityQueue<>();
		boolean[] vis = new boolean[graph.length];
		int[] dis = new int[graph.length];

		Arrays.fill(dis, Integer.MAX_VALUE);
		dis[src] = 0;

		pq.add(new Pair(src, 0));

		while (!pq.isEmpty()) {
			Pair curr = pq.poll();

			if (!vis[curr.node]) {
				vis[curr.node] = true;

				for (Edge e : graph[curr.node]) {
					int u = e.src;
					int v = e.dest;
					int w = e.wt;

					if (dis[u] + w < dis[v]) {
						dis[v] = dis[u] + w;
						pq.offer(new Pair(e.dest, dis[v]));
					}
				}
			}
		}

		System.out.println(Arrays.toString(dis));
	}

	static void bellmanFord(ArrayList<Edge>[] graph, int src, int V) {
		int[] dist = new int[V];
		Arrays.fill(dist, Integer.MAX_VALUE);
		dist[src] = 0;

		for (int i = 0; i < V - 1; i++) {
			for (int j = 0; j < V; j++) {
				for (Edge e : graph[j]) {
					int u = e.src;
					int v = e.dest;
					int w = e.wt;

					if (dist[u] != Integer.MAX_VALUE && dist[u] + w < dist[v]) {
						dist[v] = dist[u] + w;
					}
				}
			}
		}

		for (int i : dist) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		int vertex = 7;
		ArrayList<Edge>[] graph = new ArrayList[vertex];

		for (int i = 0; i < graph.length; i++) {
			graph[i] = new ArrayList<>();
		}

		// graph[0].add(new Edge(0, 1));
		// graph[0].add(new Edge(0, 2));

		// graph[1].add(new Edge(1, 3));

		// graph[2].add(new Edge(2, 1));
		// graph[2].add(new Edge(2, 3));

		// topologicalSort(graph);

		graph[0].add(new Edge(0, 1, 6));
		graph[0].add(new Edge(0, 2, 5));
		graph[0].add(new Edge(0, 3, 5));

		graph[1].add(new Edge(1, 4, -1));

		graph[2].add(new Edge(2, 1, -2));
		graph[2].add(new Edge(2, 4, 1));

		graph[3].add(new Edge(3, 2, -2));
		graph[3].add(new Edge(3, 5, -1));

		graph[4].add(new Edge(4, 6, 3));

		graph[5].add(new Edge(5, 6, 3));

		// dijkastra(graph, 0);
		bellmanFord(graph, 0, vertex);
	}
}
