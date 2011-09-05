<?php

/* PROTECTED REGION ID(php.own.imports._17_0_1_8a7027a_1306344032809_231995_2319) ENABLED START */
/* PROTECTED REGION END */

/***************************************************************
 *  Copyright notice
 *
 *  (c) 2011 nicher
 *  All rights reserved
 *
 *  This script is part of the TYPO3 project. The TYPO3 project is
 *  free software; you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation; either version 2 of the License, or
 *  (at your option) any later version.
 *
 *  The GNU General Public License can be found at
 *  http://www.gnu.org/copyleft/gpl.html.
 *
 *  This script is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  This copyright notice MUST APPEAR in all copies of the script!
 **************************************************************/

/**
 * 
 * @version $Id$
 * @copyright Copyright belongs to the respective authors
 * @license http://www.gnu.org/licenses/gpl.html GNU General Public License, version 3 or later
 */
class Tx_GenesezRealEstate_Domain_Model_Quarter extends Tx_Extbase_DomainObject_AbstractValueObject {

	/**
	 * 
	 * @var string
	 */
	protected $name;
	/**
	 * 
	 * @var string
	 */
	protected $description;


	

	
	/**
	 * Getter for name
	 *
	 * @return string 
	 */
	public function getName() {
		return $this->name;
	}
	/**
	 * Setter for name
	 *
	 * @param string $name 
	 * @return void
	 */
	public function setName($name) {
		$this->name = $name;
	}
	/**
	 * Getter for description
	 *
	 * @return string 
	 */
	public function getDescription() {
		return $this->description;
	}
	/**
	 * Setter for description
	 *
	 * @param string $description 
	 * @return void
	 */
	public function setDescription($description) {
		$this->description = $description;
	}

	/* PROTECTED REGION ID(php.class.own.code.implementation._17_0_1_8a7027a_1306344032809_231995_2319) ENABLED START */
	/* PROTECTED REGION END */

}
?>
