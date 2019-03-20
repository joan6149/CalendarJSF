<%-- 
    Document   : login
    Created on : 13-mar-2019, 11:40:30
    Author     : Joan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<form class="jqfrm" name="Login" action="ControllerIndex" method="POST">
    <div class="form-group">
        <label class="sr-only" for="user">Usuario:</label>
        <input class="form-control" type="text" id="user" placeholder="Username" name="user"/>
    </div>
    <div class="form-group">
        <label class="sr-only">Password:</label>
        <input class="form-control" type="password" id="pass" placeholder="Password" name="pass"/>
    </div>
    <button class="btn btn-outline-success" id="create" name="create">Create User</button>
    <button class="btn btn-outline-success" id="login" type="submit" name="login">Login</button>
</form>

<!--<form class="jqfrm" name="Login" action="ControllerIndex" method="POST">
    <div class="form-group">
        <label class="sr-only" for="user">Usuario:</label>
        <input class="form-control" type="text" id="user" placeholder="Username" name="user"/>
    </div>
    <div class="form-group">
        <label class="sr-only">Password:</label>
        <input class="form-control" type="password" id="pass" placeholder="Password" name="pass"/>
    </div>
    <button class="btn btn-outline-success" id="create" name="create">Create User</button>
    <button class="btn btn-outline-success" id="login" type="submit" name="login">Login</button>
</form>-->
