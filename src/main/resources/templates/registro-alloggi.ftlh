<!DOCTYPE html>
<html>
<head>
    <title>Camere Albergo</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="/styles/reset.min.css" />
    <link rel="stylesheet" href="/styles/style.css" />
    <link rel="stylesheet" href="/styles/header-1.css" />
    <link rel="stylesheet" href="/styles/rooms.css" />
</head>
<body>
<#include "menu.ftlh">
<h2>Registro Alloggi</h2>
<table>
    <#list lodgings as lodging>
        <tr>
            <#list lodging.rooms as room>
                <td>
                    <div class="container">
                        <#if room.tipoCamera=="Matrimoniale">
                            <img src="/img/matrimoniale.jpg" alt=""/>
                        </#if>
                        <#if room.tipoCamera=="Matrimoniale + 1">
                            <img src="/img/matrimoniale+1.jpg" alt=""/>
                        </#if>
                        <#if room.tipoCamera=="Camera Doppia">
                            <img src="/img/doppia.jpg" alt="" />
                        </#if>
                        <#if room.tipoCamera=="Camera Singola">
                            <img src="/img/singola.jpg" alt="" style="width:40%;"/>
                        </#if>
                        <div class="top-left">
                            <h2>${lodging.nomeCliente}</h2></br>
                            permanenza: ${lodging.giorniPermanenza}</br>
                            letti: ${room.nrPostiLetto}</br>
                        </div>
                    </div>
                </td>
            </#list>
        </tr>
    </#list>
</table>
<script src="/js/header-1.js"></script>
</body>
</html>