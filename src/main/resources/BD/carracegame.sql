-- MySQL dump 10.13  Distrib 8.0.23, for Win64 (x86_64)
--
-- Host: localhost    Database: carracegame
-- ------------------------------------------------------
-- Server version	8.0.23

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `carril`
--

DROP TABLE IF EXISTS `carril`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `carril` (
  `idcarril` int NOT NULL AUTO_INCREMENT,
  `decripcion` varchar(45) NOT NULL,
  PRIMARY KEY (`idcarril`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `carril`
--

LOCK TABLES `carril` WRITE;
/*!40000 ALTER TABLE `carril` DISABLE KEYS */;
INSERT INTO `carril` VALUES (6,'Carril 1'),(7,'Carril 2'),(8,'Carril 3'),(9,'Carril 4'),(10,'Carril 5'),(11,'Carril 6'),(12,'Carril 7'),(13,'Carril 8');
/*!40000 ALTER TABLE `carril` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `carro`
--

DROP TABLE IF EXISTS `carro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `carro` (
  `idcarro` int NOT NULL AUTO_INCREMENT,
  `placa` varchar(45) NOT NULL,
  `marca` varchar(45) NOT NULL,
  `modelo` varchar(45) NOT NULL,
  PRIMARY KEY (`idcarro`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `carro`
--

LOCK TABLES `carro` WRITE;
/*!40000 ALTER TABLE `carro` DISABLE KEYS */;
INSERT INTO `carro` VALUES (4,'FTG45','BMW','2015'),(5,'HTY65','Mercedes-Benz','2021'),(6,'OUT67','Audi','2021'),(7,'YYT41','Ford','2019');
/*!40000 ALTER TABLE `carro` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `conductor`
--

DROP TABLE IF EXISTS `conductor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `conductor` (
  `idconductor` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  PRIMARY KEY (`idconductor`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `conductor`
--

LOCK TABLES `conductor` WRITE;
/*!40000 ALTER TABLE `conductor` DISABLE KEYS */;
INSERT INTO `conductor` VALUES (1,'Juan'),(2,'Cristian'),(3,'Maria');
/*!40000 ALTER TABLE `conductor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `juego`
--

DROP TABLE IF EXISTS `juego`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `juego` (
  `idjuego` int NOT NULL AUTO_INCREMENT,
  `idjugador` int NOT NULL,
  `descripcion` varchar(45) NOT NULL,
  `distanciaRecorrida` int NOT NULL,
  PRIMARY KEY (`idjuego`,`idjugador`),
  KEY `fk_idjugador_idx` (`idjugador`),
  CONSTRAINT `fk_idjugador` FOREIGN KEY (`idjugador`) REFERENCES `jugador` (`idjugador`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=250 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `juego`
--

LOCK TABLES `juego` WRITE;
/*!40000 ALTER TABLE `juego` DISABLE KEYS */;
INSERT INTO `juego` VALUES (1,13,'Juego1',0),(2,14,'Juego1',0),(3,15,'Juego1',0),(4,16,'Juego3',0),(5,17,'Juego1',0),(6,18,'Juego1',0),(7,19,'Juego1',0),(8,20,'Juego1',0),(9,21,'Juego1',0),(10,22,'Juego1',0),(11,23,'Juego1',0),(12,24,'Juego1',0),(13,25,'Juego1',0),(14,26,'Juego2',0),(15,27,'Juego2',0),(16,28,'Juego2',0),(17,29,'Juego1-2021/05/17 00:57:13',0),(18,30,'Juego1-2021/05/17 00:57:13',0),(19,31,'Juego2-2021/05/17 00:58:29',0),(20,32,'Juego2-2021/05/17 00:58:29',0),(21,33,'Juego2-2021/05/17 00:58:29',0),(22,34,'Juego1-2021/05/17 01:28:53',0),(23,35,'Juego1-2021/05/17 01:28:53',0),(24,36,'Juego1-2021/05/17 01:28:53',0),(25,37,'Juego1-2021/05/17 01:37:30',0),(26,38,'Juego1-2021/05/17 01:37:30',0),(27,39,'Juego1-2021/05/17 01:37:30',0),(28,40,'Juego1-2021/05/17 01:39:23',0),(29,41,'Juego1-2021/05/17 01:39:23',0),(30,42,'Juego1-2021/05/17 01:39:23',0),(31,43,'Juego1-2021/05/17 01:41:25',0),(32,44,'Juego1-2021/05/17 01:41:25',0),(33,45,'Juego1-2021/05/17 01:41:25',0),(34,46,'Juego1-2021/05/17 01:44:05',0),(35,47,'Juego1-2021/05/17 01:44:05',0),(36,48,'Juego1-2021/05/17 01:44:05',0),(37,49,'Juego1-2021/05/17 01:48:09',0),(38,50,'Juego1-2021/05/17 01:48:09',0),(39,51,'Juego1-2021/05/17 01:48:09',0),(40,52,'Juego1-2021/05/17 01:50:39',0),(41,53,'Juego1-2021/05/17 01:50:39',0),(42,54,'Juego1-2021/05/17 01:50:39',0),(43,55,'Juego1-2021/05/17 02:03:32',0),(44,56,'Juego1-2021/05/17 02:03:32',0),(45,57,'Juego1-2021/05/17 02:03:32',0),(46,58,'Juego1-2021/05/17 02:06:55',0),(47,59,'Juego1-2021/05/17 02:06:55',0),(48,60,'Juego1-2021/05/17 02:06:55',0),(49,61,'Juego1-2021/05/17 02:08:18',0),(50,62,'Juego1-2021/05/17 02:08:18',0),(51,63,'Juego1-2021/05/17 02:08:18',0),(52,64,'Juego1-2021/05/17 02:10:55',0),(53,65,'Juego1-2021/05/17 02:10:55',0),(54,66,'Juego1-2021/05/17 02:10:55',0),(55,64,'Juego1-2021/05/17 02:10:55',100),(56,65,'Juego1-2021/05/17 02:10:55',200),(57,66,'Juego1-2021/05/17 02:10:55',200),(58,64,'Juego1-2021/05/17 02:10:55',300),(59,65,'Juego1-2021/05/17 02:10:55',600),(60,66,'Juego1-2021/05/17 02:10:55',600),(61,64,'Juego1-2021/05/17 02:10:55',200),(62,65,'Juego1-2021/05/17 02:10:55',400),(63,66,'Juego1-2021/05/17 02:10:55',100),(64,67,'Juego1-2021/05/17 02:24:25',0),(65,68,'Juego1-2021/05/17 02:24:25',0),(66,69,'Juego1-2021/05/17 02:24:25',0),(67,70,'Juego1-2021/05/17 02:26:07',0),(68,71,'Juego1-2021/05/17 02:26:07',0),(69,72,'Juego1-2021/05/17 02:26:07',0),(70,73,'Juego1-2021/05/17 02:28:57',0),(71,74,'Juego1-2021/05/17 02:28:57',0),(72,75,'Juego1-2021/05/17 02:28:57',0),(73,73,'Juego1-2021/05/17 02:28:57',500),(74,74,'Juego1-2021/05/17 02:28:57',500),(75,75,'Juego1-2021/05/17 02:28:57',300),(76,73,'Juego1-2021/05/17 02:28:57',100),(77,74,'Juego1-2021/05/17 02:28:57',200),(78,75,'Juego1-2021/05/17 02:28:57',100),(79,76,'Juego1-2021/05/17 02:34:18',0),(80,77,'Juego1-2021/05/17 02:34:18',0),(81,78,'Juego1-2021/05/17 02:34:18',0),(82,76,'Juego1-2021/05/17 02:34:18',600),(83,77,'Juego1-2021/05/17 02:34:18',500),(84,78,'Juego1-2021/05/17 02:34:18',400),(85,76,'Juego1-2021/05/17 02:34:18',600),(86,77,'Juego1-2021/05/17 02:34:18',100),(87,78,'Juego1-2021/05/17 02:34:18',600),(88,76,'Juego1-2021/05/17 02:34:18',300),(89,77,'Juego1-2021/05/17 02:34:18',200),(90,78,'Juego1-2021/05/17 02:34:18',400),(91,76,'Juego1-2021/05/17 02:34:18',600),(92,77,'Juego1-2021/05/17 02:34:18',600),(93,78,'Juego1-2021/05/17 02:34:18',300),(94,76,'Juego1-2021/05/17 02:34:18',300),(95,77,'Juego1-2021/05/17 02:34:18',600),(96,78,'Juego1-2021/05/17 02:34:18',200),(97,76,'Juego1-2021/05/17 02:34:18',200),(98,77,'Juego1-2021/05/17 02:34:18',400),(99,78,'Juego1-2021/05/17 02:34:18',100),(100,76,'Juego1-2021/05/17 02:34:18',500),(101,77,'Juego1-2021/05/17 02:34:18',600),(102,78,'Juego1-2021/05/17 02:34:18',600),(103,79,'Juego1-2021/05/17 02:38:28',0),(104,80,'Juego1-2021/05/17 02:38:28',0),(105,81,'Juego1-2021/05/17 02:38:28',0),(106,80,'Juego1-2021/05/17 02:38:28',500),(107,81,'Juego1-2021/05/17 02:38:28',600),(108,79,'Juego1-2021/05/17 02:38:28',200),(109,80,'Juego1-2021/05/17 02:38:28',400),(110,81,'Juego1-2021/05/17 02:38:28',600),(111,79,'Juego1-2021/05/17 02:38:28',300),(112,80,'Juego1-2021/05/17 02:38:28',100),(113,81,'Juego1-2021/05/17 02:38:28',100),(114,79,'Juego1-2021/05/17 02:38:28',200),(115,80,'Juego1-2021/05/17 02:38:28',600),(116,81,'Juego1-2021/05/17 02:38:28',100),(117,79,'Juego1-2021/05/17 02:38:28',600),(118,80,'Juego1-2021/05/17 02:38:28',600),(119,82,'Juego1-2021/05/17 02:52:42',0),(120,83,'Juego1-2021/05/17 02:52:42',0),(121,84,'Juego1-2021/05/17 02:52:42',0),(122,82,'Juego1-2021/05/17 02:52:42',200),(123,83,'Juego1-2021/05/17 02:52:42',100),(124,84,'Juego1-2021/05/17 02:52:42',600),(125,82,'Juego1-2021/05/17 02:52:42',500),(126,83,'Juego1-2021/05/17 02:52:42',500),(127,84,'Juego1-2021/05/17 02:52:42',400),(128,82,'Juego1-2021/05/17 02:52:42',100),(129,83,'Juego1-2021/05/17 02:52:42',600),(130,84,'Juego1-2021/05/17 02:52:42',300),(131,82,'Juego1-2021/05/17 02:52:42',100),(132,83,'Juego1-2021/05/17 02:52:42',500),(133,84,'Juego1-2021/05/17 02:52:42',500),(134,82,'Juego1-2021/05/17 02:52:42',500),(135,83,'Juego1-2021/05/17 02:52:42',300),(136,82,'Juego1-2021/05/17 02:52:42',400),(137,83,'Juego1-2021/05/17 02:52:42',100),(138,85,'Juego1-2021/05/17 02:58:45',0),(139,86,'Juego1-2021/05/17 02:58:45',0),(140,87,'Juego1-2021/05/17 02:58:45',0),(141,85,'Juego1-2021/05/17 02:58:45',400),(142,86,'Juego1-2021/05/17 02:58:45',200),(143,87,'Juego1-2021/05/17 02:58:45',300),(144,85,'Juego1-2021/05/17 02:58:45',300),(145,86,'Juego1-2021/05/17 02:58:45',600),(146,87,'Juego1-2021/05/17 02:58:45',100),(147,85,'Juego1-2021/05/17 02:58:45',600),(148,86,'Juego1-2021/05/17 02:58:45',300),(149,87,'Juego1-2021/05/17 02:58:45',100),(150,85,'Juego1-2021/05/17 02:58:45',400),(151,86,'Juego1-2021/05/17 02:58:45',500),(152,87,'Juego1-2021/05/17 02:58:45',100),(153,85,'Juego1-2021/05/17 02:58:45',600),(154,88,'Juego1-2021/05/17 03:37:04',0),(155,89,'Juego1-2021/05/17 03:37:04',0),(156,90,'Juego1-2021/05/17 03:37:04',0),(157,88,'Juego1-2021/05/17 03:37:04',300),(158,89,'Juego1-2021/05/17 03:37:04',100),(159,90,'Juego1-2021/05/17 03:37:04',600),(160,88,'Juego1-2021/05/17 03:37:04',600),(161,89,'Juego1-2021/05/17 03:37:04',100),(162,90,'Juego1-2021/05/17 03:37:04',300),(163,88,'Juego1-2021/05/17 03:37:04',500),(164,89,'Juego1-2021/05/17 03:37:04',100),(165,90,'Juego1-2021/05/17 03:37:04',300),(166,88,'Juego1-2021/05/17 03:37:04',600),(167,88,'Juego1-2021/05/17 03:37:04',400),(168,91,'Juego1-2021/05/17 03:39:13',0),(169,92,'Juego1-2021/05/17 03:39:13',0),(170,93,'Juego1-2021/05/17 03:39:13',0),(171,91,'Juego1-2021/05/17 03:39:13',400),(172,92,'Juego1-2021/05/17 03:39:13',300),(173,93,'Juego1-2021/05/17 03:39:13',200),(174,91,'Juego1-2021/05/17 03:39:13',200),(175,92,'Juego1-2021/05/17 03:39:13',100),(176,93,'Juego1-2021/05/17 03:39:13',200),(177,91,'Juego1-2021/05/17 03:39:13',200),(178,92,'Juego1-2021/05/17 03:39:13',200),(179,93,'Juego1-2021/05/17 03:39:13',300),(180,91,'Juego1-2021/05/17 03:39:13',400),(181,92,'Juego1-2021/05/17 03:39:13',600),(182,93,'Juego1-2021/05/17 03:39:13',500),(183,91,'Juego1-2021/05/17 03:39:13',100),(184,92,'Juego1-2021/05/17 03:39:13',300),(185,93,'Juego1-2021/05/17 03:39:13',500),(186,91,'Juego1-2021/05/17 03:39:13',300),(187,92,'Juego1-2021/05/17 03:39:13',200),(188,93,'Juego1-2021/05/17 03:39:13',600),(189,94,'Juego1-2021/05/17 04:06:44',0),(190,95,'Juego1-2021/05/17 04:06:44',0),(191,96,'Juego1-2021/05/17 04:06:44',0),(192,96,'Juego1-2021/05/17 04:06:44',300),(193,94,'Juego1-2021/05/17 04:06:44',200),(194,95,'Juego1-2021/05/17 04:06:44',500),(195,96,'Juego1-2021/05/17 04:06:44',300),(196,94,'Juego1-2021/05/17 04:06:44',400),(197,95,'Juego1-2021/05/17 04:06:44',400),(198,96,'Juego1-2021/05/17 04:06:44',100),(199,94,'Juego1-2021/05/17 04:06:44',100),(200,95,'Juego1-2021/05/17 04:06:44',500),(201,96,'Juego1-2021/05/17 04:06:44',400),(202,94,'Juego1-2021/05/17 04:06:44',500),(203,95,'Juego1-2021/05/17 04:06:44',300),(204,96,'Juego1-2021/05/17 04:06:44',500),(205,94,'Juego1-2021/05/17 04:06:44',400),(206,95,'Juego1-2021/05/17 04:06:44',100),(207,96,'Juego1-2021/05/17 04:06:44',100),(208,94,'Juego1-2021/05/17 04:06:44',200),(209,95,'Juego1-2021/05/17 04:06:44',300),(210,97,'Juego1-2021/05/17 04:15:04',0),(211,98,'Juego1-2021/05/17 04:15:04',0),(212,99,'Juego1-2021/05/17 04:15:04',0),(213,97,'Juego1-2021/05/17 04:15:04',100),(214,98,'Juego1-2021/05/17 04:15:04',300),(215,99,'Juego1-2021/05/17 04:15:04',300),(216,97,'Juego1-2021/05/17 04:15:04',200),(217,98,'Juego1-2021/05/17 04:15:04',300),(218,99,'Juego1-2021/05/17 04:15:04',200),(219,97,'Juego1-2021/05/17 04:15:04',400),(220,98,'Juego1-2021/05/17 04:15:04',300),(221,99,'Juego1-2021/05/17 04:15:04',300),(222,97,'Juego1-2021/05/17 04:15:04',300),(223,98,'Juego1-2021/05/17 04:15:04',500),(224,99,'Juego1-2021/05/17 04:15:04',600),(225,97,'Juego1-2021/05/17 04:15:04',600),(226,98,'Juego1-2021/05/17 04:15:04',400),(227,99,'Juego1-2021/05/17 04:15:04',600),(228,97,'Juego1-2021/05/17 04:15:04',600),(229,100,'Juego1-2021/05/17 04:19:52',0),(230,101,'Juego1-2021/05/17 04:19:52',0),(231,102,'Juego1-2021/05/17 04:19:52',0),(232,100,'Juego1-2021/05/17 04:19:52',100),(233,101,'Juego1-2021/05/17 04:19:52',200),(234,102,'Juego1-2021/05/17 04:19:52',300),(235,100,'Juego1-2021/05/17 04:19:52',200),(236,101,'Juego1-2021/05/17 04:19:52',200),(237,102,'Juego1-2021/05/17 04:19:52',200),(238,100,'Juego1-2021/05/17 04:19:52',100),(239,101,'Juego1-2021/05/17 04:19:52',100),(240,102,'Juego1-2021/05/17 04:19:52',200),(241,100,'Juego1-2021/05/17 04:19:52',600),(242,101,'Juego1-2021/05/17 04:19:52',500),(243,102,'Juego1-2021/05/17 04:19:52',500),(244,100,'Juego1-2021/05/17 04:19:52',500),(245,101,'Juego1-2021/05/17 04:19:52',200),(246,102,'Juego1-2021/05/17 04:19:52',500),(247,100,'Juego1-2021/05/17 04:19:52',200),(248,101,'Juego1-2021/05/17 04:19:52',500),(249,102,'Juego1-2021/05/17 04:19:52',500);
/*!40000 ALTER TABLE `juego` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jugador`
--

DROP TABLE IF EXISTS `jugador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `jugador` (
  `idjugador` int NOT NULL AUTO_INCREMENT,
  `idcarro` int NOT NULL,
  `idconductor` int NOT NULL,
  `idCarril` int NOT NULL,
  `nombre` varchar(45) NOT NULL,
  PRIMARY KEY (`idjugador`),
  KEY `fk_idcarro_idx` (`idcarro`),
  KEY `fk_idconductor_idx` (`idconductor`),
  KEY `fk_idCarril_idx` (`idCarril`),
  CONSTRAINT `fk_idcarrilJ` FOREIGN KEY (`idCarril`) REFERENCES `carril` (`idcarril`) ON DELETE CASCADE ON UPDATE RESTRICT,
  CONSTRAINT `fk_idcarro` FOREIGN KEY (`idcarro`) REFERENCES `carro` (`idcarro`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_idconductor` FOREIGN KEY (`idconductor`) REFERENCES `conductor` (`idconductor`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=103 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jugador`
--

LOCK TABLES `jugador` WRITE;
/*!40000 ALTER TABLE `jugador` DISABLE KEYS */;
INSERT INTO `jugador` VALUES (1,4,1,6,'Jose'),(2,5,2,7,'Henoc'),(3,6,3,8,'Luis'),(4,4,2,6,'xcxx'),(5,5,1,7,'rrrr'),(6,6,3,8,'ttt'),(7,4,1,6,'uuuu'),(8,4,1,6,'eeee'),(9,4,1,6,'xxxx'),(10,4,1,6,'iiii'),(11,4,1,6,'vvvv'),(12,5,2,7,'oooo'),(13,4,1,6,'llll'),(14,5,2,7,'qqq'),(15,6,3,8,'ttt'),(16,5,1,6,'uuuuuu'),(17,4,1,6,'yiyiy'),(18,5,2,7,'utyyegegb'),(19,6,3,8,'uyjtnfdnbf'),(20,4,1,6,'gkmgkjgkj'),(21,5,2,7,'f,gkgktgkrfd'),(22,6,3,8,'gjgjghjg'),(23,4,1,6,'klhkhkh'),(24,5,2,7,'jfjfjf'),(25,6,3,8,'jgjgjg'),(26,4,1,6,'jhrhurhrhr'),(27,5,2,7,'gjkfgkjrhjfdscjk'),(28,6,3,8,'ernserkjsahkds'),(29,4,1,6,'jfjhfhfhfejshss'),(30,5,2,7,'ndfcjwshjxsavsa'),(31,4,1,6,'sndbshbdjwsqdwq'),(32,5,2,7,'asdbsgdytfsaXafchgfsAD'),(33,6,3,8,'FNQIHEIUGD<ZJDXSACD'),(34,4,1,6,'fjkjfjkff'),(35,5,2,7,',fmfmnf'),(36,6,3,8,'gmgmkdsfkjdsjhbfhjdsf'),(37,4,1,6,'gdmgkljmdfslgjlkfjg'),(38,5,2,7,'dfnkjrkjhkrjtgkg'),(39,6,3,8,'frmgtkjreljtgy'),(40,4,1,6,'ghdfhgd,fÃ±lhj'),(41,5,2,7,'trwdnnfkjfd'),(42,6,3,8,'gmlksfg'),(43,4,1,6,'ghdfhjklerjhkljdgfh'),(44,5,2,7,'fgdsnfghhhghw'),(45,6,3,8,'edgmjjkhjkehwr'),(46,4,1,6,'gfdgmlksdfjhlkgjhl'),(47,5,2,7,'fnaskjhfahrsbg'),(48,6,3,8,'gsfdnhsad'),(49,4,1,6,'dsfnmjhjkhkjg'),(50,5,2,7,'dfnmqwerguaeweasa'),(51,6,3,8,'dbfhqwgrfhgdhdf'),(52,4,1,6,'gnhdhjgadseas'),(53,5,2,7,'dfahfjhgajhgvdafs'),(54,6,3,8,'bdjhajhf'),(55,4,1,6,'afdSJGDFJGADF'),(56,5,2,7,'AbdgasFHGD'),(57,6,3,8,'FDANGdgfASFDHGER'),(58,4,1,6,'GFDSHFHGDSAHGF'),(59,5,2,7,'TERTRADADA'),(60,6,3,8,'WGQEFFSDD'),(61,4,1,6,'fnsajkhwetgewtwetet'),(62,5,2,7,'eweasasaxaxs'),(63,6,3,8,'sgstertersdadsasaaaaa'),(64,4,1,6,'ttrerereds'),(65,5,2,7,'rerereeeaaaa'),(66,6,3,8,'dgwrewrwrafddfada'),(67,4,1,6,'sgddgfdjose'),(68,5,2,7,'hshhsmario'),(69,6,3,8,'ndhdhdhcarlos'),(70,4,1,6,'gggggcristian'),(71,5,2,7,'kkkkkmario'),(72,6,3,8,'uuuuujose'),(73,4,1,6,'ggggtomas'),(74,5,2,7,'jjjjjmiguel'),(75,6,3,8,'iiiipedro'),(76,4,1,6,'hhhhenoc'),(77,5,2,7,'hhhcristian'),(78,6,3,8,'nnnhernan'),(79,4,1,6,'jjjjhenoc'),(80,5,2,7,'uuuucristian'),(81,6,3,8,'jfjfjfjm,ario'),(82,4,1,6,'hhhjose'),(83,5,2,7,'yei'),(84,6,3,8,'zalyn'),(85,4,1,6,'gggthththdfhdbd'),(86,5,2,7,'dbsjdgjhewgdgdjhgjhd'),(87,6,3,8,'fdehrhhdsssssss'),(88,4,1,6,'Henoc Elias'),(89,5,2,7,'Cristian J'),(90,6,3,8,'Maria Aleja'),(91,4,1,6,'Henoc Eliaz S'),(92,5,2,7,'Cristian Jav'),(93,6,3,8,'Maria J s'),(94,4,1,6,'jjjjjjjCristian'),(95,5,2,7,'lllllllHenoc'),(96,6,3,8,'uuuuuuuuMaria'),(97,4,1,6,'mdkfkdjfkjfjfjfjfjfjfff'),(98,5,2,7,'g'),(99,6,3,8,'t'),(100,4,1,6,'hhhuuuuu'),(101,5,2,7,'er,mdmdmmmdd'),(102,6,3,8,'dmddjndnd');
/*!40000 ALTER TABLE `jugador` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pista`
--

DROP TABLE IF EXISTS `pista`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pista` (
  `idpista` int NOT NULL,
  `idcarril` int NOT NULL,
  `distancia` int NOT NULL,
  `descripcion` varchar(45) NOT NULL,
  PRIMARY KEY (`idpista`,`idcarril`),
  KEY `fk_idcarril_idx` (`idcarril`),
  CONSTRAINT `fk_idcarril` FOREIGN KEY (`idcarril`) REFERENCES `carril` (`idcarril`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pista`
--

LOCK TABLES `pista` WRITE;
/*!40000 ALTER TABLE `pista` DISABLE KEYS */;
INSERT INTO `pista` VALUES (1,6,2,'Pista1 '),(1,7,2,'Pista1'),(1,8,2,'Pista1'),(1,9,2,'Pista1'),(1,10,2,'Pista1'),(1,11,2,'Pista1');
/*!40000 ALTER TABLE `pista` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `podio`
--

DROP TABLE IF EXISTS `podio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `podio` (
  `idpodio` int NOT NULL AUTO_INCREMENT,
  `puesto` enum('1','2','3') NOT NULL,
  `descripcionP` varchar(45) NOT NULL,
  `DescripcionJuego` varchar(45) NOT NULL,
  `idJugador` int NOT NULL,
  `DistanciaRecorrida` int NOT NULL,
  PRIMARY KEY (`idpodio`),
  KEY `fk_idjugador_idx` (`idJugador`),
  KEY `fkDescripcionJ_idx` (`DescripcionJuego`),
  CONSTRAINT `fk_idJugadorPodio` FOREIGN KEY (`idJugador`) REFERENCES `jugador` (`idjugador`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `podio`
--

LOCK TABLES `podio` WRITE;
/*!40000 ALTER TABLE `podio` DISABLE KEYS */;
INSERT INTO `podio` VALUES (10,'1','Puesto 1','Juego1-2021/05/17 04:19:52',102,2200),(11,'2','Puesto 2','Juego1-2021/05/17 04:19:52',100,1700),(12,'3','Puesto 3','Juego1-2021/05/17 04:19:52',101,1700);
/*!40000 ALTER TABLE `podio` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-05-17  4:26:43
