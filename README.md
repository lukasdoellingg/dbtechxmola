# Aggregated Market Terminal

Webtech-Projekt an der HTW Berlin, Übungsgruppe Taherkhani.

**Team:**
- Lukas Dölling (602780)
- Molakounlé Falk-Tim Hessou (601871)

## Worum es geht

Wir bauen ein kleines Terminal, das Marktdaten aus verschiedenen Quellen an einer Stelle zusammenfasst. Also nicht nur Aktien von einer Seite, sondern auch ETFs, Krypto und Paare (z.B. EUR/USD). Später sollen die Daten dann wirklich von außen kommen. Im Moment ist das Backend erstmal nur der Einstieg.

Die Idee ist, dass man später in einer Übersicht verschiedene Wertpapiere sehen kann, ohne dafür mehrere Websites offen haben zu müssen.

## Milestone 1

Für den ersten Milestone haben wir:

- das GitHub-Repo angelegt
- uns eine Entity-Klasse `Instrument` überlegt (id, symbol, name, type, price, source)
- eine Spring Boot App mit einer GET-Route `/instruments`

Die Route gibt aktuell eine Liste mit ein paar Beispiel-Instrumenten zurück (Apple, ein ETF, Bitcoin und EUR/USD). Es ist noch keine Datenbank und auch noch keine richtigen APIs angebunden, die Werte sind fest im Code hinterlegt.

## Backend starten

Im Ordner `backend`:

```
./mvnw spring-boot:run
```

Danach im Browser oder mit curl:

http://localhost:8080/instruments
