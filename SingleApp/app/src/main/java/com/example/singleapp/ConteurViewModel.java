package com.example.singleapp;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ConteurViewModel extends ViewModel {
    MutableLiveData<Integer> aCounter;

    public Integer getCurrentCounterValue(){
        if(aCounter == null || aCounter.getValue() == null)
            aCounter.setValue(0); // au cas ou
        return aCounter.getValue();
    }

    public void incrementCounter(int plusValue){
        this.aCounter.setValue(this.aCounter.getValue()+1);
    }

    public void drecrementCounter(){
        this.aCounter.setValue(this.aCounter.getValue()-1);
    }


    public void resetCounter(){
        aCounter.setValue(0);
    }

}
