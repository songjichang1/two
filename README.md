#JAVA-Project-Library 
Java+Jsp+Oracle 도서관프로그램
***
## :computer: 프로젝트 소개
- **도서관에서 회원(추가,수정,삭제,조회), 도서(추가,수정,삭제,조회), 대여(대여,반납,조회)**

## :mag_right: 프로젝트 상세 내용
- **프로그램 실행자는 도서매니저**
- 회원(추가,수정,삭제,조회), 도서(추가,수정,삭제,조회), 대여(대여,반납,조회)
- 대여은 중복된 도서를 제외 하고 n개 대여 가능
- 도서, 회원 삭제 시 대여중인 회원, 도서목록도 함께 삭제
- **특정 도서, 회원 상세정보 확인 후 Update 수정 가능**

## :bulb: **기술스택**
- ` java ` 
- ` Oracle `
- ` JSP `
- ` Apache Tomcat `

## :scroll: **주요기능**


```java
<servlet>
   <servlet-name>dispatcherServlet</servlet-name>
   <servlet-class>com.FrontController</servlet-class>
  </servlet>
  <servlet-mapping>
  <servlet-name>dispatcherServlet</servlet-name>
  <url-pattern>*.do</url-pattern>
  </servlet-mapping>
```
- **클라이언트 요청 중 .do로 끝나는 (모든)요청은 FrontController(Dispatcher Servlet)이 받게금 web.xml 파일설정.**

```java
public BookDTO selectBook1(int bookID) throws SQLException{	
		DBConnection dbc= new DBConnection();
		PreparedStatement psmt =  null;
		ResultSet rs = null;
		BookDTO book = null;
				
		String sql= "SELECT "
				+ "A.BOOKID,"
				+ "A.BOOKAUTHOR,"
				+ "A.BOOKTITLE,"
				+ "A.BOOKPRICE "
				+ "FROM BOOK A "
				+ "WHERE 1=1 "
				+ "AND A.BOOKID = ?";

```
- JSP 에서 도서ID,회원ID의 값을 토대로 특정 도서, 회원의 상세정보를 사용자에게 보여주기 위해 DB 접근.
- 사용자가 특정 도서, 회원 정보를 수정할 수 있다.

```java
<b>도서ID</b> <br>
<input class="text" type="text" name="bookID" value= "${dto.bookID}"  readonly required> <br>
<b>회원ID</b> <br> 
<input class="text" type="text" name="userID" value="${dto.userID }"  readonly required> <br>
```
- 도서,회원의 상세정보에서 정보를 수정하기 전에 bookID,userID 값을 기준으로  DB에 접근하여 정보를 수정해야 하기 때문에 readonly 하여 고정.
- 정보를 (CRUD) 할 때 입력란에 공백이 없게끔 required 설정

