package com.mytests.spring.springbootconfigpropsgeneric.originalCase;

import java.util.Optional;
import java.util.function.Predicate;

public class ConditionalRetryPredicate implements Predicate<Optional<Usage>> {
    @Override
    public boolean test(Optional<Usage> usage) {
        return false;
    }

    @Override
    public Predicate<Optional<Usage>> and(Predicate<? super Optional<Usage>> other) {
        return Predicate.super.and(other);
    }

    @Override
    public Predicate<Optional<Usage>> negate() {
        return Predicate.super.negate();
    }

    @Override
    public Predicate<Optional<Usage>> or(Predicate<? super Optional<Usage>> other) {
        return Predicate.super.or(other);
    }
}