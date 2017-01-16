package com.puzzlebench.katadagger2lv1.di;

import com.puzzlebench.katadagger2lv1.CharacterApi;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by andresdavid on 14/01/17.
 */
@Module
public class CharacterApiModule {
    @Provides @Singleton
    CharacterApi providesCaracterApi()
    {
        return new CharacterApi();
    }
}
