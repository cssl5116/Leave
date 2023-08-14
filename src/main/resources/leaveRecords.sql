/*
 Navicat Premium Data Transfer

 Source Server         : docker_mysql
 Source Server Type    : MySQL
 Source Server Version : 50736
 Source Host           : localhost:3306
 Source Schema         : team

 Target Server Type    : MySQL
 Target Server Version : 50736
 File Encoding         : 65001

 Date: 14/08/2023 08:50:12
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

USE team;

-- ----------------------------
-- Table structure for leaveRecords
-- ----------------------------
DROP TABLE IF EXISTS `leaveRecords`;
CREATE TABLE `leaveRecords` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `leaveTime` datetime NOT NULL,
  `reason` varchar(255) COLLATE utf8_unicode_ci NOT NULL COMMENT '请假原因',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of leaveRecords
-- ----------------------------
BEGIN;
INSERT INTO `leaveRecords` (`id`, `name`, `leaveTime`, `reason`) VALUES (1, '周睿', '2023-08-11 11:31:13', '发烧去医院打针输液');
INSERT INTO `leaveRecords` (`id`, `name`, `leaveTime`, `reason`) VALUES (2, '胡云熙', '2022-12-06 02:21:15', '出门旅游,游山玩水');
INSERT INTO `leaveRecords` (`id`, `name`, `leaveTime`, `reason`) VALUES (3, '常震南', '2022-09-07 15:23:49', '回老家,看父母');
INSERT INTO `leaveRecords` (`id`, `name`, `leaveTime`, `reason`) VALUES (4, '赵云熙', '2023-02-13 21:41:01', '带孩子出去玩');
INSERT INTO `leaveRecords` (`id`, `name`, `leaveTime`, `reason`) VALUES (5, '戴嘉伦', '2023-03-17 00:25:35', '散散心');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
