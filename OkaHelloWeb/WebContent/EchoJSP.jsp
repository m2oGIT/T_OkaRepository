<%@ page language="java" contentType="text/html; charset=Windows-31J"
    pageEncoding="Windows-31J"%>

<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=Windows-31J">
<title>�͂��߂Ă�JSP</title>
</head>
<body>


    <h1><font color="blue">�͂��߂Ă�JSP�ł�</font></h1>
    
    <form action="./EchoJSP.jsp" method="POST">
        <input type="text" name="param" />
        <input type="submit" value="���y�[�W�ɑ��M�I" />
    </form>
    
<!-- HTML�R�����g -->
<%-- JAVA�R�����g --%>

<%
    //�͂��߂Ƀ��N�G�X�g�̃G���R�[�h�����{
    request.setCharacterEncoding( "Windows-31J" );
    //ContentType���w��
    //response.setContentType( "text/html; charset=Windows-31J" );
    //���y�[�W�œ��͂����l���擾
    String param = request.getParameter( "param" );
%>

<%= param %>

<hr>
     ���[�v�ɂ���̏o��
     <table border="1" bordercolor="black">
     <tr>
     <% for ( int i = 0; i < 10; i++) { %>
     
        <td><%= i %></td>

     <% } %>
     </tr>
     </table>
     
     
<hr>
     ���݂̓�����\��<br>
<% 
     SimpleDateFormat fmt =new SimpleDateFormat("yyyy�NMM��dd�� HH��mm��ss�b");
     Date now = new Date();
%>

<%= fmt.format(now) %>

</body>
</html>