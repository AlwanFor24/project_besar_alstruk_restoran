-- phpMyAdmin SQL Dump
-- version 5.1.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 05, 2023 at 02:03 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 7.4.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `restoran`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id` int(16) NOT NULL,
  `username` varchar(64) NOT NULL,
  `pass` varchar(64) NOT NULL,
  `nama_lengkap` varchar(255) NOT NULL,
  `notelp` varchar(64) NOT NULL,
  `alamat` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id`, `username`, `pass`, `nama_lengkap`, `notelp`, `alamat`) VALUES
(1, 'akhmad', 'akhmad', 'Akhmad Ridlo', '082122941060', 'Jln. Goyang Demi no 12 Bandung'),
(2, 'ridlo', 'ridlo', 'akhmad ridlo', '', ''),
(3, 'rika', 'rika', 'Rika Anastasia', '08358192642', 'Bogor Raya'),
(4, 'ajfhf', 'yty', 'yiy', '08888', 'bogoe'),
(5, 'eko', 'eko', 'Eko Gusti', '43353535', 'Rawr'),
(6, 'anny', 'anny', 'Anny Sutmaja', '927498365803', 'Cipadung'),
(7, 'ade', 'ade', 'Ade Rifal', '9758936598265832', 'Cipadung');

-- --------------------------------------------------------

--
-- Table structure for table `log_pesan`
--

CREATE TABLE `log_pesan` (
  `kd_pesanan` int(16) NOT NULL,
  `nama_pemesan` varchar(64) NOT NULL,
  `menu` varchar(255) NOT NULL,
  `jumlah` int(64) NOT NULL,
  `harga` int(64) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `log_pesan`
--

INSERT INTO `log_pesan` (`kd_pesanan`, `nama_pemesan`, `menu`, `jumlah`, `harga`) VALUES
(20, 'ridlo', 'Kopi Kenangan', 5, 75000),
(21, 'ridlo', 'Mie Ayam Pangsit', 4, 100000),
(22, 'ridlo', 'Es Jeruk', 3, 45000),
(23, 'ridlo', 'Es Coklat', 3, 24000);

-- --------------------------------------------------------

--
-- Table structure for table `menu`
--

CREATE TABLE `menu` (
  `kd_menu` int(64) NOT NULL,
  `nama_menu` varchar(255) NOT NULL,
  `harga` int(64) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `menu`
--

INSERT INTO `menu` (`kd_menu`, `nama_menu`, `harga`) VALUES
(1, 'Kopi Kenangan', 15000),
(2, 'Mie Ayam Pangsit', 25000),
(3, 'Bakso Sapi', 13000),
(4, 'Mie Ayam Bakso', 15000),
(5, 'Es Jeruk', 15000),
(6, 'Es Kelapa', 13000),
(7, 'Air Putih', 7000),
(8, 'Es Coklat', 8000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `log_pesan`
--
ALTER TABLE `log_pesan`
  ADD PRIMARY KEY (`kd_pesanan`);

--
-- Indexes for table `menu`
--
ALTER TABLE `menu`
  ADD PRIMARY KEY (`kd_menu`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `id` int(16) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `log_pesan`
--
ALTER TABLE `log_pesan`
  MODIFY `kd_pesanan` int(16) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- AUTO_INCREMENT for table `menu`
--
ALTER TABLE `menu`
  MODIFY `kd_menu` int(64) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
