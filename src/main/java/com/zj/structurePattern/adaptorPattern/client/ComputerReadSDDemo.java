package com.zj.structurePattern.adaptorPattern.client;

import com.zj.structurePattern.adaptorPattern.target.SDCard;
import com.zj.structurePattern.adaptorPattern.target.SDCardImpl;
import com.zj.structurePattern.adaptorPattern.target.Computer;
import com.zj.structurePattern.adaptorPattern.target.ThinkpadComputer;

/**
 * @author zhengjian
 * @date 2023-08-04 10:07
 */

/**
 * computer能直接读取SD的内容，这里没有使用到适配器
 */
public class ComputerReadSDDemo {

    public static void main(String[] args) {
        Computer computer = new ThinkpadComputer();
        SDCard sdCard = new SDCardImpl();
        System.out.println(computer.readSD(sdCard));
    }
}
