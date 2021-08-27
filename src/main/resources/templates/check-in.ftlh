<!DOCTYPE html>
<html>
<head>
    <title>Camere Albergo</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="/styles/reset.min.css" />
    <link rel="stylesheet" href="/styles/style.css" />
    <link rel="stylesheet" href="/styles/header-1.css" />
    <link rel="stylesheet" href="/styles/form.css" />
</head>
<body>
<#include "menu.ftlh">
<div class="form-style-5">
    <#if richiesta?? && noErrors??>
        La richiesta del cliente <strong>${richiesta.cognome}</strong> é stata accettata.
    <#else>
        <form method="post" action="/checkin/verifica">
            <fieldset>
                <legend><span class="number">1</span> Cliente</legend>
                <input type="text" name="cognome" placeholder="Il tuo cognome *">
                <input type="text" name="nome" placeholder="Il tuo nome *">
                <input type="number" name="giorni" placeholder="Il numero di giorni di permanenza">
                <label for="adulti">Numero di persone adulte:</label>
                <select id="adulti" name="adulti">
                        <option value="1">1 adulto</option>
                        <option value="2">2 adulto</option>
                        <option value="3">3 adulto</option>
                        <option value="4">4 adulto</option>
                        <option value="5">5 adulto</option>
                </select>
                <label for="figlie">Numero di figli:</label>
                <select id="figli" name="figli">
                    <option value="0">0 figlio</option>
                    <option value="1">1 figlio</option>
                    <option value="2">2 figlio</option>
                    <option value="3">3 figlio</option>
                    <option value="4">4 figlio</option>
                    <option value="5">5 figlio</option>
                </select>
            </fieldset>
            <fieldset>
                <legend><span class="number">2</span> Camere</legend>
                <label for="camera1">Indica il tipo di Camera</label>
                <select id="camera1" name="camera1">
                    <option value=""></option>
                    <option value="matrimoniale">Matrimoniale</option>
                    <option value="matrimoniale_1">Matrimoniale con un letto aggiuntivo</option>
                    <option value="doppia">Doppia</option>
                    <option value="singola">Singola</option>
                </select>
                <label for="camera2">Indica il tipo di Camera</label>
                <select id="camera2" name="camera2">
                    <option value=""></option>
                    <option value="matrimoniale">Matrimoniale</option>
                    <option value="matrimoniale_1">Matrimoniale con un letto aggiuntivo</option>
                    <option value="doppia">Doppia</option>
                    <option value="singola">Singola</option>
                </select>
                <label for="camera3">Indica il tipo di Camera</label>
                <select id="camera3" name="camera3">
                    <option value=""></option>
                    <option value="matrimoniale">Matrimoniale</option>
                    <option value="matrimoniale_1">Matrimoniale con un letto aggiuntivo</option>
                    <option value="doppia">Doppia</option>
                    <option value="singola">Singola</option>
                </select>
                <label for="camera4">Indica il tipo di Camera</label>
                <select id="camera4" name="camera4">
                    <option value=""></option>
                    <option value="matrimoniale">Matrimoniale</option>
                    <option value="matrimoniale_1">Matrimoniale con un letto aggiuntivo</option>
                    <option value="doppia">Doppia</option>
                    <option value="singola">Singola</option>
                </select>
            </fieldset>
            <input type="submit" value="Conferma" />
        </form>
    </#if>
</div>

<script src="/js/header-1.js"></script>
</body>
</html>