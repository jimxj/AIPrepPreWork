package com.jim.interviewbit.playground;

import java.util.regex.Pattern;

public class RegexTest {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(".*(walmartimages.com).*");
        System.out.println(pattern.matcher("https://i5.walmartimages.com/asr/5a1e462f-2447-492f-bd64-06b47f4741ed_1.b5907ced4ab2c8fe96d624c5dc9a44a8.jpeg?odnHeight=450&odnWidth=450&odnBg=FFFFFF").matches());
    }
}
