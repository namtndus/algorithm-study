package makingStarToRectangle;

import java.util.Scanner;

public class MakingStarToRectangle {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();  // 가로의 길이
        int b = sc.nextInt();  // 세로의 길이

        for(int i = 0; i<b; i++){
            for(int j = 0; j<a; j++){
                sb.append("*");
            }
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
