/*
SQLyog - Free MySQL GUI v5.02
Host - 5.5.5-10.4.19-MariaDB : Database - dborder
*********************************************************************
Server version : 5.5.5-10.4.19-MariaDB
*/


create database if not exists `dborder`;

USE `dborder`;

/*Table structure for table `barang` */

DROP TABLE IF EXISTS `barang`;

CREATE TABLE `barang` (
  `id` int(11) NOT NULL,
  `nama` varchar(40) DEFAULT NULL,
  `hrg` double DEFAULT NULL,
  `jml` int(11) DEFAULT NULL,
  `keterangan` varchar(100) DEFAULT NULL,
  `foto` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `barang` */

insert into `barang` values 
(1,'aglonema Suksom',45000,10,'-','aglonemaSuksom.jpg'),
(2,'aglonema Rotundum Aceh',30000,10,'-','aglonemaRotundumAceh.jpg'),
(3,'aglonemaRoDudAnjamani',75000,10,'-','aglonemaRoDudAnjamani.jpg'),
(4,'aglonemaSnowWhiteRemaja',77,10,'-','aglonemaSnowWhiteRemaja.jpg'),
(5,'aglonemaSuperWhite',90000,50,'-','aglonemaSuperWhite.jpg'),
(6,'aglonemaVenus',90000,10,'77','aglonemaVenus.jpg'),
(7,'aglonemaRedAnjamaniDewasa',75000,10,'-','aglonemaRedAnjamaniDewasa.jpg'),
(8,'aglonemaAyunindi',35000,10,'-','aglonemaAyunindi.jpg'),
(9,'Tanaman A',10000,5,'-abcdefgh','a.jpg'),
(10,'aa',1,1,'a','Agregasi.png');

/*Table structure for table `member` */

DROP TABLE IF EXISTS `member`;

CREATE TABLE `member` (
  `id` int(11) NOT NULL,
  `nama_member` varchar(40) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `telp` varchar(30) DEFAULT NULL,
  `alamat` varchar(60) DEFAULT NULL,
  `kota` varchar(40) DEFAULT NULL,
  `provinsi` varchar(40) DEFAULT NULL,
  `gender` varchar(10) DEFAULT NULL,
  `userName` varchar(20) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `member` */

insert into `member` values 
(1,'agus','agus@gmail.com','1234','j semarang','semarang','jateng','1','agus','123');
