$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Test.feature");
formatter.feature({
  "line": 2,
  "name": "Login feature",
  "description": "sdfgfx\r\ndfg\r\nsg",
  "id": "login-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@login"
    }
  ]
});
formatter.scenario({
  "line": 22,
  "name": "Valid username and password",
  "description": "",
  "id": "login-feature;valid-username-and-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 21,
      "name": "@positive"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "I am able to access magento Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "I click on user_icon",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "i update the user_name as \"natarajan.ramanathan93@gmail.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "I update password as \"Welcome123\"",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I click on Sign_in",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I should get the user ID as \"ID: MAG003417822\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.i_am_able_to_access_magento_Homepage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Steps.i_click_on_user_icon()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "natarajan.ramanathan93@gmail.com",
      "offset": 27
    }
  ],
  "location": "Steps.i_update_the_user_name_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Welcome123",
      "offset": 22
    }
  ],
  "location": "Steps.i_update_password_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Steps.i_click_on_Sign_in()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "ID: MAG003417822",
      "offset": 29
    }
  ],
  "location": "Steps.i_should_get_the_user_ID_as(String)"
});
formatter.result({
  "status": "skipped"
});
});