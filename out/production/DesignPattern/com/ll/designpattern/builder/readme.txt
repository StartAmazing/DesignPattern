建造者模式

模式定义： 将一个复杂对象与他的表示分离，使得同样的构建过程可以创建不同的表示

优点：
1. 建造者独立，易扩展；
2. 便于控制细节风险。

Spring源码中的应用
org.springframework.web.servlet.mvc.method.RequestMappingInfo
org.springframework.beans.factory.support.BeanDefinitionBuilder