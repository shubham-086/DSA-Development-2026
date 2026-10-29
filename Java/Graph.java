import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Graph {
	static class Edge {
		int src, dest, wt;

		Edge(int src, int dest, int wt) {
			this.src = src;
			this.dest = dest;
			this.wt = wt;
		}

		@Override
		public String toString() {
			return "{" + src + "," + dest + "," + wt + "}";
		}
	}

	static class Pair {
		int node;
		int parent;

		Pair(int node, int parent) {
			this.node = node;
			this.parent = parent;
		}
	}

	static void bfs(ArrayList<Edge>[] graph, int src) {
		Queue<Integer> q = new LinkedList<>();
		boolean[] vis = new boolean[graph.length];

		q.add(src);

		while (!q.isEmpty()) {
			int curr = q.remove();

			if (!vis[curr]) {
				System.out.print(curr + " ");
				vis[curr] = true;

				for (Edge e : graph[curr]) {
					q.add(e.dest);
				}
			}
		}
	}

	static void dfs(ArrayList<Edge>[] graph, boolean[] vis, int src) {
		System.out.print(src + " ");
		vis[src] = true;

		for (Edge e : graph[src]) {
			if (!vis[e.dest]) {
				dfs(graph, vis, e.dest);
			}
		}
	}

	static boolean isCycle(ArrayList<Edge>[] graph) {
		boolean[] vis = new boolean[graph.length];

		for (int i = 0; i < graph.length; i++) {
			if (!vis[i]) {
				if (detectCycleBfs(graph, vis, i)) {
					return true;
				}
			}
		}

		return false;
	}

	static boolean detectCycleBfs(ArrayList<Edge>[] graph, boolean[] vis, int src) {
		Queue<Pair> q = new LinkedList<>();

		q.offer(new Pair(src, 0));

		while (!q.isEmpty()) {
			Pair curr = q.remove();

			for (Edge e : graph[curr.node]) {
				int nei = e.dest;
				if (!vis[nei]) {
					vis[nei] = true;
					q.offer(new Pair(nei, curr.node));
				} else if (nei != curr.parent) {
					return true;
				}
			}
		}

		return false;
	}

	public static void main(String[] args) {
		int vertex = 5;
		ArrayList<Edge>[] graph = new ArrayList[vertex];

		for (int i = 0; i < graph.length; i++) {
			graph[i] = new ArrayList<>();
		}

		graph[0].add(new Edge(0, 1, 4));
		graph[0].add(new Edge(0, 2, 8));

		graph[1].add(new Edge(1, 0, 4));
		graph[1].add(new Edge(1, 2, 3));
		graph[1].add(new Edge(1, 4, 6));

		graph[2].add(new Edge(2, 0, 8));
		graph[2].add(new Edge(2, 1, 3));
		graph[2].add(new Edge(2, 3, 3));

		graph[3].add(new Edge(3, 2, 2));
		graph[3].add(new Edge(3, 4, 10));

		graph[4].add(new Edge(4, 1, 6));
		graph[4].add(new Edge(4, 3, 10));

		// for (int i = 0; i < graph[2].size(); i++) {
		// System.out.println(graph[2].get(i).dest);
		// }

		// for (int i = 0; i < graph.length; i++) {
		// for (Edge e : graph[i]) {
		// System.out.print(e + " ");
		// }
		// System.out.println();
		// }

		// bfs(graph, 0);
		// dfs(graph, new boolean[vertex], 0);

		System.out.println(isCycle(graph));
	}
}