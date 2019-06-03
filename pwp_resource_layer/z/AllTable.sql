/*
SQLyog Community Edition- MySQL GUI v8.02 
MySQL - 5.5.31 : Database - pwp
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`pwp` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `pwp`;

/*Table structure for table `channel` */

DROP TABLE IF EXISTS `channel`;

CREATE TABLE `channel` (
  `chnl_id` varchar(20) NOT NULL,
  `chnl_name` varchar(50) DEFAULT NULL,
  `desc` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`chnl_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `channel` */

insert  into `channel`(`chnl_id`,`chnl_name`,`desc`) values ('1','web','It support web request'),('2','anroid','It support anroid request'),('3','ios','It support anroid request'),('4','symbien','It support symbien request');

/*Table structure for table `client` */

DROP TABLE IF EXISTS `client`;

CREATE TABLE `client` (
  `clnt_id` varchar(20) NOT NULL,
  `clnt_name` varchar(50) DEFAULT NULL,
  `desc` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`clnt_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `client` */

insert  into `client`(`clnt_id`,`clnt_name`,`desc`) values ('1','firefox-b','It support firefox mojila browser'),('2','crome','It support google crome browser'),('3','opera','It support opera browser'),('4','i-explorer','It support Microsoft Internet explorer browser');

/*Table structure for table `client_channel` */

DROP TABLE IF EXISTS `client_channel`;

CREATE TABLE `client_channel` (
  `id` int(20) NOT NULL,
  `client_id` varchar(20) NOT NULL,
  `channel_id` varchar(20) NOT NULL,
  `description` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `FK_channel` (`channel_id`),
  UNIQUE KEY `FK_client` (`client_id`,`channel_id`),
  CONSTRAINT `FK_channel` FOREIGN KEY (`channel_id`) REFERENCES `channel` (`chnl_id`),
  CONSTRAINT `FK_client` FOREIGN KEY (`client_id`) REFERENCES `client` (`clnt_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `client_channel` */

insert  into `client_channel`(`id`,`client_id`,`channel_id`,`description`) values (1,'4','4',NULL),(2,'3','3',NULL),(3,'1','1',NULL),(4,'2','2',NULL);

/*Table structure for table `customer` */

DROP TABLE IF EXISTS `customer`;

CREATE TABLE `customer` (
  `cust_name` varchar(50) NOT NULL,
  `card_num` varchar(20) NOT NULL,
  `cvv` varchar(5) NOT NULL,
  `exp_date` date NOT NULL,
  `cust_id` varchar(20) NOT NULL,
  PRIMARY KEY (`card_num`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `customer` */

insert  into `customer`(`cust_name`,`card_num`,`cvv`,`exp_date`,`cust_id`) values ('Mark','5298000100214568','521','2021-07-19','4'),('Rocky','5298000100221548','325','2025-03-05','3'),('Denial','5298000100265987','895','2022-02-05','1'),('Samual','5298000100287456','147','2021-05-03','2'),('Prince','5298000100296314','852','2024-06-25','5');

/*Table structure for table `product` */

DROP TABLE IF EXISTS `product`;

CREATE TABLE `product` (
  `prod_id` int(20) NOT NULL AUTO_INCREMENT,
  `prod_name` varchar(50) DEFAULT NULL,
  `prod_desc` varchar(200) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `is_stock` tinyint(1) DEFAULT NULL,
  `vendor_name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`prod_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

/*Data for the table `product` */

insert  into `product`(`prod_id`,`prod_name`,`prod_desc`,`price`,`is_stock`,`vendor_name`) values (1,'Keybord','Wireless with 10m range',599,1,'Lenevo'),(2,'Mouse','Wire 1000dpi range',250,1,'Longitech'),(3,'Pendrive','32 GB Fast Transfer',999,1,'Sandisk'),(4,'HeadPhone','Wireless 220db Bass rich',2200,1,'Boat'),(5,'Earphone','Wire Ultimate HQ Sound',1550,1,'Philipse'),(6,'Data Cable','3m long lenght',150,0,'Sandisk');

/*Table structure for table `redeem` */

DROP TABLE IF EXISTS `redeem`;

CREATE TABLE `redeem` (
  `order_id` int(20) NOT NULL AUTO_INCREMENT,
  `purchase_date` date NOT NULL,
  `delivery_date` date NOT NULL,
  `product_id` int(20) NOT NULL,
  `card_num` varchar(20) NOT NULL,
  `price` bigint(20) DEFAULT NULL,
  `product_name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`order_id`),
  KEY `FK_redeem` (`card_num`),
  KEY `FK_redeem_p` (`product_id`),
  CONSTRAINT `FK_redeem` FOREIGN KEY (`card_num`) REFERENCES `customer` (`card_num`),
  CONSTRAINT `FK_redeem_p` FOREIGN KEY (`product_id`) REFERENCES `product` (`prod_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

/*Data for the table `redeem` */

insert  into `redeem`(`order_id`,`purchase_date`,`delivery_date`,`product_id`,`card_num`,`price`,`product_name`) values (1,'2019-06-01','2019-06-10',1,'5298000100265987',995,'Keybord'),(2,'2019-05-30','2019-06-03',2,'5298000100265987',250,'Mouse'),(3,'2019-06-03','2019-06-07',3,'5298000100265987',999,'Pendrive'),(4,'2019-05-29','2019-06-05',4,'5298000100287456',2200,'HeadPhone'),(5,'2019-06-06','2019-06-10',5,'5298000100214568',995,'Earphone'),(6,'2019-06-07','2019-06-12',6,'5298000100214568',995,'Data Cable');

/*Table structure for table `reward` */

DROP TABLE IF EXISTS `reward`;

CREATE TABLE `reward` (
  `reward_id` int(20) NOT NULL AUTO_INCREMENT,
  `avail_pts` bigint(20) DEFAULT NULL,
  `used_pts` bigint(20) DEFAULT NULL,
  `pend_pts` bigint(20) DEFAULT NULL,
  `earn_pts` bigint(20) DEFAULT NULL,
  `card_num` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`reward_id`),
  KEY `FK_reward` (`card_num`),
  CONSTRAINT `FK_reward` FOREIGN KEY (`card_num`) REFERENCES `customer` (`card_num`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

/*Data for the table `reward` */

insert  into `reward`(`reward_id`,`avail_pts`,`used_pts`,`pend_pts`,`earn_pts`,`card_num`) values (1,16025,1785745,5024,2905145,'5298000100265987'),(2,15074,7601951,5024,3605963,'5298000100287456'),(3,39025,5796159,5024,5305782,'5298000100221548'),(4,76070,3347785,5024,6405254,'5298000100296314'),(5,66145,1800145,5024,9205145,'5298000100214568');

/*Table structure for table `service_details` */

DROP TABLE IF EXISTS `service_details`;

CREATE TABLE `service_details` (
  `service_id` int(20) NOT NULL AUTO_INCREMENT,
  `service_name` varchar(50) NOT NULL,
  `api_name` varchar(50) NOT NULL,
  `version` varchar(20) NOT NULL,
  PRIMARY KEY (`service_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*Data for the table `service_details` */

insert  into `service_details`(`service_id`,`service_name`,`api_name`,`version`) values (1,'pwpservice','getbalanceapi','v1'),(2,'pwpservice','getproductapi','v1'),(3,'pwpservice','redeemptionapi','v1');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
