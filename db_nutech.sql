-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 07, 2023 at 05:31 AM
-- Server version: 10.4.10-MariaDB
-- PHP Version: 7.3.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_nutech`
--

-- --------------------------------------------------------

--
-- Table structure for table `saldo`
--

CREATE TABLE `saldo` (
  `id` varchar(255) NOT NULL,
  `created_on` datetime(6) DEFAULT NULL,
  `debit` int(11) DEFAULT NULL,
  `description` varchar(100) DEFAULT NULL,
  `id_merchan` varchar(50) DEFAULT NULL,
  `kredit` int(11) DEFAULT NULL,
  `saldo_akhir` int(11) DEFAULT NULL,
  `saldo_awal` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `saldo`
--

INSERT INTO `saldo` (`id`, `created_on`, `debit`, `description`, `id_merchan`, `kredit`, `saldo_akhir`, `saldo_awal`) VALUES
('dfd', '0000-00-00 00:00:00.000000', 232, 'fdfd', 'fdf', 232, 232, 232);

-- --------------------------------------------------------

--
-- Table structure for table `tb_merchant`
--

CREATE TABLE `tb_merchant` (
  `id` int(11) NOT NULL,
  `id_merchant` varchar(20) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `alamat` text NOT NULL,
  `created_on` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `tb_produk`
--

CREATE TABLE `tb_produk` (
  `id` int(5) NOT NULL,
  `kode_produk` varchar(10) NOT NULL,
  `description` varchar(20) NOT NULL,
  `created_on` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `tb_transaksi`
--

CREATE TABLE `tb_transaksi` (
  `id` int(5) NOT NULL,
  `idpel` varchar(20) NOT NULL,
  `invoice_number` varchar(20) NOT NULL,
  `transaction_type` varchar(20) NOT NULL,
  `description` varchar(50) NOT NULL,
  `admin` float NOT NULL,
  `amount` float NOT NULL,
  `total_amount` float NOT NULL,
  `created_on` datetime NOT NULL,
  `id_mercahant` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` varchar(255) NOT NULL,
  `created_on` datetime(6) DEFAULT NULL,
  `is_deleted` bit(1) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  `username` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `created_on`, `is_deleted`, `password`, `username`) VALUES
('69a14773-d226-4d0c-bbbd-84e0535a1925', '2023-10-07 08:39:41.000000', b'1', '134', 'budi'),
('951e985d-1142-4ef4-b978-7a2c3f51cc8b', '2023-10-07 08:39:52.000000', b'0', '134', 'cahyo'),
('da3936e9-995c-4630-b652-e29b300ceb1d', '2023-10-06 22:09:46.000000', b'0', '134', 'cahyo');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `saldo`
--
ALTER TABLE `saldo`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tb_merchant`
--
ALTER TABLE `tb_merchant`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tb_produk`
--
ALTER TABLE `tb_produk`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tb_transaksi`
--
ALTER TABLE `tb_transaksi`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tb_merchant`
--
ALTER TABLE `tb_merchant`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tb_produk`
--
ALTER TABLE `tb_produk`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tb_transaksi`
--
ALTER TABLE `tb_transaksi`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
