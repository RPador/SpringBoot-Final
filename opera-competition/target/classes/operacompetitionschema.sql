DROP TABLE IF EXISTS placement;
DROP TABLE IF EXISTS competitor_song;
DROP TABLE IF EXISTS song;
DROP TABLE IF EXISTS competitor;


create table competitor (
	competitor_id int unsigned not null auto_increment,
	first_name char(50) not null,
	last_name char(50) not null,
	phone varchar(20) not null,
	primary key (competitor_id)
);

CREATE TABLE song (
	song_id int unsigned NOT NULL AUTO_INCREMENT,
	competitor_id int unsigned not null,
	song_title varchar(128) not null,
	PRIMARY KEY (song_id),
	foreign key (competitor_id) references competitor (competitor_id) on delete cascade
);

CREATE TABLE competitor_song (
	competitor_id int unsigned not null,
	song_id int unsigned not null,
	foreign key (competitor_id) references competitor (competitor_id) on delete cascade,
	foreign key (song_id) references song (song_id) on delete cascade
);


CREATE TABLE placement (  
	placement_id int unsigned AUTO_INCREMENT,
	competitor_id int unsigned NOT NULL,
	placement_number char(20) not null,
	PRIMARY KEY (placement_id),
	foreign key (competitor_id) references competitor (competitor_id)
);

