CREATE TABLE IF NOT EXISTS `m_institusi` (
  `id` varchar(256) PRIMARY KEY,
  `kode_institusi` varchar(255) NOT NULL,
  `nama_institusi` varchar(255) NOT NULL,
  `website` varchar(255) DEFAULT NULL,
  `alamat` varchar(255) DEFAULT NULL,
  `no_telepon` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;