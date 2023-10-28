# 快速使用

`Element-FX`还在开发早期, 当前发布在[JitPack](https://jitpack.io/#lzw-723/element-fx)

## 使用Maven

### 步骤1 将JitPack仓库添加到pom.xml

在项目的pom文件中添加

```xml
 <repositories>
  <repository>
      <id>jitpack.io</id>
      <url>https://jitpack.io</url>
  </repository>
 </repositories>
```

### 步骤2 添加依赖项到pom.xml

在项目的pom文件的dependencies元素中添加

```xml
 <dependency>
     <groupId>com.github.lzw-723.element-fx</groupId>
     <artifactId>element-lite</artifactId>
     <version>e752e732b2</version>
 </dependency>
 ```

## 使用Gradle

### 步骤1 将JitPack仓库添加到build.gradle

`maven { url 'https://jitpack.io' }`

将其添加到根目录build.gradle中repositories的末尾

```groovy {5}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
    mavenCentral()
    maven { url 'https://jitpack.io' }
    }
}
```

### 步骤2 添加依赖项到build.gradle

```groovy {2}
dependencies {
    implementation 'com.github.lzw-723.element-fx:element-lite:e752e732b2'
}
```

## 引入

### 步骤3 在JavaFX应用程序中引入Element-FX

为Scene添加样式资源

`scene.getStylesheets().add(ELResources.loadStyle().toExternalForm());`

```java {10}
/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getClassLoader().getResource("main.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 640, 480);
        scene.getStylesheets().add(ELResources.loadStyle().toExternalForm());
        stage.setScene(scene);
        stage.show();
    }

}
```

::: info
以上示例中Element-FX的版本可能不是最新，你可以在[JitPack](https://jitpack.io/#lzw-723/element-fx)查看最新构建版本
:::

::: tip
如果以上配置完还是无法拉取依赖可能是Maven镜像配置有误，记得在`mirrorOf`中排除*jitpack.io*
:::
