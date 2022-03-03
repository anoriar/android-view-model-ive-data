package com.android.uraall.counter;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {
    private int count = 1;
    private MutableLiveData<Integer> countLiveData = new MutableLiveData<Integer>();

    public void decreaseValue() {
        --count;
        countLiveData.setValue(count);
    }

    public void increaseValue() {
        ++count;
        countLiveData.setValue(count);
    }

    public MutableLiveData<Integer> getCurrentValue() {
        countLiveData.setValue(count);
        return countLiveData;
    }
}