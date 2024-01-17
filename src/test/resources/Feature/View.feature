@Viewpage
  Feature: i want to verify the text and others functionalities on the view screen.
    Author: Mehdi
    Date : 02/01/2024

  Scenario: Click on the view text to check the view page functionalities.
    * click on view "VIEW" on the home page
    * text h1 "The ultimate software development kit for RCoS+ embedded software architecture" on the view page
    * text p2 "Learn, design and simulate with Arçelik RCoS + software development kit easily." on the view page
    * text p3 "RCoS + control boards are designed to simulate a real product and allow users to instantly test their actions. You can use libraries prepared with Arçelik RCoS + 2.0 software architecture and you can easily control the hardware elements through sample projects. You can compile the software you have created and install it on the control boards. You can also create your own design from scratch!" on the view page
    * text PC IDE "RCoS+ SDK PC IDE" on the view page
    #* text p5 "Create your own project immediately using PC IDE. You can review sample projects, open and update a project that you have created before." on the view page
    * text p6 "You can install the software that you developed into the mainboard and / or display board and see the results. Developing software with RCoS + expandable electronic boards is easy now." on the view page

  Scenario: Check the forums page.
    * click on the forums "FORUMS" on the home page
    * check the text "FORUMS" on the forums page

  Scenario: Check the documents page.
    * click on the documents "DOCUMENTS" on the home page
    * check the text documents "Documents" on the documents page

    Scenario: Check the videos page.
      * click on the videos "VIDEOS" on the home page
      * check the text videos "Videos" on the videos page

    Scenario: Check the application note page.
      * click on the application "APPLICATION NOTES" on the home page
      * check the text application "Application Notes" on the application note page

    Scenario: Check the downloads page.
      * click on the downloads "DOWNLOADS" on the home page
      * check the text downloads "Oops! That page can’t be found." on the download page

    Scenario: Verify the footer functionalities
      * text version "2024- Tüm hakları Arçelik A.Ş.’ye aittir." on the footer
      * text home page "Home Page" on the footer
      * text forums "Forums" on the footer
      * text articles "Articles" on the footer
      * text documents "Documents" on the footer
      * text videos "Videos" on the footer
      * text FAQ "FAQ" on the footer