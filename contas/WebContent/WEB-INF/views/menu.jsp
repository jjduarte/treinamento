<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Menu de Contas</title>
</head>
<body>
<h2>Página inicial da Lista de Contas</h2>
<p>Bem vindo, ${usuarioLogado.login}</p>
<a href="listaContas">Clique aqui</a> para acessar a lista de contas <br/>
<a href="efetuaLogout">Clique aqui</a> para efetuar o logout.<br/>
<a href="form">Clique aqui</a> criar uma nova conta.
</body>
</html>