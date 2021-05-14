package FactoryMethod.factory;

import FactoryMethod.button.Button;
import FactoryMethod.button.HtmlButton;

/**
 * HTML Dialog will produce HTML buttons.
 */
public class HtmlDialog extends Dialog{

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
