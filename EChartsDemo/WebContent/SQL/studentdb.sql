-- --------------------------------------------------------
-- 主机:                           127.0.0.1
-- 服务器版本:                        5.7.15-log - MySQL Community Server (GPL)
-- 服务器操作系统:                      Win64
-- HeidiSQL 版本:                  9.4.0.5168
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- 导出 studentdb 的数据库结构
DROP DATABASE IF EXISTS `studentdb`;
CREATE DATABASE IF NOT EXISTS `studentdb` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `studentdb`;

-- 导出  表 studentdb.examinfo 结构
DROP TABLE IF EXISTS `examinfo`;
CREATE TABLE IF NOT EXISTS `examinfo` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `student_id` bigint(20) unsigned NOT NULL DEFAULT '0',
  `name` varchar(50) NOT NULL,
  `score` decimal(4,2) unsigned DEFAULT NULL,
  `exam_order` tinyint(3) unsigned DEFAULT NULL,
  `mobile` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=96 DEFAULT CHARSET=utf8;

-- 正在导出表  studentdb.examinfo 的数据：~95 rows (大约)
DELETE FROM `examinfo`;
/*!40000 ALTER TABLE `examinfo` DISABLE KEYS */;
INSERT INTO `examinfo` (`id`, `student_id`, `name`, `score`, `exam_order`, `mobile`) VALUES
	(1, 0, '黄敏', 70.83, 1, NULL),
	(2, 0, '马康康', 56.67, 1, NULL),
	(3, 0, '单长亮', 90.83, 1, NULL),
	(4, 0, '范平平', 85.00, 1, NULL),
	(5, 0, '邬华龙', 71.67, 1, NULL),
	(6, 0, '董雨翔', 76.25, 1, NULL),
	(7, 0, '苑金东', 43.30, 1, NULL),
	(8, 0, '张余粮', 72.50, 1, NULL),
	(9, 0, '程伟伟', 56.67, 1, NULL),
	(10, 0, '姚远', 70.00, 1, NULL),
	(11, 0, '张辽', 80.83, 1, NULL),
	(12, 0, '姚夏', 39.17, 1, NULL),
	(13, 0, '许成林', 56.67, 1, NULL),
	(14, 0, '张文强', 91.67, 1, NULL),
	(15, 0, '王丰', 71.67, 1, NULL),
	(16, 0, '王俊', 35.83, 1, NULL),
	(17, 0, '刘磊', 42.50, 1, NULL),
	(18, 0, '夏超超', 98.33, 1, NULL),
	(19, 0, '胡小东', 89.17, 1, NULL),
	(20, 0, '黄敏', 84.00, 2, NULL),
	(21, 0, '马康康', 84.00, 2, NULL),
	(22, 0, '单长亮', 96.67, 2, NULL),
	(23, 0, '范平平', 85.00, 2, NULL),
	(24, 0, '邬华龙', 71.50, 2, NULL),
	(25, 0, '董雨翔', 85.00, 2, NULL),
	(26, 0, '苑金东', 54.00, 2, NULL),
	(27, 0, '张余粮', 72.50, 2, NULL),
	(28, 0, '程伟伟', 80.00, 2, NULL),
	(29, 0, '姚远', 73.80, 2, NULL),
	(30, 0, '张辽', 76.00, 2, NULL),
	(31, 0, '姚夏', 65, 2, NULL),
	(32, 0, '许成林', 60.00, 2, NULL),
	(33, 0, '张文强', 93.33, 2, NULL),
	(34, 0, '王丰', 67.50, 2, NULL),
	(35, 0, '王俊', 63.33, 2, NULL),
	(36, 0, '刘磊', 50.00, 2, NULL),
	(37, 0, '夏超超', 95.00, 2, NULL),
	(38, 0, '胡小东', 97.00, 2, NULL),
	(39, 0, '黄敏', 78.00, 3, NULL),
	(40, 0, '马康康', 95.00, 3, NULL),
	(41, 0, '单长亮', 92.00, 3, NULL),
	(42, 0, '范平平', 89.00, 3, NULL),
	(43, 0, '邬华龙', 79.00, 3, NULL),
	(44, 0, '董雨翔', 77.00, 3, NULL),
	(45, 0, '苑金东', 58.00, 3, NULL),
	(46, 0, '张余粮', 86.00, 3, NULL),
	(47, 0, '程伟伟', 90.00, 3, NULL),
	(48, 0, '姚远', 86.00, 3, NULL),
	(49, 0, '张辽', 84.00, 3, NULL),
	(50, 0, '姚夏', 60.00, 3, NULL),
	(51, 0, '许成林', 64.00, 3, NULL),
	(52, 0, '张文强', 96.00, 3, NULL),
	(53, 0, '王丰', 76.00, 3, NULL),
	(54, 0, '王俊', 63.00, 3, NULL),
	(55, 0, '刘磊', 44.00, 3, NULL),
	(56, 0, '夏超超', 96.00, 3, NULL),
	(57, 0, '胡小东', 94.00, 3, NULL),
	(58, 0, '黄敏', 76.70, 4, NULL),
	(59, 0, '马康康', 81.70, 4, NULL),
	(60, 0, '单长亮', 90.00, 4, NULL),
	(61, 0, '范平平', 77.10, 4, NULL),
	(62, 0, '邬华龙', 89.60, 4, NULL),
	(63, 0, '董雨翔', 79.20, 4, NULL),
	(64, 0, '苑金东', 71.70, 4, NULL),
	(65, 0, '张余粮', 53.30, 4, NULL),
	(66, 0, '程伟伟', 75.80, 4, NULL),
	(67, 0, '姚远', 80.40, 4, NULL),
	(68, 0, '张辽', 0.00, 4, NULL),
	(69, 0, '姚夏', 80.80, 4, NULL),
	(70, 0, '许成林', 0.00, 4, NULL),
	(71, 0, '张文强', 82.10, 4, NULL),
	(72, 0, '王丰', 74.20, 4, NULL),
	(73, 0, '王俊', 61.70, 4, NULL),
	(74, 0, '刘磊', 49.20, 4, NULL),
	(75, 0, '夏超超', 93.80, 4, NULL),
	(76, 0, '胡小东', 84.20, 4, NULL),
	(77, 0, '黄敏', 85.00, 5, NULL),
	(78, 0, '马康康', 80.00, 5, NULL),
	(79, 0, '单长亮', 80.80, 5, NULL),
	(80, 0, '范平平', 80.80, 5, NULL),
	(81, 0, '邬华龙', 87.50, 5, NULL),
	(82, 0, '董雨翔', 80.00, 5, NULL),
	(83, 0, '苑金东', 0.00, 5, NULL),
	(84, 0, '张余粮', 65.80, 5, NULL),
	(85, 0, '程伟伟', 85.00, 5, NULL),
	(86, 0, '姚远', 71.70, 5, NULL),
	(87, 0, '张辽', 0.00, 5, NULL),
	(88, 0, '姚夏', 79.20, 5, NULL),
	(89, 0, '许成林', 0.00, 5, NULL),
	(90, 0, '张文强', 80.00, 5, NULL),
	(91, 0, '王丰', 88.30, 5, NULL),
	(92, 0, '王俊', 57.50, 5, NULL),
	(93, 0, '刘磊', 47.60, 5, NULL),
	(94, 0, '夏超超', 90.80, 5, NULL),
	(95, 0, '胡小东', 97.70, 5, NULL);
/*!40000 ALTER TABLE `examinfo` ENABLE KEYS */;

-- 导出  表 studentdb.studentinfo 结构
DROP TABLE IF EXISTS `studentinfo`;
CREATE TABLE IF NOT EXISTS `studentinfo` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `sex` tinyint(4) DEFAULT '1' COMMENT '1-男，2-女',
  `mobile` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  studentdb.studentinfo 的数据：~0 rows (大约)
DELETE FROM `studentinfo`;
/*!40000 ALTER TABLE `studentinfo` DISABLE KEYS */;
/*!40000 ALTER TABLE `studentinfo` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
