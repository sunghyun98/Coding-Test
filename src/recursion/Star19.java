package recursion;

import java.io.*;

public class Star19 {
    static char arr[][];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int M = 4*N - 3;
        arr = new char[M][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                //star[i][j] = ' ';
            }
        }

        //star(int x)

    }
    public static void star(int x, int y){

    }
}
