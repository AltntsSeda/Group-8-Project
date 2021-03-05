

@FID-206


    Feature:Create Project with Detailed Information

		Background: Login with valid credentials

		    When the user enter valid credentials "posmanager16@info.com" "posmanager"
		    And click on login button
			And go to "Project" Module
		    
		    Scenario:User should be able to create a new project with detailed information
				And click on the "Create" button on the Dashboard page of the Project Module
				And enter a Project Name on the new page "Eu3 Project"
				And click on the "Create & Edit" button on the Create New Project page
				And select a customer from the customer dropdown
				And click on Emails tab
				And enter an email alias "Eu3 Project"
				And click on the "Save" button on the Dashboard page of the Project Module
				And click on the Dashboard link from the left menu
				Then the user should see one additional project with the new project name "Eu3 Project"
		    