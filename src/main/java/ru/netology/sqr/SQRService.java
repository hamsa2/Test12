package ru.netology.sqr;

public class SQRService {

    public int checkSquare(int x, int y) {
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if ((i*i) >= 10 && (i*i) <= 99) {
                count++;
            }
        }
        return count;
    }

}
