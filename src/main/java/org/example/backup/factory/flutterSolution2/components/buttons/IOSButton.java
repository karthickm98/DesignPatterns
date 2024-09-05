package org.example.backup.factory.flutterSolution2.components.buttons;

public class IOSButton implements Button {
    @Override
    public void showButton() {
        System.out.println("IOS Button displayed");

    }

    @Override
    public void clickButton() {
        System.out.println("IOS Button clicked");

    }
}
