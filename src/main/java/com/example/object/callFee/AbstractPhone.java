package com.example.object.callFee;

import com.example.object.movieReservation.Money;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractPhone {

    private double taxRate;
    private List<Call> calls = new ArrayList<>();

    public AbstractPhone(double taxRate) {
        this.taxRate = taxRate;
    }

    public Money calculateFee() {
        Money result = Money.ZERO;

        for (Call call : calls) {
            result = result.plus(calculateCallFee(call));
        }

        return result.plus(result.times(taxRate));
    }

    abstract protected Money calculateCallFee(Call call);
}
