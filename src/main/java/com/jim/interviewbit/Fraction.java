package com.jim.interviewbit;

import java.util.HashMap;
import java.util.Map;

public class Fraction {
    public String fractionToDecimal(long numerator, long denominator) {
        if (denominator == 0) {
            return null;
        }

        StringBuilder sb = new StringBuilder();
        if (numerator > 0 && denominator < 0 || numerator < 0 && denominator > 0) {
            sb.append("-");
        }
        numerator = Math.abs(numerator);
        denominator = Math.abs(denominator);

        long remaining = numerator % denominator;
        if (remaining == 0) {
            sb.append(numerator / denominator);
        } else {
            sb.append((int) (numerator / denominator));
            sb.append(".");

            Map<Long, Integer> cache = new HashMap<>();
            do {
                if (cache.containsKey(remaining)) {
                    String repeatStr = sb.substring(cache.get(remaining));
                    sb.setLength(cache.get(remaining));
                    sb.append("(").append(repeatStr).append(")");
                    break;
                }

                FractionResult result = computeDecimal(remaining, denominator);
                if (result.remaining == remaining) {
                    //repeating
                    sb.append("(").append(result.string).append(")");
                    break;
                } else {
                    cache.put(remaining, sb.length());
                    sb.append(result.string);
                }

                remaining = result.remaining;
            } while (remaining != 0);

        }

        return sb.toString();
    }

    private FractionResult computeDecimal(long remaining, long denominator) {
        StringBuilder sb = new StringBuilder();
        remaining = remaining * 10;
        while (remaining < denominator) {
            remaining = remaining * 10;
            sb.append("0");
        }

        return new FractionResult(sb.append((int) (remaining / denominator)).toString(), remaining % denominator);
    }

    private static class FractionResult {
        String string;
        long remaining;

        public FractionResult(String string, long remaining) {
            this.string = string;
            this.remaining = remaining;
        }
    }
}
