package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxInArrayWhereFirstElementNotMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {8, 12, 15, 98, 0, 144, 5, 86};
        long expected = 144;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
}