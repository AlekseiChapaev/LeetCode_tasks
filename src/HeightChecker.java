import java.util.Arrays;

public class HeightChecker {
    public static void main(String[] args) {

        int count = 0;
        int[] heights = new int[]{1,1,4,2,1,3};
        int[] doub = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            doub[i] = heights[i];
        }
        Arrays.sort(heights);

        for (int i = 0; i < heights.length; i++) {
            if(heights[i] != doub[i]){
                count++;
            }
        }
        System.out.println(count);

    }
}