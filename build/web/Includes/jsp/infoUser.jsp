<%-- 
    Document   : infoUser
    Created on : 14-mar-2019, 9:14:40
    Author     : Joan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:useBean id="Usuario" scope="session" class="com.calendarjsf.modelos.Usuarios"></jsp:useBean>
<div class="col">
    <div class="header">
        <%-- <p>Usuario: <jsp:getProperty name="Usuario" property="usuario"/></p>
        <p>Email: <jsp:getProperty name="Usuario" property="email"/></p>
        <button class="btn btn-outline-success" id="login" name="login">Login</button> --%>
        <form class="jqfrm" name="exit" action="Logout" method="POST">
            <label class="infoUser">Usuario: <jsp:getProperty name="Usuario" property="usuario"/></label>
            <div class="w-100"></div>
            <label class="infoUser">Email: <jsp:getProperty name="Usuario" property="email"/></label>
            <div class="w-100"></div>
            <input type="hidden" name="exit" value="exit">
            <button class="btn btn-outline-success" id="exit" type="submit" name="exit" style="margin-top: 20px;">Salir</button>
        </form>
    </div>
</div>

<!-- <div class="col"></div>
                <div class="col bordes">
                    <h2 class="Subtitulo">Login</h2>
                    <div class="header">
                        <%-- <p>Usuario: <jsp:getProperty name="Usuario" property="usuario"/></p>
                        <p>Email: <jsp:getProperty name="Usuario" property="email"/></p>
                        <button class="btn btn-outline-success" id="login" name="login">Login</button> --%>
                        <form class="jqfrm" name="exit" action="ControllerIndex" method="POST">
                            <label class="">Usuario: <jsp:getProperty name="Usuario" property="usuario"/></label>
                            <div class="w-100"></div>
                            <label class="">Email: <jsp:getProperty name="Usuario" property="email"/></label>
                            <div class="w-100"></div>
                            <input type="hidden" name="exit" value="exit">
                            <button class="btn btn-outline-success" id="exit" type="submit" name="exit" style="margin-top: 20px;">Salir</button>
                        </form>
                    </div>
                </div> 
                <div class="col"></div> -->
