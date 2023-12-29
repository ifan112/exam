请完成以下任务：

- 解释业务功能，核心对象及关系
- 优化代码包结构
- 实现统一处理异常
    - 如果是 `BizException`，那么返回具体的错误码及信息
    - 如果是未知异常，返回 `{"code": 500, "message": "未知异常"}`
- 完善针对 `OrderService#pay()` 方法的单元测试用例
- 使用一种设计模式优化查找和调用 PaymentService 实现类的方式，实现当新增一个实现类时不需要修改调用方的代码
- 其它任何你想到的优化