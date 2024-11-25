import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] roomSize = br.readLine().split(" ");
        int[][] room = new int[Integer.parseInt(roomSize[0])][Integer.parseInt(roomSize[1])];

        String[] start = br.readLine().split(" ");

        for (int i = 0; i < room.length; i++) {
            String[] state = br.readLine().split(" ");
            for (int j = 0; j < room[i].length; j++) {
                room[i][j] = Integer.parseInt(state[j]);
            }
        }

        int result = 0;
        int r = Integer.parseInt(start[0]);
        int c = Integer.parseInt(start[1]);
        int direction = Integer.parseInt(start[2]);

        while (true) {
            int target = room[r][c];
            if (target == 0) {
                result++;
                room[r][c] = 9;
            }
            boolean cleanCheck = false;

            // 주변 4 칸 중 청소 되어 있지 않은 칸이 존재할 경우
            if (c == 0) {
                cleanCheck = room[r][c + 1] == 0 || room[r - 1][c] == 0 || room[r + 1][c] == 0;
            } else if ( c == room[r].length) {
                cleanCheck = room[r][c - 1] == 0 ||room[r - 1][c] == 0 || room[r + 1][c] == 0;
            } else if ( r == 0 ) {
                cleanCheck = room[r][c - 1] == 0 || room[r][c + 1] == 0 || room[r + 1][c] == 0;
            } else if ( r == room.length ) {
                cleanCheck = room[r][c - 1] == 0 || room[r][c + 1] == 0 || room[r - 1][c] == 0;
            } else {
                cleanCheck = room[r][c - 1] == 0 || room[r][c + 1] == 0 || room[r - 1][c] == 0 || room[r + 1][c] == 0;
            }

            if (cleanCheck) {
                // 반 시계 방향으로 방향 전환
                if (direction == 0) {
                    direction = 3;
                } else {
                    direction--;
                }

                if (direction == 0) {
                    // 북
                    if (room[r - 1][c] == 0) {
                        r -= 1;
                    } else {
                        continue;
                    }
                } else if (direction == 1) {
                    // 동
                    if (room[r][c + 1] == 0) {
                        c += 1;
                    } else {
                        continue;
                    }
                } else if (direction == 2) {
                    // 남
                    if (room[r + 1][c] == 0) {
                        r += 1;
                    } else {
                        continue;
                    }
                } else if (direction == 3) {
                    // 서
                    if (room[r][c - 1] == 0) {
                        c -= 1;
                    } else {
                        continue;
                    }
                }
            } else {
                // 후진
                if (direction == 0) {
                    // 북
                    if (room[r + 1][c] == 1) {
                        System.out.println(result);
                        return;
                    } else {
                        r += 1;
                    }
                } else if (direction == 1) {
                    // 동
                    if (room[r][c - 1] == 1) {
                        System.out.println(result);
                        return;
                    } else {
                        c -= 1;
                    }
                } else if (direction == 2) {
                    // 남
                    if (room[r - 1][c] == 1) {
                        System.out.println(result);
                        return;
                    } else {
                        r -= 1;
                    }
                } else if (direction == 3) {
                    // 서
                    if (room[r][c + 1] == 1) {
                        System.out.println(result);
                        return;
                    } else {
                        c += 1;
                    }
                }
            }
        }
    }
}