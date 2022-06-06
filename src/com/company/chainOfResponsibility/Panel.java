package com.company.chainOfResponsibility;

public class Panel extends Container {
    private String modalHelpText;

    @Override
    public void showHelp() {
        if (modalHelpText != null)
            System.out.println(modalHelpText);
        else super.showHelp();
    }
}
