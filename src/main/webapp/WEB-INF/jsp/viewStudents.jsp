
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html  id="viewStudents" >
    <head>
        <title>View Books</title>
        <link href="<c:url value="/css/common.css"/>" rel="stylesheet" type="text/css">
    </head>
    <body>
        <table>
            <thead>
                <tr>
                <th>Student Name</th>
                    <th>ISBN</th>
                    <th>Book Name</th>
                    <th>Author</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${students}" var="student">
                    <tr>
                        <td>${student.sName}</td>
                        
                         <td>${student.bName}</td>
                    </tr>
                </c:forEach>
               
                       
                        
                    	
                       
                
            </tbody>
        </table>
    </body>
</html>