package Top150;
import apple.laf.JRSUIUtils;
import sun.awt.image.ImageWatched;

import java.util.*;
import java.util.Collections;
import java.util.stream.Stream;

import static java.util.Arrays.sort;
import static java.util.Collections.sort;

/*There is a directed graph of n nodes with each node labeled from 0 to n - 1.
The graph is represented by a 0-indexed 2D integer array graph where graph[i]
is an integer array of nodes adjacent to node i, meaning there is an edge from
 node i to each node in graph[i].

A node is a terminal node if there are no outgoing edges. A node is a safe node
if every possible path starting from that node leads to a terminal node
 (or another safe node).

Return an array containing all the safe nodes of the graph.
The answer should be sorted in ascending order.*/

class Solution39 {
    public List<Integer> eventualSafeNodes(int[][] graph) {

        TreeMap<Integer, Integer> outGoingEdges = new TreeMap<>();
        HashMap<Integer, Integer> inComingEdges = new HashMap<>();
        List<Integer> finalList = new LinkedList<>();

        int rowIndex = 0;
        for(int[] i: graph){
            for(int j: i){
                inComingEdges.put(j, inComingEdges.getOrDefault(i, 0) + 1);
            }
            outGoingEdges.put(rowIndex, i.length);
            rowIndex++;
        }

        // Create a list of entries from the TreeMap
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(outGoingEdges.entrySet());

        // Sort the list using a custom comparator based on values
        Collections.sort(entryList, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> entry1, Map.Entry<Integer, Integer> entry2) {
                // Compare values in descending order
                return entry1.getValue().compareTo(entry2.getValue());
            }
        });

        // Create a new LinkedHashMap to maintain the order
        LinkedHashMap<Integer, Integer> sortedMap = new LinkedHashMap<>();

        // Put the sorted entries into the sortedMap
        for (Map.Entry<Integer, Integer> entry : entryList) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

//         Print the sorted entries
        for (Map.Entry<Integer, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        for(int i: sortedMap.keySet()){
            if(sortedMap.get(i) == 0){
                finalList.add(i);
            }
//            else if(sortedMap.get(i) == 1){
//                int value = graph[i][0];
//                if(sortedMap.containsKey(value)){
//                    finalList.add(i);
//                }
//                else{
//                    if(sortedMap.containsKey(graph[value][0])){
//                        finalList.add(i);
//                        finalList.add(value);
//                    }
//                }
//            }
            else{
                int count = 0;
                int[] row = graph[i];
                for(int n: row){
                    if(finalList.contains(n)){
                        count++;
                    }
                    else if(finalList.contains(graph[n][0]) && graph[n].length == 1){
                        count++;
                    }
                    System.out.println(finalList);
                }
                if(count == graph[i].length)
                    finalList.add(i);
            }
        }

        Collections.sort(finalList);
        System.out.println(finalList);
        System.out.println(inComingEdges);
        return finalList;

//        System.out.println(outGoingEdges);
//
//        return null;

//        /*List containing all the terminal nodes in the graph*/
//        HashSet<Integer> terminalNodes = new HashSet<Integer>();
//        List<Integer> safeNodes = new LinkedList<>();

        /*Iterates through the 2D array and if there's any
        * occurrence of an empty array that means there are no
        * out-going edges from that particular node. rowIndex is
        * being used to keep track of the current node index in
        * the 2D array. */

//        int rowIndex = 0;
//        for (int[] i : graph) {
//            if(i.length == 0){
//                terminalNodes.add(rowIndex);
//            }
//            rowIndex++;
//        }
//
//        rowIndex = 0;
//        for(int[] i: graph){
//            int count = 0;
//            for(int j: i){
//                if(terminalNodes.contains(j))
//                    count++;
//            }
//            if(count == i.length) {
//                safeNodes.add(rowIndex);
//                terminalNodes.add(rowIndex);
//            }
//            rowIndex++;
//        }
//
//        System.out.println(terminalNodes);
//        System.out.println(safeNodes);
//        return safeNodes;
    }
}

public class SafeState {
    public static void main(String[] args){
        Solution39 sol = new Solution39();
//        [[],[0,2,3,4],[3],[4],[]]
//        [[1,2],[2,3],[5],[0],[5],[],[]]
//        [[],[2],[3,4],[4],[]]
        int[][] graph = {{}, {2}, {3,4}, {4}, {}};
//        int[][] graph = {{1,2}, {2,3}, {5}, {0}, {5}, {}, {}};
//        int[][] graph = {{}, {0,2,3,4}, {3}, {4}, {}};
//        int[][] graph = {{1,2},{2,3},{5},{0},{5},{},{}};

        List<Integer> outputList = sol.eventualSafeNodes(graph);
    }
}
