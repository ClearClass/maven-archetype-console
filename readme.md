## О проекте
Maven-проект архетипа для консольного приложения. Основные отличия от стандартного архетипа (maven-archetype-quickstart-1.1):

* добавлена настройка плагина компилятора для работы с Java 1.8;
* тестовый класс реализован на основе JUnit4 вместо JUnit3;
* добавлен плагин выполнения главного класса (org.codehaus.mojo:exec-maven-plugin);
* имя главного класса изменено на Main.

### Версии

* Версия 1.0 - базовая версия.
* Версия 1.1 - добавлен Spring-контекст `spring-context.xml` и аннотация `@ContextConfiguration` для загрузки контекста в тестовом классе, а также соответствующие Maven-зависимости.

## Установка
```sh
$ mvn clean install
```
Для проверки корректности установки можно воспользоваться командами:
```sh
$ mvn archetype:generate -B -DarchetypeGroupId=lib.clearclass.maven.archetypes -DarchetypeArtifactId=maven-archetype-console -DarchetypeVersion=1.0 -DgroupId=com.company -DartifactId=myproject -Dversion=1.0-SNAPSHOT -Dpackage=mypack
$ cd myproject
$ mvn package
```

## Использование с Eclipse

1. Создать/обновить файл `~/.m2/archetype-catalog.xml`. Для этого из рабочего каталога, в котором находится проект архетипа, выполнить команду:
```sh
$ mvn archetype:update-local-catalog
```

2. Добавить в Eclipse путь к каталогу `~/.m2` (где должен находится `archetype-catalog.xml`), выполнив настройку:  
>**`Preferences->Maven->Archetypes->Add Local Catalog...`**
