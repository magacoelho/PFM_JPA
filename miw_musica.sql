-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 20-05-2015 a las 00:04:52
-- Versión del servidor: 5.6.21
-- Versión de PHP: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `miw_musica`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `favoritousuario`
--

CREATE TABLE IF NOT EXISTS `favoritousuario` (
`id` int(10) NOT NULL,
  `idFavorito` varchar(50) NOT NULL,
  `idUsuario` int(11) NOT NULL,
  `idTipoFavorito` int(10) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=50 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `favoritousuario`
--

INSERT INTO `favoritousuario` (`id`, `idFavorito`, `idUsuario`, `idTipoFavorito`) VALUES
(6, '4KkHjCe8ouh8C2P9LPoD4F', 1, 1),
(7, '0UWZUmn7sybxMCqrw9tGa7', 1, 1),
(8, '4etuCZVdP8yiNPn4xf0ie5', 1, 1),
(9, '1KSR2lf3WrtMPrPBGzcy3A', 1, 2),
(10, '1QL7yTHrdahRMpvNtn6rI2', 1, 1),
(11, '5rmESHqL2QY5Lfdb5oyzMO', 1, 2),
(12, '0FP3X2Uw9eE3cQwNvEjouI', 1, 2),
(13, '5ReKddpdZKgpVlecQhLnEH', 1, 2),
(14, '24TAupSNVWSAHL0R7n71vm', 1, 2),
(15, '6ww9bfld1sOMjLFD5HWb96', 1, 2),
(19, '3Msp0L57aoikzJfHXS44rf', 1, 3),
(20, '2hBFmQFh7FjrUvDGCVNNwi', 1, 3),
(21, '5HOqAeyPmrupUFH1vRMQWk', 1, 3),
(22, '2yttTeN4FGs1ntyRLeXMnB', 1, 2),
(23, '72K0gi3DyEuaW0kPCw0lrO', 1, 3),
(24, '5Z6v3PHCaOycOa8pvNtaXf', 1, 3),
(25, '24Hm1yNyHNgzcqIvHc5PEq', 1, 3),
(26, '5fMH8LdYvPiPlTe8Z9A8gs', 1, 3),
(27, '2RQ5ZdPZAq4dcYc48uUq8i', 1, 3),
(28, '5xne6Wu3vCYQy4NZyVF1TU', 1, 3),
(29, '3NVKkxzypbMfH8Mov9ZsSY', 1, 3),
(30, '5JDoloqtRe9wEVH9pYeuVb', 1, 3),
(31, '4jFl904O3cx2wNMMIXAwlw', 1, 3),
(32, '70hPop67BKDroN8gLpH1kN', 1, 3),
(37, '4mWtGeW6myZAUo2qpGh5Uk', 1, 3),
(38, '40GBpLW1z3aK0BmRybEpZe', 1, 3),
(39, '1dinsYBZjKg1qyfxf3xX80', 1, 3),
(43, '0EmeFodog0BfCgMzAIvKQp', 4, 1),
(44, '0qE6Dd97eQiywwpbrhb5fX', 4, 2),
(45, '7okwEbXzyT2VffBmyQBWLz', 1, 1),
(47, '2nszmSgqreHSdJA3zWPyrW', 1, 1),
(48, '1t7t8q4zoYHp22JLIx3FM7', 1, 1),
(49, '5aOjT1DbSYHA1jylD0zohr', 1, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipofavorito`
--

CREATE TABLE IF NOT EXISTS `tipofavorito` (
`id` int(10) NOT NULL,
  `descripcion` varchar(50) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tipofavorito`
--

INSERT INTO `tipofavorito` (`id`, `descripcion`) VALUES
(1, 'INTERPRETES'),
(2, 'ALBUMES'),
(3, 'TEMAS');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE IF NOT EXISTS `usuarios` (
`id` int(11) NOT NULL,
  `username` varchar(16) COLLATE utf8_spanish_ci NOT NULL,
  `password` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `esAdmin` int(11) DEFAULT '0',
  `email` varchar(255) COLLATE utf8_spanish_ci DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `esActivo` tinyint(4) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id`, `username`, `password`, `esAdmin`, `email`, `create_time`, `esActivo`) VALUES
(1, 'u1', '$2y$10$TgGHvxpHA7a6dmtn3sXPL.C.8AECdxBygCV2sNmLzlEmHRFCkn0ci', 1, NULL, '2015-01-06 01:35:26', 1),
(2, 'u2', '$2y$10$.D7pgd/67e9yXBI2Tj/QNO8xRiupRG0I8HfypjLd63NpIn9FFre4y', 0, NULL, '2015-01-06 01:35:27', 1),
(4, 'yo', '$2y$10$thIduueb0/nxLGQZpqUXIeIj3/ijdw60LXxeujboLWlRSs9Y179Ty', 1, 'hh@gg.es', '2015-01-09 05:23:24', 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `favoritousuario`
--
ALTER TABLE `favoritousuario`
 ADD PRIMARY KEY (`id`), ADD UNIQUE KEY `idFavorito_idUsuario` (`idFavorito`,`idUsuario`), ADD KEY `FK_usuario` (`idUsuario`), ADD KEY `FK_tipofavorito` (`idTipoFavorito`);

--
-- Indices de la tabla `tipofavorito`
--
ALTER TABLE `tipofavorito`
 ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
 ADD PRIMARY KEY (`id`), ADD UNIQUE KEY `username_UNIQUE` (`username`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `favoritousuario`
--
ALTER TABLE `favoritousuario`
MODIFY `id` int(10) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=50;
--
-- AUTO_INCREMENT de la tabla `tipofavorito`
--
ALTER TABLE `tipofavorito`
MODIFY `id` int(10) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `favoritousuario`
--
ALTER TABLE `favoritousuario`
ADD CONSTRAINT `FK_tipofavorito` FOREIGN KEY (`idTipoFavorito`) REFERENCES `tipofavorito` (`id`),
ADD CONSTRAINT `FK_usuario` FOREIGN KEY (`idUsuario`) REFERENCES `usuarios` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
