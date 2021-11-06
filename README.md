# Maven_coverage
## Помощь с покрытием в Sonarcloud в проекте с Maven

## pom.xml
в properties закидываем
```xml
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>

        <maven.compiler.source>16</maven.compiler.source>
        <maven.compiler.target>16</maven.compiler.target>
```

В моём проектe SDK 16 поэтому указал 16

я указывал Junit5 при создании тестов, поэтому закидываем в dependencies вот это
https://github.com/DenKorparation/Maven_coverage/blob/master/.github/workflows/build.yml#L19

ещё закидываем в pom.xml вот это
https://github.com/DenKorparation/Maven_coverage/blob/master/pom.xml#L48-L109

Опять же в моём проектe SDK 16 поэтому указал 16 в 
https://github.com/DenKorparation/Maven_coverage/blob/master/pom.xml#L104-L105

теперь можно проверить, запустив справа во вкладке maven lifecycle/test
В консоли должно быть что-то такое
![Screenshot](test_result.png)
В папке target должен появиться jacoco.exec
В папке target/site/jacoco/ можно посмотреть отчёт о покрытии и, если были созданы тесты, должно показывать ненулевое покрытие

# SonarCloud
## pom.xml
добавить в properties
https://github.com/DenKorparation/Maven_coverage/blob/master/pom.xml#L17-L23
Эту строку нужно изменить 
https://github.com/DenKorparation/Maven_coverage/blob/master/pom.xml#L18

## .github/workflows/build.yml
Далее подключаем репозиторий к SonarCloud

были изменены строки, в отличие от дефолтного файла, создаваемого при подключении к SonarCloud
https://github.com/DenKorparation/Maven_coverage/blob/master/.github/workflows/build.yml#L16
https://github.com/DenKorparation/Maven_coverage/blob/master/.github/workflows/build.yml#L19


