package com.zj.structurePattern.adaptorPattern.client;

import com.zj.structurePattern.adaptorPattern.adaptee.TFCard;
import com.zj.structurePattern.adaptorPattern.adaptee.TFCardImpl;
import com.zj.structurePattern.adaptorPattern.adapter.SDAdapterTF;
import com.zj.structurePattern.adaptorPattern.target.Computer;
import com.zj.structurePattern.adaptorPattern.target.SDCard;
import com.zj.structurePattern.adaptorPattern.target.SDCardImpl;
import com.zj.structurePattern.adaptorPattern.target.ThinkpadComputer;

/**
 * @author zhengjian
 * @date 2023-08-04 10:11
 */

/**
 * computer没有直接操作TF的功能，但是有操作SD的功能，所以这里使用了适配器，SD适配TF
 */
public class ComputerReadTFDemo {
    public static void main(String[] args) {
        Computer computer = new ThinkpadComputer();
        SDCard sdCard = new SDCardImpl();
        System.out.println(computer.readSD(sdCard));
        System.out.println("====================================");
        TFCard tfCard = new TFCardImpl();
        SDCard tfCardAdapterSD = new SDAdapterTF(tfCard);
        System.out.println(computer.readSD(tfCardAdapterSD));
    }
}
