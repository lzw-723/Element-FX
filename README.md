# Element-FX

A `JavaFX` version of `element-plus`.

`JavaFX` 版本的 `element-plus`。

## 截图 Screenshot

![预览](https://img1.imgtp.com/2023/03/21/XiFkZi7i.gif)

## 目标 Target

移植 [Element-Plus](https://element-plus.org) UI库到 `JavaFX` 平台，并提供桌面端优化。

使用**Java 11**开发，兼容**Java 8**及以上版本。

## 起步 Start

> 项目还在开发早期，仅提供演示Demo
>
> 需要JDK8或以上版本、git

拉取工程

```shell
git clone https://github.com/lzw-723/Element-FX

cd Element-FX
```

安装依赖

```shell
./mvnw clean install
```

启动Demo

```shell
./mvnw clean javafx:run -f "demo/pom.xml"
```

## 模块 Module

### Lite

提供样式资源，无交互代码

### Demo

提供样例

## 路线图 Roadmap

* [ ] 提供针对JavaFX原生控件的样式表
* [ ] 样式表黑暗模式支持
* [ ] 样式表动态切换支持
* [ ] 自定义控件支持
