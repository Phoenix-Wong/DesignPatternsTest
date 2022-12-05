package com.dp.designpatternstest.AbstractFactoryPattern;

/**
 * @author MikeWang
 * @date 2022/12/5 6:13 PM
 * 抽象工厂
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
