![](https://github.com/StuyPulse/StuyLib/raw/master/pictures/StuyLib%20Banner.png)

[![](https://jitpack.io/v/StuyPulse/StuyLib.svg)](https://jitpack.io/#StuyPulse/StuyLib)

# What is StuyLib?

StuyLib is an FRC library / toolkit which includes many different utilities for programming. It includes things like a Gamepad Library, a Limelight Library, a Digitial Filter / Streams Library, and many other utilities relating to math and programming.

# Awards

- IStreams / IStreamFilters: 
	- [Innovation in Control Award sponsored by Rockwell Automation](https://www.thebluealliance.com/event/2020scmb#awards)

# How do I use StuyLib?

### Setting up StuyLib

[Instructions from JitPack.io](https://jitpack.io/#StuyPulse/StuyLib)

Step 1. Add the JitPack repository to your build file

 - Add it in your root build.gradle at the end of repositories:
```
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

 - Step 2. Add the dependency
```
	dependencies {
	    compile 'com.github.StuyPulse:StuyLib:VERSION'
	}
```

The version tag can be seen at the top of the readme. An example would be:
```
	dependencies {
	    compile 'com.github.StuyPulse:StuyLib:2020.1.9.0'
	}
```


### Other Dependencies

If you want the NetworkTable classes to work on something other than the robot, then you need to include other dependencies.

If you are using network tables anywhere else than the robot, ie. on a laptop, you will need to include the jar files in the `./lib` folder. For example, when using NetKeyboard, you need to run a program to send the keyboard input, [here is the program](https://github.com/Sam-Belliveau/NetworkKeyboardServer). This program uses these jar files to send network table data to the robot. It is otherwise pretty rare that you would need to use these

# Criteria for Code Contribution

When contributing code, as always, make a branch and a pull request.

All code MUST be commented, and no single class should be to complicated.

At the top of each class, give a brief description of the class, along with an author tag which contains an email just in case anybody has any questions on how to use it.

# Current Positions

Current Lead Repository Maintainer

 - [Sam Belliveau (2022)](https://github.com/Sam-Belliveau)

Future Lead Repository Maintainer (if he's a good boi)

 - [Myles Pasetsky (2023)](https://github.com/selym3)

Notable Contributors

 - [Ivan Wei (2022)](https://github.com/iwei20)
 - [Winston Peng (2020)](https://github.com/CreativePenguin)
 - [Kevin Cai (2020)](https://github.com/Kevin16777126)
