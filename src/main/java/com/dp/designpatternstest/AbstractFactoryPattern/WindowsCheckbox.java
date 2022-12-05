package com.dp.designpatternstest.AbstractFactoryPattern;

/**
 * @author MikeWang
 * @date 2022/12/5 6:12 PM
 */
public class WindowsCheckbox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("You have created WindowsCheckbox.");
    }
}
