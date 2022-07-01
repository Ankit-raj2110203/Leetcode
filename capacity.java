class Solution {

    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int count=0;
        int n=capacity.length;
        //ArrayList<Integer> l=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            capacity[i]=capacity[i]-rocks[i];
        }
        //Collections.sort(l);
        Arrays.sort(capacity);
        for(int i=0;i<n;i++){

            if(additionalRocks>=capacity[i]){
                additionalRocks-=capacity[i];
                count++;
            }
        }
        return count;


    }
}
class capacity{
    public static void main(String[] args) {
        int[]capacity={54,18,91,49,51,45,58,54,47,91,90,20,85,20,90,49,10,84,59,29,40,9,100,1,64,71,30,46,91};
        int[]rocks={14,13,16,44,8,20,51,15,46,76,51,20,77,13,14,35,6,34,34,13,3,8,1,1,61,5,2,15,18};
        int additionalRocks=77;
        System.out.println(maximumBags(capacity,rocks,additionalRocks);
    }
}