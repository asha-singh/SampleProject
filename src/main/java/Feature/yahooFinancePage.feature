Feature: Yahoo finance page 
    
  Scenario Outline: On the Yahoo Finance page enter AAPL in search text box
    Given User opens browser and launches yahoo finance 
    Then User validate Yahoo Finance page is displayed
    Then User enters "<company>" in the top Search Text Box
    Then User clicks Search
    Then User is displayed with AAPL Page
    Then Close Browser
    
     
    
    Examples:
   |company |
   |AAPL | 
 
   
    
    
    
    
    
    
