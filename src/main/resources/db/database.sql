-- MySQL dump 10.13  Distrib 5.7.21, for Win64 (x86_64)
--
-- Host: localhost    Database: FoodOrderingSystem
-- ------------------------------------------------------
-- Server version	5.7.21-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Current Database: `FoodOrderingSystem`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `FoodOrderingSystem` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `FoodOrderingSystem`;

--
-- Table structure for table `contact_details`
--

DROP TABLE IF EXISTS `contact_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `contact_details` (
  `contact_id` int(11) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `message` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `subject` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`contact_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contact_details`
--

LOCK TABLES `contact_details` WRITE;
/*!40000 ALTER TABLE `contact_details` DISABLE KEYS */;
/*!40000 ALTER TABLE `contact_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `food`
--

DROP TABLE IF EXISTS `food`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `food` (
  `food_id` int(11) NOT NULL,
  `food_name` varchar(255) DEFAULT NULL,
  `price` double NOT NULL,
  `food_title_title_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`food_id`),
  KEY `FKftrlagrmhy65ej283hxpwy2tn` (`food_title_title_id`),
  CONSTRAINT `FKftrlagrmhy65ej283hxpwy2tn` FOREIGN KEY (`food_title_title_id`) REFERENCES `food_title` (`title_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `food`
--

LOCK TABLES `food` WRITE;
/*!40000 ALTER TABLE `food` DISABLE KEYS */;
INSERT INTO `food` VALUES (1,'Exotic Combo of Cheese & Basil',30,1),(2,'Capsicum, Tomatoes, Onion',30,1),(3,'Chicken Tikka & Cheese',30,1),(4,'Chicken Burger',40,2);
/*!40000 ALTER TABLE `food` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `food_restaurant_list`
--

DROP TABLE IF EXISTS `food_restaurant_list`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `food_restaurant_list` (
  `food_food_id` int(11) NOT NULL,
  `restaurant_list_restaurant_id` int(11) NOT NULL,
  UNIQUE KEY `UK_dhn254oumnpia0ta6lr99587j` (`restaurant_list_restaurant_id`),
  KEY `FKnbh4slhsly07wcg0nkyru5ytn` (`food_food_id`),
  CONSTRAINT `FKnbh4slhsly07wcg0nkyru5ytn` FOREIGN KEY (`food_food_id`) REFERENCES `food` (`food_id`),
  CONSTRAINT `FKsetlharx2xfty0sw6wvw6wry7` FOREIGN KEY (`restaurant_list_restaurant_id`) REFERENCES `restaurant` (`restaurant_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `food_restaurant_list`
--

LOCK TABLES `food_restaurant_list` WRITE;
/*!40000 ALTER TABLE `food_restaurant_list` DISABLE KEYS */;
INSERT INTO `food_restaurant_list` VALUES (1,1),(1,2);
/*!40000 ALTER TABLE `food_restaurant_list` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `food_title`
--

DROP TABLE IF EXISTS `food_title`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `food_title` (
  `title_id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`title_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `food_title`
--

LOCK TABLES `food_title` WRITE;
/*!40000 ALTER TABLE `food_title` DISABLE KEYS */;
INSERT INTO `food_title` VALUES (1,'Pizzas'),(2,'Burgers');
/*!40000 ALTER TABLE `food_title` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `food_title_food_list`
--

DROP TABLE IF EXISTS `food_title_food_list`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `food_title_food_list` (
  `food_title_title_id` int(11) NOT NULL,
  `food_list_food_id` int(11) NOT NULL,
  UNIQUE KEY `UK_l6k12qh1pb6ks4a5l36kab88b` (`food_list_food_id`),
  KEY `FKr943o96nd1qdus9flcn4h7t67` (`food_title_title_id`),
  CONSTRAINT `FKr943o96nd1qdus9flcn4h7t67` FOREIGN KEY (`food_title_title_id`) REFERENCES `food_title` (`title_id`),
  CONSTRAINT `FKt1jqodt3xukwr64uexvldps1n` FOREIGN KEY (`food_list_food_id`) REFERENCES `food` (`food_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `food_title_food_list`
--

LOCK TABLES `food_title_food_list` WRITE;
/*!40000 ALTER TABLE `food_title_food_list` DISABLE KEYS */;
INSERT INTO `food_title_food_list` VALUES (1,1),(1,2),(1,3);
/*!40000 ALTER TABLE `food_title_food_list` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hibernate_sequence`
--

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` VALUES (3);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `order_detail`
--

DROP TABLE IF EXISTS `order_detail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `order_detail` (
  `iid` varchar(255) NOT NULL,
  `oid` varchar(255) NOT NULL,
  `qty` int(11) NOT NULL,
  `total_price` double NOT NULL,
  `food_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`iid`,`oid`),
  KEY `FKiyi4bmnb8vf4hdbbcduu43kin` (`food_id`),
  KEY `FKm6an0aai7muf3tij80e3e6jr5` (`oid`),
  CONSTRAINT `FKiyi4bmnb8vf4hdbbcduu43kin` FOREIGN KEY (`food_id`) REFERENCES `food` (`food_id`),
  CONSTRAINT `FKm6an0aai7muf3tij80e3e6jr5` FOREIGN KEY (`oid`) REFERENCES `orders` (`oid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `order_detail`
--

LOCK TABLES `order_detail` WRITE;
/*!40000 ALTER TABLE `order_detail` DISABLE KEYS */;
/*!40000 ALTER TABLE `order_detail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `orders` (
  `oid` varchar(255) NOT NULL,
  `order_date` varchar(255) DEFAULT NULL,
  `restaurant_restaurant_id` int(11) DEFAULT NULL,
  `user_user_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`oid`),
  KEY `FKagwq2pyw2stvey6vxnh3805w0` (`restaurant_restaurant_id`),
  KEY `FKcooejujh32cpgw33d02snbufy` (`user_user_id`),
  CONSTRAINT `FKagwq2pyw2stvey6vxnh3805w0` FOREIGN KEY (`restaurant_restaurant_id`) REFERENCES `restaurant` (`restaurant_id`),
  CONSTRAINT `FKcooejujh32cpgw33d02snbufy` FOREIGN KEY (`user_user_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orders_order_details`
--

DROP TABLE IF EXISTS `orders_order_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `orders_order_details` (
  `orders_oid` varchar(255) NOT NULL,
  `order_details_iid` varchar(255) NOT NULL,
  `order_details_oid` varchar(255) NOT NULL,
  KEY `FKqxe4kojrongqkjhbrxj2ob1rx` (`order_details_iid`,`order_details_oid`),
  KEY `FKawsauxhy2vslj6pix7rc3rmi9` (`orders_oid`),
  CONSTRAINT `FKawsauxhy2vslj6pix7rc3rmi9` FOREIGN KEY (`orders_oid`) REFERENCES `orders` (`oid`),
  CONSTRAINT `FKqxe4kojrongqkjhbrxj2ob1rx` FOREIGN KEY (`order_details_iid`, `order_details_oid`) REFERENCES `order_detail` (`iid`, `oid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders_order_details`
--

LOCK TABLES `orders_order_details` WRITE;
/*!40000 ALTER TABLE `orders_order_details` DISABLE KEYS */;
/*!40000 ALTER TABLE `orders_order_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `restaurant`
--

DROP TABLE IF EXISTS `restaurant`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `restaurant` (
  `restaurant_id` int(11) NOT NULL,
  `location` varchar(255) DEFAULT NULL,
  `restaurant_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`restaurant_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `restaurant`
--

LOCK TABLES `restaurant` WRITE;
/*!40000 ALTER TABLE `restaurant` DISABLE KEYS */;
INSERT INTO `restaurant` VALUES (1,'Panadura','Pizza hut'),(2,'Panadura','Dominos');
/*!40000 ALTER TABLE `restaurant` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `restaurant_food_list`
--

DROP TABLE IF EXISTS `restaurant_food_list`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `restaurant_food_list` (
  `restaurant_restaurant_id` int(11) NOT NULL,
  `food_list_food_id` int(11) NOT NULL,
  UNIQUE KEY `UK_d7kat35g9dnhy7emy41qkdosd` (`food_list_food_id`),
  KEY `FK5n4nxqees3ggbfbfh7o7nq7jt` (`restaurant_restaurant_id`),
  CONSTRAINT `FK5n4nxqees3ggbfbfh7o7nq7jt` FOREIGN KEY (`restaurant_restaurant_id`) REFERENCES `restaurant` (`restaurant_id`),
  CONSTRAINT `FKcf08vafnl5tcfeelt09fsnuur` FOREIGN KEY (`food_list_food_id`) REFERENCES `food` (`food_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `restaurant_food_list`
--

LOCK TABLES `restaurant_food_list` WRITE;
/*!40000 ALTER TABLE `restaurant_food_list` DISABLE KEYS */;
INSERT INTO `restaurant_food_list` VALUES (1,1),(1,2),(1,3),(1,4);
/*!40000 ALTER TABLE `restaurant_food_list` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `user_id` int(11) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `user_type` int(11) NOT NULL,
  `user_credential_username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`user_id`),
  KEY `FKbipytqmsabcqqd8nv8t0sbko7` (`user_credential_username`),
  CONSTRAINT `FKbipytqmsabcqqd8nv8t0sbko7` FOREIGN KEY (`user_credential_username`) REFERENCES `user_credential` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_credential`
--

DROP TABLE IF EXISTS `user_credential`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_credential` (
  `username` varchar(255) NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  `user_user_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`username`),
  KEY `FKpe77ffxcyg3n7q3sk4abxnf2l` (`user_user_id`),
  CONSTRAINT `FKpe77ffxcyg3n7q3sk4abxnf2l` FOREIGN KEY (`user_user_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_credential`
--

LOCK TABLES `user_credential` WRITE;
/*!40000 ALTER TABLE `user_credential` DISABLE KEYS */;
INSERT INTO `user_credential` VALUES ('email','password',NULL),('sample','sample',NULL);
/*!40000 ALTER TABLE `user_credential` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-03-10  1:17:52
