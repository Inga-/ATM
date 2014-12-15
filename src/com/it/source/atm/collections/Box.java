package com.it.source.atm.collections;

import com.it.source.atm.interfaces.IBox;
import com.it.source.atm.moneys.*;

public class Box implements IBox {
    private Money arr[];
    private int i;
    
    public Box() {
        arr = new Money[4];
    }
    
    public void add(Money m) {
        if (i >= arr.length) {
            Money tmp [] = new Money[arr.length * 2];
            for (int j = 0; j < arr.length; j++){ 
            	tmp[j] = arr[j];
            }
            arr = tmp;
        }
        arr[i++] = m;
    }
    
    public Money get() {
        if (i == 0)
            return null;
        
        return arr[--i];
    } 
    
    public int size() {
        return i;
    } 

}
