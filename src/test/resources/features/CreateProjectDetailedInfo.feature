Feature:

	Background:
		#@FID-208
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
		Then the user click "Create" button on Project page
		Then the user able to write "Project EU4" on Project Name box
		And the user able to write "eu4testmail" on Choose a Project Email box
		Then the user able to click "Create&Edit" button
		Then the user able to write "Seda" on Customer box
		And the user able select "Create" dropdown on Customer box
		And the user able to click "Save" button on the Projects page tab
		And the user able to search "Project EU4" on serach box as Project Name
		Then the user able to see "Project EU4" Kanban on Project Dashboard search page
		