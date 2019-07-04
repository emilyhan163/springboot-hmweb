/*
SQLyog Trial v11.51 (64 bit)
MySQL - 5.6.25-log : Database - test
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`test` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci */;

USE `test`;

/*Table structure for table `user_info` */

DROP TABLE IF EXISTS `user_info`;

CREATE TABLE `user_info` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `phone` varchar(20) NOT NULL DEFAULT '' COMMENT '手机号',
  `userName` varchar(20) DEFAULT NULL COMMENT '用户名',
  `status` tinyint(4) DEFAULT NULL COMMENT '状态',
  `valid` tinyint(4) NOT NULL DEFAULT '1' COMMENT '是否有效(0:无效 1:有效)',
  `createTime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `createBy` bigint(20) DEFAULT NULL COMMENT '创建人',
  `createByType` int(11) DEFAULT NULL COMMENT '创建人类型',
  `updateTime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `updateBy` bigint(20) DEFAULT NULL COMMENT '修改人',
  `updateByType` int(11) DEFAULT NULL COMMENT '修改人类型',
  PRIMARY KEY (`id`),
  KEY `idx_phone` (`phone`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COMMENT='用户表';

/*Data for the table `user_info` */

insert  into `user_info`(`id`,`phone`,`userName`,`status`,`valid`,`createTime`,`createBy`,`createByType`,`updateTime`,`updateBy`,`updateByType`) values (1,'123456','tesggggg',1,1,'2019-07-03 18:45:26',NULL,NULL,'2019-07-04 14:17:19',NULL,NULL),(2,'123457','好样子',1,1,'2019-07-04 10:41:07',NULL,NULL,'2019-07-04 10:41:31',NULL,NULL),(3,'123458','ok吗',1,1,'2019-07-04 10:41:45',NULL,NULL,'2019-07-04 10:41:45',NULL,NULL),(4,'12349','开会了',1,1,'2019-07-04 11:17:15',NULL,NULL,'2019-07-04 11:17:15',NULL,NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
