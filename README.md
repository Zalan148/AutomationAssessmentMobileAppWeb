Android mobile device used and website tested is Booking.com

1) Install node.js and npm if not already installed
2) Install Appium CLI server with node.js by doing following: npm install -g appium
3) Install driver for Android: appium driver install uiautomator2
4) Install wait plugin: appium plugin install --source=npm appium-wait-plugin
5) Install dashboard: appium plugin install --source=npm appium-dashboard
6) Run the following once so that Appium gets the compatible browser version matching the emulator:
   appium --allow-insecure chromedriver_autodownload
7) Download and install Android Studio for emulator
8) In Android Studio navigate to File -> Settings -> Language and Frameworks -> Android SDK -> check the required installations are there
9) Appium Client - used Intellij IDE, Java and Page Object Model
10) Start appium server and activate wait plugin
    appium server --use-plugins=element-wait
11) Launch Android Studio and add virtual device. Turn the emulator on e.g. Pixel 7 Pro device.
12) Might need to include a configuration settings file in the folder .android
13) Path to android SDK location will need to be added to environment variables
14) Highlight TestRunner class -> right click 'Run TestRunner'
