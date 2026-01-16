package com.study._26_Wrapper;

public class Sample {
    private int myNum;
    public static Sample[] mySamples = {
        new Sample(0),
        new Sample(1),
        new Sample(2),
        new Sample(3),
        new Sample(4),
    };

    public Sample(int myNum) {
        this.myNum = myNum;
    }

    public Sample getSample(int number) {
        for (Sample mySample : mySamples) {
            if (mySample.myNum == number) {
                return mySample;
            }
        }
        return new Sample(number);
    }


}
