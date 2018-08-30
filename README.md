# Workshop Mindstorms

## Einrichten der Umgebung
- JDK
- Eclipse
- Github
- Beispiel bauen und Upload auf den Roboter

#### Eclipse einrichten
- JDK [herunterladen](http://www.oracle.com/technetwork/java/javase/downloads/) und installieren
- Eclipse [herunterladen](https://www.eclipse.org/downloads/) und die Version für _Java Entwickler_ installieren
- Im Eclipse Marketplace _Help -> Eclipse Marketplace..._ nach *leJOS EV3* suchen und installieren

#### Projekt einrichten
Repository auschecken:
```bash 
# ssh
git clone git@github.com:janklecka0815/bootcamp-mindstorms-18.git
    
# oder https
git clone https://github.com/janklecka0815/bootcamp-mindstorms-18.git
```
#### Testprogramm starten
Um zu sehen ob alles geklappt hat kompilieren wir als erstes die Datei _EV3Hello.java_ im Verzeichnis _src/org/lejos/learn/helloworld_ und starten sie auf dem Roboter. Vorher müssen allerdings noch ein paar Einstellungen in Eclipse angepasst werden:
- _Window -> Preferences -> leJOS EV3_ auf den Ordner lib/lejos_ev3 setzen
- Ausgeschecktes Projekt öffnen: _File -> Open Projects from File System..._
- In der Projekt Ansicht auf _bootcamp-mindstorms-18_ rechtsklicken, unter Properties _Java Compiler_ auf _Enable project specific settings_ klicken und Java 1.7 auswählen
- Roboter per USB anschließen und über _Run as (LeJOS)_ auf die Datei EV3Hello den Build übertragen

*Auf dem Bildschirm des Roboters sollte jetzt eine Ausgabe erscheinen*

## Aufgaben

### Bewegen des Roboters
- Lies mit dem Farbsensor die Farbe des Untergrunds aus, ein beispiel zum ansteuern des Sensors ist in der Datei _src/org/lejos/learn/helloworld/ColorExample.java_ zu finden
- Lasse den Roboter vor und zurück fahren, ein Beispiel zum ansteuern des Motors findest du in der Datei _src/org/lejos/learn/helloworld/MotorExample.java_

### Challenge
Welcher Roboter ist der schnellste auf dem vorgegebenen Kurs?

## Doku:
https://roberta-home.de/sites/default/files/media/Roberta-EV3programmierenJava_small.pdf

http://www.lejos.org/ev3/docs/
