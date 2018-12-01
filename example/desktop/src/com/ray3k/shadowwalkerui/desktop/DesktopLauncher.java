package com.ray3k.shadowwalkerui.desktop;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Window;
import com.ray3k.shadowwalkerui.Core;
import com.ray3k.shadowwalkerui.DesktopWorker;
import java.awt.SplashScreen;

public class DesktopLauncher implements DesktopWorker {

    public static void main(String[] arg) {
        Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
        config.setDecorated(false);
        config.setTransparentFramebuffer(true);
        config.setWindowedMode(400, 600);
        
        Core core = new Core();
        Core.desktopWorker = new DesktopLauncher();
        new Lwjgl3Application(core, config);
    }
    
    @Override
    public void dragWindow(int x, int y) {
        Lwjgl3Window window = ((Lwjgl3Graphics) Gdx.graphics).getWindow();
        window.setPosition(x, y);
    }

    @Override
    public int getWindowX() {
        return ((Lwjgl3Graphics) Gdx.graphics).getWindow().getPositionX();
    }

    @Override
    public int getWindowY() {
        return ((Lwjgl3Graphics) Gdx.graphics).getWindow().getPositionY();
    }

    @Override
    public void closeSplash() {
        SplashScreen splash = SplashScreen.getSplashScreen();
        if (splash != null) {
            splash.close();
        }
    }
}
