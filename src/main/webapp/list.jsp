<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="/resources/js/jquery-1.8.2.min.js"></script>
<script type="text/javascript">
	$(function(){
		$.ajax("selectAllType","",function(date1){
			$(date1).each(function(i,val1){
				alert(val1.tname)
				$("[name=tid]").append("<option value='"+val1.tid+"'>"+val1.tname+"</option>")
			})
		},"json")
	})
</script>
</head>
<body>
	<form action="queryAllGoods" method="post">
		种类:<select name="tid">
				
			</select>
		品牌:<select name="bid">
			
			</select>
		价格:<input type="text" name="price1">--<input type="text" name="price2"> 
		<br>名称:<input type="text" name="gname">
		英文名称:<input type="text" name="gEnglishName">
		<input type="submit" value="搜索">
	</form>
	<table border="1">
		<tr>
			<td>编号</td>
			<td>名称</td>
			<td>类型</td>
			<td>品牌</td>
			<td>英文名</td>
			<td>大小</td>
			<td>价格</td>
			<td>数量</td>
			<td>标签</td>
		</tr>
		<c:forEach items="${list}" var="g">
			<tr>
				<td>${g.gid}</td>
				<td>${g.gname}</td>
				<td>${g.tname}</td>
				<td>${g.bname}</td>
				<td>${g.gEnglishName}</td>
				<td>${g.size}</td>
				<td>${g.price}</td>
				<td>${g.count}</td>
				<td>${g.lable}</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="9">
				<button onclick="fenye(1)">首页</button>
				<button onclick="fenye(${page.prePage==0?1:page.prePage})">上一页</button>
				<button onclick="fenye(${page.nextPage==0?page.Pages:page.nextPage})">下一页</button>
				<button onclick="fenye(${page.pages})">尾页</button>
				当前${page.pageNum}/${page.pages},共${page.total}条数据
			</td>
		</tr>
	</table>
</body>
</html>