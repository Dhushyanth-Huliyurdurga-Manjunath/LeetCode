/*Intitial Solution*/

// class Solution {
//     public int[] findArray(int[] pref) {
//         int[] arr = new int[pref.length];
//         // List<Integer> list  = new ArrayList<Integer>();
//         int xorValue = 0;

//         arr[0] = pref[0];
//         for(int i = 1; i < pref.length; i++){
//             // int count = 0;
//             arr[i] = pref[i-1] ^ pref[i];
            
//             // xorValue = xorValue^arr[i];

//             // for(int j = 0; j < 9; j++){
//             //     System.out.println(xorValue);
//             //     if(pref[i] == (xorValue ^ j) && count <= i){
//             //         xorValue = xorValue^j;
//             //         arr[i] = j;
//             //         // list.add(j);
//             //         count++;
//             //     }
//             // }
//         }

//             // while(count <= i){
//             //     for(int j = 0; j < 9; j++){
//             //         System.out.println(pref[i]);
//             //         if(pref[i] == (xorValue ^ j) && !list.contains(j)){
//             //             arr[i] = j;
//             //             list.add(j);
//             //             count++;
//             //         }
//             //     }
//             // }
//         // }

//         return arr;
//     }
// }


/*End of Initial Solution */

/*Final Solution */
class Solution {
    public int[] findArray(int[] pref) {
        int[] arr = new int[pref.length];
        
        for(int i = 0; i < pref.length; i++){
            if(i == 0)
                arr[0] = pref[0];
            else
                arr[i] = pref[i-1] ^ pref[i];
        }
        return arr;
    }
}
/*End of Final Solution*/