package com.company.adapter;

public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        super(peg.getWidth());
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        return Math.sqrt(2 * Math.pow(peg.getWidth(), 2) / 2);
    }
}
