package com.company.test;

import com.company.kata_bowling;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

class kata_bowlingTest {
    private kata_bowling kataBowling;

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
        kataBowling = new kata_bowling();
    }

    @org.junit.jupiter.api.Test
    public void shouldScoreGutterGame() {
        rollMany(20, 0);

        assertThat(kataBowling.getScore(), is(0));
    }

    @org.junit.jupiter.api.Test
    public void shouldScoreAllOnes() {
        rollMany(20, 1);

        assertThat(kataBowling.getScore(), is(20));
    }

    @org.junit.jupiter.api.Test

    public void shouldScoreOneSpare() {
        rollSpare();
        kataBowling.roll(3);
        rollMany(17, 0);

        assertThat(kataBowling.getScore(), is(16));
    }

    @org.junit.jupiter.api.Test

    public void shouldScoreOneStrike() {
        rollStrike();
        kataBowling.roll(3);
        kataBowling.roll(4);
        rollMany(16, 0);

        assertThat(kataBowling.getScore(), is(24));
    }

    @org.junit.jupiter.api.Test
    public void shouldScorePerfectGame() {
        rollMany(12, 10);

        assertThat(kataBowling.getScore(), is(300));
    }

    private void rollMany(int rolls, int pins) {
        for (int i = 0; i < rolls; i++)
            kataBowling.roll(pins);
    }

    private void rollSpare() {
        kataBowling.roll(5);
        kataBowling.roll(5);
    }

    private void rollStrike() {
        kataBowling.roll(10);
    }
}