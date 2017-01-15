package com.puzzlebench.katadagger2lv1;

import android.app.Application;

import com.puzzlebench.katadagger2lv1.di.CharacterApiModule;
import com.puzzlebench.katadagger2lv1.di.CharacterComponent;
import com.puzzlebench.katadagger2lv1.di.DaggerCharacterComponent;


/**
 * Created by andresdavid on 13/01/17.
 */

public class KataDagger2Aplication extends Application {
    private CharacterComponent characterComponent;
    @Override
    public void onCreate() {
        super.onCreate();
        initInjector();
    }

    private void initInjector() {
        characterComponent = DaggerCharacterComponent.builder()
                .characterApiModule(new CharacterApiModule())
                .build();
    }

    public CharacterComponent getCharacterComponent() {
        return characterComponent;
    }

}
