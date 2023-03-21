package ru.netology.sqr;

public class SQRService {

    public static int raschetDiapozona(int start, int finish) {
        int totalHit = 0;
        for (int number = 0; number <= 99; number++) {

            int sqr = number * number;
            if (sqr >= start && sqr <= finish)
                totalHit++;

        }
        return totalHit;
    }

}
