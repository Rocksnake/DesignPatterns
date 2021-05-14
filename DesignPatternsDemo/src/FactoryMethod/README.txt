工厂方法模式实现了Java高层次的灵活性，工厂方法通过构建方法来识别，会创建具体类的对象，但以抽象型或接口的形式返回对象。

目录结构：
|
|-Button - 产品接口
|--HtmlButton - 具体产品A
|--WindowButton - 具体产品B
|-Dialog - 创建者类
|--HtmlDialog - 具体创建者1
|--WindowDialog - 具体创建者2
|-MainDemo - 客户端代码

不同类型的对话框需要其各自类型的元素。因此为每个对话框类型创建子类并重写其工厂方法。

现在，每种对话框类型都将对合适的按钮类进行初始化。对话框基类使用其通用接口与对象进行交互，因此代码更改后仍能正常工作。

在Java核心库中也有工厂方法模式的体现。

Reference：https://docs.oracle.com/javase/8/docs/api/overview-summary.html
    - java.util.Calendar#getInstance()
    - java.util.ResourceBundle#getBundle()
    - java.text.NumberFormat#getInstance()
    - java.nio.charset.Charset#forName()
    - java.net.URLStreamHandlerFactory#createURLStreamHandler(String)（根据协议返回不同的单例对象）
    - java.util.EnumSet#of()
    - javax.xml.bind.JAXBContext#createMarshaller()