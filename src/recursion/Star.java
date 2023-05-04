package recursion;

import javax.imageio.IIOException;
import java.io.*;

public class Star {
    static char arr [][];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int M = (int)Math.pow(2,N); //2차원 배열은 2의 거듭제곱으로 생성


        arr = new char[M][M]; //N^2를 한 2차원 배열 생성

        star(0, 0, M, false); //초기값은 x = 0, y = 0, M , false

        for(int i = 0; i < M; i++){
            for (int j = 0; j <M-i; j++){
                bw.write(arr[i][j]);
            }bw.write("\n");
        }
        bw.flush();
        bw.close();
    }

    static void star(int x, int y, int M, boolean blank){
        //공백을
        if (blank) {
            for (int i = x; i < x + M; i++) {
                for (int j = y; j < y + M; j++) {
                    arr[i][j] = ' ';
                }
            }
            return;
        }


        if(M == 1){
            arr[x][y] = '*';
            return;
        }

        int size = M / 2;
        int count = 0;
        for (int i = x; i < x + M; i += size) {
            for (int j = y; j < y + M; j += size) {
                count++;
                if (count == 4) { // 공백 칸일 경우
                    star(i, j, size, true);
                } else {
                    star(i, j, size, false);
                }
            }
        }
    }
}