package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;

public class SQRServiceTest {

    @org.junit.jupiter.api.Test
    public void shouldCountSquaresFirst() {
        SQRService service = new SQRService();

        int expected = 2;
        int actual = service.numberSquares(110, 150);

        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldCountSquares() {
        SQRService service = new SQRService();

        int expected = 5;
        int actual = service.numberSquares(100, 200);

        Assertions.assertEquals(expected, actual);
    }
}

