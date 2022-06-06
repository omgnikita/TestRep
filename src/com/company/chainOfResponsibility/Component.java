package com.company.chainOfResponsibility;

abstract public class Component implements ComponentWithContextualHelp {
    public String tooltipText;

    protected Container container;

    @Override
    public void showHelp() {
        if (tooltipText != null)
            System.out.println(tooltipText);
        else container.showHelp();
    }
}
