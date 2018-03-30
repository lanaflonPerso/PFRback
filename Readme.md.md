---


---

<p><img src="https://tof.cx/images/2018/03/30/1bbd11f66389dfbcd26605f93e7754f9.jpg" alt="enter image description here"></p>
<hr>
<pre><code> \-\-  |U.--. ||R.--. ||O.--. ||C.--. ||R.--. ||E.--. ||A.--. ||T.--. ||I.--. ||O.--. ||N.--. |
 \-\-  | (\\/) || :(): || :/\\: || :/\\: || :(): || (\\/) || (\\/) || :/\\: || (\\/) || :/\\: || :(): |
 \-\-  | :\\/: || ()() || :\\/: || :\\/: || ()() || :\\/: || :\\/: || (__) || :\\/: || :\\/: || ()() |
 \-\-  | '--'U|| '--'R|| '--'O|| '--'C|| '--'R|| '--'E|| '--'A|| '--'T|| '--'I|| '--'O|| '--'N|
 \-\-  `------'`------'`------'`------'`------'`------'`------'`------'`------'`------'`------'
</code></pre>
<hr>
<p><strong>PFRback</strong><br>
API REST SPRING BOOT + JPA + SCRIPT SQL + " PREPARESTATEMENT en commentaire dans la classe 'FredCaseController"<br>
Sur le fil rouge a proprement parlé, j’ai fait le diagramme de classe et coopéré sur quelques partie du code.<br>
C’est pour cela que j’ai décidé de refaire entierement une version legère de l’application fil rouge.<br>
Application que j’ai appelé fred app.</p>
<hr>
<p>Prérequis pour l’installation de l’API<br>
Java8 version 1.8<br>
MAVEN dernière version (3.5 si problème)<br>
MySQL dernière version (5.7 si problème)<br>
TOMCAST serveur (dernière version, si problème version 7)<br>
un IDE “maven srping” (Eclipse ou IntelliJ par exemple)</p>
<hr>
<p>Exemple pour Eclipse :<br>
Importez le project avec " import existing maven project "<br>
l’Update des dépendances avec MAVEN ce fera automatiquement</p>
<p>Modifier les propriétés MySQL du fichier application.properties en fonction de l’environnement du poste d’execution<br>
Ajuster les éléments <s>barrés</s> a votre convenance<br>
"<br>
spring.datasource.url =   jdbc:mysql:<s><a href="//localhost:3306">//localhost:3306</a></s>/fred_app?createDatabaseIfNotExist=true&amp;\createDatabaseIfNotExist=true&amp;useUnicode=true&amp;character_set_server=utf8mb4&amp;useSSL=false<br>
spring.datasource.username = <s>root</s><br>
spring.datasource.password = <s>admin</s><br>
"</p>
<hr>
<p>Assurez vous d’avoir démarrer le serveur MySQL<br>
Lancez l’application<br>
Au demmarrage l’application va créer et pleupler la database<br>
Nom de la database fred_app<br>
Elle sera peuplé par des informations fictives a des fins de test</p>
<hr>
<p>Vous pouvez faire aussi des tests via POSTMAn par exemple, voici les URL necessaires<br>
fred_case</p>
<pre><code>http://localhost:8080/api/fred_case

http://localhost:8080/api/fred_case/{id}
</code></pre>
<p>fred_user</p>
<pre><code>http://localhost:8080/api/fred_user

http://localhost:8080/api/fred_user/{id}
</code></pre>

