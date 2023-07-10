class Solution11 {
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] answer = new int[queries.length];

        // for (int i = 0; i < queries.length; i++) {
        //     for (int j = 0; j < points.length; j++) {
        //         double rSquared = Math.pow(queries[i][2], 2);
        //         double xSquared = Math.pow(queries[i][0]-points[j][0], 2);
        //         double ySquared = Math.pow(queries[i][1]-points[j][1], 2);
                
        //         if(xSquared+ySquared <= rSquared){
        //             answer[i]++;
        //         }
        //     }
        // }

        int count = 0;
        for(int[] q: queries){
            for(int[] p: points){
                double rSquared = Math.pow(q[2], 2);
                double xSquared = Math.pow(q[0]-p[0], 2);
                double ySquared = Math.pow(q[1]-p[1], 2);

                if(xSquared+ySquared <= rSquared){
                    answer[count]++;
                }
            }
                count++;
        }
        return answer;
    }
}
