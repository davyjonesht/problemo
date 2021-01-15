package problemo.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArrayRotation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inp1 =  br.readLine();
        int d = Integer.parseInt(br.readLine());
        int arr[] = Arrays.stream(inp1.split(" ")).mapToInt(Integer::parseInt).toArray();
        //System.out.println(Arrays.toString(arr));

        int gcd = gcd(arr.length, d);

        for (int i = 0; i < gcd; i++){
            int temp = arr[i];
            int j = i;
            while(j+d < arr.length){
                arr[j] = arr[j+d];
                j = j+d;
            }
            arr[j] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static int gcd(int a, int b) {
        if(b==0)
            return a;
        return gcd(b, a%b);
    }
}
