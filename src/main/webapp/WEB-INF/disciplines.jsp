<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="../resources/css/styles.css">
  <title>Система управления студентами и их успеваемостью</title>
</head>

<body>
<div>
  <div class="header">
    <div class="left-side"></div>
    <div id="title"><h1>Система управления студентами и их успеваемостью</h1></div>
    <div class=" right-side blue-button logout"><span><a href="">Logout</a></span></div>
  </div>
  <div class="main">
    <div class="left-side"><div class="blue-button"><a href="/">На главную</a></div><div class="blue-button"></div></div>
    <div class="left-side">
      <div class="left-top-buttons">
        <div><button class="grey-button-top">Создать дисциплину...</button></div><div><button class="grey-button-top"  onclick="window.location.href = './disciplines.jsp';">Модифицировать выбранную дисциплину...</button></div>
        <div><button class="grey-button-top">Удалить выбранную дисциплину...</button>
        </div>
        <div><b class="text">Список дисциплин</b></div>
        <div>
          <form method="get">
            <table>
              <thead class="thead">
              <tr>
                <th></th>
                <th>Наименование дисциплины</th>
              </tr>
              </thead>
              <tbody>
              <tr>
                <td><input type="checkbox"></td>
                <td>Высшая математика</td>
              </tr>
              <tr>
                <td><input type="checkbox"></td>
                <td>История науки и техники</td>
              </tr>
              <tr>
                <td><input type="checkbox"></td>
                <td>Политология</td>
              </tr>
              <tr>
                <td><input type="checkbox"></td>
                <td>Информатика</td>
              </tr>
              <tr>
                <td><input type="checkbox"></td>
                <td>Теория Алгоритмизации</td>
              </tr>

              </tbody>
            </table>
          </form>
        </div>
      </div>
      <div class="right-side blue-button"><span></span></div>
    </div>
  </div>
</body>
