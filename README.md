# Android TV apps for ABC iview and SBS
2 basic TV apps that will stream content from ABC iview and SBS. 
![home](docs/home.jpg)

ABC iview for Android TV
-------------------------
![main](docs/main.jpg)
![details](docs/details.jpg)

SBS for Android TV
------------------
![films](docs/sbs-films.jpg)

To build
--------
Create a file named `app.properties` in the project that defines the API urls for the ABC iview and SBS services.
See gradle build error messages for details.

Permissions
-----------
For Android TV versions 6 and above, you will need to check the permissions for both apps and enable both Microphone and Storage permissions in order for the app to utilise the search function correctly.

&#35;SIDELOADTAG
------------
You will need to install &#35;SIDELOADTAG or compatible app such as TV App Repo first, and then use the following tags to install directly on your TV.
- To install iView - iview120
- To install SBS - sbs120
