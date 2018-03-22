DROP TABLE `data`;

CREATE TABLE `fred_case` (
  `id` mediumint(8) unsigned NOT NULL auto_increment,
  `id` mediumint,
  `name` TEXT default NULL,
  `description` TEXT default NULL,
  PRIMARY KEY (`id`)
) AUTO_INCREMENT=1;

INSERT IGNORE INTO `data` (`id`,`name`,`description`) VALUES (1,"felis, adipiscing","vel pede blandit congue. In scelerisque scelerisque dui. Suspendisse ac"),(2,"tempor arcu.","eu neque"),(3,"faucibus lectus,","sit amet orci. Ut sagittis lobortis mauris."),(4,"Aenean eget","faucibus lectus, a sollicitudin orci sem eget massa."),(5,"lorem eu","Suspendisse aliquet, sem"),(6,"amet risus.","urna suscipit nonummy. Fusce fermentum fermentum"),(7,"malesuada fringilla","diam. Duis mi enim, condimentum eget, volutpat ornare, facilisis eget,"),(8,"nec ligula","nec metus facilisis lorem tristique"),(9,"volutpat. Nulla","Sed molestie."),(10,"leo. Cras","risus. Nunc ac sem");
INSERT IGNORE INTO `data` (`id`,`name`,`description`) VALUES (11,"arcu. Nunc","eu, ligula. Aenean euismod mauris"),(12,"orci lobortis","nisl. Nulla eu neque pellentesque massa lobortis ultrices. Vivamus"),(13,"mauris, rhoncus","libero est,"),(14,"Nunc commodo","iaculis aliquet diam."),(15,"mattis velit","Curabitur vel lectus. Cum sociis"),(16,"ultrices. Vivamus","Donec"),(17,"sodales purus,","non justo. Proin"),(18,"sagittis felis.","convallis, ante lectus convallis est, vitae sodales"),(19,"sit amet,","Proin vel arcu eu odio"),(20,"ac urna.","Proin sed");
INSERT IGNORE INTO `data` (`id`,`name`,`description`) VALUES (21,"dictum augue","accumsan laoreet ipsum."),(22,"Nam porttitor","quis"),(23,"arcu imperdiet","velit. Pellentesque ultricies dignissim lacus. Aliquam rutrum lorem ac risus."),(24,"lorem, sit","dictum placerat, augue. Sed molestie. Sed id risus quis"),(25,"arcu. Morbi","justo sit amet nulla. Donec"),(26,"tempor augue","tellus sem mollis"),(27,"Morbi quis","a, magna. Lorem ipsum dolor sit amet, consectetuer adipiscing elit."),(28,"pede et","ut lacus. Nulla tincidunt, neque vitae"),(29,"consequat purus.","sem elit, pharetra ut, pharetra sed, hendrerit a, arcu."),(30,"adipiscing elit.","enim nisl elementum purus, accumsan interdum libero");
INSERT IGNORE INTO `data` (`id`,`name`,`description`) VALUES (31,"Pellentesque habitant","pretium aliquet,"),(32,"gravida mauris","turpis egestas. Fusce aliquet magna a neque. Nullam ut nisi"),(33,"tellus. Suspendisse","neque"),(34,"eleifend non,","sit amet, consectetuer adipiscing elit. Aliquam auctor,"),(35,"luctus lobortis.","in"),(36,"eu, accumsan","commodo tincidunt nibh. Phasellus nulla. Integer vulputate, risus"),(37,"nisi sem","venenatis lacus. Etiam bibendum"),(38,"dignissim tempor","tortor nibh sit amet orci. Ut sagittis lobortis mauris."),(39,"tempor, est","at pretium aliquet, metus"),(40,"neque sed","purus. Duis elementum, dui quis accumsan convallis, ante lectus convallis");
INSERT IGNORE INTO `data` (`id`,`name`,`description`) VALUES (41,"aliquet magna","cursus in, hendrerit consectetuer, cursus et, magna. Praesent interdum ligula"),(42,"erat. Etiam","enim mi"),(43,"tellus justo","eu nulla at sem molestie sodales. Mauris blandit enim consequat"),(44,"eget mollis","Suspendisse aliquet molestie"),(45,"arcu. Vestibulum","fermentum arcu. Vestibulum ante ipsum"),(46,"mauris. Morbi","sociis natoque"),(47,"lacus vestibulum","ipsum ac mi eleifend egestas. Sed pharetra,"),(48,"lorem ut","Suspendisse aliquet,"),(49,"egestas blandit.","hendrerit id,"),(50,"Mauris magna.","metus. Vivamus euismod urna. Nullam lobortis quam");
INSERT IGNORE INTO `data` (`id`,`name`,`description`) VALUES (51,"posuere vulputate,","urna, nec luctus felis purus ac tellus. Suspendisse sed dolor."),(52,"aliquet lobortis,","augue ac ipsum. Phasellus vitae mauris"),(53,"elit erat","mauris blandit mattis. Cras eget nisi dictum"),(54,"ligula eu","ornare"),(55,"sit amet,","varius orci, in consequat"),(56,"sit amet","urna. Vivamus molestie"),(57,"vestibulum lorem,","nec urna suscipit nonummy. Fusce fermentum fermentum arcu. Vestibulum ante"),(58,"dis parturient","aliquet"),(59,"Morbi accumsan","Curabitur consequat, lectus sit amet luctus vulputate,"),(60,"pede. Nunc","Cras vulputate velit eu sem. Pellentesque ut");
INSERT IGNORE INTO `data` (`id`,`name`,`description`) VALUES (61,"sem molestie","velit. Sed malesuada augue ut lacus. Nulla tincidunt, neque vitae"),(62,"dolor sit","Nullam suscipit, est ac facilisis facilisis, magna"),(63,"augue scelerisque","pede sagittis augue, eu"),(64,"risus. Nunc","facilisis. Suspendisse commodo tincidunt nibh."),(65,"venenatis lacus.","urna. Nullam lobortis quam a felis ullamcorper viverra. Maecenas iaculis"),(66,"pede, ultrices","et magnis dis"),(67,"eget magna.","tortor nibh sit amet orci. Ut sagittis"),(68,"justo faucibus","urna suscipit"),(69,"neque. Morbi","turpis nec"),(70,"euismod enim.","Pellentesque habitant morbi tristique senectus et netus et malesuada fames");
INSERT IGNORE INTO `data` (`id`,`name`,`description`) VALUES (71,"Nunc ac","Maecenas"),(72,"nec orci.","vitae, posuere at, velit. Cras"),(73,"nostra, per","ut, sem. Nulla"),(74,"diam vel","egestas ligula. Nullam feugiat placerat velit. Quisque varius. Nam porttitor"),(75,"est, mollis","enim nisl elementum purus, accumsan interdum libero dui nec"),(76,"erat neque","ipsum. Donec sollicitudin adipiscing ligula. Aenean gravida nunc sed pede."),(77,"at augue","ac mattis semper, dui lectus rutrum urna, nec"),(78,"id sapien.","fermentum convallis"),(79,"leo. Vivamus","Duis cursus, diam at pretium aliquet, metus"),(80,"leo. Cras","arcu ac orci. Ut semper pretium neque. Morbi quis");
INSERT IGNORE INTO `data` (`id`,`name`,`description`) VALUES (81,"fringilla mi","rutrum urna, nec luctus felis purus ac tellus. Suspendisse sed"),(82,"Proin nisl","facilisis vitae, orci. Phasellus dapibus"),(83,"eget ipsum.","luctus aliquet odio. Etiam ligula tortor, dictum eu, placerat eget,"),(84,"dignissim magna","Nunc pulvinar arcu"),(85,"non leo.","a sollicitudin orci"),(86,"Suspendisse sagittis.","tristique pharetra. Quisque ac"),(87,"Pellentesque habitant","diam at pretium aliquet, metus urna convallis"),(88,"feugiat. Sed","nibh dolor,"),(89,"a, auctor","enim. Sed nulla ante, iaculis nec, eleifend non,"),(90,"egestas a,","adipiscing");
INSERT IGNORE INTO `data` (`id`,`name`,`description`) VALUES (91,"neque venenatis","eu augue porttitor interdum."),(92,"non ante","ultricies dignissim lacus. Aliquam rutrum"),(93,"auctor non,","mi lorem, vehicula et, rutrum eu, ultrices sit amet,"),(94,"eu dui.","turpis vitae purus"),(95,"arcu. Aliquam","feugiat. Sed nec metus facilisis lorem"),(96,"Etiam laoreet,","urna. Nunc quis"),(97,"dui lectus","mollis. Phasellus libero mauris, aliquam"),(98,"Cum sociis","id nunc interdum feugiat. Sed nec metus facilisis lorem tristique"),(99,"mauris a","auctor, velit eget laoreet posuere, enim nisl elementum purus, accumsan"),(100,"ut odio","Nulla aliquet. Proin velit. Sed");

CREATE TABLE `fred_user` (
  `id` mediumint(8) unsigned NOT NULL auto_increment,
  `id` mediumint,
  `username` varchar(255) default NULL,
  PRIMARY KEY (`id`)
) AUTO_INCREMENT=1;

INSERT IGNORE INTO `data` (`id`,`username`) VALUES (1,"Thomas"),(2,"Aphrodite"),(3,"Cain"),(4,"Burton"),(5,"Craig"),(6,"Jasper"),(7,"Claudia"),(8,"Grady"),(9,"Maggy"),(10,"Hasad");
INSERT IGNORE INTO `data` (`id`,`username`) VALUES (11,"Adria"),(12,"Ayanna"),(13,"Raymond"),(14,"Natalie"),(15,"Linda"),(16,"Colt"),(17,"Elvis"),(18,"Beck"),(19,"Laith"),(20,"Wynne");
INSERT IGNORE INTO `data` (`id`,`username`) VALUES (21,"Valentine"),(22,"Nolan"),(23,"Merritt"),(24,"Rebecca"),(25,"Isaiah"),(26,"Latifah"),(27,"Sydney"),(28,"Ori"),(29,"Denton"),(30,"Skyler");
INSERT IGNORE INTO `data` (`id`,`username`) VALUES (31,"Joseph"),(32,"Harrison"),(33,"Ima"),(34,"Rinah"),(35,"Indira"),(36,"Sonia"),(37,"Merrill"),(38,"Tasha"),(39,"Hiram"),(40,"Linus");
INSERT IGNORE INTO `data` (`id`,`username`) VALUES (41,"Benedict"),(42,"Sage"),(43,"Clementine"),(44,"Cailin"),(45,"Hasad"),(46,"Vera"),(47,"Kuame"),(48,"Uriah"),(49,"Cassandra"),(50,"Callum");
INSERT IGNORE INTO `data` (`id`,`username`) VALUES (51,"Rae"),(52,"Olympia"),(53,"Davis"),(54,"Louis"),(55,"Derek"),(56,"Ezra"),(57,"Holly"),(58,"Elliott"),(59,"Gareth"),(60,"Sarah");
INSERT IGNORE INTO `data` (`id`,`username`) VALUES (61,"Lareina"),(62,"Justin"),(63,"Avram"),(64,"Tiger"),(65,"Kirby"),(66,"Thomas"),(67,"Belle"),(68,"Ramona"),(69,"Sharon"),(70,"Yetta");
INSERT IGNORE INTO `data` (`id`,`username`) VALUES (71,"Lucas"),(72,"Jameson"),(73,"Cyrus"),(74,"Timon"),(75,"Delilah"),(76,"Lane"),(77,"Carlos"),(78,"Lavinia"),(79,"Daryl"),(80,"Brent");
INSERT IGNORE INTO `data` (`id`,`username`) VALUES (81,"Kirsten"),(82,"Lael"),(83,"Thaddeus"),(84,"Gwendolyn"),(85,"Jayme"),(86,"Pearl"),(87,"Brielle"),(88,"Wynter"),(89,"Aaron"),(90,"Cameran");
INSERT IGNORE INTO `data` (`id`,`username`) VALUES (91,"Giacomo"),(92,"Carson"),(93,"Daria"),(94,"Lev"),(95,"Kirby"),(96,"Gregory"),(97,"Alyssa"),(98,"Yardley"),(99,"Nehru"),(100,"Medge");
