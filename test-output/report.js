$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("aaplPage.feature");
formatter.feature({
  "line": 1,
  "name": "AAPL Page",
  "description": "",
  "id": "aapl-page",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 6,
  "name": "On the AAPL Page validate current Sales Price",
  "description": "",
  "id": "aapl-page;on-the-aapl-page-validate-current-sales-price",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "User search for \"\u003ccompany\u003e\" page from Yahoo Finance Page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User validates AAPL page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User checks for Sales Price of AAPL",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Sales price greater than \"\u003cBenchmark Price\u003e\" test passes",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Sales price is less than or equal \"\u003cBenchmark Price\u003e\" test fails",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Close browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 17,
  "name": "",
  "description": "",
  "id": "aapl-page;on-the-aapl-page-validate-current-sales-price;",
  "rows": [
    {
      "cells": [
        "company",
        "Benchmark Price"
      ],
      "line": 18,
      "id": "aapl-page;on-the-aapl-page-validate-current-sales-price;;1"
    },
    {
      "cells": [
        "AAPL",
        "130.0"
      ],
      "line": 19,
      "id": "aapl-page;on-the-aapl-page-validate-current-sales-price;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 19,
  "name": "On the AAPL Page validate current Sales Price",
  "description": "",
  "id": "aapl-page;on-the-aapl-page-validate-current-sales-price;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "User search for \"AAPL\" page from Yahoo Finance Page",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User validates AAPL page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User checks for Sales Price of AAPL",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Sales price greater than \"130.0\" test passes",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Sales price is less than or equal \"130.0\" test fails",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Close browser",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "AAPL",
      "offset": 17
    }
  ],
  "location": "AAPLPageStepDefinition.user_search_for_page_from_Yahoo_Finance_Page(String)"
});
formatter.result({
  "duration": 38271255700,
  "status": "passed"
});
formatter.match({
  "location": "AAPLPageStepDefinition.user_validates_AAPL_page_is_displayed()"
});
formatter.result({
  "duration": 22878738400,
  "status": "passed"
});
formatter.match({
  "location": "AAPLPageStepDefinition.user_checks_for_Sales_Price_of_AAPL()"
});
formatter.result({
  "duration": 84192300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "130.0",
      "offset": 26
    }
  ],
  "location": "AAPLPageStepDefinition.sales_price_greater_than_test_passes(double)"
});
formatter.result({
  "duration": 52254000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "130.0",
      "offset": 35
    }
  ],
  "location": "AAPLPageStepDefinition.sales_price_is_less_than_or_equal_test_fails(double)"
});
formatter.result({
  "duration": 58266800,
  "status": "passed"
});
formatter.match({
  "location": "AAPLPageStepDefinition.close_browser()"
});
formatter.result({
  "duration": 983629000,
  "status": "passed"
});
formatter.uri("yahooFinancePage.feature");
formatter.feature({
  "line": 1,
  "name": "Yahoo finance page",
  "description": "",
  "id": "yahoo-finance-page",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "On the Yahoo Finance page enter AAPL in search text box",
  "description": "",
  "id": "yahoo-finance-page;on-the-yahoo-finance-page-enter-aapl-in-search-text-box",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User opens browser and launches yahoo finance",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User validate Yahoo Finance page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "User enters \"\u003ccompany\u003e\" in the top Search Text Box",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User clicks Search",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User is displayed with AAPL Page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Close Browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "yahoo-finance-page;on-the-yahoo-finance-page-enter-aapl-in-search-text-box;",
  "rows": [
    {
      "cells": [
        "company"
      ],
      "line": 14,
      "id": "yahoo-finance-page;on-the-yahoo-finance-page-enter-aapl-in-search-text-box;;1"
    },
    {
      "cells": [
        "AAPL"
      ],
      "line": 15,
      "id": "yahoo-finance-page;on-the-yahoo-finance-page-enter-aapl-in-search-text-box;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 15,
  "name": "On the Yahoo Finance page enter AAPL in search text box",
  "description": "",
  "id": "yahoo-finance-page;on-the-yahoo-finance-page-enter-aapl-in-search-text-box;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User opens browser and launches yahoo finance",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User validate Yahoo Finance page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "User enters \"AAPL\" in the top Search Text Box",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User clicks Search",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User is displayed with AAPL Page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Close Browser",
  "keyword": "Then "
});
formatter.match({
  "location": "YahooFinancePageStepDefinition.user_opens_browser_and_launches_yahoo_finance()"
});
formatter.result({
  "duration": 32001975700,
  "status": "passed"
});
formatter.match({
  "location": "YahooFinancePageStepDefinition.user_validate_Yahoo_Finance_page_is_displayed()"
});
formatter.result({
  "duration": 21144100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AAPL",
      "offset": 13
    }
  ],
  "location": "YahooFinancePageStepDefinition.user_enters_in_the_top_Search_Text_Box(String)"
});
formatter.result({
  "duration": 212694600,
  "status": "passed"
});
formatter.match({
  "location": "YahooFinancePageStepDefinition.user_clicks_Search()"
});
formatter.result({
  "duration": 7186539500,
  "status": "passed"
});
formatter.match({
  "location": "YahooFinancePageStepDefinition.user_is_displayed_with_AAPL_Page()"
});
formatter.result({
  "duration": 23256342500,
  "status": "passed"
});
formatter.match({
  "location": "YahooFinancePageStepDefinition.close_Browser()"
});
formatter.result({
  "duration": 1052093100,
  "status": "passed"
});
});