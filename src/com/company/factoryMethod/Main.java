package com.company.factoryMethod;

import com.company.factoryMethod.Dialog.Dialog;
import com.company.factoryMethod.Dialog.WebDialog;
import com.company.factoryMethod.Dialog.WindowsDialog;

public class Main {
    public static void main(String[] args) {
        Dialog winDialog = new WindowsDialog();
        Dialog HTMLDialog = new WebDialog();
        winDialog.renderWindow();
        HTMLDialog.renderWindow();
    }
}
