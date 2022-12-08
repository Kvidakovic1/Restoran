# c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < E:\Java\Restoran\Baza_podataka\restoran.sql

drop database if exists restoran;
create database restoran default charset utf8;
use restoran;

create table konobar(
    sifra int not null primary key auto_increment,
    ime varchar(30),
    prezime varchar(30),
    oib char(11),
    iban varchar(50)
);

create table stol(
    sifra int not null primary key auto_increment,
    broj_stola int,
    konobar int
);

create table gost(
    sifra int not null primary key auto_increment,
    ime varchar(30),
    prezime varchar(30),
    broj_telefona varchar(20)
);

create table artikl(
    sifra int not null primary key auto_increment,
    naziv varchar(40),
    cijena decimal(18,2),
    kategorija varchar(30)
);

create table artikl_narudba(
    sifra int not null primary key auto_increment,
    artikl int,
    narudba int,
    napomena varchar(120),
    kolicina decimal(18,2)
);

create table narudba(
    sifra int not null primary key auto_increment,
    gost int,
    stol int
);

alter table stol add foreign key (konobar) references konobar(sifra);
alter table narudba add foreign key (gost) references gost(sifra);
alter table narudba add foreign key (stol) references stol(sifra);
alter table artikl_narudba add foreign key (artikl) references artikl(sifra);
alter table artikl_narudba add foreign key (narudba) references narudba(sifra);


insert into konobar(ime,prezime,oib,iban)
values('Imer','Abazi','24929752626','HR1323600008587815596'),
('Ana','Tocko','25907769979','HR4923600002334797248'),
('Laze','Ristov','26468109043','HR8923600001232746548');

insert into stol(broj_stola,konobar)
values(1,1),(2,2),(3,3);

insert into gost(ime,prezime,broj_telefona)
values('Marko','Huljak','+385 99 760 6232'),
('Filip','Begic','+385 98 500 5588'),
('Nikola','Hlavsa','+385 97 513 9744'),
('Mario','Tomic','+385 92 564 9527');

insert into artikl(naziv,cijena,kategorija)
values('Coca cola',15.00,'Piće'),
('Fanta',15.00,'Piće'),
('Sprite',15.00,'Piće'),
('Špageti bolognese',65.00,'Hrana'),
('Ćevapi',60.00,'Hrana'),
('Orada',105.00,'Hrana'),
('Brancin',105.00,'Hrana');