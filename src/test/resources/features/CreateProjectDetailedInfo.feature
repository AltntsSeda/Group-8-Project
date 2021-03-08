Feature: Create Project with Detailed Information

	Background:
		When the user enter valid credentials "posmanager16@info.com" "posmanager"
		Then the user should be able to login

	#User Story: As a POS Manager I should be able to create new project with detailed information
	#
	#Acceptance Criteria: POS Manager can create new project with detailed information
	#
	#Notes:  After creating project
	# - project name
	# - project email
	# - customer name
	#
	#should be checked if they are seen correctly on the Dashboard of the Project Module
	@FID-206
	Scenario: Create Project with Detailed Information (Aut.) Test
		And the user navigates to "Project" tab
		Then the user click Create button on Project page
		Then the user able to write "Project EU4" on Project Name box
		And the user able to write "eu4testmail" on Choose a Project Email box
		Then the user able to click Create&Edit button
		Then select a customer from the customer dropdown "0000"
		Then the user able to click Save button on the Projects page tab
		Then the user should see one additional project with the new project name "Project EU4"
		