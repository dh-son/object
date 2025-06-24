package com.example.object.movieReservation;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
