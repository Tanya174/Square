package ru.netology.sqr;

public class SQRService {

    public int numberSquares(int minLimit, int maxLimit) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= minLimit && i * i <= maxLimit) {
                count++;
            }
        }
        return count;
    }
}
