@Home
  Feature: As user i want to check the home screen and there functionalities, so i open to the website arcos.
    Author : Mehdi
    Date : 22-12-2023

  Scenario: 000 Open the home screen and all the contents and visible links
    * text homepage "HOME PAGE" on the home screen
    * text banner "The ultimate software development kit for RCoS+ embedded software architecture" on the home screen
    * text view "VIEW" on home screen
    * text arcossdk "RCoS SDK Workshops are on the way… Top universities and best engineering students.." on the home screen
    * search the text "Secure IoT Application" on page

    Scenario: 001 Key Features
    * text keyfeature "KEY FEATURES" on the home screen
    * text card title "Design Easily" on the home screen
    * text card info "Using expandable RCoS+ embedded system, you can access all components and make designs that control them easily." on the home screen
    * text card title1 "Library Support" on the home screen
    * text card info1 "Easily access libraries and dozens of example applications written with RCoS + architecture." on the home screen
    * text card title2 "Code & Try" on the home screen
    * text card info2 "You can load the codes which you have written on your RCoS+ embedded system immediately and observe the results instantly." on the home screen

    Scenario: 002 Why Rcosa +SDK
    * text section3 "WHY RCoS+ SDK?" on the home screen
    * text SDK paragraph "Using the development kit designed with RCoS + software architecture, you can run all RCoS + software layers and applications, develop your own design codes and upload them to RCoS + embedded systems and observe the results instantly. RCoS + is an easy, integrated and convenient development and learning platform for those who want to develop embedded software. Use the RCoS + SDK to get started and prepare for your firmware designs." on the home screen
    * text view1 "VIEW" on the home screen

    Scenario: 003 Use cases section
      #* text use cases "USE CASES" on the home screen
      * search the text "USE CASES" on page
      #* text header "Arçelik Electronic Platform Infrastructure" on the home screen
      * search the text "Arçelik Electronic Platform Infrastructure" on page
      #* text point1 "Development experience with different MCU’s like NXP, Atmel, Espressif and Cypress." on the home screen
      * search the text "Development experience with different MCU’s like NXP, Atmel, Espressif and Cypress." on page
      #* text point2 "Having platform 2.0 embedded architecture." on the home screen
      * search the text "Having platform 2.0 embedded architecture." on page
      #* text point3 "Simulating display boards and control of buttons, touch buttons, encoder, relays and so on…" on the home screen
      * search the text "Simulating display boards and control of buttons, touch buttons, encoder, relays and so on…" on page
      #* text point4 "Build software for control boards using RCoS+ software architecture." on the home screen
      * search the text "Build software for control boards using RCoS+ software architecture." on page
      #* text header1 "Secure IoT Application" on the home screen
      * search the text "Secure IoT Application" on page
      #* text iot point1 "Expansion with WiFi module" on the home screen
      * search the text "Expansion with WiFi module" on page
      #* text iot point2 "Touch screen control with 2,4′ TFT LCD display with RCoS+ GUI library" on the home screen
      * search the text "Touch screen control with 2,4′ TFT LCD display with RCoS+ GUI library" on page
      #* text iot point3 "Small motor control board expansion" on the home screen
      * search the text "Small motor control board expansion" on page
      #* text iot point4 "Extension board, relay/IO boards" on the home screen
      * search the text "Extension board, relay/IO boards" on page
      #* text iot point5 "Secure end-to-end IoT application development" on the home screen
      * search the text "Secure end-to-end IoT application development" on page
      #* text iot point6 "Onboarding and device control over cloud account" on the home screen
      * search the text "Onboarding and device control over cloud account" on page

    Scenario: 004 Download section
    * text download "DOWNLOAD" on the home screen
    * text download paragraph "We have combined RCoS + SDK tool, development tools, sample applications and libraries for you. Download now to get started!" on the home screen
    #* text download button "DOWNLOAD" on the home screen
    * wait for 10 second
    * search the text "DOWNLOAD" on page

    Scenario: 005 Verify the footer functionalities
      * text version "2024- Tüm hakları Arçelik A.Ş.’ye aittir." on the footer
      * text home page "Home Page" on the footer
      * text forums "Forums" on the footer
      * text articles "Articles" on the footer
      * text documents "Documents" on the footer
      * text videos "Videos" on the footer
      * text FAQ "FAQ" on the footer

