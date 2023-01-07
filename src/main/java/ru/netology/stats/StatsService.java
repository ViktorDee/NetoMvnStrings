package ru.netology.stats;

public class StatsService {

    public int allSalesSum(int[] sales) {
        int salesSum = 0;
        for (int s : sales) {
            salesSum += s;
        }
        return salesSum;
    }

    public int salesAverage(int[] sales) {
        int salesAvg = 0;
        for (int i = 0; i < sales.length; i++) {
            salesAvg += sales[i];
        }
        return salesAvg / sales.length;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month++;
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month++;
        }
        return minMonth + 1;
    }

    public int salesBelowAverage(int[] sales) {
        int salesAvg = 0;
        int monthsBelowAvg = 0;
        int sumOfMonths = 0;

        for (int i = 0; i < sales.length; i++) {
            sumOfMonths = sumOfMonths + sales[i];
        }
        salesAvg = sumOfMonths / sales.length;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < salesAvg) {
                monthsBelowAvg++;
            }
        }
        return monthsBelowAvg;
    }

    public int salesGreaterThanAverage(int[] sales) {
        int salesAvg = 0;
        int monthsGreaterThanAvg = 0;
        int sumOfMonths = 0;

        for (int i = 0; i < sales.length; i++) {
            sumOfMonths = sumOfMonths + sales[i];
        }
        salesAvg = sumOfMonths / sales.length;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > salesAvg) {
                monthsGreaterThanAvg++;
            }
        }
        return monthsGreaterThanAvg;
    }
}
