/*
Navicat MySQL Data Transfer

Source Server         : 本地数据库
Source Server Version : 50528
Source Host           : localhost:3306
Source Database       : mybatis

Target Server Type    : MYSQL
Target Server Version : 50528
File Encoding         : 65001

Date: 2017-12-12 20:38:36
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for discuss
-- ----------------------------
DROP TABLE IF EXISTS `discuss`;
CREATE TABLE `discuss` (
  `user_id` int(11) DEFAULT NULL,
  `commit` varchar(255) DEFAULT NULL,
  `createtime` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  KEY `user_id` (`user_id`),
  CONSTRAINT `user_id` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of discuss
-- ----------------------------
INSERT INTO `discuss` VALUES ('1', '评论1', '2017-12-12 14:03:44');
INSERT INTO `discuss` VALUES ('2', '评论2', '2017-12-12 14:15:54');
INSERT INTO `discuss` VALUES ('3', '评论3', '2017-12-12 14:15:58');
INSERT INTO `discuss` VALUES ('1', '评论4', '2017-12-12 14:16:01');
INSERT INTO `discuss` VALUES ('2', '评论5', '2017-12-12 14:16:07');
INSERT INTO `discuss` VALUES ('1', '评论6', '2017-12-12 14:14:56');

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
