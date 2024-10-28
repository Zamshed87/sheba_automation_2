Feature: Verify sheba icon work properly

  #T1
  @Release
  Scenario: Verify sheba logo work properly
    Given User Click on sheba logo
    Then User return to home page


# T2
#  @Release
#  Scenario: Product Display
#    Given Check Health and  care is available in Category item section
#    When Click on health button
#    Then Check best deal is Displayed
#    And Click on best deal button
 

    #T3
  @Release
  Scenario: Product Display two
    Given Check All Services work properly
    When Click on All Services button
    Then Check if AC Repair is visible

  @Release
  Scenario: Product Display three
    Given Check location works properly
    When Click on location button
    Then Check if dhaka is visible

  @Release
  Scenario: Product Display four
    Given Check search works properly
    When Click on search button
    Then Check if salon is visible