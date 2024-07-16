<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <title>show one</title>
</head>
<body>
    <h1>${song.title}</h1>
    <h2>Started by ${song.person.username}</h2>
    <h4>Genre ${song.genre}</h4>
    <p> Lyrics : ${song.lyrics}</p>
    
    <a href="/songs/${song.id }/edit">Contribute</a>
</body>
</html>
