
<%@page import="com.calendarjsf.modelos.Usuarios"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page errorPage="jsp/Error.jsp" %>
<html>
    <head>
        <%@ include file="/Includes/jsp/links.jsp" %>
    </head>
    <body>
        <div class="container-fluid">
            <!-- Inyectamos el header -->
            <%@ include file="/Includes/jsp/header.jsp" %>
            <!-- Inyectamos la barra de navegacion -->
            <%@ include file="/Includes/jsp/navBar.jsp" %>
            <section class="container-fluid" id="mainSection">
                    <article class="row text-center">
                            <div class="container-fluid" id="menuUserPrincipal">

                            </div>
                    </article>
            </section>
            <footer class="container-fluid">
                    <div class="row">

                    </div>
            </footer>
        </div>
    </body>
</html>
