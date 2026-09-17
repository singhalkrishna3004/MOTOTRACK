# MotoTrack CLI

## Overview
MotoTrack is a lightweight Java command-line application built to help vehicle owners and DIY enthusiasts track garage inventory, log maintenance, diagnose recurring issues, and document custom modifications. 

## Features
* **Vehicle Registration:** Add and store details of multiple vehicles (cars, bikes) in your garage.
* **Service Logging:** Record dates, service types, and detailed notes (e.g., tracking a "crackling sound on startup" for a Meteor 350, or a routine oil change).
* **History Generation:** Pull complete chronological service records for any registered vehicle.

## Technologies Used
* Java (JDK 11 or higher)
* Standard Java Collections Framework (ArrayList, HashMap)
* Scanner for CLI interactions

## Setup and Installation
1. Ensure you have the Java Development Kit (JDK) installed.
2. Clone this repository: `git clone https://github.com/{your-github-username}/MotoTrack.git`
3. Navigate to the source directory: `cd MotoTrack/src`
4. Compile all Java files: `javac *.java`
5. Run the application: `java MotoTrack`

## Testing Instructions
1. Run the app and select option `1`.
2. Add a test vehicle (e.g., Make: Royal Enfield, Model: Meteor 350, Year: 2022).
3. Select option `3` to log a service for that vehicle. 
4. Select option `4` to verify the history prints correctly.