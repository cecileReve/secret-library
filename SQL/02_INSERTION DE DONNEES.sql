use master
use librairie

/*==============================================================*/
/* Table : AUTEUR                                               */
/*==============================================================*/
insert into AUTEUR
values
('SUSKIND', 'Patrick'),
('ENGLER', 'Olivier'),
('WANG', 'Wallace'),
('GOSCINNY','R'), 
('UDERZO', 'A'),
('NOTHOMB', 'Amélie')

/*==============================================================*/
/* Table : EVENEMENT                                            */
/*==============================================================*/
insert into EVENEMENT
values
('Special Rentrée', '50', 'https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcQoUxzO7ww3UWafJmA2wB561psodzU5W_eoePAT538uc5MzG4mC','2016-09-01T07:00:00','2016-09-15T22:00:00','...'),
('Special Japon', '25', 'http://orig13.deviantart.net/4955/f/2007/210/1/1/japon_by_hatchikoo.jpg', '2016-10-05T08:00:00','2016-10-31T23:00:00', '...')

/*==============================================================*/
/* Table : PRIX                                                 */
/*==============================================================*/
insert into PRIX
values
(12.70, '2013-12-10T10:00:00'),
(25, '2016-03-15T09:00:00'),
(6.90, '2014-05-25T13:00:00')


insert into TRANSPORTEUR(CODETRANSPORTEUR, NOMTRANSPORTEUR)
values 
	('1','UPS'),
	('2','TNT'),
	('3','DHL'),
	('4','FEDEX'),
	('5','CHRONOPOST')

insert into TVA(NOMTAXE,TAUXTVA)
values
	('Dom-Tom',2.1),
	('Normal',5.5),
	('Erotique',20),
	('Violent',20)

/*==============================================================*/
/* Table : EDITEUR                                              */
/*Insert														*/
/*==============================================================*/

insert into EDITEUR
values
	('Gallimard'),
	('Hachette'),
	('Albin Michel')

/*==============================================================*/
/* Table : CATEGORIE                                            */
/*Insert														*/
/*==============================================================*/

insert into CATEGORIE
values
	('Romans & Fictions'),
	('Histoire & Géographie'),
	('Esoterisme')

/*==============================================================*/
/* Table : MOTCLEF                                              */
/*Insert														*/
/*==============================================================*/

insert into MOTCLEF
values
	('Mécha'),
	('Guerre'),
	('Occulte')

/*==============================================================*/
/* Table : THEME                                                */
/*Insert														*/
/*==============================================================*/

insert into THEME
values
	('Action'),
	('Biographie'),
	('Astrologie')

/*==============================================================*/
/* Table : SOUSTHEME                                            */
/*Insert														*/
/*==============================================================*/

insert into SOUSTHEME
values
	('Aventure'),
	('Thriller'),
	('Savoir')


/*==============================================================*/
/* Table : AFFINAGE                                             */
/*Insert														*/
/*==============================================================*/

insert into AFFINAGE
values
	('Action','Aventure'),
	('Biographie','Thriller'),
	('Astrologie','Savoir')



INSERT INTO EMPLOYE VALUES 
('1', '1', '1', '', '1', '1', '1', '1', '1'),
('test', 'test', 'test', '', '', '', '', '', '')

INSERT INTO ENTREPRISE VALUES
('entr', '123', 'logo'),
('en2', '111', '')

INSERT INTO STATUT VALUES
('1', '1', 'salut'),
('2', '2', 'bonjour mathieu'),
('100','Compte ouvert',''),
('101','Compte fermé',''),
('102','Compte suspendu',''),
('103','Compte bloqué',''),
('200','En cours de préparation',''),
('201','Attente transporteur','En attente de prise en charge par le transporteur'),
('202','Prise en charge','Prise en charge par le transporteur'),
('203','Encours de livraison',''),
('204','Livrée','Commande livrée'),
('205','Annulée','Commande annulée'),
('300','En stock','Livre en stock'),
('301','Plus de stock','Plus en stock en cours de réapprovisionnement'),
('302','Plus disponible à la vente',''),
('303','Nouveauté',''),
('304','En Promo','')

INSERT INTO ADRESSE VALUES
('1', 'rue', 'code', 'ville', 'complement', 'pays', 'comm'),
('52', 'route', '121', 'auckland', '123', 'chili', '')

INSERT INTO CLIENT VALUES
('1', 'nom', 'prenom', 'tel', '2000-05-23T14:25:10', 'mel', 'mdp', '2004-05-23T14:25:10', '', 'hello'),
('1', '1', '1', '1', '2000-05-23T14:25:10', '1', '1', '2004-05-23T14:25:10', '', '')

INSERT INTO ENREGISTREMENTFACTURE VALUES
(1, 1, CURRENT_TIMESTAMP),
(2, 2, CURRENT_TIMESTAMP)

INSERT INTO ENREGISTREMENTLIVRAISON VALUES
(1, 1, CURRENT_TIMESTAMP),
(2, 2, CURRENT_TIMESTAMP)

INSERT INTO PANIER VALUES
(1, 'panier', CURRENT_TIMESTAMP),
(2, 'piano', CURRENT_TIMESTAMP)

/*==============================================================*/
/* Table : LIVRE                                                */
/*Insert														*/
/*==============================================================*/
insert into LIVRE
values
	('1111111111111','Gallimard','Romans & Fictions','1','Erotique','Les Aventures de Mathieu à l AFPA','','','blablablablablablablablablablablablablablablablabla',25,'2016-06-27',250,''),
	('2222222222222','Hachette','Histoire & Géographie','2','Normal','La Biographie Complète de Aurèle','','','blablablablablablablablablablablablablablablablabla',12,'2017-03-15',100,''),
	('3333333333333','Albin Michel','Esoterisme','1','Dom-Tom','Les Mystérieuses absences de Cécile','','','blablablablablablablablablablablablablablablablabla',40,'2016-12-06',500,'')

/*==============================================================*/
/* Table : PRECISION                                            */
/*Insert														*/
/*==============================================================*/

insert into PRECISION
values
	('Aventure','1111111111111'),
	('Thriller','2222222222222'),
	('Savoir','3333333333333')

/*==============================================================*/
/* Table : DEFINITION                                           */
/*Insert														*/
/*==============================================================*/

insert into DEFINITION
values
	('Mécha','1111111111111'),
	('Guerre','2222222222222'),
	('Occulte','3333333333333')   

insert into COUT
values
('1111111111111', 1),
('2222222222222',2)

insert into DETAILPANIER
values
(1,'1111111111111',1),
(2,'3333333333333',57)

insert into ECRITURE
values
(1,'1111111111111'),
(2,'2222222222222'),
(3,'2222222222222'),
(4,'3333333333333'),
(5,'3333333333333')

insert into PROMOTION
values
(1,'1111111111111'),
(2,'1111111111111'),
(1,'2222222222222')




insert into COMMANDE(CODETRANSPORTEUR,IDADRESSELIVRAISON,IDADRESSEFACTURATION,IDCLIENT,IDSTATUT,DATECOMMANDE,IPCOMMANDE,NUMEROTRANSACTION,COMMENTAIRECOMMANDE)
values 
	('3','1','1','1','1',CURRENT_TIMESTAMP,'1','1',''),
	('2','1','2','2','2',CURRENT_TIMESTAMP,'2','2',''),
	('5','2','1','1','2',CURRENT_TIMESTAMP,'3','3',''),
	('4','1','1','2','1',CURRENT_TIMESTAMP,'4','4',''),
	('3','2','2','2','2',CURRENT_TIMESTAMP,'5','5',''),
	('1','2','2','1','1',CURRENT_TIMESTAMP,'8','9',''),
	('5','2','1','2','2',CURRENT_TIMESTAMP,'6','7','')

insert into DETAILCOMMANDE(CODEISBN,IDCOMMANDE,IDEVENEMENT,QUANTITEDETAILCOMMANDE,PRIXHTDETAILCOMMANDE,TAUXTVADETAILCOMMANDE)
values
	('1111111111111',5,2,2,10,5.5),
	('2222222222222',2,null,3,10,5.5),
	('2222222222222',1,null,1,1,20),
	('1111111111111',2,1,2,7,5.5),
	('3333333333333',6,null,5,15.75,2.1)

insert into EVALUATION(IDDETAILCOMMANDE,IDCLIENT,CODEISBN,NOTEEVALUATION,COMMENTAIREEVALUATION)
values
	(2,1,'2222222222222',4,'Livre à lire et à garder chez soi.'),
	(4,2,'1111111111111',3,'')


