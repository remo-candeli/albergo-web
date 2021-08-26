<!DOCTYPE html>
<html>
<head>
    <title>Camere Albergo</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="/styles/reset.min.css" />
    <link rel="stylesheet" href="/styles/style.css" />
    <link rel="stylesheet" href="/styles/header-1.css" />
    <link rel="stylesheet" href="/styles/tables.css" />
</head>
<body>
<#include "menu.ftlh">
<h2>Registro stanze albergo</h2>
<div class="table-wrapper">
    <table class="fl-table">
        <thead>
            <tr>
                <th>Numero Camera</th>
                <th>Tipo Camera</th>
                <th>Nr posti letto</th>
            </tr>
        </thead>
        <tbody>
            <#list rooms as room>
                <tr>
                    <td>${room.idCamera}</td>
                    <td>${room.toString()}</td>
                    <td>${room.getNrPostiLetto()}</td>
                </tr>
            </#list>
        </tbody>
    </table>
</div>

<script src="/js/header-1.js"></script>
</body>
</html>