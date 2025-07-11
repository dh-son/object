package com.example.object.callFee;

import com.example.object.movieReservation.Money;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Phone extends AbstractPhone{
    private Money amount;
    private Duration seconds;

    public Phone(Money amount, Duration seconds, double taxRate) {
        super(taxRate);
        this.amount = amount;
        this.seconds = seconds;
    }

    @Override
    protected Money calculateCallFee(Call call) {
        return amount.times(call.getDuration().getSeconds() / seconds.getSeconds());
    }
}
