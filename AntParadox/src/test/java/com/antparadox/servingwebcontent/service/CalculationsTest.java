package com.antparadox.servingwebcontent.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculationsTest {

    @Test
    public void harmonic_series_should_return_correct_seconds_and_harmonic_value() {
        Calculations calculations = new Calculations();
        calculations.harmonicSeries(1,1,1);
        assertEquals(calculations.getSeconds(),3);
    }
}
