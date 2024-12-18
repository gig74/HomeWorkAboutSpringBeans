# Постановка задачи
В этом домашнем задании создайте приложение на Spring 3-мя разными способами.

## Требования
1. Сконфигурируйте бины в Spring тремя разными способами

- Конфигурация Java;
- Конфигурация XML;
- Конфигурация Groovy;

2. Создайте несколько бинов и добавьте им разные скоупы.
3. Потестируйте, запускается ли приложение и создаются ли все необходимые бины.
4. Пришлите на проверку код из трех приложений (каждое — с разной конфигурацией).

## Подключенные зависимости и плагины
 - spring-boot-starter-web - инструменты для разработки веб-приложений spring
 - groovy - язык groovy ("Мощный многогранный язык для JVM")
 - gmavenplus-plugin - Интегрирует Groovy в проекты Maven.

## Краткое описание функциональности
- С помощью аннотаций java по умолчанию создаются следующие объекты: два синглтона разных классов, 
нужное количество прототипов, создаваемых при каждом обращении к соответствующему классу,
один рестконтроллер, к которому можно обратится по сети к порту 8080 на соответствующей машине, 
а также объект для request, создаваемый при каждом обращении к рестконтроллеру
- Используя java-конфигурацию создаются следующие объекты: два синглтона одного класса, один синглтон 
другого класса, а также нужное количество прототипов, создаваемых при каждом обращении к соответствующему 
классу
- Используя xml-конфигурацию создаются следующие объекты: два синглтона одного класса, один синглтон 
другого класса, а также нужное количество прототипов, создаваемых при каждом обращении к соответствующему 
классу
- Используя конфигурацию groovy создаются следующие объекты: два синглтона одного класса, один синглтон
другого класса, а также нужное количество прототипов, создаваемых при каждом обращении к соответствующему
классу
- Запускаемый класс - Application, объекты создаются поочередно, вначале с помощью аннотаций по умолчанию, 
потом Java, потом XML, потом groovy. Обратиться к RestController можно из командной строки ОС : 
curl.exe localhost:8080 .

## Описание файлов конфигурации
- java/config/SpringBeans.java - конфигурация java
- resources/spring-beans.xml - конфигурация xml
- resources/spring-beans.groovy - конфигурация groovy