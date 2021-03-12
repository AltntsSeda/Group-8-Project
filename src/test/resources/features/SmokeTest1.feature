@Smoke

Feature:Smoke Test

	
	@FID-235
		Scenario Outline: Users should be able to use all links under the username dropdown on the basepage
		   When the user enters the "POS Manager" information
		   And click on the username on the basepage
		   And click on the "<Dropdown Item>"
		   Then user should be able to go "<Dropdown Item>" page
		    Examples:
		      | Dropdown Item       |
		      | Documentation       |
		      | Support             |
		      | My Odoo.com account |	

	
	@FID-234
		Scenario: Users should be able to login with valid credentials
		    When the user enter valid credentials "posmanager16@info.com" "posmanager"
		    Then the user should be able to login