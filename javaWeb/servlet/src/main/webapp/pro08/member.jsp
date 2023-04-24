<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.List"%>
<%@ page import="pro07.*"%>
<%
List<MemberVO> list = (List<MemberVO>) request.getAttribute("list");
%>

<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>회원정보</title>
<link rel="stylesheet" href="https://unpkg.com/mvp.css" />
</head>
<body>
	<main>
		<table>
			<tr>
				<th>ID</th>
				<th>NAME</th>
				<th>EMAIL</th>
				<th>JOIN</th>
			</tr>
			<%
			for (int i = 0; i < list.size(); i++) {
				MemberVO member = list.get(i);
			%>
			<tr>
				<td><%=member.getId()%></td>
				<td><%=member.getName()%></td>
				<td><%=member.getEmail()%></td>
				<td><%=member.getJoinDate()%></td>
			</tr>
			<%
			}
			%>
		</table>
	</main>
</body>
</html>
</MemberVO>
</MemberVO>
