package com.puzzlebench.katadagger2lv1.ui;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * Created by andresdavid on 14/01/17.
 */
public abstract class BaseActivity extends AppCompatActivity implements Presenter.View {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResID());
        bindViews();
        onPreparePresenter();
        onPrepareActivity();
    }

    private void bindViews() {
        ButterKnife.bind(this);
    }

    /**
     * @return the layout id associated to the layout used in the activity.
     */

    @LayoutRes protected abstract int getLayoutResID();
    /**
     * Called just after setContentView.
     * Override this method to configure your activity or initialize views
     */

    protected void onPrepareActivity() {

    }

    /**
     * Called before to initialize all the presenter instances linked to the component lifecycle.
     * Override this method to configure your presenter with extra data if needed.
     */

    protected void onPreparePresenter() {

    }

}
