-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 12, 2021 at 10:34 AM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.4.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db10119291perpustakaan`
--

-- --------------------------------------------------------

--
-- Table structure for table `t_aktivitas`
--

CREATE TABLE `t_aktivitas` (
  `id_aktivitas` int(11) NOT NULL,
  `id_anggota` int(11) NOT NULL,
  `id_petugas` int(11) NOT NULL,
  `isbn` varchar(30) NOT NULL,
  `tgl_aktivitas` date DEFAULT NULL,
  `jenis_aktivitas` enum('meminjam','mengembalikan') DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `t_aktivitas`
--

INSERT INTO `t_aktivitas` (`id_aktivitas`, `id_anggota`, `id_petugas`, `isbn`, `tgl_aktivitas`, `jenis_aktivitas`) VALUES
(2, 3, 2, '9786026238792', '2021-07-08', 'mengembalikan'),
(3, 1, 6, '9786026232694', '2021-07-28', 'meminjam'),
(4, 11, 2, '9786026238789', '2021-07-07', 'mengembalikan'),
(5, 1, 6, '9786026232694', '2021-07-30', 'mengembalikan'),
(6, 7, 4, '9786026238814', '2021-07-10', 'meminjam'),
(7, 20, 4, '9786026238825', '2021-07-20', 'mengembalikan'),
(8, 9, 4, '9786026238807', '2021-07-17', 'mengembalikan'),
(9, 8, 12, '9872193302321', '2021-07-25', 'meminjam'),
(10, 8, 12, '9875552223452', '2021-07-25', 'mengembalikan'),
(11, 12, 3, '9786026238829', '2021-07-20', 'mengembalikan'),
(12, 13, 3, '9786026238815', '2021-07-10', 'meminjam'),
(13, 16, 3, '9786026238798', '2021-07-05', 'meminjam'),
(14, 15, 3, '9786026238794', '2021-07-03', 'meminjam'),
(15, 14, 3, '9786026238791', '2021-07-08', 'mengembalikan'),
(16, 17, 5, '9786026238834', '2021-07-16', 'meminjam'),
(17, 18, 5, '9786026238822', '2021-07-19', 'mengembalikan'),
(18, 19, 5, '9786026238819', '2021-07-12', 'meminjam'),
(19, 21, 5, '9786026238826', '2021-07-14', 'meminjam'),
(20, 20, 5, '9786026238837', '2021-07-30', 'mengembalikan'),
(21, 22, 7, '9786026238806', '2021-07-13', 'mengembalikan'),
(23, 24, 7, '9786026238836', '2021-07-16', 'meminjam'),
(24, 23, 7, '9786026238818', '2021-07-24', 'mengembalikan'),
(25, 28, 7, '9786026238810', '2021-07-09', 'meminjam'),
(26, 27, 8, '9786026238811', '2021-07-15', 'mengembalikan'),
(27, 26, 8, '9786026238812', '2021-07-10', 'meminjam'),
(28, 29, 8, '9786026238813', '2021-07-14', 'mengembalikan'),
(29, 23, 9, '9786026238800', '2021-07-06', 'meminjam'),
(30, 31, 9, '9786026238797', '2021-07-05', 'meminjam'),
(31, 32, 10, '9786026238816', '2021-07-12', 'meminjam'),
(32, 33, 10, '9786026238817', '2021-07-12', 'meminjam'),
(33, 34, 3, '9786026238790', '2021-07-08', 'mengembalikan'),
(34, 35, 4, '9786026238803', '2021-07-12', 'mengembalikan'),
(35, 36, 6, '9786026238820', '2021-07-13', 'meminjam'),
(36, 37, 6, '9786026238821', '2021-07-17', 'mengembalikan'),
(37, 35, 6, '9786026238802', '2021-07-06', 'meminjam'),
(38, 39, 7, '9786026238823', '2021-07-17', 'mengembalikan'),
(39, 40, 7, '9786026238824', '2021-07-21', 'mengembalikan'),
(40, 30, 7, '9786026238787', '2021-07-07', 'mengembalikan'),
(41, 42, 5, '9786026238804', '2021-07-14', 'mengembalikan'),
(42, 43, 5, '9786026238827', '2021-07-14', 'meminjam'),
(43, 47, 5, '9786026238828', '2021-07-14', 'meminjam'),
(44, 31, 5, '9786026238796', '2021-07-10', 'mengembalikan'),
(45, 46, 5, '9786026238830', '2021-07-21', 'mengembalikan'),
(46, 44, 8, '9786026238831', '2021-07-21', 'mengembalikan'),
(47, 50, 1, '9786026238832', '2021-07-15', 'meminjam'),
(48, 51, 1, '9786026238833', '2021-07-21', 'mengembalikan'),
(49, 7, 1, '9786026238799', '2021-07-05', 'meminjam'),
(50, 22, 3, '9786026238793', '2021-07-03', 'meminjam'),
(51, 34, 6, '9786026238808', '2021-07-08', 'meminjam'),
(52, 42, 10, '9786026238786', '2021-07-08', 'mengembalikan'),
(53, 17, 10, '9786026238795', '2021-07-03', 'meminjam'),
(54, 11, 10, '9786026238788', '2021-07-09', 'mengembalikan'),
(55, 4, 2, '9786026238839', '2021-07-16', 'meminjam'),
(56, 6, 2, '9786026238809', '2021-07-09', 'meminjam'),
(58, 30, 7, '9786026238835', '2021-07-22', 'mengembalikan'),
(60, 5, 3, '9786026238838', '2021-07-20', 'mengembalikan'),
(63, 22, 8, '9875552223452', '2021-07-26', 'meminjam'),
(64, 2, 1, '9786026238805', '2021-07-07', 'meminjam'),
(65, 35, 7, '9786026238791', '2021-08-11', 'meminjam');

-- --------------------------------------------------------

--
-- Table structure for table `t_anggota`
--

CREATE TABLE `t_anggota` (
  `id_anggota` int(11) NOT NULL,
  `nama_anggota` varchar(50) NOT NULL,
  `jenis_kelamin` enum('laki-laki','perempuan') NOT NULL,
  `no_telpon` varchar(13) DEFAULT NULL,
  `alamat` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `t_anggota`
--

INSERT INTO `t_anggota` (`id_anggota`, `nama_anggota`, `jenis_kelamin`, `no_telpon`, `alamat`) VALUES
(1, 'Asep Ahmad', 'laki-laki', '085678765221', 'Surabaya'),
(2, 'Dadang suryana', 'laki-laki', '0821263563272', 'Bandung'),
(3, 'Melinda', 'perempuan', '0831172372357', 'Garut'),
(4, 'Nana', 'laki-laki', '085542775472', 'Bandung'),
(5, 'Yadi Mukidi', 'laki-laki', '085118111333', 'Garut'),
(6, 'Taro', 'laki-laki', '0861416415511', 'Jakarta'),
(7, 'Mila Amalia', 'perempuan', '0874164155313', 'Sukabumi'),
(8, 'Siti Masitoh', 'perempuan', '087678777666', 'Jakarta'),
(9, 'Agus Ridwan', 'laki-laki', '085678777890', 'Bogor'),
(10, 'Esih Sukaesih', 'perempuan', '082332221172', 'Garut'),
(11, 'Ikbal Muhamad', 'laki-laki', '0824672456552', 'Magelang'),
(12, 'Ios Nepada', 'laki-laki', '0859426745653', 'Tanggerang'),
(13, 'Ian Saputra', 'laki-laki', '0817372745275', 'Karawang'),
(14, 'Intan Herlina', 'perempuan', '0813863268377', 'Bandung'),
(15, 'Rismayanti', 'perempuan', '0815118189916', 'Jakarta'),
(16, 'Serawati', 'perempuan', '0816118189916', 'Garut'),
(17, 'Tarno Karno', 'laki-laki', '0837383778772', 'Bogor'),
(18, 'Mila Aolia', 'perempuan', '0873722837672', 'Tasikmalaya'),
(19, 'Ratnasari Soleha', 'perempuan', '0862529762572', 'Medan'),
(20, 'Puput', 'perempuan', '0087528252755', 'Kediri'),
(21, 'Denisa Putri', 'perempuan', '0829682524698', 'Banten'),
(22, 'Toto Henrriana', 'laki-laki', '0888252726244', 'Bandung'),
(23, 'Yumila', 'perempuan', '0282625274275', 'Jakarta'),
(24, 'Misabakus Solihin', 'laki-laki', '0892726562436', 'Sukabumi'),
(25, 'Suhendar', 'laki-laki', '0865265266427', 'Surabaya'),
(26, 'Ehen Herdiana', 'laki-laki', '0826624264276', 'Magelang'),
(27, 'Ilma Nurohmah', 'perempuan', '0928726242754', 'Bandung'),
(28, 'Ramdani Pratama', 'laki-laki', '0862624272477', 'Bandung'),
(29, 'Iban Ibenk', 'laki-laki', '0812836857252', 'Bandung'),
(30, 'Raihan Rf', 'laki-laki', '0812638153701', 'Jakarta'),
(31, 'Yosi Putra', 'laki-laki', '0812637257257', 'Garut'),
(32, 'Yesi Putri', 'perempuan', '0856725287285', 'Bandung'),
(33, 'Natans', 'laki-laki', '0892725273643', 'Garut'),
(34, 'Miko Marselino', 'laki-laki', '0826362656542', 'Garut'),
(35, 'Munadi SN', 'laki-laki', '0826514374275', 'Cianjur'),
(36, 'Pipih Plasyah', 'perempuan', '0863925275141', 'Bogor'),
(37, 'Tri Risma Maharani', 'perempuan', '0826252753751', 'Jakarta'),
(38, 'Gofar Razab', 'laki-laki', '0862626141646', 'Bandung'),
(39, 'Mundar Mandir', 'laki-laki', '0282562743643', 'Tanggerang'),
(40, 'Neng ineu', 'perempuan', '0267358253852', 'Cikarang'),
(41, 'Mulan maulani', 'perempuan', '0825141641775', 'Purwakarta'),
(42, 'Jajang Sukimin', 'perempuan', '0282534272656', 'Purwakarta'),
(43, 'Mineu putri', 'perempuan', '0823251151666', 'Cikarang'),
(44, 'Gagan Sugandi', 'perempuan', '0862554526426', 'Cikarang'),
(45, 'Tika Maharani', 'perempuan', '0872752672537', 'Bandung'),
(46, 'Kurobe', 'laki-laki', '0827624617437', 'Purwakarta'),
(47, 'Diablo', 'laki-laki', '086715137537', 'Purwakarta'),
(50, 'Ramiris', 'perempuan', '078652835725', 'Bandung'),
(51, 'Guy Crimson', 'laki-laki', '087657646746', 'Jakarta'),
(58, 'Sumi Asianti', 'perempuan', '0858257252452', 'Majalaya'),
(59, 'Teten Sayuuri', 'laki-laki', '0891152562454', 'Tasikmalaya'),
(65, 'Ade sugandi', 'laki-laki', '0865245235461', 'Surabaya');

-- --------------------------------------------------------

--
-- Table structure for table `t_buku`
--

CREATE TABLE `t_buku` (
  `isbn` varchar(30) NOT NULL,
  `judul_buku` varchar(100) NOT NULL,
  `penulis` varchar(100) NOT NULL,
  `tahun_terbit` int(4) DEFAULT NULL,
  `jenis_buku` varchar(30) DEFAULT NULL,
  `penerbit` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `t_buku`
--

INSERT INTO `t_buku` (`isbn`, `judul_buku`, `penulis`, `tahun_terbit`, `jenis_buku`, `penerbit`) VALUES
('1232134564358', 'Pemrograman Dasar', 'Mang Uloh', 2012, 'Komputer', 'Informatika'),
('1232134565567', 'Komputer & Jaringan', 'Rian Januari', 2009, 'Pelajaran', 'Informatika'),
('45534324234', 'Malin Kundang', 'dodi', 1992, 'dongeng', 'gramedia'),
('9786026232694', 'Pemrograman berorientasi objek menggunakan java', 'Adam Mukharil Bachtiar', 2018, 'ilmu komputer', 'Gramedia'),
('9786026238786', 'Struktur Data', 'Jajang Nurjaman', 2014, 'Ilmu Komputer', 'Gramedia'),
('9786026238787', 'Doa Ibu', 'Malin', 2008, 'Dongeng', 'Dunia Buku'),
('9786026238788', 'Pancasila dan Kewarganegaraam', 'Hadi', 2011, 'Pelajaran', 'Gramedia'),
('9786026238789', 'Dunia Imajinasi', 'Yunus', 2019, 'Novel', 'Dunia Buku'),
('9786026238790', 'Kesunyian Malam', 'Nanda Amalia', 2010, 'Novel', 'Dunia Buku'),
('9786026238791', 'Bandung 2001', 'Silmia NF', 2001, 'Novel', 'Dunia Buku'),
('9786026238792', 'Tips Lancar UN', 'Rian Januari', 2021, 'Pelajaran', 'Dunia Buku'),
('9786026238793', 'Nasib Anak Rantau', 'Yunus', 2000, 'Fiksi', 'Dunia Buku'),
('9786026238794', 'Matematika ', 'Amri Irawan', 2010, 'Pelajaran', 'Gramedia'),
('9786026238795', 'Pemograman Web', 'Jajang Nurjaman', 2013, 'Ilmu Komputer', 'Gramedia'),
('9786026238796', 'Java Pemula', 'Jajang Nurjaman', 2017, 'Ilmu Komputer', 'Gramedia'),
('9786026238797', 'Hidup Sehat', 'Yunus', 2018, 'Novel', 'Dunia Buku'),
('9786026238798', 'Jaringan Komputer', 'Agus Setiadi', 2019, 'Ilmu Komputer', 'Gramedia'),
('9786026238799', 'Terbit Dari Timur', 'Yunus', 2019, 'Novel', 'Dunia Buku'),
('9786026238800', 'Membosankan', 'Nanda Amalia', 2019, 'Novel', 'Dunia Buku'),
('9786026238801', 'Matematika  Dasar', 'Amri Irawan', 2000, 'Pelajaran', 'Gramedia'),
('9786026238802', 'Matematika Dasar 2', 'Amri Irawan', 2019, 'Pelajaran', 'Gramedia'),
('9786026238803', 'Matematika Dasar 3', 'Amri Irawan', 2020, 'Pelajaran', 'Gramedia'),
('9786026238804', 'Kalkulus 2', 'Neti', 2000, 'Pelajaran', 'Gramedia'),
('9786026238805', 'Manajemen Komputer', 'Rian Januari', 2011, 'Ilmu Komputer', 'Informatika'),
('9786026238806', 'Menyelamtkanmu', 'Nanda Amalia', 2000, 'Novel', 'Dunia Buku'),
('9786026238807', 'Memikirkanmu', 'Nanda Amalia', 2019, 'Novel', 'Juragan21'),
('9786026238808', 'Tips Olahraga', 'Malin', 2000, 'Pelajaran', 'Gramedia'),
('9786026238809', 'Teknik Industri', 'Jajang Nurjaman', 1999, 'Ilmu Komputer', 'Gramedia'),
('9786026238810', 'Agama Islam', 'Agus Setiadi', 1988, 'Pelajaran', 'Juragan21'),
('9786026238811', 'Hongkong', 'Iskandar', 2000, 'Novel', 'Dunia Buku'),
('9786026238812', 'Paris Van Java', 'Iskandar', 2019, 'Novel', 'Dunia Buku'),
('9786026238813', 'Ilmu Pengetahuan Alan', 'Neti', 2019, 'Pelajaran', 'Gramedia'),
('9786026238814', 'Membosankan 2', 'Nanda Amalia', 2020, 'Novel', 'Dunia Buku'),
('9786026238815', 'Situ Bagendit', 'Aneu Septiana', 2016, 'Dongeng', 'Dunia Buku'),
('9786026238816', 'Bersama Temanku', 'Nanda Amalia', 2015, 'Novel', 'Juragan21'),
('9786026238817', 'Hal Terindah', 'Yunus', 2019, 'Novel', 'Surya Kencana'),
('9786026238818', 'Tutorial Fany', 'Rezza Hambali', 2020, 'Pelajaran', 'Juragan21'),
('9786026238819', 'Pemograman Dasar', 'Deri Muzaki', 2021, 'Pelajaran', 'Juragan21'),
('9786026238820', 'Ilmu Pengetahuan Sosial', 'Rikher Muhamad', 2010, 'Pelajaran', 'Dunia Buku'),
('9786026238821', 'Berlawanan Arah', 'Nanda Amalia', 2010, 'Novel', 'Dunia Buku'),
('9786026238822', 'Kewirausahaan', 'Yunus', 2012, 'Pelajaran', 'Gramedia'),
('9786026238823', 'Positive Thinking', 'Nanda Amalia', 2008, 'Novel', 'Juragan21'),
('9786026238824', 'Sukses Bersama', 'Aneu Septiana', 2011, 'Novel', 'Juragan21'),
('9786026238825', 'Basis Data 1', 'Iskandar', 2001, 'Pelajaran', 'Gramedia'),
('9786026238826', 'Basis Data 2', 'Iskandar', 2008, 'Pelajaran', 'Gramedia'),
('9786026238827', 'Sistem Operasi', 'Aneu Septiana', 2012, 'Pelajaran', 'Informatika'),
('9786026238828', 'Sistem Informasi', 'Aneu Septiana', 2001, 'Pelajaran', 'Informatika'),
('9786026238829', 'Si Kabyan Hayang Kawin', 'Malin', 2001, 'Dongeng', 'Juragan21'),
('9786026238830', 'Tangkuban Kalapa', 'Malin', 2000, 'Dongeng', 'Juragan21'),
('9786026238831', 'Maju Tak Gentar', 'Rian Januari', 2011, 'Pelajaran', 'Gramedia'),
('9786026238832', 'Bahasa Inggris Pemula', 'Silmia NF', 2000, 'Pelajaran', 'Gramedia'),
('9786026238833', 'Mantan Terindah ', 'Laila Rahmah Ramdani', 2014, 'Novel', 'Juragan21'),
('9786026238834', 'Pemograman Visual', 'Rian Januari', 2021, 'Pelajaran', 'Juragan21'),
('9786026238835', 'Fisika 3', 'Agus Setiadi', 2010, 'Pelajaran', 'Gramedia'),
('9786026238836', 'Fisika 2', 'Agus Setiadi', 2008, 'Pelajaran', 'Gramedia'),
('9786026238837', 'Biologi ', 'Agus Setiadi', 2004, 'Pelajaran', 'Gramedia'),
('9786026238838', 'Tahun 1945', 'Silmia NF', 2001, 'Novel', 'Juragan21'),
('9786026238839', 'Ip Addres', 'Rian Januari', 2007, 'Pelajaran', 'Informatika'),
('9872193302321', 'Kalkulus 2', 'Tati Haryati', 2016, 'Pelajaran', 'gramedia'),
('9873918463521', 'Malin Kundang', 'Jajang Nurjaman', 2010, 'Dongeng', 'Gramedia'),
('9875552223452', 'Struktur Data', 'Hendra', 2012, 'Ilmu Komputer', 'Informatika');

-- --------------------------------------------------------

--
-- Table structure for table `t_kembali`
--

CREATE TABLE `t_kembali` (
  `id_pengembalian` int(11) NOT NULL,
  `id_peminjaman` int(11) NOT NULL,
  `tgl_kembali` date DEFAULT NULL,
  `denda` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `t_kembali`
--

INSERT INTO `t_kembali` (`id_pengembalian`, `id_peminjaman`, `tgl_kembali`, `denda`) VALUES
(6, 1, '2021-07-15', 3000),
(7, 1, '2021-07-16', 4000),
(12, 5, '2021-07-24', 0),
(13, 7, '2021-07-25', 0),
(14, 1, '2021-08-10', 29000),
(15, 1, '2021-08-10', 29000),
(16, 2, '2021-07-10', 5000),
(17, 2, '2021-07-10', 5000),
(18, 11, '2021-07-20', 12000),
(19, 2, '2021-07-14', 39000),
(21, 4, '2021-07-16', 11000),
(22, 56, '2021-08-03', 28000),
(23, 6, '2021-08-12', 15000),
(24, 6, '2021-08-13', 16000),
(25, 8, '2021-08-14', 39000),
(27, 11, '2021-08-07', 30000),
(28, 12, '2021-08-03', 26000),
(29, 13, '2021-08-04', 27000),
(30, 14, '2021-08-12', 35000),
(31, 15, '2021-08-12', 34000),
(32, 16, '2021-07-16', 7000),
(33, 17, '2021-08-20', 42000),
(34, 18, '2021-08-01', 22000),
(35, 19, '2021-07-21', 11000),
(36, 20, '2021-07-21', 11000),
(37, 21, '2021-07-21', 10000),
(38, 22, '2021-07-21', 10000),
(39, 23, '2021-07-22', 10000),
(40, 24, '2021-07-23', 11000),
(41, 58, '2021-07-24', 18000),
(42, 26, '2021-07-24', 12000),
(43, 27, '2021-07-24', 11000),
(44, 28, '2021-07-20', 7000),
(45, 29, '2021-07-20', 7000),
(46, 30, '2021-07-22', 9000),
(47, 30, '2021-07-22', 9000),
(48, 31, '2021-07-22', 7000),
(49, 33, '2021-07-23', 8000),
(50, 35, '2021-07-24', 8000),
(51, 36, '2021-07-20', 8000),
(52, 36, '2021-07-20', 4000),
(53, 37, '2021-07-20', 4000),
(54, 38, '2021-07-19', 4000),
(55, 38, '2021-07-19', 4000),
(56, 39, '2021-07-19', 2000),
(57, 41, '2021-07-22', 5000),
(58, 42, '2021-07-21', 4000),
(59, 43, '2021-07-22', 5000),
(60, 44, '2021-07-23', 5000),
(61, 44, '2021-07-19', 1000),
(62, 45, '2021-07-23', 5000),
(63, 46, '2021-07-17', 0),
(64, 46, '2021-07-23', 5000),
(65, 47, '2021-07-24', 6000),
(66, 47, '2021-07-24', 6000),
(67, 44, '2021-07-13', 0),
(69, 62, '2021-08-14', 0),
(70, 32, '2021-08-03', 19000),
(72, 64, '2021-08-24', 9000);

-- --------------------------------------------------------

--
-- Table structure for table `t_petugas`
--

CREATE TABLE `t_petugas` (
  `id_petugas` int(11) NOT NULL,
  `nama` varchar(50) DEFAULT NULL,
  `jabatan` varchar(20) DEFAULT NULL,
  `no_hp` varchar(15) DEFAULT NULL,
  `password` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `t_petugas`
--

INSERT INTO `t_petugas` (`id_petugas`, `nama`, `jabatan`, `no_hp`, `password`) VALUES
(1, 'Wandi Al Hakim', 'Staff', '08972746275', 'Staff'),
(2, 'Deri Manurung', 'Staff', '08975378224', 'Staff'),
(3, 'Dadang Koseh', 'Staff', '08937573497', 'Staff'),
(4, 'Nandang', 'Staff', '08973683654', 'Staff'),
(5, 'Danang Miharja', 'Staff', '08937583924', 'Staff'),
(6, 'dedi', 'staff', '085659434775', 'Admin'),
(7, 'Bibiw Selebew', 'Staff', '08978211984', 'Staff'),
(8, 'Ipit Marpu\'it', 'Staff', '08972648365', 'Staff'),
(9, 'Saputra Wati', 'Staff', '08935782111', 'Staff'),
(10, 'Yana Umar', 'Staff', '08982781885', 'Staff'),
(11, 'Diane', 'Staff', '08989837574', 'Staff'),
(12, 'yadi', 'admin', '056678987443', 'admin'),
(13, 'Hendra Kurniadi', 'Staff', '08927524149', 'Staff'),
(14, 'yayan ruhiyan', 'staff', '087889000998', 'staff'),
(15, 'Gugun Muhidin', 'Staff', '08972874682', 'Staff'),
(16, 'Asep Saepudin', 'Staff', '08929741917', 'Staff'),
(17, 'Ubay Dilah', 'Staff', '08900193891', 'Staff'),
(18, 'Triana Tresna Berkah', 'Staff', '08911209898', 'Staff'),
(19, 'Titin Kartini', 'Staff', '08909240982', 'Staff'),
(20, 'Tommy Yuli Saputra', 'Staff', '08828478128', 'Staff'),
(21, 'Bubut Sperpat', 'Staff', '08572892019', 'Staff'),
(22, 'Mang Soleh', 'Staff', '08937281148', 'Staff'),
(23, 'Dani Nugraha', 'Admin', '08977362827', 'Admin'),
(24, 'Anggi Aqua', 'Staff', '08988272114', 'Staff'),
(25, 'Ahdi Kancil', 'Staff', '08121727256', 'Staff'),
(26, 'Didi Salidi', 'Staff', '08967129135', 'Staff'),
(32, 'Melinda', 'Staff', '08928361127', 'Staff'),
(44, 'Neng Salma', 'Staff', '08972661119', 'Staff');

-- --------------------------------------------------------

--
-- Table structure for table `t_pinjam`
--

CREATE TABLE `t_pinjam` (
  `id_peminjaman` int(11) NOT NULL,
  `id_anggota` int(11) DEFAULT NULL,
  `isbn` varchar(30) NOT NULL,
  `tgl_pinjam` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `t_pinjam`
--

INSERT INTO `t_pinjam` (`id_peminjaman`, `id_anggota`, `isbn`, `tgl_pinjam`) VALUES
(1, 1, '9786026232694', '2021-07-09'),
(2, 3, '9786026238787', '2021-07-02'),
(3, 4, '9786026238788', '2021-07-02'),
(4, 11, '9786026238789', '2021-07-02'),
(5, 8, '9786026232694', '2021-07-21'),
(6, 8, '9872193302321', '2021-07-25'),
(7, 8, '9875552223452', '2021-07-25'),
(8, 9, '9786026238793', '2021-07-03'),
(9, 16, '9786026238794', '2021-07-03'),
(10, 5, '9786026238795', '2021-07-03'),
(11, 12, '9786026238796', '2021-07-05'),
(12, 13, '9786026238797', '2021-07-05'),
(13, 16, '9786026238798', '2021-07-05'),
(14, 15, '9786026238799', '2021-07-05'),
(15, 14, '9786026238800', '2021-07-06'),
(16, 17, '9786026238801', '2021-07-06'),
(17, 18, '9786026238802', '2021-07-06'),
(18, 19, '9786026238803', '2021-07-07'),
(19, 21, '9786026238804', '2021-07-07'),
(20, 20, '9786026238805', '2021-07-07'),
(21, 22, '9786026238806', '2021-07-08'),
(22, 30, '9786026238807', '2021-07-08'),
(23, 24, '9786026238808', '2021-07-08'),
(24, 23, '9786026238809', '2021-07-09'),
(25, 28, '9786026238810', '2021-07-09'),
(26, 27, '9786026238811', '2021-07-09'),
(27, 26, '9786026238812', '2021-07-10'),
(28, 29, '9786026238813', '2021-07-10'),
(29, 23, '9786026238814', '2021-07-10'),
(30, 31, '9786026238815', '2021-07-10'),
(31, 32, '9786026238816', '2021-07-12'),
(32, 33, '9786026238817', '2021-07-12'),
(33, 34, '9786026238818', '2021-07-12'),
(34, 35, '9786026238819', '2021-07-12'),
(35, 36, '9786026238820', '2021-07-13'),
(36, 37, '9786026238821', '2021-07-13'),
(37, 35, '9786026238822', '2021-07-13'),
(38, 39, '9786026238823', '2021-07-13'),
(39, 40, '9786026238824', '2021-07-14'),
(40, 30, '9786026238825', '2021-07-14'),
(41, 42, '9786026238826', '2021-07-14'),
(42, 43, '9786026238827', '2021-07-14'),
(43, 47, '9786026238828', '2021-07-14'),
(44, 31, '9786026238829', '2021-07-15'),
(45, 46, '9786026238830', '2021-07-15'),
(46, 44, '9786026238831', '2021-07-15'),
(47, 50, '9786026238832', '2021-07-15'),
(48, 51, '9786026238833', '2021-07-15'),
(49, 7, '9786026238834', '2021-07-16'),
(50, 22, '9786026238835', '2021-07-16'),
(51, 34, '9786026238836', '2021-07-16'),
(52, 42, '9786026238837', '2021-07-16'),
(53, 17, '9786026238838', '2021-07-16'),
(54, 11, '9786026238839', '2021-07-16'),
(56, 6, '9786026238790', '2021-07-03'),
(57, 7, '9786026238791', '2021-07-03'),
(58, 20, '9786026238792', '2021-07-03'),
(59, 2, '9786026238786', '2021-07-02'),
(61, 32, '9786026238791', '2021-08-11'),
(62, 43, '9786026238818', '2021-08-11'),
(63, 23, '9786026238787', '2021-08-08'),
(64, 12, '9786026232694', '2021-08-12');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `t_aktivitas`
--
ALTER TABLE `t_aktivitas`
  ADD PRIMARY KEY (`id_aktivitas`),
  ADD KEY `id_anggota` (`id_anggota`),
  ADD KEY `id_petugas` (`id_petugas`),
  ADD KEY `isbn` (`isbn`);

--
-- Indexes for table `t_anggota`
--
ALTER TABLE `t_anggota`
  ADD PRIMARY KEY (`id_anggota`);

--
-- Indexes for table `t_buku`
--
ALTER TABLE `t_buku`
  ADD PRIMARY KEY (`isbn`);

--
-- Indexes for table `t_kembali`
--
ALTER TABLE `t_kembali`
  ADD PRIMARY KEY (`id_pengembalian`),
  ADD KEY `id_peminjaman` (`id_peminjaman`);

--
-- Indexes for table `t_petugas`
--
ALTER TABLE `t_petugas`
  ADD PRIMARY KEY (`id_petugas`);

--
-- Indexes for table `t_pinjam`
--
ALTER TABLE `t_pinjam`
  ADD PRIMARY KEY (`id_peminjaman`),
  ADD KEY `id_anggota` (`id_anggota`),
  ADD KEY `isbn` (`isbn`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `t_aktivitas`
--
ALTER TABLE `t_aktivitas`
  MODIFY `id_aktivitas` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=66;

--
-- AUTO_INCREMENT for table `t_anggota`
--
ALTER TABLE `t_anggota`
  MODIFY `id_anggota` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=69;

--
-- AUTO_INCREMENT for table `t_kembali`
--
ALTER TABLE `t_kembali`
  MODIFY `id_pengembalian` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=73;

--
-- AUTO_INCREMENT for table `t_petugas`
--
ALTER TABLE `t_petugas`
  MODIFY `id_petugas` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=45;

--
-- AUTO_INCREMENT for table `t_pinjam`
--
ALTER TABLE `t_pinjam`
  MODIFY `id_peminjaman` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=65;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `t_aktivitas`
--
ALTER TABLE `t_aktivitas`
  ADD CONSTRAINT `t_aktivitas_ibfk_1` FOREIGN KEY (`id_anggota`) REFERENCES `t_anggota` (`id_anggota`),
  ADD CONSTRAINT `t_aktivitas_ibfk_2` FOREIGN KEY (`id_petugas`) REFERENCES `t_petugas` (`id_petugas`),
  ADD CONSTRAINT `t_aktivitas_ibfk_3` FOREIGN KEY (`isbn`) REFERENCES `t_buku` (`isbn`);

--
-- Constraints for table `t_kembali`
--
ALTER TABLE `t_kembali`
  ADD CONSTRAINT `t_kembali_ibfk_1` FOREIGN KEY (`id_peminjaman`) REFERENCES `t_pinjam` (`id_peminjaman`) ON UPDATE CASCADE;

--
-- Constraints for table `t_pinjam`
--
ALTER TABLE `t_pinjam`
  ADD CONSTRAINT `t_pinjam_ibfk_1` FOREIGN KEY (`id_anggota`) REFERENCES `t_anggota` (`id_anggota`) ON UPDATE CASCADE,
  ADD CONSTRAINT `t_pinjam_ibfk_2` FOREIGN KEY (`isbn`) REFERENCES `t_buku` (`isbn`) ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
