找了个代码生成器，我改了下结构，优化了部分功能，可以在项目中使用，用来实现代码的自动生成。支持pojo、mapper、service、impl、controller层路径配置化，
1.mapper 层：提供泛型mapper接口及面向对象和List的基本方法，提高代码复用
2.service层和Impl：提供底层BaseService接口(方法与mapper层一一对应)及其抽象实现AbstractService，自动生成代码会自动集
成BaseService接口并实现它，没有特殊要求基本不用改动直接能用
3.cntroller层：提供所有方法(方法与mapper层一一对应)的控制层实现
4.结果返回：封装了统一API响应结果(包括响应代码code、相应信息message、响应数据data)
5.ServiceException异常封装，自定义了异常处理机制，代码中可以直接抛出异常，交给自定义机制处理
6.提供简单的接口签名认证
使用方法：数据库建立好表机构，在代码里面直接输入表名，就可以生成控制层、接口及实现层、持久化层和Pojo层所有代码。别激动，就是这么屌