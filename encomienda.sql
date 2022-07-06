-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 17-12-2021 a las 07:18:07
-- Versión del servidor: 10.4.22-MariaDB
-- Versión de PHP: 8.0.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bd_encomiendas`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `encomienda`
--

CREATE TABLE `encomienda` (
  `en_id` int(11) NOT NULL,
  `en_destinatario` varchar(45) COLLATE latin1_spanish_ci NOT NULL,
  `en_direccion` varchar(100) COLLATE latin1_spanish_ci NOT NULL,
  `en_tipo` varchar(10) COLLATE latin1_spanish_ci NOT NULL,
  `en_entregadomicilio` tinyint(1) NOT NULL,
  `en_tamano` varchar(10) COLLATE latin1_spanish_ci NOT NULL,
  `en_remitente` varchar(45) COLLATE latin1_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

--
-- Volcado de datos para la tabla `encomienda`
--

INSERT INTO `encomienda` (`en_id`, `en_destinatario`, `en_direccion`, `en_tipo`, `en_entregadomicilio`, `en_tamano`, `en_remitente`) VALUES
(10, 'Mauricio', 'El Carmen', 'Paquete', 0, 'Mediana', 'Amazon!'),
(20, 'Violeta', 'EL Nuevo', 'Paquete', 0, 'Grande', 'Ebay'),
(30, 'Alonso', 'Galvarino', 'Paquete', 1, 'Mediana', 'Aliexpress');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `encomienda`
--
ALTER TABLE `encomienda`
  ADD PRIMARY KEY (`en_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
