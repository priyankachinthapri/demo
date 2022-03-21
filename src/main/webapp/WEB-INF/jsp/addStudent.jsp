<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>

<html id="addStudent" >
    <head>
        <title>Add Book</title>
    </head>
    <body>
        <c:if test="${addBookSuccess}">
            <div>Successfully added Book with ISBN: ${savedBook.isbn}</div>
        </c:if>
         <c:if test="${addfalsemessage}">
            <div>You have borrowed List of 2. Kindly return </div>
        </c:if>
         <c:if test="${addemptyBook}">
            <div>Books in library is empty . Please add Books </div>
        </c:if>
    
        <c:url var="add_book_url" value="/addStudent"/>
        <form:form action="${add_book_url}" method="post" modelAttribute="student">
            <form:label path="sName">SName: </form:label> <form:input type="text" path="sName"/></br>
            <form:label path="bid">Books : </form:label> 
            <form:select  name="bid" path="bid" id="books">
          
           	 <c:forEach items="${books}" var="book">
                         <tr>
                        <td><option value="${book.id}" >${book.bName}</option></td>
                        
                    	</tr>
                        </c:forEach>
  		</form:select>
            </br>
           
            <input type="submit" value="submit"/>
        </form:form>
        
       
    </body>
</html>