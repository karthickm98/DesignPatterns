package org.example.factory.flutterProblem;

import org.example.factory.flutterProblem.components.buttons.AndroidButton;
import org.example.factory.flutterProblem.components.buttons.IOSButton;
import org.example.factory.flutterProblem.components.buttons.LinuxButton;
import org.example.factory.flutterProblem.components.buttons.WindowsButton;
import org.example.factory.flutterProblem.components.dropdowns.AndroidDropDown;
import org.example.factory.flutterProblem.components.dropdowns.IOSDropDown;
import org.example.factory.flutterProblem.components.dropdowns.LinuxDropDown;
import org.example.factory.flutterProblem.components.dropdowns.WindowDropDown;
import org.example.factory.flutterProblem.components.message.AndroidMessage;
import org.example.factory.flutterProblem.components.message.IOSMessage;
import org.example.factory.flutterProblem.components.message.LinuxMessage;
import org.example.factory.flutterProblem.components.message.WindowsMessage;
import org.example.factory.flutterProblem.enums.SupportedPlatform;

public class Flutter {
    public void setRefreshRate(int refreshRate) {   // specific method
        System.out.println("Refresh Rate set to " + refreshRate);
    }

    public void setTheme(){         // specific method
        System.out.println("setting Dark Theme");
    }

    public void createButton(SupportedPlatform platform){     //
        if(platform == SupportedPlatform.ANDROID){
            AndroidButton androidButton = new AndroidButton();
            androidButton.showButton();
        }
        if(platform == SupportedPlatform.IOS){
            IOSButton iosButton = new IOSButton();
            iosButton.showButton();
        }
        if(platform == SupportedPlatform.WINDOWS){
            WindowsButton windowsButton = new WindowsButton();
            windowsButton.showButton();
        }
        if(platform == SupportedPlatform.LINUX){
            LinuxButton linuxButton = new LinuxButton();
            linuxButton.showButton();
        }
    }

    public void createDropDown(SupportedPlatform platform){   //
        if(platform == SupportedPlatform.ANDROID){
            AndroidDropDown androidDropDown = new AndroidDropDown();
            androidDropDown.showDropDown();
        }
        if(platform == SupportedPlatform.IOS){
            IOSDropDown iosDropDown = new IOSDropDown();
            iosDropDown.showDropDown();
        }
        if(platform == SupportedPlatform.WINDOWS){
            WindowDropDown windowDropDown = new WindowDropDown();
            windowDropDown.showDropDown();
        }
        if(platform == SupportedPlatform.LINUX){
            LinuxDropDown linuxDropDown = new LinuxDropDown();
            linuxDropDown.showDropDown();
        }
    }

    // similar more methods, using if-else conditions.
    public void createMessage(SupportedPlatform platform, String text){
        if(platform == SupportedPlatform.ANDROID){
            AndroidMessage androidMessage = new AndroidMessage();
            androidMessage.writeText(text);
        }
        if(platform == SupportedPlatform.IOS){
            IOSMessage iosMessage = new IOSMessage();
            iosMessage.writeText(text);
        }
        if(platform == SupportedPlatform.WINDOWS){
            WindowsMessage windowsMessage = new WindowsMessage();
            windowsMessage.writeText(text);
        }
        if(platform == SupportedPlatform.LINUX){
            LinuxMessage linuxMessage = new LinuxMessage();
            linuxMessage.writeText(text);
        }
    }
}
