package com.dp.designpatternstest.AbstractFactoryPattern;

/**
 * @author MikeWang
 * @date 2022/12/5 6:15 PM
 */
public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
