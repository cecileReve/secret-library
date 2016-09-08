
use master
drop database librairie
create database librairie
use librairie


/*--------------------------------------------------------------------------------------------------------------------------------------- 
Création des tables de la base de données Librairie
---------------------------------------------------------------------------------------------------------------------------------------*/


/*==============================================================*/
/* Table : COMMANDE                                             */
/*==============================================================*/
create table COMMANDE (
   IDCOMMANDE				int              identity,
   CODETRANSPORTEUR			varchar(20)           null,
   IDADRESSELIVRAISON		int                   null,
   IDADRESSEFACTURATION		int                   null,
   IDCLIENT					int                   null,
   IDSTATUT					int                   null,
   DATECOMMANDE				datetime              null,
   IPCOMMANDE				varchar(20)           null,
   NUMEROTRANSACTION		varchar(20)           null,
   COMMENTAIRECOMMANDE		text                 null,
   constraint PK_COMMANDE primary key nonclustered (IDCOMMANDE)
)

/*==============================================================*/
/* Table : DETAILCOMMANDE                                       */
/*==============================================================*/
create table DETAILCOMMANDE (
   IDDETAILCOMMANDE			int              identity,
   CODEISBN					char(13)              null,
   IDCOMMANDE				int                   null,
   IDEVENEMENT				int                  null,
   QUANTITEDETAILCOMMANDE	int                   null,
   PRIXHTDETAILCOMMANDE		decimal               null,
   TAUXTVADETAILCOMMANDE	decimal               null,
   constraint PK_DETAILCOMMANDE primary key nonclustered (IDDETAILCOMMANDE)
)

/*==============================================================*/
/* Table : EVALUATION                                           */
/*==============================================================*/
create table EVALUATION (
   IDEVALUATION				int              identity,
   IDDETAILCOMMANDE			int                   null,
   IDCLIENT					int                   null,
   CODEISBN					char(13)              null,
   NOTEEVALUATION			decimal               null,
   COMMENTAIREEVALUATION	varchar(500)         null,
   constraint PK_EVALUATION primary key nonclustered (IDEVALUATION)
)

/*==============================================================*/
/* Table : STATUT                                               */
/*==============================================================*/
create table STATUT (
   IDSTATUT					int                  not null,
   LIBELLESTATUT			varchar(50)           null,
   COMMENTAIRESTATUT		text                 null,
   constraint PK_STATUT primary key nonclustered (IDSTATUT)
)

/*==============================================================*/
/* Table : TRANSPORTEUR                                         */
/*==============================================================*/
create table TRANSPORTEUR (
   CODETRANSPORTEUR			varchar(20)          not null,
   NOMTRANSPORTEUR			varchar(50)           null,
   constraint PK_TRANSPORTEUR primary key nonclustered (CODETRANSPORTEUR)
)

/*==============================================================*/
/* Table : TVA                                                  */
/*==============================================================*/
create table TVA (
   NOMTAXE					varchar(50)          not null,
   TAUXTVA					decimal               null,
   constraint PK_TVA primary key nonclustered (NOMTAXE)
)

/*==============================================================*/
/* Table : EMPLOYE                                              */
/*==============================================================*/
create table EMPLOYE (
   NUMSECUEMPLOYE       varchar(20)          not null,
   NOMEMPLOYE           varchar(50)           null,
   PRENOMEMPLOYE        varchar(50)           null,
   DATENAISSANCEEMPLOYE datetime             null,
   TELEMPLOYE           varchar(20)          null,
   EMAILEMPLOYE         varchar(50)          null,
   LOGINEMPLOYE         varchar(50)          null,
   MDPEMPLOYE           varchar(50)          null,
   COMMENTAIREEMPLOYE   text                 null,
   constraint PK_EMPLOYE primary key nonclustered (NUMSECUEMPLOYE)
)

/*==============================================================*/
/* Table : ENTREPRISE                                           */
/*==============================================================*/
create table ENTREPRISE (
   IDENTREPRISE         int              identity,
   NOMENTREPRISE        varchar(50)           null,
   SIRETENTREPRISE      varchar(50)           null,
   LOGOENTREPRISE       varchar(50)          null,
   constraint PK_ENTREPRISE primary key nonclustered (IDENTREPRISE)
)

/*==============================================================*/
/* Table : SIEGE                                                */
/*==============================================================*/
create table SIEGE (
   IDENTREPRISE         int                  not null,
   IDADRESSE            int                  not null,
   constraint PK_SIEGE primary key nonclustered (IDENTREPRISE, IDADRESSE)
)

/*==============================================================*/
/* Table : PANIER                                              */
/*==============================================================*/
create table PANIER (
   IDPANIER             int              identity,
   IDCLIENT             int                  not null,
   NOMPANIER            varchar(50)           null,
   DATEPANIER           datetime              null,
   constraint PK_PANIER primary key nonclustered (IDPANIER)
)

/*==============================================================*/
/* Table : ADRESSE                                              */
/*==============================================================*/
create table ADRESSE (
   IDADRESSE            int              identity,
   NUMADRESSE           varchar(10)           null,
   VOIEADRESSE			varchar(50)			  null,
   CODEPOSTAL           varchar(10)           null,
   VILLE                varchar(50)           null,
   CPTADRESSE           varchar(200)          null,
   PAYSADRESSE          varchar(50)          null,
   COMMENTAIREADRESSE   text                 null,
   constraint PK_ADRESSE primary key nonclustered (IDADRESSE)
)

/*==============================================================*/
/* Table : CLIENT                                               */
/*==============================================================*/
create table CLIENT (
   IDCLIENT             int              identity,
   IDSTATUT             int                  not null,
   NOMCLIENT            varchar(50)           null,
   PRENOMCLIENT         varchar(50)           null,
   TELCLIENT            varchar(50)          null,
   NAISSANCECLIENT      datetime             null,
   EMAILCLIENT          varchar(50)           null,
   MDPCLIENT            varchar(50)           null,
   DATEINSCRIPTION      datetime              null,
   DATEDESINSCRIPTION   datetime             null,
   COMMENTAIRECLIENT    text                 null,
   constraint PK_CLIENT primary key nonclustered (IDCLIENT)
)

/*==============================================================*/
/* Table : ENREGISTREMENTFACTURE                                */
/*==============================================================*/
create table ENREGISTREMENTFACTURE (
   IDCLIENT             int                  not null,
   IDADRESSE            int                  not null,
   DATEENREGISTREMENTFACTURE datetime         null,
   constraint PK_ENREGISTREMENTFACTURE primary key nonclustered (IDCLIENT, IDADRESSE)
)

/*==============================================================*/
/* Table : ENREGISTREMENTLIVRAISON                              */
/*==============================================================*/
create table ENREGISTREMENTLIVRAISON (
   IDCLIENT             int                  not null,
   IDADRESSE            int                  not null,
   DATEENREGISTREMENTLIVRAISON datetime       null,
   constraint PK_ENREGISTREMENTLIVRAISON primary key nonclustered (IDCLIENT, IDADRESSE)
)

/*==============================================================*/
/* Table : AUTEUR                                               */
/*==============================================================*/
create table AUTEUR (   
IDAUTEUR             int              identity,   
NOMAUTEUR            varchar(50)           null,   
PRENOMAUTEUR         varchar(50)           null,   
constraint PK_AUTEUR primary key nonclustered (IDAUTEUR)
)

/*==============================================================*/
/* Table : COUT                                                 */
/*==============================================================*/
create table COUT (   
CODEISBN             char(13)             not null,   
IDPRIX               int                  not null,   
constraint PK_COUT primary key nonclustered (CODEISBN, IDPRIX)
)

/*==============================================================*/
/* Table : DETAILPANIER                                         */
/*==============================================================*/
create table DETAILPANIER (   
IDDETAILPANIER       int              identity,   
IDPANIER             int                  not null,   
CODEISBN             char(13)             not null,   
QUANTITEDETAILPANIER int                   null,   
constraint PK_DETAILPANIER primary key nonclustered (IDDETAILPANIER)
)

/*==============================================================*/
/* Table : ECRITURE                                             */
/*==============================================================*/
create table ECRITURE (   
IDAUTEUR             int                  not null,   
CODEISBN             char(13)             not null,   
constraint PK_ECRITURE primary key nonclustered (IDAUTEUR, CODEISBN)
)

/*==============================================================*/
/* Table : EVENEMENT                                            */
/*==============================================================*/
create table EVENEMENT (   
IDEVENEMENT          int              identity,   
NOMEVENEMENT         varchar(50)          null,   
PROMOTIONEVENEMENT   int                  null,   
LOGOEVENEMENT        varchar(250)         null,   
DATEDEBUTEVENEMENT   datetime             null,   
DATEFINEVENEMENT     datetime             null,   
COMMENTAIREEVENEMENT text                 null,   
constraint PK_EVENEMENT primary key nonclustered (IDEVENEMENT)
)

/*==============================================================*/
/* Table : PRIX                                                 */
/*==============================================================*/
create table PRIX (   
IDPRIX               int              identity,   
MONTANTHT            decimal               null,   
DATEMAJPRIX          datetime              null,   
constraint PK_PRIX primary key nonclustered (IDPRIX)
)

/*==============================================================*/
/* Table : PROMOTION                                            */
/*==============================================================*/
create table PROMOTION (   
IDEVENEMENT          int                  not null,   
CODEISBN             char(13)             not null,   
constraint PK_PROMOTION primary key nonclustered (IDEVENEMENT, CODEISBN)
)

/*==============================================================*/
/* Table : THEME                                                */
/*==============================================================*/
create table THEME (   
NOMTHEME             varchar(50)          not null,   
constraint PK_THEME primary key nonclustered (NOMTHEME)
)

/*==============================================================*/
/* Table : AFFINAGE                                             */
/*==============================================================*/
create table AFFINAGE (   
NOMTHEME             varchar(50)          not null,   
NOMSOUSTHEME         varchar(50)          not null,   
constraint PK_AFFINAGE primary key nonclustered (NOMTHEME, NOMSOUSTHEME)
)

/*==============================================================*/
/* Table : SOUSTHEME                                            */
/*==============================================================*/
create table SOUSTHEME (   
NOMSOUSTHEME         varchar(50)          not null,   
constraint PK_SOUSTHEME primary key nonclustered (NOMSOUSTHEME)
)

/*==============================================================*/
/* Table : "PRECISION"                                          */
/*==============================================================*/
create table "PRECISION" (   
NOMSOUSTHEME         varchar(50)          not null,   
CODEISBN             char(13)             not null,   
constraint PK_PRECISION primary key nonclustered (NOMSOUSTHEME, CODEISBN)
)

/*==============================================================*/
/* Table : MOTCLEF                                              */
/*==============================================================*/
create table MOTCLEF (   
NOMMOTCLEF           varchar(50)          not null,   
constraint PK_MOTCLEF primary key nonclustered (NOMMOTCLEF)
)

/*==============================================================*/
/* Table : DEFINITION                                           */
/*==============================================================*/
create table "DEFINITION" (   
NOMMOTCLEF           varchar(50)          not null,   
CODEISBN             char(13)             not null,   
constraint PK_DEFINITION primary key nonclustered (NOMMOTCLEF, CODEISBN)
)

/*==============================================================*/
/* Table : CATEGORIE                                            */
/*==============================================================*/
create table CATEGORIE (   
NOMCATEGORIE         varchar(50)          not null,   
constraint PK_CATEGORIE primary key nonclustered (NOMCATEGORIE)
)

/*==============================================================*/
/* Table : EDITEUR                                              */
/*==============================================================*/
create table EDITEUR (   
NOMEDITEUR           varchar(50)          not null,   
constraint PK_EDITEUR primary key nonclustered (NOMEDITEUR)
)

/*==============================================================*/
/* Table : LIVRE                                                */
/*==============================================================*/
create table LIVRE (   
CODEISBN             char(13)             not null,   
NOMEDITEUR           varchar(50)          null,   
NOMCATEGORIE         varchar(50)          null,   
IDSTATUT             int                  null,   
NOMTAXE              varchar(50)          null,   
NOMLIVRE             varchar(50)          null,   
SOUSTITRE            varchar(200)         null,   
COUVLIVRE            varchar(250)         null,   
RESUMELIVRE          text                 null,   
STOCKLIVRE           int                  null,   
DATESORTIE           date				  null,   
POIDSLIVRE           decimal              null,   
COMMENTAIRELIVRE     text                 null,   
constraint PK_LIVRE primary key nonclustered (CODEISBN)
)


/*--------------------------------------------------------------------------------------------------------------------------------------- 
Ajout des Foreign Key et des contraintes (CHECK, UNIQUE, ...)
---------------------------------------------------------------------------------------------------------------------------------------*/


/*==============================================================*/
/* Table : COMMANDE                                             */
/*==============================================================*/
alter table COMMANDE
add
	constraint FK_COMMANDE_TRANSPORTEUR
		foreign key (CODETRANSPORTEUR)
		references TRANSPORTEUR(CODETRANSPORTEUR)
		on update cascade
		on delete cascade,

	constraint FK_COMMANDE_ADRESSE_LIVRAISON
		foreign key (IDADRESSELIVRAISON)
		references ADRESSE(IDADRESSE),

	constraint FK_COMMANDE_ADRESSE_FACTURATION
		foreign key (IDADRESSEFACTURATION)
		references ADRESSE(IDADRESSE),

	constraint FK_COMMANDE_CLIENT
		foreign key (IDCLIENT)
		references CLIENT(IDCLIENT)
		on update cascade
		on delete cascade,

	constraint FK_COMMANDE_STATUT
		foreign key (IDSTATUT)
		references STATUT(IDSTATUT)
		on update cascade
		on delete cascade



/*==============================================================*/
/* Table : DETAILCOMMANDE                                       */
/*==============================================================*/
alter table DETAILCOMMANDE
add
	constraint FK_DETAILCOMMANDE_LIVRE
	foreign key (CODEISBN)
	references LIVRE(CODEISBN)
	on update cascade
	on delete cascade,

	constraint FK_DETAILCOMMANDE_COMMANDE
	foreign key (IDCOMMANDE)
	references COMMANDE(IDCOMMANDE)
	on update cascade
	on delete cascade,

	constraint FK_DETAILCOMMANDE_EVENEMENT
	foreign key (IDEVENEMENT)
	references EVENEMENT(IDEVENEMENT)
	on update cascade
	on delete cascade

/*==============================================================*/
/* Table : EVALUATION                                           */
/*==============================================================*/
alter table EVALUATION
add
	constraint FK_EVALUATION_DETAILCOMMANDE
	foreign key (IDDETAILCOMMANDE)
	references DETAILCOMMANDE(IDDETAILCOMMANDE),

	constraint FK_EVALUATION_CLIENT
	foreign key (IDCLIENT)
	references CLIENT(IDCLIENT)

/*==============================================================*/
/* Table : STATUT                                               */
/*==============================================================*/


/*==============================================================*/
/* Table : TRANSPORTEUR                                         */
/*==============================================================*/


/*==============================================================*/
/* Table : TVA                                                  */
/*==============================================================*/


/*==============================================================*/
/* Table : EMPLOYE                                              */
/*==============================================================*/
alter table EMPLOYE
add 
	constraint UN_EMAIL_EMPLOYE
	UNIQUE (EMAILEMPLOYE),

	constraint UN_LOGIN_EMPLOYE
	unique (LOGINEMPLOYE)


/*==============================================================*/
/* Table : ENTREPRISE                                           */
/*==============================================================*/


/*==============================================================*/
/* Table : SIEGE                                                */
/*==============================================================*/
alter table siege
add constraint FK_SIEGE_ENTREPRISE
foreign key (idEntreprise)
references entreprise(idEntreprise)
on update cascade
on delete cascade

alter table siege
add constraint FK_SIEGE_ADRESSE
foreign key (idAdresse)
references Adresse(idAdresse)
on update cascade
on delete cascade

/*==============================================================*/
/* Table : PANIER                                              */
/*==============================================================*/
alter table panier
add constraint FK_PANIER_CLIENT
foreign key (idClient)
references Client(idClient)
on update cascade
on delete cascade


/*==============================================================*/
/* Table : ADRESSE                                              */
/*==============================================================*/


/*==============================================================*/
/* Table : CLIENT                                               */
/*==============================================================*/
alter table client
add 
	constraint FK_CLIENT_STATUT
	foreign key (idStatut)
	references Statut(idStatut),

	--constraint CK_INSCRIPTION_DESINSCRIPTION
	--check (DATEINSCRIPTION<DATEDESINSCRIPTION),

	constraint UN_EMAIL_CLIENT
	UNIQUE (EMAILCLIENT)


/*==============================================================*/
/* Table : ENREGISTREMENTFACTURE                                */
/*==============================================================*/
alter table enregistrementfacture
add constraint FK_ENREGISTREMENTFACTURE_CLIENT
foreign key (idClient)
references Client(idClient)
on update cascade
on delete cascade

alter table enregistrementfacture
add constraint FK_ENREGISTREMENTFACTURE_ADRESSE
foreign key (idAdresse)
references Adresse(idAdresse)
on update cascade
on delete cascade


/*==============================================================*/
/* Table : ENREGISTREMENTLIVRAISON                              */
/*==============================================================*/
alter table enregistrementlivraison
add constraint FK_ENREGISTREMENTLIVRAISON_CLIENT
foreign key (idClient)
references Client(idClient)
on update cascade
on delete cascade

alter table enregistrementlivraison
add constraint FK_ENREGISTREMENTLIVRAISON_ADRESSE
foreign key (idAdresse)
references Adresse(idAdresse)
on update cascade
on delete cascade


/*==============================================================*/
/* Table : AUTEUR                                               */
/*==============================================================*/
alter table AUTEUR
add 
constraint UN_AUTEUR
unique (NOMAUTEUR,PRENOMAUTEUR) 

/*==============================================================*/
/* Table : COUT                                                 */
/*==============================================================*/
ALTER TABLE COUT
ADDCONSTRAINT FK_COUT_LIVRE
FOREIGN KEY (CODEISBN)
REFERENCES LIVRE(CODEISBN)
ON UPDATE CASCADE
ON DELETE CASCADE

ALTER TABLE COUT
ADDCONSTRAINT FK_COUT_PRIX
FOREIGN KEY (IDPRIX)
REFERENCES PRIX(IDPRIX)
ON UPDATE CASCADE
ON DELETE CASCADE


/*==============================================================*/
/* Table : DETAILPANIER                                         */
/*==============================================================*/
ALTER TABLE DETAILPANIER
ADDCONSTRAINT FK_DETAILPANIER_PANIER
FOREIGN KEY (IDPANIER)
REFERENCES PANIER(IDPANIER)
ON UPDATE CASCADE
ON DELETE CASCADE

/*==============================================================*/
/* Table : ECRITURE                                             */
/*==============================================================*/
ALTER TABLE ECRITURE
ADDCONSTRAINT FK_ECRITURE_AUTEUR
FOREIGN KEY (IDAUTEUR)
REFERENCES AUTEUR(IDAUTEUR)
ON UPDATE CASCADE
ON DELETE CASCADE

ALTER TABLE ECRITURE
ADDCONSTRAINT FK_ECRITURE_LIVRE
FOREIGN KEY (CODEISBN)
REFERENCES LIVRE(CODEISBN)
ON UPDATE CASCADE
ON DELETE CASCADE

/*==============================================================*/
/* Table : EVENEMENT                                            */
/*==============================================================*/
alter table EVENEMENT
add
	constraint CK_DEBUT_FIN
	check (DATEDEBUTEVENEMENT<DATEFINEVENEMENT)

/*==============================================================*/
/* Table : PRIX                                                 */
/*==============================================================*/


/*==============================================================*/
/* Table : PROMOTION                                            */
/*==============================================================*/
ALTER TABLE PROMOTION
ADDCONSTRAINT FK_PROMOTION_EVENEMENT
FOREIGN KEY (IDEVENEMENT)
REFERENCES EVENEMENT(IDEVENEMENT)
ON UPDATE CASCADE
ON DELETE CASCADE

ALTER TABLE PROMOTION
ADDCONSTRAINT FK_PROMOTION_LIVRE
FOREIGN KEY (CODEISBN)
REFERENCES LIVRE(CODEISBN)
ON UPDATE CASCADE
ON DELETE CASCADE

/*==============================================================*/
/* Table : THEME                                                */
/*==============================================================*/


/*==============================================================*/
/* Table : AFFINAGE                                             */
/*==============================================================*/
alter table AFFINAGE    
add 
	constraint FK_AFFINAGE_THEME    
	foreign key (NOMTHEME)    
	references THEME(NOMTHEME)   
	on update cascade    
	on delete cascade
	
alter table AFFINAGE    
add 
	constraint FK_AFFINAGE_SOUSTHEME    
	foreign key (NOMSOUSTHEME)    
	references SOUSTHEME(NOMSOUSTHEME)    
	on update cascade    
	on delete cascade

/*==============================================================*/
/* Table : SOUSTHEME                                            */
/*==============================================================*/


/*==============================================================*/
/* Table : "PRECISION"                                          */
/*==============================================================*/
alter table "PRECISION"   
add 
	constraint FK_PRECISION_SOUSTHEME    
	foreign key (NOMSOUSTHEME)    
	references SOUSTHEME(NOMSOUSTHEME)    
	on update cascade    
	on delete cascade
	
alter table "PRECISION"    
add 
	constraint FK_PRECISION_LIVRE    
	foreign key (CODEISBN)    
	references LIVRE(CODEISBN)    
	on update cascade    
	on delete cascade

/*==============================================================*/
/* Table : MOTCLEF                                              */
/*==============================================================*/


/*==============================================================*/
/* Table : DEFINITION                                           */
/*==============================================================*/
alter table "DEFINITION"    
add 
	constraint FK_DEFINITION_MOTCLEF   
	foreign key (NOMMOTCLEF)    
	references MOTCLEF(NOMMOTCLEF)    
	on update cascade    
	on delete cascade
	
alter table "DEFINITION"    
add 
	constraint FK_DEFINITION_LIVRE    
	foreign key (CODEISBN)    
	references LIVRE(CODEISBN)    
	on update cascade    
	on delete cascade

/*==============================================================*/
/* Table : CATEGORIE                                            */
/*==============================================================*/


/*==============================================================*/
/* Table : EDITEUR                                              */
/*==============================================================*/


/*==============================================================*/
/* Table : LIVRE                                                */
/*==============================================================*/
alter table LIVRE    
add    
	constraint FK_LIVRE_EDITEUR    
	foreign key (NOMEDITEUR)    
	references EDITEUR (NOMEDITEUR)    
	on update cascade    
	on delete cascade

alter table LIVRE  
add 
	constraint FK_LIVRE_CATEGORIE    
	foreign key (NOMCATEGORIE)    
	references CATEGORIE(NOMCATEGORIE)    
	on update cascade    
	on delete cascade
	
alter table LIVRE    
add 
	constraint FK_LIVRE_STATUT    
	foreign key (IDSTATUT)    
	references STATUT(IDSTATUT)
	
alter table LIVRE    
add 
	constraint FK_LIVRE_TVA    
	foreign key (NOMTAXE)    
	references TVA(NOMTAXE)    
	on update cascade    
	on delete cascade