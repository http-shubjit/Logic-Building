// Binary search is the fastest algorithim for searching any element

// int start = your_stating_num;
// int end = your_ending_num;
// int n=searching_element;
// while(start<=end){
//     int mid=(start+end)/2;
//     if(n==mid){
//         return true;
//     }

//     else if(n>mid){
// start=mid+1;
//     }
//     else if(n<mid)
//     end=mid-1;

// }


//** Find Second Largest Element without sorting a array;

class Solution {
    public static void main(String[] args) {
        int[] arr = new int[] { 12, 3, 4, 2, 10, 6, 3 };
        int first = arr[0];
        int second = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > first) {
                second = first;
                first = arr[i];

            } else if (first < arr[i] && second < arr[i]) {
                second = arr[i];

            }
        }
        System.out.println(second);
    }
}

