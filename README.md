Steps for setting up the application :
==================================================== 

Liferay Version : Liferay Community Edition Portal 7.0.5 GA6

1.	Clone following repository from GIT: (GIT URL : https://github.com/pranavparmar128/liferay-dxp)

https://github.com/pranavparmar128/liferay-dxp.git

2. Repository contains liferay workspace. Please import this workspace in Liferay IDE.

3. Workspace contains 3 modules.
	a. computer-api
	b. computer-service
	c. computer-web
	
	Build & deploy above module in liferay. Following is the command for building & deploying modules.

	To point deployment path to Liferay, Please add property "liferay.workspace.home.dir" with Liferay home directory path in "gradle-local.properties" file.
	
	If blade cli is installed, then use "blade gw deploy"
	If not use "./gradlew deploy" for linux, "gradlew deploy" for windows.

4. Once all three modules are deployed, "ComputerApplication" will be available. Drop this portlet on a page.

5. To add a computer, please click on "Add computer".

6. To update/delete, use the action button (:) which will appear at the end of each record.

7. To search, type the desired string in the search box input and hit the search button.
