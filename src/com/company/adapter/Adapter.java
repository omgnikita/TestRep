package com.company.adapter;

public class Adapter {
    public static void main(String[] args) {
        RoundHole RH = new RoundHole(5);
        RoundPeg RP = new RoundPeg(5);
        System.out.println(RH.fits(RP));

        SquarePeg SmallSP = new SquarePeg(2);
        SquarePeg LargeSP = new SquarePeg(6);
//        System.out.println(RH.fits(SmallSP));

        SquarePegAdapter SmallSPA = new SquarePegAdapter(SmallSP);
        SquarePegAdapter LargeSPA = new SquarePegAdapter(LargeSP);
        System.out.println(RH.fits(SmallSPA));
        System.out.println(RH.fits(LargeSPA));
    }
}
