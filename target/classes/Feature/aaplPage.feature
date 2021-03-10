Feature: AAPL Page
 



   Scenario Outline: On the AAPL Page validate current Sales Price 
    Given User search for "<company>" page from Yahoo Finance Page
    Then User validates AAPL page is displayed
    Then User checks for Sales Price of AAPL
    When Sales price greater than "<Benchmark Price>" test passes
    When Sales price is less than or equal "<Benchmark Price>" test fails
    Then Close browser
    
    
     
    
    Examples:
    |company |Benchmark Price|
    |AAPL |130.0|