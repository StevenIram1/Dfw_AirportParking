$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/BookParking.feature");
formatter.feature({
  "line": 2,
  "name": "Book parking and save feature validation",
  "description": "",
  "id": "book-parking-and-save-feature-validation",
  "keyword": "Feature"
});
formatter.before({
  "duration": 28978360299,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User should be able to book parking",
  "description": "",
  "id": "book-parking-and-save-feature-validation;user-should-be-able-to-book-parking",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user is on dfwAirport website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user clicks park",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user should see book and save parking form",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinitions.user_is_on_dfwAirport_website()"
});
formatter.result({
  "duration": 10155966131,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinitions.user_clicks_park()"
});
formatter.result({
  "duration": 69632702,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinitions.user_should_see_book_and_save_parking_form()"
});
formatter.result({
  "duration": 5895027286,
  "status": "passed"
});
});