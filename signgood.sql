-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 12, 2017 at 02:34 PM
-- Server version: 10.1.26-MariaDB
-- PHP Version: 7.1.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `signgood`
--

-- --------------------------------------------------------

--
-- Table structure for table `data`
--

CREATE TABLE `data` (
  `name` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `data`
--

INSERT INTO `data` (`name`, `email`, `password`) VALUES
('', '', ''),
('jc', '1@1.1', '1'),
('bhonesh chawla', '1@1.11', '11'),
('q', 'a@a.com', '1'),
('', 'a@aa.com', '1'),
('', 'a@aaaa.com', ''),
('a', 'aa@a.com', 'a'),
('bho', 'abc', '1234'),
('ash', 'ash', '123'),
('bhonesh', 'b@b.com', 'bb'),
('qq', 'qq', 'qq'),
('qqqqqqqqqqq', 'qqqqqqqqqqqqq', '12'),
('bhonesh', 'raj@gmail.com', '1234'),
('Sri Ram', 'ram@g.com', 'r'),
('Sri Ram', 'ram_24', '123');

-- --------------------------------------------------------

--
-- Table structure for table `day`
--

CREATE TABLE `day` (
  `date` varchar(255) NOT NULL,
  `specialday` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `day`
--

INSERT INTO `day` (`date`, `specialday`) VALUES
('2017-10-1', 'hi'),
('2017-10-1', 'birthday of ram'),
('2017-10-1', 'birthday of om'),
('2017-10-12', 'Birthday'),
('2017-10-11', 'birthday of bhonesh'),
('2017-10-12', 'RAM'),
('2017-10-12', 'Om'),
('2017-10-2', 'birthday of harami'),
('2017-10-2', 'abh'),
('2017-10-3', 'rambhai'),
('2017-10-3', 'ramk'),
('2017-10-3', 'ramo'),
('2017-10-1', 'eaaa'),
('2017-10-24', 'vacationend'),
('2017-10-24', 'AAA'),
('2017-10-16', 'qw'),
('2017-10-27', '123'),
('2017-10-19', 'Ram'),
('2017-10-19', 'ARMAN'),
('2017-10-24', 'qwe'),
('2017-10-6', '123'),
('2017-10-12', 'birthday of om');

-- --------------------------------------------------------

--
-- Table structure for table `diary`
--

CREATE TABLE `diary` (
  `email` varchar(255) NOT NULL,
  `filename` varchar(255) NOT NULL,
  `content` text NOT NULL,
  `date` varchar(255) NOT NULL,
  `important` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `diary`
--

INSERT INTO `diary` (`email`, `filename`, `content`, `date`, `important`) VALUES
('abc', 'bho1', 'Hi Bhuvi', '2017-10-10', 'yes'),
('qq', 'qqqqqqqqqqqqqqqqqqqqqqqqqq', 'qqqqqqqqqqqqq', '2017-10-11', 'no'),
('1@1.1', 'as', 'hello avishkar', '2017-10-11', 'no'),
('b@b.com', 'right', 'watsapp', '2017-10-12', 'no'),
('ram@g.com', 'ram', 'Hi', '2017-10-12', 'no'),
('ram@g.com', 'Hie', 'Hi Guys', '2017-10-12', 'no'),
('ram@g.com', 'cnscnsh;kjd', 'JBkjnfksdj', '2017-10-12', 'no'),
('ram@g.com', 'ram', 'NDSKJnDMSACDS', '2017-10-12', 'no'),
('raj@gmail.com', 'ram', 'gyeuegdyugd', '2017-10-12', 'no');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `data`
--
ALTER TABLE `data`
  ADD PRIMARY KEY (`email`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
