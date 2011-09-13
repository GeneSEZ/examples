
#
# Table structure for table 'tx_gszinventory_domain_model_product'
#
CREATE TABLE tx_gszinventory_domain_model_product (
	uid int(11) NOT NULL auto_increment,
	pid int(11) DEFAULT '0' NOT NULL,
	
	name varchar(255) DEFAULT '' NOT NULL,
	description text NOT NULL,
	quantity int(11) DEFAULT '0' NOT NULL,
	
	tstamp int(11) unsigned DEFAULT '0' NOT NULL,
	crdate int(11) unsigned DEFAULT '0' NOT NULL,
	deleted tinyint(4) unsigned DEFAULT '0' NOT NULL,
	hidden tinyint(4) unsigned DEFAULT '0' NOT NULL,
	
	
	
	PRIMARY KEY (uid),
	KEY parent (pid),
);

# PROTECTED REGION ID(ext_tables.sql.own.sql.declaration.eee_1045467100313_135436_1) ENABLED START
# PROTECTED REGION END
