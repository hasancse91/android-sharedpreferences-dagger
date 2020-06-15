# Android SharedPreferences with Dagger 2

`SharedPreferences` is a very common and usefull API of Android SDK to store simple key-value pair data for any Android App. In this repository, I implemented the `SharedPreferences` with `Dagger 2` **Dependency Injection** framework. Please be mentioned that, it's not mandatory to implement SharedPreferences with Dagger. This repository is for practicing the Dagger stuff. If you want to know the basic implementation of SharedPreferences without Dagger, then check [this repository](https://github.com/hasancse91/Android-SharedPreferences).

<img src="https://github.com/hasancse91/android-sharedpreferences-dagger/blob/master/screenshot.png" width="250" height="444" />

### Prerequisites
Basic knowledge of `Kotlin` and `SharedPreferences` API.

### Project Description
We will develop a simple single page Application. This App will store user name and website data in SharedPreferences. The main target is implementation the SharedPreferences things using Dagger dependency injection.

### Project Setup
No special things required for this project setup. Simply clone, sync gradle and run!

### Solution Idea
Generally we create an instance of `SharedPreferences` inside our Activity. But in this project, we don't create the instance of `SharedPreferences` from our Activity class. Rather than, the instance of `SharedPreferences` will be **injected** into Activity class when the activity class is created.
This injection is implemented by `Dagger 2`. Activity class don't need to know anything about the creation process of `SharedPreferences` instance.

### Disclaimer
There are some other ways of implementation of `SharedPreferences` and `Dagger`. It is not guaranteed that my approach is the best in all cases.
