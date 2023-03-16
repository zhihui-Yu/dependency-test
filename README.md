# Test

---

## 基础实验
- 项目依赖情况：
```text
A -> B -> C<1.0.0>
  -> C<1.0.1>
  
C<1.0.0> 中有   MainC.java + MainC2.java
C<1.0.1> 中只有 MainC.java

B 调用MainC2.java的方法
A 调用MainC.java 的方法
```

在运行时发现B中的1.0.0，变成了1.0.1，导致运行时使用B的方法时报错 `java.lang.NoClassDefFoundError: org/example/MainC2`

如果使用B包中（引用C包方法的方法）的方法则不会报错。