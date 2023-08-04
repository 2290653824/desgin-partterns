package com.zj.structurePattern.adaptorPattern.adaptee;

public interface TFCard {
    String readTF();    
    int writeTF(String msg);
}