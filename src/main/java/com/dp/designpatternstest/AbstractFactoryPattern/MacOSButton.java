package com.dp.designpatternstest.AbstractFactoryPattern;

/**
 * @author MikeWang
 * @date 2022/12/5 6:10 PM
 */
public class MacOSButton implements Button{
    @Override
    public void paint() {
        System.out.println("You have created MacOSButton.");
    }
}
