


                                                                                                    
                                             ./oso+:.                                               
                                          .sdNMMMMMMNh:                                             
                                         sNMMMMMMMMMMMMs                                            
                                        :MMMMMMMMMMMMMMM-                                           
                                        -MdhddmMMdyyhmMM.                                           
                                        .m:../oss:..-+MN`                                           
                                        +y-`.-/o+:.`.:hmy                                           
                                        .o+syyyysossyyyd:                                           
                                         :-/hmhsshmhs///                                            
                                          :/sds--ss/://                                         
                                          `oydh//shoos+.                                  
                                         ./ydhdhdhdhhss/.`                             
                                      `-odMNNNyhdysdhso:.`                             
                                   ```.:/sdNNNNNNNmdho:`        ` ` ``.           
                                       `.:+ymNNNmNNy:`     `` `` .-`-..-.                  
                            ````          `./ymmddy-     ``.:`--`----::.-                           
                           .-:-.``          `-/o+:-` `.`-`-`-.`-`..-::--:.                          
                          -///:-.``           .-   `-``-..`. ```````-::/+/                          
                          +soo+:.`.``    `.`   :` `-`.``      ``.---/ooos+                          
                          /dyyso+/+-`....-`:    `..`         ``.+hddyssyy+                          
                          /mdhhshhdo/:.:.-`.`  `.:/:.```  ``.-:sdNNh:.-ohs.                         
                          .+hh/.-+dmhdy+:-..`..-/yo+dh+:--.--/ohmNMm/..-/o:-`                        
                         /-:s+-.-+NMNNmyso++oosy-```+mmdhhhdmmmmNNmo:-::..-:                        
                        .+-.:o/-:+NMMNmmNNNNNNd-   ```+mNNNNNmmmNNNds+/:--::                        
                        .o:.-+++ohmNNNMNNMMMmy-.``-....:ymNNmmddmo-Nds+:-:/+                        
                        -y/-:/+osd`+mNNMMMMd++yyyyhdmds//oymmmm:.  smhss+//+                        
                        :s+/+oshd+  `/NMMMMNmhs+++-.-+yyssosmmm    .dmddo:-:`                       
                        .//+hdddo    -Nmhdms++++++oo/:-:ohhdhhh     :mmh/..--                       
                        ::-:+yds     :o+/.smmmmddyhhhhhdmmy//-o      sh-``.-/                       
                        +-```-s/     :.````:-....:-...-/s:` `./`     +.` `.:/                       
                        +/-.` `/    --`  ../o/---+ssossy+`  `./.    `` ``-/o-                       
                        -yo:.  ``   /-````--:/://+oo+:--.-. `.+.   ````.-:oo`                       
                         /s/:`  ``  +s/` `:++/-``::.`-:/-...:oy   `.```-:+s.                        
                         `os/-`` -` oyo/``./oss+::/+++/-```-+hh   .```./os.                         
                          `os/.```. +/--.``-:://++///:--...::os` ```..+s+`                          
     --  .------..------..------..------..------..------..------..------..------..------..------.
     --  |U.--. ||R.--. ||O.--. ||C.--. ||R.--. ||E.--. ||A.--. ||T.--. ||I.--. ||O.--. ||N.--. |
     --  | (\/) || :(): || :/\: || :/\: || :(): || (\/) || (\/) || :/\: || (\/) || :/\: || :(): |
     --  | :\/: || ()() || :\/: || :\/: || ()() || :\/: || :\/: || (__) || :\/: || :\/: || ()() |
     --  | '--'U|| '--'R|| '--'O|| '--'C|| '--'R|| '--'E|| '--'A|| '--'T|| '--'I|| '--'O|| '--'N|
     --  `------'`------'`------'`------'`------'`------'`------'`------'`------'`------'`------'

PFRback
API REST SPRING BOOT + JPA + SCRIPT SQL + " PREPARESTATEMENT en commentaire dans la classe 'FredCaseController"
Sur le fil rouge a proprement parlé, j'ai fait le diagramme de classe et coopéré sur quelques partie du code.
C'est pour cela que j'ai décidé de refaire entierement une version legère de l'application fil rouge.
Application que j'ai appelé fred app.

Prérequis pour l'installation de l'API
Java8 version 1.8
MAVEN dernière version (3.5 si problème)
MySQL dernière version (5.7 si problème)
TOMCAST serveur (dernière version, si problème version 7)
un IDE "maven srping" (Eclipse ou IntelliJ par exemple)

Exemple pour Eclipse :
Importez le project avec " import existing maven project "
l'Update des dépendances avec MAVEN ce fera automatiquement

Modifier les propriétés MySQL du fichier application.properties en fonction de l'environnement du poste d'execution
Ajuster les éléments rouge a votre convenance
"
spring.datasource.url =   jdbc:mysql://localhost:3306/fred_app?createDatabaseIfNotExist=true&\createDatabaseIfNotExist=true&useUnicode=true&character_set_server=utf8mb4&useSSL=false
spring.datasource.username = root
spring.datasource.password = admin
"

Assurez vous d'avoir démarrer le serveur MySQL
Lancez l'application
Au demmarrage l'application va créer et pleupler la database
Nom de la database fred_app
Elle sera peuplé par des informations fictives a des fins de test

Vous pouvez faire aussi des tests via POSTMAn par exemple, voici les URL necessaires
fred_case
http://localhost:8080/api/fred_case
http://localhost:8080/api/fred_case/{id}
fred_user
http://localhost:8080/api/fred_user
http://localhost:8080/api/fred_user/{id}


