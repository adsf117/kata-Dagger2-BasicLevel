package com.puzzlebench.katadagger2lv1.di;

import com.puzzlebench.katadagger2lv1.di.CharacterApiModule;
import com.puzzlebench.katadagger2lv1.ui.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by andresdavid on 14/01/17.
 */
@Singleton @Component(modules = {CharacterApiModule.class})
public interface CharacterComponent {
    void inject(MainActivity mainActivity);
}
