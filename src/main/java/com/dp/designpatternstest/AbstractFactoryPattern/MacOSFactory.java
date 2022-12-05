package com.dp.designpatternstest.AbstractFactoryPattern;

/**
 * @author MikeWang
 * @date 2022/12/5 6:13 PM
 */
public class MacOSFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
