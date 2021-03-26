/*
 Navicat Premium Data Transfer

 Source Server         : lcy
 Source Server Type    : MySQL
 Source Server Version : 80019
 Source Host           : localhost:3306
 Source Schema         : ems

 Target Server Type    : MySQL
 Target Server Version : 80019
 File Encoding         : 65001

 Date: 18/03/2021 20:38:18
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for express
-- ----------------------------
DROP TABLE IF EXISTS `express`;
CREATE TABLE `express`  (
  `emsId` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `emsAddr` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `emsName` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `emsPhone` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `emsMa` varchar(10) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `emsLocal` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `emsDelete` int(0) NULL DEFAULT NULL,
  PRIMARY KEY (`emsId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of express
-- ----------------------------
INSERT INTO `express` VALUES ('EMS202020202', '大连甘井子', '大蜗牛', '18811116666', 'EMS0202', '3-6-10', 0);
INSERT INTO `express` VALUES ('EMS202020211', '大连甘井子喜喜', '阿萨', '18811115555', 'EMS0211', '3-6-11', 0);
INSERT INTO `express` VALUES ('EMS20210110 ', 'A 栋 1 单元 201', '高小松', '13010001212', 'EMS201', '1-2-10', 0);
INSERT INTO `express` VALUES ('Sf20210318', '23 号楼 2 单元 502', '李大伟 ', '13612121212', 'SF4001 ', '3-1-23 ', 0);
INSERT INTO `express` VALUES ('YD2021031002', '8 号楼 3 单元 1001', '杨明明', '13266666666', 'YD3001', '23-2-3', 0);

SET FOREIGN_KEY_CHECKS = 1;
