## О проекте
Maven-проект архетипа для консольного приложения. Основные отличия от стандартного архетипа (maven-archetype-quickstart-1.1):

* добавлена настройка плагина компилятора для работы с Java 1.8;
* тестовый класс реализован на основе JUnit4 вместо JUnit3;
* добавлен плагин выполнения главного класса (org.codehaus.mojo:exec-maven-plugin);
* имя главного класса изменено на Main.

### Версии

* Версия 1.0 - базовая версия.
* Версия 1.1 - добавлен Spring-контекст `spring-context.xml` и аннотация `@ContextConfiguration` для загрузки контекста в тестовом классе, а также соответствующие Maven-зависимости.
* Версия 1.2 - в Spring-контекст добавлена встраиваемая СУБД **H2** (со сценарием инициализации) и связанный с ней jdbcTemplate-бин; загрузка xml-контекста осуществляется в главном и тестовом классе; в `pom.xml` добавлена настройка maven-jar-plugin для указания главного класса в `MANIFEST.MF`.

## Установка
```sh
$ mvn clean install
```
Для проверки корректности установки можно воспользоваться командами:
```sh
$ mvn archetype:generate -B -DarchetypeGroupId=lib.clearclass.maven.archetypes -DarchetypeArtifactId=maven-archetype-console -DarchetypeVersion=1.2 -DgroupId=com.company -DartifactId=myproject -Dversion=1.0-SNAPSHOT -Dpackage=mypack
$ cd myproject
$ mvn package
```

## Использование с Eclipse

1. Создать/обновить файл `~/.m2/archetype-catalog.xml`. Для этого перейти в каталог `~/.m2` и выполнить из него команду:
```sh
$ mvn archetype:crawl -Dcatalog=archetype-catalog.xml
```

2. Добавить в Eclipse путь к каталогу `~/.m2` (где должен находится `archetype-catalog.xml`), выполнив настройку:  
>**`Preferences->Maven->Archetypes->Add Local Catalog...`**
