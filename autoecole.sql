-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le : ven. 31 mars 2023 à 09:31
-- Version du serveur : 5.7.36
-- Version de PHP : 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `autoecole`
--

-- --------------------------------------------------------

--
-- Structure de la table `categorie`
--

DROP TABLE IF EXISTS `categorie`;
CREATE TABLE IF NOT EXISTS `categorie` (
  `CodeCategorie` int(11) NOT NULL AUTO_INCREMENT,
  `Libelle` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `Prix` double(5,2) NOT NULL,
  PRIMARY KEY (`CodeCategorie`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `categorie`
--

INSERT INTO `categorie` (`CodeCategorie`, `Libelle`, `Prix`) VALUES
(1, 'Automobile', 34.95),
(2, 'Poids lourd', 43.00),
(3, 'Bateau', 51.25),
(4, 'Moto', 38.15),
(5, 'Transport en commun', 40.50);

-- --------------------------------------------------------

--
-- Structure de la table `eleve`
--

DROP TABLE IF EXISTS `eleve`;
CREATE TABLE IF NOT EXISTS `eleve` (
  `CodeEleve` int(11) NOT NULL AUTO_INCREMENT,
  `Nom` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `Prenom` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `Sexe` tinyint(4) NOT NULL,
  `DateDeNaissance` date DEFAULT NULL,
  `Adresse1` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `CodePostal` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `Ville` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `Telephone` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `login` varchar(50) NOT NULL,
  `mdp` varchar(50) NOT NULL,
  PRIMARY KEY (`CodeEleve`)
) ENGINE=InnoDB AUTO_INCREMENT=158 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `eleve`
--

INSERT INTO `eleve` (`CodeEleve`, `Nom`, `Prenom`, `Sexe`, `DateDeNaissance`, `Adresse1`, `CodePostal`, `Ville`, `Telephone`, `login`, `mdp`) VALUES
(8, 'Gnocchi', 'Gwendoline', 0, NULL, '', '75008', 'Paris', '0104310779', 'ggnocchi', '23e08489ef00d7e596d820baa9382438'),
(16, 'Macaroni', 'Mazarine', 1, '1983-06-06', '', '75016', 'Paris', '0118060182', 'mmacaroni', '18811deb45591a0e8e35236a483d5ee5'),
(18, 'Ossobucco', 'Omer', 0, '1981-07-03', '', '75018', 'Paris', '0117070381', 'oossobucco', '7e443aec1b1b7e7d681798affb497c12'),
(22, 'Spaghetti', 'Sophie', 1, '1979-09-07', '', '75002', 'Paris', '0115090779', 'sspaghetti', '351e15efc7c3e7a6eefa9ea307a4bb54'),
(23, 'Tortellini', 'Théodule', 0, NULL, '', '75003', 'Paris', '0114210880', 'ttortellini', '2b83defcfea8b7b4f7b0e2a83e6593ba'),
(41, 'Pomadoro', 'Pistache', 1, NULL, '', '75001', 'Paris', '0116141178', 'ppomadoro', '41cf90637e0dbee01417eb2f5b08a132'),
(53, 'Cannelloni', 'Célestine', 1, NULL, '', '75003', 'Paris', '0171737579', 'ccannelloni', '74e61fe4007b3c4716e7caa87ad66d66'),
(57, 'Ravioli', 'Romuald', 0, NULL, '', '75017', 'Paris', '0109210781', 'rravioli', 'e473a8c0733a30195a509c729810c7f1'),
(63, 'Baccalaõ', 'Brutus', 0, '1979-11-09', '', '75003', 'Paris', '0145464748', 'bbaccalao', '902cccc672097d20f20347856d8fb19b'),
(64, 'Tortilla', 'Tania', 1, NULL, '', '75004', 'Paris', '0122270181', 'ttortilla', '40987bce4589fad4f596033a6bca5190'),
(70, 'Vermicellini', 'Véronique', 1, NULL, '', '75010', 'Paris', '0128220381', 'vvermicellini', 'f2f70eee6e134ae702c8e8349df2737e'),
(71, 'Tagliatelli', 'Thomas', 0, NULL, '', '75011', 'Paris', '0129170482', 'ttagliatelli', '71404bafedcfecda5b59193a301dddca'),
(77, 'Ghappati', 'Gontrand', 0, '1981-12-02', '', '75017', 'Paris', '0135120281', 'gghappati', 'bf63cd92f53b8eeba8a724431be65dee'),
(84, 'Busecca', 'Bruce', 0, '1981-11-07', '', '75004', 'Paris', '0187868584', 'bbusecca', 'e0ea14bc51574ee357cc008c4138e352'),
(85, 'Carpaccio', 'Clémentine', 1, NULL, '', '75005', 'Paris', '0142130781', 'ccarpaccio', '70eb182aae550821490f15d94810c454'),
(87, 'Chipolata', 'Charlotte', 1, NULL, '', '75007', 'Paris', '0144220379', 'cchipolata', 'c255e9bd8189e968a77b5580ff4e1224'),
(91, 'Broccoli', 'Basile', 0, '1981-02-07', '', '75011', 'Paris', '0176757473', 'bbroccoli', '40514f636bbe489f621bc5708f701041'),
(92, 'Farfalle', 'Fernande', 1, NULL, '', '75012', 'Paris', '0148141281', 'ffarfalle', 'f26c5acffefe5e63065561d31abc7fc9'),
(93, 'Lasagne', 'Lazare', 0, NULL, '', '75013', 'Paris', '0149130481', 'llasagne', 'ad76d71d3b647c92fb85aa67e285184e'),
(95, 'Risotto', 'Rolande', 1, NULL, '', '75015', 'Paris', '0151170280', 'rrisotto', 'f553904dea69d8f0b3f6356e5215980d'),
(96, 'Polenta', 'Paule', 1, NULL, '', '75016', 'Paris', '0152290379', 'ppolenta', 'd2befcccc5fb6898313e00b4491765e3'),
(97, 'Tapioca', 'Thérèse', 1, '1980-08-05', '', '75017', 'Paris', '0153080580', 'ttapioca', '8e93aee660dce9aedb1a82d4cc419445'),
(100, 'Mozzarella', 'Milène', 1, '1979-09-10', '', '75020', 'Paris', '0156091079', 'mmozzarella', 'b0f6810c4a12c741283ee4e19eb9e39a'),
(102, 'Caponata', 'Clovis', 0, '1980-07-06', '', '75002', 'Paris', '0158070680', 'ccaponata', '2003d73a257ca3198958119333b1401f'),
(106, 'Clafouti', 'Cornelia', 1, NULL, '', '75006', 'Paris', '0162210281', 'cclafoutit', '52bab16b06cd5d7de6753384d24b6c4a'),
(110, 'Fettucine', 'Félicie', 1, '1981-06-05', '', '75010', 'Paris', '0110060581', 'ffettucine', '21701c2d86d4b39417fd436249b0ec5b'),
(111, 'Rigatoni', 'Rita', 1, NULL, '', '75011', 'Paris', '0161280681', 'rrigatoni', '98566f0f7a8fcbec85ee71b409b1095f'),
(112, 'Cappelletti', 'Clémence', 1, '1981-12-10', '', '75012', 'Paris', '0165091011', 'ccappelletti', '0b5e1764cc83b5cf30d7b4111ae478ac'),
(113, 'Antipasta', 'Amadeus', 0, NULL, '', '75013', 'Paris', '0123242526', 'aantipasta', 'd58ad7bda681152979946cb801cd93ad'),
(114, 'Scaloppine', 'Scarlet', 1, NULL, '', '75014', 'Paris', '0127091283', 'sscaloppine', 'd2ac9f986f64b8ad450fa0c356db8d64'),
(115, 'Anguilla', 'Amandine', 1, NULL, '', '75015', 'Paris', '0112131415', 'aanguilla', '3e68123a135a83d050c00b18a83453fd'),
(116, 'Bagnacauda', 'Brigitte', 1, NULL, '', '75016', 'Paris', '0156575859', 'bbagnacauda', '3cc3ecb355fd7d78a4f892550aa7a3c9'),
(117, 'Funghi', 'Fiona', 1, NULL, '', '75017', 'Paris', '0187767583', 'ffunghi', '9e9065becb971ad21e2e4711fde9a529'),
(118, 'Melanzane', 'Mélanie', 1, NULL, '', '75018', 'Paris', '0154467985', 'mmelanzane', 'e39efa1e71ed710acbd84ee8947f5a91'),
(119, 'Fagioli', 'Ferdinand', 0, NULL, '', '75019', 'Paris', '0189888786', 'ffagioli', '4cad2d891f001ea8fb68c1d60a99fb77'),
(120, 'Vongole', 'Véronica', 1, NULL, '', '75020', 'Paris', '0145464748', 'vvongole', '52895787e99297bc64ef97b5df690d43'),
(121, 'Pesce', 'Pascaline', 1, NULL, '', '75001', 'Paris', '0131323334', 'ppesce', 'f0f3f8e2aa2e1e1aaff5ade111a16305'),
(122, 'Cozze', 'Charline', 1, NULL, '', '75002', 'Paris', '0117191613', 'ccozze', '5fa5b71459c0d9b453cbcd4a1f3ab8e4'),
(123, 'Stracciatella', 'Sabrina', 1, '1975-05-05', '', '75003', 'Paris', '0131649728', 'sstracciatella', '79d37c667b12d0e7f05979e14486849d'),
(124, 'Minestrone', 'Martina', 1, NULL, '', '75004', 'Paris', '0195969798', 'mminestrone', '61a3c83fc78c492575eeb03986b401dd'),
(125, 'Pavese', 'Pietro', 0, '1979-08-07', '', '75005', 'Paris', '0107080910', 'ppavese', '876e9a77c7a126c29e23faa977a78f66'),
(126, 'Fonduta', 'Florence', 1, '1979-09-09', '', '75006', 'Paris', '0103050709', 'ffonduta', '7f02d4b0f527f46ecf0c970cc781faff'),
(127, 'Carozza', 'Cunégonde', 1, NULL, '', '75007', 'Paris', '0105090307', 'ccarozza', '611926b110c31f513798fd56123b4be5'),
(128, 'Calzone', 'Corentin', 0, NULL, '', '75008', 'Paris', '0186848280', 'ccalzone', '547f990b07f5d1e2207fb396fecc60fa'),
(129, 'Tortino', 'Terrence', 0, '1980-05-12', '', '75009', 'Paris', '0104070205', 'ttortino', 'f44552558a9651cc795c32603e97853a'),
(130, 'Carciofi', 'Christian', 0, NULL, '', '75010', 'Paris', '0103060908', 'ccarciofi', 'fd65d11e5bac8521493fbfaba9333819'),
(131, 'Scampi', 'Simone', 1, '1982-01-05', '', '75011', 'Paris', '0104050607', 'sscampi', '2180fe9cbeed6737070c0d81e0d1c878'),
(132, 'Limone', 'Léon', 0, '1981-08-09', '', '75012', 'Paris', '0192969498', 'llimone', '921a5a751a7c21cd2ff2b0d5bf7d1f93'),
(133, 'Bisi', 'Bénédicte', 1, '1979-07-08', '', '75013', 'Paris', '0165646362', 'bbisi', 'caadd608727169d5fea3870544851828'),
(134, 'Uova', 'Ursule', 1, NULL, '', '75014', 'Paris', '0103050709', 'uuova', 'ca4fdf8733b2edcc0f4feb7d113c8ccc'),
(135, 'Carbonara', 'Camille', 1, '1979-11-10', '', '75015', 'Paris', '0151535759', 'ccarbonara', 'dc7fdba7c94033a7c4fd505d106497b0'),
(136, 'Uccelletto', 'Ulla', 1, NULL, '', '75016', 'Paris', '0108060402', 'uuccelletto', '26ff756515e67f4355616fed0043e070'),
(137, 'Cavoli', 'Constant', 0, NULL, '', '75017', 'Paris', '0104040404', 'ccavoli', 'f6a1dd5098979bb6d95452739507c531'),
(138, 'Prosciutto', 'Priscilla', 1, NULL, '', '75018', 'Paris', '0151525354', 'pprosciuttot', 'a22522654c89b8d1948b1a0d3cccc978'),
(139, 'Peperonata', 'Patricia', 1, '1972-08-05', '', '75019', 'Paris', '0159575553', 'ppeperonata', '7b9092f9d1c2fa51873cb2b54e0a63db'),
(140, 'Spinaci', 'Steve', 0, '1979-06-04', '', '75020', 'Paris', '0186848280', 'sspinaci', '5b064f620980b95bcdc38b5b7d1200e3'),
(141, 'Parmigiana', 'Patrick', 0, NULL, '', '75001', 'Paris', '0102050809', 'pparmigiana', '2743c81f7836d76341c4986a699f4207'),
(142, 'Tegame', 'Thierry', 0, '1976-06-16', '', '75002', 'Paris', '0104060709', 'ttegame', '6acf87dcafc230085cb74c20f36defe7'),
(143, 'Zucchini', 'Zoé', 1, NULL, '', '75003', 'Paris', '0108070504', 'zzucchinit', 'dbea6ad4c7dba5ffa2d8c00563f3af67'),
(144, 'Aragosta', 'Armande', 1, NULL, '', '75004', 'Paris', '0134353637', 'aaragosta', '755514c5fc3283b5476aa973a2dcf369'),
(145, 'Trotelle', 'Teresa', 1, NULL, '', '75005', 'Paris', '0160824281', 'ttrotelle', 'f0ec333c56e141863b1c18de3395febb'),
(146, 'Cacciucco', 'Christelle', 1, '1980-09-11', '', '57006', 'Paris', '0197959391', 'ccacciucco', '195ae383fbb5e6322216eb931d13ca10'),
(147, 'Ostriche', 'Ornella', 1, NULL, '', '75007', 'Paris', '0194989692', 'oostriche', 'b3453a9bf3f08a7b323d4bf584eb21af'),
(148, 'Triglie', 'Théodule', 0, NULL, '', '75008', 'Paris', '0168646662', 'ttriglie', 'cf24d6d4e2e9e76b34fd22cafb904cfe'),
(149, 'Pollo', 'Polo', 0, NULL, '', '75009', 'Paris', '0174859652', 'ppollot', '2ba3f0e64e8a87efe2a3eba6f1676000'),
(150, 'Cacciatora', 'Carmen', 1, '1979-09-09', '', '75010', 'Paris', '0198979695', 'ccacciatora', '5c48a430b787132eebc397c38f5765ca'),
(151, 'Peperoni', 'Pierre', 0, '1981-11-11', '', '75011', 'Paris', '0197643231', 'ppeperoni', '6d3c50966f6e6d08514a04b3aec700fd'),
(152, 'Vitello', 'Vincent', 0, '1982-12-02', '', '75012', 'Paris', '0189452365', 'vvitello', '1ca772eea38129606d0fbf404f270253'),
(153, 'Cima', 'Céline', 1, NULL, '', '75013', 'Paris', '0131649782', 'ccima', 'd2c261ec13c228221ec359a3afde68d3'),
(154, 'Polpette', 'Pauline', 1, NULL, '', '75014', 'Paris', '0148592615', 'ppolpette', '2a97aaa57eedea39786597e23e665441'),
(155, 'Manzo', 'Marceline', 1, NULL, '', '75015', 'Paris', '0136353433', 'mmanzo', '5c36dbd8cb048656314c26fd3d78ec59'),
(156, 'Abbacchio', 'Alberte', 1, NULL, '', '75016', 'Paris', '0102030405', 'aabbacchiot', '30a47501818b6b609bb10bba6a559894'),
(157, 'Vaccinara', 'Valentine', 1, NULL, '', '75017', 'Paris', '0134373895', 'vvaccinara', 'd0bacd94539c31a9ab6ff4af02f70221');

-- --------------------------------------------------------

--
-- Structure de la table `lecon`
--

DROP TABLE IF EXISTS `lecon`;
CREATE TABLE IF NOT EXISTS `lecon` (
  `CodeLecon` int(11) NOT NULL AUTO_INCREMENT,
  `Date` date DEFAULT NULL,
  `Heure` varchar(50) DEFAULT NULL,
  `CodeMoniteur` int(11) DEFAULT NULL,
  `CodeEleve` int(11) DEFAULT NULL,
  `Immatriculation` varchar(50) DEFAULT NULL,
  `Reglee` int(1) NOT NULL,
  PRIMARY KEY (`CodeLecon`),
  KEY `CodeMoniteur` (`CodeMoniteur`),
  KEY `CodeEleve` (`CodeEleve`),
  KEY `Immatriculation` (`Immatriculation`)
) ENGINE=InnoDB AUTO_INCREMENT=140 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `lecon`
--

INSERT INTO `lecon` (`CodeLecon`, `Date`, `Heure`, `CodeMoniteur`, `CodeEleve`, `Immatriculation`, `Reglee`) VALUES
(8, '2016-08-23', '10:00:00', 11, 22, '123 AB 21', 1),
(9, '2016-07-23', '10:00:00', 11, 63, '234 BC 21', 1),
(10, '2015-12-24', '10:00:00', 11, 63, '234 BC 21', 1),
(11, '2016-06-07', '10:00:00', 11, 63, '234 BC 21', 1),
(16, '2016-09-05', '10:00:00', 14, 113, '789 GH 21', 1),
(17, '2016-04-03', '10:00:00', 14, 113, '789 GH 21', 1),
(18, '2016-03-31', '10:00:00', 14, 113, '789 GH 21', 1),
(19, '2016-07-16', '10:00:00', 14, 113, '789 GH 21', 1),
(20, '2016-07-12', '10:00:00', 14, 113, '789 GH 21', 1),
(21, '2016-08-28', '10:00:00', 8, 113, '234 BC 21', 1),
(22, '2015-12-29', '10:00:00', 8, 8, '234 BC 21', 1),
(23, '2016-01-02', '10:00:00', 8, 16, '234 BC 21', 1),
(24, '2016-09-22', '10:00:00', 11, 22, '456 DE 21', 1),
(25, '2016-01-30', '10:00:00', 14, 23, '345 CD 21', 1),
(26, '2016-04-09', '10:00:00', 8, 18, '234 BC 21', 1),
(27, '2016-08-01', '10:00:00', 11, 8, '234 BC 21', 1),
(28, '2016-02-14', '10:00:00', 14, 16, '234 BC 21', 1),
(29, '2016-01-16', '10:00:00', 11, 23, '234 BC 21', 1),
(30, '2016-01-12', '10:00:00', 8, 53, '234 BC 21', 1),
(31, '2016-08-09', '10:00:00', 11, 22, '234 BC 21', 1),
(32, '2016-04-02', '10:00:00', 8, 8, '234 BC 21', 1),
(33, '2016-08-25', '10:00:00', 8, 8, '234 BC 21', 1),
(34, '2016-02-06', '10:00:00', 8, 8, '234 BC 21', 1),
(35, '2016-03-29', '10:00:00', 8, 8, '234 BC 21', 1),
(36, '2015-12-25', '10:00:00', 8, 8, '234 BC 21', 1),
(37, '2016-02-06', '10:00:00', 8, 8, '234 BC 21', 1),
(38, '2016-08-16', '10:00:00', 11, 8, '234 BC 21', 1),
(39, '2016-05-20', '10:00:00', 14, 16, '345 CD 21', 1),
(40, '2016-08-08', '10:00:00', 14, 53, '456 DE 21', 1),
(41, '2016-07-06', '10:00:00', 14, 18, '456 DE 21', 1),
(42, '2016-02-01', '10:00:00', 11, 148, '567 EF 21', 1),
(43, '2015-12-09', '10:00:00', 11, 57, '234 BC 21', 1),
(44, '2016-07-13', '10:00:00', 14, 71, '456 DE 21', 1),
(45, '2016-04-30', '10:00:00', 14, 71, '456 DE 21', 1),
(46, '2015-12-22', '10:00:00', 14, 71, '456 DE 21', 1),
(47, '2016-08-23', '10:00:00', 14, 71, '456 DE 21', 1),
(48, '2016-06-05', '10:00:00', 14, 71, '456 DE 21', 1),
(49, '2016-05-02', '10:00:00', 8, 116, '234 BC 21', 1),
(50, '2016-08-27', '10:00:00', 8, 96, '234 BC 21', 1),
(51, '2016-01-21', '10:00:00', 14, 41, '345 CD 21', 1),
(52, '2016-01-09', '10:00:00', 11, 115, '345 CD 21', 1),
(53, '2016-04-20', '10:00:00', 14, 128, '789 GH 21', 1),
(54, '2016-01-24', '10:00:00', 14, 128, '789 GH 21', 1),
(56, '2016-06-10', '10:00:00', 11, 148, '567 EF 21', 1),
(57, '2016-07-11', '10:00:00', 11, 148, '567 EF 21', 1),
(58, '2016-09-08', '10:00:00', 8, 85, '890 HJ 21', 1),
(59, '2016-08-07', '10:00:00', 8, 145, '890 HJ 21', 1),
(60, '2016-02-09', '10:00:00', 11, 8, '456 DE 21', 1),
(61, '2016-06-07', '10:00:00', 11, 8, '234 BC 21', 1),
(62, '2016-01-14', '10:00:00', 11, 157, '678 FG 21', 1),
(63, '2016-08-10', '10:00:00', 11, 157, '678 FG 21', 1),
(64, '2016-07-29', '10:00:00', 11, 157, '678 FG 21', 1),
(65, '2016-06-24', '10:00:00', 11, 157, '678 FG 21', 1),
(66, '2016-04-12', '10:00:00', 14, 157, '678 FG 21', 1),
(67, '2016-08-10', '10:00:00', 11, 132, '123 AB 21', 1),
(68, '2016-03-25', '10:00:00', 14, 8, '234 BC 21', 1),
(69, '2016-07-14', '10:00:00', 15, 16, '345 CD 21', 1),
(73, '2016-03-27', '10:00:00', 15, 8, '123 AB 21', 1),
(74, '2016-02-19', '10:00:00', 15, 8, '123 AB 21', 1),
(75, '2016-07-29', '10:00:00', 11, 8, '123 AB 21', 1),
(76, '2016-02-01', '10:00:00', 14, 16, '234 BC 21', 1),
(77, '2016-03-10', '10:00:00', 15, 18, '345 CD 21', 1),
(79, '2016-01-19', '10:00:00', 14, 8, '234 BC 21', 1),
(80, '2016-07-04', '10:00:00', 15, 16, '345 CD 21', 1),
(81, '2016-04-03', '10:00:00', 11, 8, '123 AB 21', 1),
(85, '2016-01-11', '10:00:00', 14, 16, '234 BC 21', 1),
(86, '2016-04-29', '10:00:00', 15, 18, '345 CD 21', 1),
(87, '2016-07-06', '10:00:00', 11, 8, '123 AB 21', 1),
(88, '2016-06-16', '10:00:00', 14, 16, '234 BC 21', 1),
(89, '2016-02-02', '10:00:00', 15, 18, '345 CD 21', 1),
(90, '2016-08-23', '10:00:00', 15, 18, '789 GH 21', 0),
(91, '2016-08-22', '10:00:00', 14, 18, '567 EF 21', 0),
(92, '2017-09-02', '13:56:00', 11, 63, '456 DE 21', 0),
(93, '2017-09-02', '13:58:00', 11, 129, '345 CD 21', 0),
(94, '2017-09-02', '14:00:00', 11, 64, '345 CD 21', 0),
(95, '2017-09-02', '14:09:00', 14, 64, '678 FG 21', 0),
(96, '2017-09-02', '15:00:00', 11, 70, '678 FG 21', 0),
(97, '2017-09-02', '14:13:00', 14, 84, '234 BC 21', 0),
(98, '2017-11-17', '09:15:00', 15, 156, '890 HJ 21', 0),
(99, '2017-08-23', '10:00:00', 8, 23, '567 EF 21', 0),
(100, '2017-09-02', '14:19:00', 11, 16, '567 EF 21', 0),
(101, '2017-09-02', '14:20:00', 14, 123, '345 CD 21', 0),
(102, '2017-09-02', '14:23:00', 14, 8, '456 DE 21', 0),
(103, '2017-09-02', '14:26:00', 11, 141, '456 DE 21', 0),
(104, '2017-09-02', '14:28:00', 8, 16, '345 CD 21', 0),
(105, '2017-09-02', '14:29:00', 11, 16, '456 DE 21', 0),
(106, '2017-09-02', '14:30:00', 14, 77, '345 CD 21', 0),
(107, '2017-09-02', '14:36:00', 14, 16, '234 BC 21', 0),
(108, '2017-09-02', '14:40:00', 14, 16, '234 BC 21', 0),
(109, '2017-09-05', '14:43:00', 11, 8, '456 DE 21', 0),
(110, '2017-09-02', '08:46:00', 11, 8, '345 CD 21', 0),
(111, '2017-09-05', '11:47:00', 8, 16, '345 CD 21', 0),
(112, '2017-09-02', '15:03:00', 11, 8, '456 DE 21', 0),
(113, '2017-09-29', '18:07:00', 11, 16, '234 BC 21', 0),
(114, '2017-11-14', '02:10:00', 11, 128, '789 GH 21', 0),
(115, '2017-09-02', '18:16:00', 11, 8, '345 CD 21', 0),
(116, '2017-09-02', '13:17:00', 11, 8, '345 CD 21', 0),
(117, '2017-11-02', '13:26:00', 11, 131, '345 CD 21', 0),
(118, '2015-11-11', '02:09:00', 15, 57, '789 GH 21', 0),
(119, '2020-09-09', '18:28:00', 11, 53, '456 DE 21', 0),
(120, '2017-09-22', '08:00:00', 8, 23, '567 EF 21', 0),
(121, '2017-09-22', '16:48:00', 11, 16, '345 CD 21', 0),
(122, '2017-09-22', '02:00:00', 11, 53, '567 EF 21', 0),
(123, '2017-09-27', '08:00:00', 14, 64, '678 FG 21', 0),
(124, '2018-08-17', '09:02:00', 11, 102, '456 DE 21', 0),
(125, '2020-06-24', '11:00:00', 14, 64, '789 GH 21', 0),
(126, '2020-12-16', '14:00:00', 14, 16, '345 CD 21', 0),
(127, '2020-12-16', '14:00:00', 15, 8, '678 FG 21', 0),
(128, '2020-12-16', '15:00:00', 14, 126, '567 EF 21', 0),
(137, '2020-12-16', '14:00:00', 11, 8, '234 BC 21', 0),
(138, '2023-03-31', '08:00:00', 11, 8, '123 AB 21', 0),
(139, '2023-03-31', '08:00:00', 14, 8, '234 BC 21', 0);

-- --------------------------------------------------------

--
-- Structure de la table `licence`
--

DROP TABLE IF EXISTS `licence`;
CREATE TABLE IF NOT EXISTS `licence` (
  `CodeLicence` int(11) NOT NULL AUTO_INCREMENT,
  `CodeMoniteur` int(11) DEFAULT NULL,
  `CodeCategorie` int(11) DEFAULT NULL,
  `DateObtention` date DEFAULT NULL,
  PRIMARY KEY (`CodeLicence`),
  KEY `CodeMoniteur` (`CodeMoniteur`,`CodeCategorie`),
  KEY `CodeCategorie` (`CodeCategorie`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `licence`
--

INSERT INTO `licence` (`CodeLicence`, `CodeMoniteur`, `CodeCategorie`, `DateObtention`) VALUES
(1, 11, 1, NULL),
(2, 11, 4, NULL),
(3, 11, 5, NULL),
(4, 8, 3, NULL),
(5, 14, 1, NULL),
(6, 14, 2, NULL),
(7, 14, 5, NULL),
(8, 15, 1, NULL),
(9, 15, 3, NULL);

-- --------------------------------------------------------

--
-- Structure de la table `moniteur`
--

DROP TABLE IF EXISTS `moniteur`;
CREATE TABLE IF NOT EXISTS `moniteur` (
  `CodeMoniteur` int(11) NOT NULL AUTO_INCREMENT,
  `Nom` varchar(50) DEFAULT NULL,
  `Prenom` varchar(50) DEFAULT NULL,
  `Sexe` tinyint(4) DEFAULT NULL,
  `DateDeNaissance` date DEFAULT NULL,
  `Adresse1` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `CodePostal` varchar(50) DEFAULT NULL,
  `Ville` varchar(50) DEFAULT NULL,
  `Telephone` varchar(50) DEFAULT NULL,
  `login` varchar(50) NOT NULL,
  `mdp` varchar(50) NOT NULL,
  PRIMARY KEY (`CodeMoniteur`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `moniteur`
--

INSERT INTO `moniteur` (`CodeMoniteur`, `Nom`, `Prenom`, `Sexe`, `DateDeNaissance`, `Adresse1`, `CodePostal`, `Ville`, `Telephone`, `login`, `mdp`) VALUES
(8, 'Béald', 'Géraldine', 0, '1969-11-30', '12, avenue du Collège', '75004', 'Paris', '0180123456', 'gbealdt', '6c2093754ba58b4f85b5272df73642f9'),
(11, 'Ambrosi', 'Pierre', 1, '1970-01-05', '23, rue du Lycée', '75019', 'Paris', '0180234567', 'pambrosi', 'aa4211050502ac4f2b2510c7595757cb'),
(14, 'Catard', 'Olivier', 2, '1963-09-12', '34, boulevard de l\'Université', '75005', 'Paris', '0180345677', 'ocatard', '1585d40573beafeaa60b6135d7fefc72'),
(15, 'Ezard', 'Régine', 1, '1978-04-06', '45, rue des Écoles', '75020', 'Paris', '0180456789', 'rezard', '512a950ca27174d2afdc6c9c84eab956');

-- --------------------------------------------------------

--
-- Structure de la table `responsable`
--

DROP TABLE IF EXISTS `responsable`;
CREATE TABLE IF NOT EXISTS `responsable` (
  `CodeResponsable` int(11) NOT NULL AUTO_INCREMENT,
  `Nom` varchar(50) DEFAULT NULL,
  `Prenom` varchar(50) DEFAULT NULL,
  `Sexe` tinyint(4) NOT NULL,
  `DateDeNaissance` date DEFAULT NULL,
  `Adresse1` varchar(50) DEFAULT NULL,
  `CodePostal` varchar(50) DEFAULT NULL,
  `Ville` varchar(50) DEFAULT NULL,
  `Telephone` varchar(50) DEFAULT NULL,
  `login` varchar(50) NOT NULL,
  `mdp` varchar(50) NOT NULL,
  PRIMARY KEY (`CodeResponsable`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `responsable`
--

INSERT INTO `responsable` (`CodeResponsable`, `Nom`, `Prenom`, `Sexe`, `DateDeNaissance`, `Adresse1`, `CodePostal`, `Ville`, `Telephone`, `login`, `mdp`) VALUES
(1, 'Gilmore', 'Laurence', 0, NULL, '26 rue des allouettes', '42000', 'Saint-Etienne', '0177355625', 'lgilmore', 'c75dd60df7b81a7c25a86c9f93bb836c');

-- --------------------------------------------------------

--
-- Structure de la table `vehicule`
--

DROP TABLE IF EXISTS `vehicule`;
CREATE TABLE IF NOT EXISTS `vehicule` (
  `Immatriculation` varchar(50) NOT NULL,
  `Marque` varchar(50) DEFAULT NULL,
  `Modele` varchar(50) DEFAULT NULL,
  `Annee` int(11) DEFAULT NULL,
  `CodeCategorie` int(11) DEFAULT NULL,
  PRIMARY KEY (`Immatriculation`),
  KEY `CodeCategorie` (`CodeCategorie`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `vehicule`
--

INSERT INTO `vehicule` (`Immatriculation`, `Marque`, `Modele`, `Annee`, `CodeCategorie`) VALUES
('123 AB 21', 'Mercedes', 'Spaniac', 2000, 1),
('234 BC 21', 'Peugeot', 'Sisancys', 1996, 1),
('345 CD 21', 'Renault', 'Morgane', 1996, 1),
('456 DE 21', 'Peugeot', 'Catsansys', 1999, 1),
('567 EF 21', 'Kawasaki', 'Zephyr', 1997, 4),
('678 FG 21', 'Renault', 'Betton', 1999, 5),
('789 GH 21', 'Iveco', 'Roader', 1998, 2),
('890 HJ 21', 'Oceansea', 'Tempest', 1999, 3),
('GK-719-RJ', 'Volkswagen', 'Polo', 2022, 1);

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `lecon`
--
ALTER TABLE `lecon`
  ADD CONSTRAINT `lecon_ibfk_1` FOREIGN KEY (`CodeMoniteur`) REFERENCES `moniteur` (`CodeMoniteur`),
  ADD CONSTRAINT `lecon_ibfk_2` FOREIGN KEY (`CodeEleve`) REFERENCES `eleve` (`CodeEleve`),
  ADD CONSTRAINT `lecon_ibfk_3` FOREIGN KEY (`Immatriculation`) REFERENCES `vehicule` (`Immatriculation`);

--
-- Contraintes pour la table `licence`
--
ALTER TABLE `licence`
  ADD CONSTRAINT `licence_ibfk_1` FOREIGN KEY (`CodeMoniteur`) REFERENCES `moniteur` (`CodeMoniteur`),
  ADD CONSTRAINT `licence_ibfk_2` FOREIGN KEY (`CodeCategorie`) REFERENCES `categorie` (`CodeCategorie`);

--
-- Contraintes pour la table `vehicule`
--
ALTER TABLE `vehicule`
  ADD CONSTRAINT `vehicule_ibfk_1` FOREIGN KEY (`CodeCategorie`) REFERENCES `categorie` (`CodeCategorie`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
