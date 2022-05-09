/*
SQLyog Community Edition- MySQL GUI v6.07
Host - 5.1.44-community : Database - securecomputation
*********************************************************************
Server version : 5.1.44-community
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

create database if not exists `securecomputation`;

USE `securecomputation`;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

/*Table structure for table `~tmpclp488401` */

DROP TABLE IF EXISTS `~tmpclp488401`;

CREATE TABLE `~tmpclp488401` (
  `NetName` varchar(8) DEFAULT NULL,
  `NodeName` varchar(6) DEFAULT NULL,
  `Rpath` varchar(0) DEFAULT NULL,
  `Attacker` varchar(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `~tmpclp488401` */

insert  into `~tmpclp488401`(`NetName`,`NodeName`,`Rpath`,`Attacker`) values ('Network1','Node1','','No'),('Network1','Node2','','No'),('Network1','Node3','','No'),('Network1','Node4','','No'),('Network1','Node5','','No'),('Network1','Node6','','No'),('Network1','Node7','','No'),('Network1','Node8','','No'),('Network1','Node9','','No'),('Network1','Node10','','No'),('Network2','Node11','','No'),('Network2','Node12','','No'),('Network2','Node13','','No'),('Network2','Node14','','No'),('Network2','Node15','','No'),('Network2','Node16','','No'),('Network2','Node17','','No'),('Network2','Node18','','No'),('Network2','Node19','','No'),('Network2','Node20','','No'),('Network3','Node21','','No'),('Network3','Node22','','No'),('Network3','Node23','','No'),('Network3','Node24','','No'),('Network3','Node25','','No'),('Network3','Node26','','No'),('Network3','Node27','','No'),('Network3','Node28','','No'),('Network3','Node29','','No'),('Network3','Node30','','No');

/*Table structure for table `attacker` */

DROP TABLE IF EXISTS `attacker`;

CREATE TABLE `attacker` (
  `Network` varchar(8) DEFAULT NULL,
  `Node` varchar(5) DEFAULT NULL,
  `Date` varchar(21) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `attacker` */

insert  into `attacker`(`Network`,`Node`,`Date`) values ('Network1','Node5','05/01/2019   13:32:32'),('Network1','Node5','05/01/2019   13:34:51'),('Network1','Node4','22/05/2021   01:49:13');

/*Table structure for table `network1` */

DROP TABLE IF EXISTS `network1`;

CREATE TABLE `network1` (
  `NodeName` varchar(6) DEFAULT NULL,
  `Linkwt` tinyint(4) DEFAULT NULL,
  `Attacker` varchar(3) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `network1` */

insert  into `network1`(`NodeName`,`Linkwt`,`Attacker`) values ('Node1',20,'No'),('Node2',30,'No'),('Node3',45,'No'),('Node4',20,'Yes'),('Node5',50,'Yes'),('Node6',40,'No'),('Node7',35,'No'),('Node8',10,'No'),('Node9',25,'No'),('Node10',25,'No');

/*Table structure for table `network2` */

DROP TABLE IF EXISTS `network2`;

CREATE TABLE `network2` (
  `NodeName` varchar(6) DEFAULT NULL,
  `Linkwt` smallint(6) DEFAULT NULL,
  `Attacker` varchar(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `network2` */

insert  into `network2`(`NodeName`,`Linkwt`,`Attacker`) values ('Node11',25,'No'),('Node12',35,'No'),('Node13',15,'No'),('Node14',55,'No'),('Node15',65,'No'),('Node16',75,'No'),('Node17',85,'No'),('Node18',95,'No'),('Node19',105,'No'),('Node20',115,'No');

/*Table structure for table `network3` */

DROP TABLE IF EXISTS `network3`;

CREATE TABLE `network3` (
  `NodeName` varchar(6) DEFAULT NULL,
  `Linkwt` tinyint(4) DEFAULT NULL,
  `Attacker` varchar(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `network3` */

insert  into `network3`(`NodeName`,`Linkwt`,`Attacker`) values ('Node21',10,'No'),('Node22',20,'No'),('Node23',10,'No'),('Node24',20,'No'),('Node25',50,'No'),('Node26',60,'No'),('Node27',70,'No'),('Node28',80,'No'),('Node29',90,'No'),('Node30',10,'No');

/*Table structure for table `results` */

DROP TABLE IF EXISTS `results`;

CREATE TABLE `results` (
  `fname` varchar(17) DEFAULT NULL,
  `tdelay` smallint(6) DEFAULT NULL,
  `tpt` smallint(6) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `results` */

insert  into `results`(`fname`,`tdelay`,`tpt`) values ('DES.java',3649,4000),('DES.java',3658,4000),('DES.java',3861,4000),('DBConnection.java',2374,4000),('Source.java',3878,4000),('DES.java',2832,3000);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
