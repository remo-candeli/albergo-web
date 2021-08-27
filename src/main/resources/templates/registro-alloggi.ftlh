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
    <style>
        @import url('https://fonts.googleapis.com/css2?family=Encode+Sans:wght@100&family=Lobster&display=swap');
    </style>
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
                            <img src="/img/matrimoniale.jpg" alt="" style="width: 180px; height: 190px;"/>
                        </#if>
                        <#if room.tipoCamera=="Matrimoniale + 1">
                            <img src="/img/matrimoniale+1.jpg" alt="" style="width: 180px; height: 190px;"/>
                        </#if>
                        <#if room.tipoCamera=="Camera Doppia">
                            <img src="/img/doppia.jpg" alt="" style="width: 180px; height: 190px;"/>
                        </#if>
                        <#if room.tipoCamera=="Camera Singola">
                            <img src="/img/singola.jpg" alt="" style="width: 180px; height: 190px;"/>
                        </#if>
                        <div class="bottom-left">
                            <h2>Cliente: ${lodging.nomeCliente}</h2>
                            perm.: ${lodging.giorniPermanenza} gg</br>
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