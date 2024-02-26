<%@taglib uri="http://java.sun.com/jsp/jstl/core"   prefix="c"%>
<center>
    <h2>Welcome to Customer List Page</h2>
    ${message}<br>
   <%-- ${customerList}<br><hr> --%>
    <a href="/manyToMany/">Home Page</a><br><br>
    <table border="1">
        <tr>
            <th>CUSTOMER ID</th>
            <th>CUSTOMER Name</th>
            <th>EMAIL</th>
            <th>ADD Products</th>
            <th>Delete Cart</th>
        </tr>

        <c:if test="${!empty customerList}">
            <c:forEach items="${customerList}" var="cust">
                <tr>
                    <td> <c:out value="${cust.customerId}"/></td>
                    <td><c:out value="${cust.customerName}"/></td>
                    <td><c:out value="${cust.email}"/></td>
                    <td>
                        <a href="/manyToMany/AddProducts?customerId=${cust.customerId}"> Add Products </a>
                    </td>
                    <td>
                        <a href="/manyToMany/deleteCustomer?customerId=${cust.customerId}">Delete Customer along with Products</a>
                    </td>
                </tr>
            </c:forEach>
        </c:if>
    </table>
</center>