package FactoryMethod.factory;

import FactoryMethod.button.Button;
import FactoryMethod.button.WindowsButton;

/**
 * Windows Dialog will produce Windows buttons.
 */
public class WindowsDialog extends Dialog{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
