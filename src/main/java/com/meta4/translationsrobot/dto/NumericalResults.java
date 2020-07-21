package com.meta4.translationsrobot.dto;

public enum NumericalResults {
    WITHOUT_EXTRACTION(0),
    NOT_VALIDATED_YET(1),
    IS_WRONG(2),
    IS_OK(3);
    private final int value;

    NumericalResults(int value) {
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}
