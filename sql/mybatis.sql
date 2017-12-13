/*
Navicat MySQL Data Transfer

Source Server         : 本地数据库
Source Server Version : 50528
Source Host           : localhost:3306
Source Database       : mybatis

Target Server Type    : MYSQL
Target Server Version : 50528
File Encoding         : 65001

Date: 2017-12-13 15:34:22
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for content
-- ----------------------------
DROP TABLE IF EXISTS `content`;
CREATE TABLE `content` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) DEFAULT NULL,
  `document` longtext,
  `user_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `user_id` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of content
-- ----------------------------
INSERT INTO `content` VALUES ('1', '发文1', '这是内容1', '1');
INSERT INTO `content` VALUES ('2', '发文2', '这是内容2', '2');
INSERT INTO `content` VALUES ('3', '发文3', '这是内容3', '3');
INSERT INTO `content` VALUES ('4', '发文4', '这是内容4', '2');
INSERT INTO `content` VALUES ('5', '发文5', '这是内容5', '2');
INSERT INTO `content` VALUES ('6', '发文6', '这是内容6', '1');

-- ----------------------------
-- Table structure for discuss
-- ----------------------------
DROP TABLE IF EXISTS `discuss`;
CREATE TABLE `discuss` (
  `commit` varchar(255) DEFAULT NULL,
  `createtime` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `content_id` int(11) DEFAULT NULL,
  KEY `content_id` (`content_id`),
  CONSTRAINT `content_id` FOREIGN KEY (`content_id`) REFERENCES `content` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of discuss
-- ----------------------------
INSERT INTO `discuss` VALUES ('评论1', '2017-12-13 11:38:02', '1');
INSERT INTO `discuss` VALUES ('评论2', '2017-12-13 11:38:05', '2');
INSERT INTO `discuss` VALUES ('评论3', '2017-12-13 11:38:08', '3');
INSERT INTO `discuss` VALUES ('评论4', '2017-12-13 11:38:11', '2');
INSERT INTO `discuss` VALUES ('评论5', '2017-12-13 11:38:14', '4');
INSERT INTO `discuss` VALUES ('评论6', '2017-12-13 11:38:19', '1');
INSERT INTO `discuss` VALUES ('评论7', '2017-12-13 11:39:16', '5');
INSERT INTO `discuss` VALUES ('评论8', '2017-12-14 11:39:20', '6');
INSERT INTO `discuss` VALUES ('评论9', '2017-12-16 11:39:35', '4');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(40) DEFAULT NULL,
  `sex` varchar(2) DEFAULT NULL,
  `birthday` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `address` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '张三', '男', '2017-12-12 13:52:06', '广东深圳');
INSERT INTO `user` VALUES ('2', '李四', '男', '2017-12-11 16:15:06', '湖南邵阳');
INSERT INTO `user` VALUES ('3', '王二', '男', '2017-12-11 16:50:19', '北京市');
