/*
 Navicat Premium Data Transfer

 Source Server         : Mysql
 Source Server Type    : MySQL
 Source Server Version : 80018
 Source Host           : localhost:3306
 Source Schema         : live_project

 Target Server Type    : MySQL
 Target Server Version : 80018
 File Encoding         : 65001

 Date: 15/03/2020 19:44:55
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `pw` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of admin
-- ----------------------------
BEGIN;
INSERT INTO `admin` VALUES (1, 'hack', 'e10adc3949ba59abbe56e057f20f883e');
COMMIT;

-- ----------------------------
-- Table structure for order
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `judgeNumber` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of order
-- ----------------------------
BEGIN;
INSERT INTO `order` VALUES (3, 'ssssssss');
INSERT INTO `order` VALUES (7, 'a');
INSERT INTO `order` VALUES (9, 'ssd');
INSERT INTO `order` VALUES (12, '8a1c3973-b47b-4282-9d83-9dff1ba4f5d9');
INSERT INTO `order` VALUES (13, 'ff156c58-d317-49d5-9c92-7b898084e1e8');
INSERT INTO `order` VALUES (14, '45cdc895-be02-4551-80d3-21f9a247ba0b');
INSERT INTO `order` VALUES (15, 'ff963c14-6cda-4f4c-8815-2b3a1c99a154');
INSERT INTO `order` VALUES (16, '92bffb3b-5bb8-4804-83a5-e11ab4075f27');
INSERT INTO `order` VALUES (17, '602e691d-6bb7-4900-9119-025f8234eaf4');
INSERT INTO `order` VALUES (18, 'd01c8bb8-94e3-4774-8618-8c3bb0c28848');
INSERT INTO `order` VALUES (19, '0acc52db-c5fe-47b7-b1d8-aae76ca34c1e');
INSERT INTO `order` VALUES (20, 'e6ceeec9-9f45-4e6a-a34e-99f2624851ae');
INSERT INTO `order` VALUES (21, '1b3c4c04-3e51-415d-9bc3-42fb22b236fa');
INSERT INTO `order` VALUES (22, '53792d88-20f4-4196-8d39-ad60ce65ea25');
INSERT INTO `order` VALUES (23, 'e1f1d4f2-1ea0-4b87-ba99-7b74ee52a6ee');
COMMIT;

-- ----------------------------
-- Table structure for record
-- ----------------------------
DROP TABLE IF EXISTS `record`;
CREATE TABLE `record` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `tel` varchar(255) DEFAULT NULL,
  `cardId` varchar(255) DEFAULT NULL,
  `count` int(11) DEFAULT NULL,
  `orderId` int(11) DEFAULT NULL,
  `selfOrderNumber` varchar(255) DEFAULT NULL,
  `status` int(1) DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `orderId` (`orderId`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of record
-- ----------------------------
BEGIN;
INSERT INTO `record` VALUES (1, 'hack', '13205039021', '350583199712144336', 5, 20, 'c97a901f-2118-4378-8190-f2ec9fdd9246', 1);
INSERT INTO `record` VALUES (2, 'zzz', '15396642008', '350583199712144335', 3, 20, 'd97a901f-2118-4378-8190-f2ec9fdd9246', 1);
INSERT INTO `record` VALUES (3, 'hack', '13205039021', '350583199712144336', 5, 23, 'b4eba772-bced-4240-a828-b918b864eafd', 0);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
