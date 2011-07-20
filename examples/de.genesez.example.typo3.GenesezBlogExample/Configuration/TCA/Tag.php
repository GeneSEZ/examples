<?php
if (!defined ('TYPO3_MODE')) {
	die ('Access denied.');
}

$TCA['tx_genesezblogexample_domain_model_tag'] = array (
	'ctrl' => $TCA['tx_genesezblogexample_domain_model_tag']['ctrl'],
	'interface' => array(
		'showRecordFieldList' => 'name',
	),
	'types' => array(
		'1' => array('showitem'	=> 'name'),
	),
	'palettes' => array(
		'1' => array('showitem'	=> ''),
	),
	'columns' => array(
		'hidden' => array(
			'exclude' => 1,
			'label'	=> 'LLL:EXT:lang/locallang_general.xml:LGL.hidden',
			'config' => array(
				'type' => 'check',
			)
		),
		'sys_language_uid' => array(
			'exclude' => 1,
			'label' => 'LLL:EXT:lang/locallang_general.php:LGL.language',
			'config' => array(
				'type' => 'select',
				'foreign_table' => 'sys_language',
				'foreign_table_where' => 'ORDER BY sys_language.title',
				'items' => array(
					array('LLL:EXT:lang/locallang_general.php:LGL.allLanguages', -1),
					array('LLL:EXT:lang/locallang_general.php:LGL.default_value', 0)
				),
			)
		),
		'l18n_parent' => array(
			'displayCond' => 'FIELD:sys_language_uid:>:0',
			'exclude' => 1,
			'label' => 'LLL:EXT:lang/locallang_general.php:LGL.l18n_parent',
			'config' => array(
				'type' => 'select',
				'items'	=> array(
					array('', 0),
				),
				'foreign_table' => 'tx_genesezblogexample_domain_model_tag',
				'foreign_table_where' => 'AND tx_genesezblogexample_domain_model_tag.uid=###REC_FIELD_l18n_parent### AND tx_genesezblogexample_domain_model_tag.sys_language_uid IN (-1,0)',
			)
		),
		'l18n_diffsource' => array(
			'config' =>array(
				'type' =>'passthrough',
			)
		),
	't3ver_label' => array(
		'displayCond' => 'FIELD:t3ver_label:REQ:true',
		'label' => 'LLL:EXT:lang/locallang_general.php:LGL.versionLabel',
		'config' => array(
			'type' =>'none',
			'cols' => 27,
		)
	),
		'name' => array(
		),
	)
);

/* PROTECTED REGION ID(tca.php.own.code.implementation._16_9_8a7027a_1297194795235_681189_1679) ENABLED START */
// TODO: put your further code implementations here
/* PROTECTED REGION END */

?>
