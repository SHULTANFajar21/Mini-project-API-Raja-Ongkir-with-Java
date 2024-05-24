@api
Feature: test automation rest API


  @api
  Scenario: test get list province normal
    Given prepare url for "PROVINCE"
    And hit api province
    And validation status code is equals 200
    When validation response body get list province
    Then validation response json with jsonSchema "get_list_province.json"


  @api
  Scenario: test get list city normal
    Given prepare url for "CITY"
    And hit api city
    And validation status code is equals 200
    When validation response body get list city
    Then validation response json with jsonSchema "get_list_city.json"

  @api
  Scenario: test post cost normal
    Given prepare url for "COST"
    And hit api cost
    And validation status code is equals 200
    When validation response body post cost normal
    Then validation response json with jsonSchema "post_cost_normal.json"

