import java.util.HashSet;

class Network {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] network = new boolean[n];

        for (int node=0; node<n; node++) {
            if (!network[node]) {
                dfs(computers, node, network);
                answer++;
            }
        }

        return answer;
    }

    boolean[] dfs(int[][] computers, int node, boolean[] visited) {
        visited[node] = true;

        for (int i=0; i<computers.length; i++) {
            if (node != i && computers[node][i] == 1 && visited[i] == false) {
                visited = dfs(computers, i, visited);
            }
        }
        return visited;
    }
}