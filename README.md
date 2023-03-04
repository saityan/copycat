# Making an interface
This repository contains the intent to create the Android app with the following interface:

![interface_screenshot](https://user-images.githubusercontent.com/20212022/216633559-0e028ece-7aca-4991-9cc3-f7d03b6720f6.jpg)

It was relayed to me as a potentially interesting task to solidify certain skills. No functionality aside from presenting the interface was implied.
No icons or other assets were given, as well as any numeric specifications.

## Technology and structure
The app follows a simple MVVM pattern, with most of the code related to Jetpack Compose toolkit.
There's no database or any data handling at the moment. I might add them in the future if I have time.

## Licences and attribution
The app uses vector icons as external assets, which were drawn by a 3rd party. All assets were described as free-to-use and with no attribution required.
If you happen to be the author of any of the assets and want attribution or restrict non-commercial use, please contact me.

## SDK restrictions
Minimum SDK is 26.
Target SDK is 33.

## Timer
Though it might not seem like that, the countdown timer is actually working. It always starts from the same value, that can be adjusted by changing "countdown" constant.

## Testing
The app was tested in Android Studio on the following virtual devices: Pixel 5 API 30, Pixel XL API 31, Nexus 6 API 33, Nexus 9 API 26.
There was no real device testing.
