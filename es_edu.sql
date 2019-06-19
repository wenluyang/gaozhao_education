/*
 Navicat Premium Data Transfer

 Source Server         : 本地
 Source Server Type    : MySQL
 Source Server Version : 50553
 Source Host           : localhost:3306
 Source Schema         : es_edu

 Target Server Type    : MySQL
 Target Server Version : 50553
 File Encoding         : 65001

 Date: 19/06/2019 09:26:49
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for class_hour_plan
-- ----------------------------
DROP TABLE IF EXISTS `class_hour_plan`;
CREATE TABLE `class_hour_plan`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '课时' ROW_FORMAT = Fixed;

-- ----------------------------
-- Table structure for common_dict
-- ----------------------------
DROP TABLE IF EXISTS `common_dict`;
CREATE TABLE `common_dict`  (
  `dict_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `code` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `dict_type` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `value` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`dict_id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '通用字典' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for grade
-- ----------------------------
DROP TABLE IF EXISTS `grade`;
CREATE TABLE `grade`  (
  `grade_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `name` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '年级名称',
  PRIMARY KEY (`grade_id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '年级' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for resource
-- ----------------------------
DROP TABLE IF EXISTS `resource`;
CREATE TABLE `resource`  (
  `res_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `pres_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`res_id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '资源' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for school_class
-- ----------------------------
DROP TABLE IF EXISTS `school_class`;
CREATE TABLE `school_class`  (
  `class_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `year_id` int(11) NULL DEFAULT NULL COMMENT '学年ID',
  `grade_id` int(11) NULL DEFAULT NULL COMMENT '年级ID',
  `teacher_id` int(11) NULL DEFAULT NULL COMMENT '班主任ID',
  PRIMARY KEY (`class_id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '班级' ROW_FORMAT = Fixed;

-- ----------------------------
-- Table structure for school_year
-- ----------------------------
DROP TABLE IF EXISTS `school_year`;
CREATE TABLE `school_year`  (
  `year_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `name` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '学年名称',
  `start_year` int(11) NULL DEFAULT NULL COMMENT '开始年份',
  `end_year` int(11) NULL DEFAULT NULL COMMENT '结束年份',
  `is_current` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0' COMMENT '是否当前学年 1是0否',
  PRIMARY KEY (`year_id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '学年数据表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of school_year
-- ----------------------------
INSERT INTO `school_year` VALUES (1, '第一学年', 2018, 2019, '1');
INSERT INTO `school_year` VALUES (3, '第二学年', 2019, 2020, '0');
INSERT INTO `school_year` VALUES (4, '', NULL, NULL, NULL);

-- ----------------------------
-- Table structure for subject
-- ----------------------------
DROP TABLE IF EXISTS `subject`;
CREATE TABLE `subject`  (
  `subject_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `name` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '科目名称',
  `type` int(11) NULL DEFAULT NULL COMMENT '科目类型',
  `importance` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '重点学科',
  `seq` int(11) NULL DEFAULT NULL COMMENT '排序',
  PRIMARY KEY (`subject_id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '科目' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sys_edubureau
-- ----------------------------
DROP TABLE IF EXISTS `sys_edubureau`;
CREATE TABLE `sys_edubureau`  (
  `id` bigint(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `edu_code` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '教育机构编号',
  `edu_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '教育局名称',
  `province_code` int(10) NULL DEFAULT NULL COMMENT '省份ID',
  `city_code` int(10) NULL DEFAULT NULL COMMENT '城市ID',
  `district_code` int(10) NULL DEFAULT NULL COMMENT '地区ID',
  `fk_code` bigint(12) NULL DEFAULT NULL COMMENT '唯一外键标识符',
  `valid_start_time` datetime NULL DEFAULT NULL COMMENT '服务开始时间',
  `valid_end_time` datetime NULL DEFAULT NULL COMMENT '服务结束时间',
  `tel` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '电话',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `del_status` tinyint(4) NULL DEFAULT 0 COMMENT '删除状态',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 67 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sys_edubureau
-- ----------------------------
INSERT INTO `sys_edubureau` VALUES (62, '3123', '312', 312, 312, 312, 329614725199429632, '2018-12-30 00:00:00', '2018-12-30 00:00:00', '312', '2019-05-25 10:52:20', '2019-06-18 13:28:22', 0);
INSERT INTO `sys_edubureau` VALUES (63, NULL, '121212121', 212, 2121, 21, 329615194080673792, NULL, NULL, NULL, '2019-05-25 10:54:11', '2019-05-25 10:54:11', 0);
INSERT INTO `sys_edubureau` VALUES (64, '3333', '3333333333', 333333, 1111, 222, 338344518027837440, '2018-12-30 00:00:00', '2018-12-30 00:00:00', '3333333333', '2019-06-18 13:01:24', '2019-06-18 13:01:24', NULL);
INSERT INTO `sys_edubureau` VALUES (65, '3213123', '312312', 32312, 312321, 312312, 338346014534533120, '2018-12-30 00:00:00', '2018-12-30 00:00:00', '32131', '2019-06-18 13:07:21', '2019-06-18 13:07:21', NULL);
INSERT INTO `sys_edubureau` VALUES (66, '321', '2313', 31231, 3123, 312, 338349107808567296, '2018-12-30 00:00:00', '2018-12-30 00:00:00', '2321312', '2019-06-18 13:19:39', '2019-06-18 13:19:39', 0);

-- ----------------------------
-- Table structure for sys_schoolinfor
-- ----------------------------
DROP TABLE IF EXISTS `sys_schoolinfor`;
CREATE TABLE `sys_schoolinfor`  (
  `id` bigint(12) UNSIGNED NOT NULL AUTO_INCREMENT,
  `school_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '学校名称',
  `school_area` bigint(12) NULL DEFAULT NULL COMMENT '学校面积',
  `province_code` int(10) NULL DEFAULT NULL COMMENT '学校所属省份编号',
  `district_code` int(10) NULL DEFAULT NULL COMMENT '所在地区编号',
  `city_code` int(12) NULL DEFAULT NULL COMMENT '学校所属城市代码',
  `school_postcode` int(10) NULL DEFAULT NULL COMMENT '学校邮编',
  `setup_time` date NULL DEFAULT NULL COMMENT '学校创建时间',
  `edu_bureau_fkcode` bigint(20) NULL DEFAULT NULL COMMENT '教育局(Sys_Edu_Bureau)外键唯一标识',
  `del_status` tinyint(4) NULL DEFAULT NULL COMMENT '删除状态',
  `school_latlng` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '学校经纬度，格式(22，113)',
  `school_profile` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '学校简介',
  `school_nature` int(4) NULL DEFAULT NULL COMMENT '学校办学性质(1公办，2私立)',
  `school_address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '学校地址',
  `school_image` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '学校的图片URL',
  `school_motto` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '学校校训',
  `fkCode` bigint(12) NULL DEFAULT NULL COMMENT '外键唯一标识',
  `school_fax` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '学校传真',
  `school_tel` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '学校电话',
  `school_english_ame` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '学校英文名称',
  `valid_start_time` datetime NULL DEFAULT NULL COMMENT '服务开始时间',
  `valid_end_time` datetime NULL DEFAULT NULL COMMENT '服务结束时间',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sys_schoolinfor
-- ----------------------------
INSERT INTO `sys_schoolinfor` VALUES (1, '学校名称', NULL, 111, 3333, 222, NULL, NULL, 31312, 0, NULL, NULL, NULL, NULL, NULL, NULL, 123, NULL, NULL, NULL, '2018-12-30 00:00:00', '2018-12-30 00:00:00', '2019-06-18 16:04:17', '2019-06-18 16:32:40');
INSERT INTO `sys_schoolinfor` VALUES (2, '113333', NULL, NULL, 111, 111, NULL, NULL, 2222, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2018-12-30 00:00:00', '2018-12-30 00:00:00', '2019-06-18 16:12:23', '2019-06-18 16:12:23');
INSERT INTO `sys_schoolinfor` VALUES (3, '434343', NULL, NULL, 4343, 43434, NULL, NULL, 322323, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2018-12-30 00:00:00', '2018-12-30 00:00:00', '2019-06-18 16:14:54', '2019-06-18 16:14:54');
INSERT INTO `sys_schoolinfor` VALUES (4, '4234324', NULL, NULL, 23424, 24324, NULL, NULL, 3213123, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2018-12-30 00:00:00', '2018-12-30 00:00:00', '2019-06-18 16:15:18', '2019-06-18 16:15:18');
INSERT INTO `sys_schoolinfor` VALUES (5, '3213', NULL, 23213, 131, 123213, NULL, NULL, 213213, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2018-12-30 00:00:00', '2018-12-30 00:00:00', '2019-06-18 16:17:31', '2019-06-18 16:17:31');

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user`  (
  `id` bigint(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `fk_code` bigint(10) NULL DEFAULT NULL COMMENT '用户关联的用户fk_code(这里可以是教职工，学生，后期还可以是家长)',
  `user_account` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户账号',
  `pwd` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户密码',
  `del_status` int(4) NULL DEFAULT 0 COMMENT '删除状态',
  `identity` int(4) NULL DEFAULT NULL COMMENT '用户的身份(1学生，2校长，3教职工，4教育局用户,5学校管理员,6超级管理员)',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `by_fkcode` bigint(10) NULL DEFAULT NULL COMMENT '用户所属于的教育局和学校',
  `creator_fkCode` bigint(10) NULL DEFAULT NULL COMMENT '创建者的fk_code',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 15 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES (1, 329252388055547905, '杨先前', '123', 0, 6, '2019-05-24 12:04:34', '2019-05-24 12:04:34', 123, 329252388055547905);
INSERT INTO `sys_user` VALUES (14, 329270518433710080, 'jyj61', '123456', 0, 4, '2019-05-24 12:04:34', '2019-05-24 12:04:34', NULL, 32);

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher`  (
  `teacher_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `birthday` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '老师生日',
  `home_addr` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '家庭居住地址',
  `native_place` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '籍贯',
  `home_zipcode` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮编',
  `phone` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '电话',
  `sex` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '性别',
  `teacher_no` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '教师编号',
  `suject_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '任教学科ID',
  `nation` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '民族',
  `degree` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '学历',
  `major` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '专业',
  `graduate_school` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '毕业学校',
  `graduate_date` date NULL DEFAULT NULL COMMENT '毕业时间',
  `email` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮箱',
  PRIMARY KEY (`teacher_id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '教师表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for term
-- ----------------------------
DROP TABLE IF EXISTS `term`;
CREATE TABLE `term`  (
  `term_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `name` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '学期名称',
  `start_time` date NULL DEFAULT NULL COMMENT '开始时间',
  `end_time` date NULL DEFAULT NULL COMMENT '结束时间',
  `is_current` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '是否当前学期',
  `year` int(11) NULL DEFAULT 0 COMMENT '学年',
  PRIMARY KEY (`term_id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '学期管理' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of term
-- ----------------------------
INSERT INTO `term` VALUES (3, '3213', '2018-01-01', '2018-01-01', '1', 3);
INSERT INTO `term` VALUES (4, '第一学期', '2018-09-01', '2019-09-01', NULL, 1);
INSERT INTO `term` VALUES (5, '第二学期', '2019-09-01', '2020-09-01', NULL, 1);

SET FOREIGN_KEY_CHECKS = 1;
