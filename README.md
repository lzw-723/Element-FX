# Element-FX

[![LICENSE](https://img.shields.io/badge/License-MIT-lightskyblue)](./LICENSE)

![JDK](https://img.shields.io/badge/JDK-%3E=8-blue)
![JavaFX](https://img.shields.io/badge/JavaFX-Any-pink)

[![JitCI](https://jitci.com/gh/lzw-723/Element-FX/svg)](https://jitci.com/gh/lzw-723/Element-FX)
[![JitPack](https://jitpack.io/v/lzw-723/Element-FX.svg)](https://jitpack.io/#lzw-723/Element-FX)

A `JavaFX` version of `element-plus`.

`JavaFX` 版本的 `element-plus`。

## 截图 Screenshot

![预览](https://i.niupic.com/images/2023/12/13/dDBf.png)

## 使用 Using

您可以快速添加Element-FX到现有的JavaFX项目中，参见[文档](https://blog.lzwi.fun/Element-FX/)

## 目标 Target

移植 [Element-Plus](https://element-plus.org) UI库到 `JavaFX` 平台，并提供桌面端优化。

使用**Java 11**开发，兼容**Java 8**及以上版本。

## 起步 Start

> 开发、构建本项目需要 JDK 8 或以上版本、git

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

## 贡献与社区支持

我们欢迎任何形式的贡献和支持！

如果您发现任何错误、问题或需要改进的地方，请随时提交问题或拉取请求（Pull Request）。

我们将尽快审查和处理您的贡献，并与您进行进一步的讨论和合作。

同时，我们也鼓励您参与社区讨论和分享您的经验、想法和建议，以促进项目的发展和进步。
