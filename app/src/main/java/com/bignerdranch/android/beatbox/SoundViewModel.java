package com.bignerdranch.android.beatbox;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by Mateusz on 2017-04-02.
 */

public class SoundViewModel extends BaseObservable {

    private Sound mSound;
    private BeatBox mBeatBox;

    public SoundViewModel(BeatBox mBeatBox) {
        this.mBeatBox = mBeatBox;
    }

    @Bindable
    public String getTitle() {
        return mSound.getmName();
    }

    public Sound getSound() {
        return mSound;
    }

    public void setSound(Sound sound) {
        mSound = sound;
        notifyPropertyChanged(BR.title);
    }

    public void onButtonClicked() {

        mBeatBox.play(mSound);
    }
}
