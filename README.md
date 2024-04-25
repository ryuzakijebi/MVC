### Project BookList MVC Spring
![](img/0.png)

## Table of Contents

- [ Dependencies](#-dependencies-)
- 
[ Project Structure](#ProjectStructure)
- [ PostgreSQL Config](#psqlconfig)
- [ Test Running](#test)

## <a name="Dependencies"></a> Dependencies :
- `Spring Boot Dev Tools`
- `Spring Data JPA`
- `Thymeleaf`
- `Spring Web`
- `PostgreSQL Driver`

## <a name="ProjectStructure"></a> Project Structure :

* `controller` : BookController.java
* `entity` : Book.java
* `repository` : BookRepository.java
* `service` : BookService.java, BookServiceImpl.java
* `main` : ProjectApplication.java
* `resources/templates (webpages)` : books.html, create_book.html, edit_book.html

## <a name="psqlconfig"></a> PostgreSQL Config :
* `Config Database, Schema and Table` : 
  ![](img/1.png)
  ![](img/2.png)

* `Config Application.properties` :
  ![](img/3.png)


## <a name="test"></a> Test Running
* `Home Page`
  ![](img/4.png)

#
* `Add New Book`
  ![](img/5.png)

  ![](img/6.png)

  ![](img/7.png)

#
* `Edit Book`
  
  ![](img/8.png)
  ![](img/9.png)
  ![](img/10.png)

#
* `Delete Book`
  ![](img/11.png)
  ![](img/12.png)