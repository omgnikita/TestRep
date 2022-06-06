package com.company.chainOfResponsibility;

public class Dialog extends Container {
    private String wikiPageURL = "www.google.com";

    @Override
    public void showHelp() {
        if (wikiPageURL != null)
            System.out.println(wikiPageURL);
        else super.showHelp();
    }
}
