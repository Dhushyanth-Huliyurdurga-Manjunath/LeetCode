package General;

public class MinSpeedTrain {
    public static void main(String[] args){
        Solution60 sol = new Solution60();

        int[] dist = {5, 3, 4, 6, 2, 2, 7};
        double hour = 10.92;

        int result = sol.minSpeedOnTime(dist, hour);
        System.out.println(result);
    }
}


class Solution60 {
    public int minSpeedOnTime(int[] dist, double hour) {
        int totalDistance = 0;
        double timeTaken = 0, minSpeed = 0, min = 1;

        for(int i: dist){
            totalDistance += i;
        }

        minSpeed = (int) Math.ceil(totalDistance / hour);
        double time = 0;
        for(int i = 0; i < dist.length - 1; i++){
             time = Math.ceil((double)dist[i] / minSpeed);
//            if(((double)dist[i]/minSpeed) < min){
//                minSpeed = ((double)totalDistance - (double)dist[i]) / (hour - time);
//            }
            timeTaken += time;
            System.out.println(dist[i]+" "+timeTaken+" "+time+" "+minSpeed);
        }
        double remainingTime = 0;
        if(timeTaken < hour){
            remainingTime = (hour - timeTaken);
            if(remainingTime < 1 && (minSpeed < dist[dist.length - 1])){
                minSpeed = (double) dist[dist.length - 1] / (hour - timeTaken);
            }
        }
        timeTaken += ((double)dist[dist.length - 1]/minSpeed);
        System.out.println(dist[dist.length - 1]+" "+timeTaken+" "+time+" "+minSpeed);
        System.out.println(((double)dist[dist.length - 1] / minSpeed)+" "+timeTaken);

//        System.out.println(timeTaken);

        return (timeTaken <= hour) ? (int)minSpeed : -1;
    }
}