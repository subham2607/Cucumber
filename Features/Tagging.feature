Feature: Tags in cucumber

@SanityTest
Scenario: Verify login
Given This is valid login test

@SanityTest @End2End
Scenario: Verify logout
Given this is logout test

@RegressionTest
Scenario: Verify search
Given this is search test

@RegressionTest @End2End
Scenario: Verify advanced search
Given this advanced search test

@End2End
Scenario: verify prepaid recharge
Given this is prepaid recharge test

@End2End
Scenario: Verifypost paid recharge
Given this is post paid recharge test
