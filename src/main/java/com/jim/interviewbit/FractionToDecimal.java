package com.jim.interviewbit;

public class FractionToDecimal {
    public String fractionToDecimal(int numerator, int denominator) {
        if (denominator == 0) {
            return null;
        }

        int remaining = numerator % denominator;
        if (remaining == 0) {
            return String.valueOf(numerator / denominator);
        } else {
            StringBuilder sb = new StringBuilder(numerator / denominator);
            sb.append(".");

            //FractionResult preResult = null;

            do {
                FractionResult result = computeDecimal(remaining, denominator);
                if (result.remaining == remaining) {
                    //repeating
                    sb.append("(").append(result.string).append(")");
                    break;
                } else {
                    sb.append(result.string);
                }

                remaining = result.remaining;
            } while (remaining != 0);

            return sb.toString();
        }
    }

    private FractionResult computeDecimal(int remaining, int denominator) {
        StringBuilder sb = new StringBuilder();
        while (remaining < denominator) {
            remaining = remaining * 10;
            sb.append("0");
        }

        return new FractionResult(sb.append(remaining / denominator).toString(), remaining % denominator);
    }

    private static class FractionResult {
        String string;
        int remaining;

        public FractionResult(String string, int remaining) {
            this.string = string;
            this.remaining = remaining;
        }
    }
}
