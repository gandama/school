<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>教师信息管理</title>
    <link href="/application/css/style.css" rel="stylesheet" type="text/css"/>
    <script type="text/javascript" src="/application/js/jquery.js"></script>

    <script type="text/javascript">
        $(document).ready(function(){
            $(".click").click(function(){
                $(".tip").fadeIn(200);
            });

            $(".tiptop a").click(function(){
                $(".tip").fadeOut(200);
            });

            $(".sure").click(function(){
                $(".tip").fadeOut(100);
            });

            $(".cancel").click(function(){
                $(".tip").fadeOut(100);
            });

        });
    </script>


</head>


<body>

<div class="place">
    <span>位置：</span>
    <ul class="placeul">
        <li><a href="#">首页</a></li>
        <li><a href="#">数据表</a></li>
        <li><a href="#">基本内容</a></li>
    </ul>
</div>

<div class="rightinfo">

    <div class="tools">

        <ul class="toolbar">
            <li class="click"><span><img src="/application/images/t01.png" /></span>添加</li>
            <li class="click"><span><img src="/application/images/t02.png" /></span>修改</li>
            <li><span><img src="/application/images/t03.png" /></span>删除</li>
            <li><span><img src="/application/images/t04.png" /></span>统计</li>
        </ul>


        <ul class="toolbar1">
            <li><span><img src="/application/images/t05.png" /></span>设置</li>
        </ul>

    </div>


    <table class="tablelist">
        <thead>
        <tr>
            <th><input name="" type="checkbox" value="" checked="checked"/></th>
            <th>id<i class="sort"><img src="/application/images/px.gif" /></i></th>
            <th>教师姓名</th>
            <th>教师密码</th>
            <th>籍贯</th>
            <th>发布时间</th>
            <th>是否审核</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="teacher" items="${users}">
            <tr>
                <td><input name="" type="checkbox" value="" /></td>
                <td>${teacher.getId()}</td>
                <td>${teacher.getTname()}</td>
                <td>${teacher.getTpwd()}</td>
                <td>江苏南京</td>
                <td>2013-09-09 15:05</td>
                <td>已审核</td>
                <td><a href="#" class="tablelink">查看</a>     <a href="#" class="tablelink"> 删除</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>


    <div class="pagin">
        <div class="message">共<i class="blue">${totalCount}</i>条记录，当前显示第&nbsp;<i class="blue">${pageNow}&nbsp;</i>页</div>
        <div class="paginList">
            <a style="margin-right: 8px; display:${pageNow==1?"none":"inline-block"} " href="/TeacherController/showTeachers.htm?page=${pageNow-1}">上一页</a>
            <c:forEach var="i" begin="1" end="${totalPage}" step="1">
                <a style="margin-right: 8px" href="/TeacherController/showTeachers.htm?page=${i}">${i}</a>
            </c:forEach>
            <a style="margin-right: 8px; display:${pageNow==totalPage?"none":"inline-block"} " href="/TeacherController/showTeachers.htm?page=${pageNow+1}">下一页</a>
        </div>
    </div>


    <div class="tip">
        <div class="tiptop"><span>提示信息</span><a></a></div>

        <div class="tipinfo">
            <span><img src="images/ticon.png" /></span>
            <div class="tipright">
                <p>是否确认对信息的修改 ？</p>
                <cite>如果是请点击确定按钮 ，否则请点取消。</cite>
            </div>
        </div>

        <div class="tipbtn">
            <input name="" type="button"  class="sure" value="确定" />&nbsp;
            <input name="" type="button"  class="cancel" value="取消" />
        </div>

    </div>




</div>

<script type="text/javascript">
    $('.tablelist tbody tr:odd').addClass('odd');
</script>
</body>
</html>
