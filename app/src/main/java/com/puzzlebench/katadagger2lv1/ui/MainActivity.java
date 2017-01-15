package com.puzzlebench.katadagger2lv1.ui;



import android.support.v4.content.ContextCompat;
import android.widget.ImageView;
import android.widget.TextView;

import com.puzzlebench.katadagger2lv1.Character;
import com.puzzlebench.katadagger2lv1.CharacterApi;
import com.puzzlebench.katadagger2lv1.KataDagger2Aplication;
import com.puzzlebench.katadagger2lv1.R;


import javax.inject.Inject;

import butterknife.BindView;

public class MainActivity extends BaseActivity {

    @Inject CharacterApi characterApi;


    @BindView(R.id.characternameLabel)
    TextView characternameLabel;
    @BindView(R.id.characterImage)
    ImageView characterImage;


    @Override
    protected int getLayoutResID() {
        return R.layout.activity_main;
    }

    @Override protected void onPrepareActivity() {
        super.onPrepareActivity();
        initializeDagger();
        Character character = getCharacterFromApi();
        rederCharacter(character);


    }

    private Character getCharacterFromApi() {
        return characterApi.getCaracterApi();
    }
    private void rederCharacter(Character character) {
        renderName(character.getName());
        renderImage(character.getImage());
    }

    private void renderImage(int image) {
        characterImage.setImageDrawable(ContextCompat.getDrawable(this,image));
    }

    private void renderName(int name) {
        characternameLabel.setText(name);
    }

    private void initializeDagger() {
        KataDagger2Aplication application = (KataDagger2Aplication)getApplication();
        application.getCharacterComponent().inject(this);
    }
}
