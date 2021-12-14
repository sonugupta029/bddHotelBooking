Feature: BDD Hotel Booking


Scenario: Booking Flow
    Given user opens web page login.html page
    Then page header should be displayed as "Hotel Booking Application"
    Then click Login and verify username error message
    Then enter username as "admin"
    Then click Login and verify password error message
    Then enter password as "admin"
    Then click Login
    Then user will navigate to Hotel Booking page
    Then verify the title "Hotel Booking Form" of the page
    Then verify firstname error message
    Then enter firstname as "Sonu"
    Then verify lastname error message
    Then enter lastname as "Gupta"
    Then verify email error message
    Then enter email as "sonu.gupta5@tcs.com"
    Then validate alertbox text "Please enter valid Contact no"
    Then enter mobile number as "9545348072"
    Then enter address as "2291"
    Then enter city as "Pune"
    Then enter state as "Maharashtra"
    Then enter no of people as "4"
    Then enter card name as "Sonu Gupta"
    Then enter card number as "954534807248072"
    Then enter CVV as "954"
    Then enter debit card month expiry as "11"
    Then enter debit card year expiry as "25"
    Then click Confirm booking
    Then verify booking confirmation screen

