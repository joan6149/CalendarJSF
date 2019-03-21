<%-- 
    Document   : header
    Created on : 13-mar-2019, 13:08:34
    Author     : Joan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<header class="row align-items-center"> <!-- CABECERA DE LA WEB -->
    <div class="col-md-3 logo">
        <img class="img-responsive" src="Includes/Images/Logo.png" />
    </div>
    <div class="col-md-6">
        <!-- <p class="titulo">CALENDAR VER. 1.0 alpha</p> -->
    </div>
    <div class="col-md-3 align-self-center">
        <c:if test="${Usuario != null}">
            <%@ include file="/Includes/jsp/infoUser.jsp" %>
        </c:if>
        <c:if test="${Usuario == null}">
            <%@ include file="/Includes/jsp/login.jsp" %>
        </c:if>
    </div>
</header> <!-- FIN DE CABECERA -->
