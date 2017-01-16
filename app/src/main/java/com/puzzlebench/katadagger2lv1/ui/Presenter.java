package com.puzzlebench.katadagger2lv1.ui;

/**
 * Created by andresdavid on 14/01/17.
 */

 class Presenter <T extends Presenter.View> {

    private T view;

    public void setView(T view) {
        this.view = view;
    }

    public T getView() {
        return view;
    }

    public void initialize() {

    }

    public void terminate() {

    }

    public interface View {

    }
}
