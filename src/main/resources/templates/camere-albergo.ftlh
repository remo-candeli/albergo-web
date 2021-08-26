<!DOCTYPE html>
<html>
<head>
    <title>Cities</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
<h2>Registro stanze albergo</h2>

<table>
    <tr>
        <th>Numero Camera</th>
        <th>Tipo Camera</th>
        <th>Nr posti letto</th>
    </tr>

    <#list rooms as room>
        <tr>
            <td>${room.idCamera}</td>
            <td>${room.toString()}</td>
            <td>${room.getNrPostiLetto()}</td>
        </tr>
    </#list>
</table>

</body>
</html>