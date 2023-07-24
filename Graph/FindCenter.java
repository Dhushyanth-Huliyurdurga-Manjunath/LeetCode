package Graph;

public class FindCenter {
    public static void main(String[] args){
        Solution59 sol = new Solution59();

        int[][] graph = {{1,2}, {5, 1}, {1, 3}, {1, 4}};

        int result = sol.findCenter(graph);
        System.out.println(result);

    }
}

class Solution59 {
    public int findCenter(int[][] edges) {
        // HashSet<Integer> hashSet = new HashSet<>();

        // for(int i = 0; i < edges[0].length; i++){
        //     hashSet.add(edges[0][i]);
        // }

        // for(int i = 0; i < edges[0].length; i++){
        //     if(hashSet.contains(edges[1][i])){
        //         return edges[1][i];
        //     }
        // }
        // return 0;

        if(edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1])
            return edges[0][0];
        else
            return edges[0][1];
    }
}