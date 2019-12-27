<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.1.0/css/bootstrap.min.css">
<body>
<h2 style="text-align: center">登录页</h2>

<hr/>

<form class="form-horizontal" role="form" action="/login">
    <div class="form-group">
        <label for="userName" class="col-sm-2 control-label">用户名</label>
        <div class="col-sm-8">
            <input type="text" class="form-control" id="userName" name="userName" placeholder="请输入用户名">
        </div>
    </div>
    <div class="form-group">
        <label for="pwd" class="col-sm-2 control-label">密码</label>
        <div class="col-sm-8">
            <input type="password" class="form-control" id="pwd" name="pwd" placeholder="请输入密码">
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <button type="submit" class="btn btn-default">登录</button>
        </div>
    </div>
</form>
</body>
</html>
