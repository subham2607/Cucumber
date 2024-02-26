Feature: Hooks in cucumber

Scenario: Add new Customer
Given user is on add customer page
When user fills the customer details
Then customer is added

Scenario: Edit customer
Given user is on edit custoner page
When user edits contact details
Then contact details updated

Scenario: Delete customer
Given user is on delete custoner page
When user delete customer
Then customer deleted





