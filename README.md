# QKart – E-commerce Test Automation Framework

## Overview
QKart is an e-commerce web application used to demonstrate end-to-end UI test automation using Selenium WebDriver, Java and TestNG.
The framework automates critical user journeys such as user registration, login, product search, cart management, and checkout validation. 
It follows the Page Object Model (POM) design pattern and supports data-driven testing using Apache POI and Excel files.
In addition to reading test data from Excel files, the framework also generates execution reports in Excel format by writing test results back to a spreadsheet after execution.

---

## Tech Stack
- Java
- Selenium WebDriver
- TestNG
- Gradle
- Apache POI
- Git

---

## Framework Design
- Page Object Model (POM)
- DriverFactory for browser management
- TestNG Framework
- TestNG DataProvider
- Explicit Wait Utilities
- Screenshot Capture Utility
- Data-Driven Testing using Apache POI
- Excel Result Reporting

---

## Project Structure
src
├── main
│   ├── java
│   │   ├── base
│   │   ├── pages
│   │   └── utils
│   │
│   └── resources
│       └── testdata
│           ├── users.xlsx
│
└── test
    └── java
        ├── tests
        ├── listeners
        └── base

---

## Test Coverage

### Authentication
- User Registration
- User Login
- Duplicate User Registration Validation

### Product Search
- Product Search Validation
- Search Result Verification

### Cart Management
- Add Product to Cart
- Update Cart Quantity

### Checkout
- Add Address
- Select Address
- Place Order

### Browser Operations
- Window Handling
- URL Validation
- Screenshot Capture

### Data-Driven Testing
- Registration using Excel test data
- Multiple user execution using TestNG DataProvider

---

## Utilities Implemented

### DriverFactory
- Browser initialization
- Driver management

### WaitUtils
- Explicit waits
- URL synchronization

### Test Listener
- Screenshot capture on test failure
- Test execution monitoring

### ExcelUtils
- Read Excel data using Apache POI
- Support TestNG DataProvider

### ConfigReader
- Environment configuration management

### ResultWriter
- Create RunResults.xlsx
- Write execution results
- Generate execution summary

---

## Key Achievements

- Implimented reusable Page Object Model framework.
- Automated end-to-end user workflows.
- Added Data-Driven Testing using Apache POI.
- Executed test cases with multiple datasets.
- Generated execution results automatically in Excel format.
- Reduced code duplication through reusable utility classes.
- Improved test stability using explicit wait strategies.
- Automated end-to-end user workflows for an e-commerce platform.

---

## How to Execute

### Run all tests:
- gradlew test
### View TestNG Report:
- build/reports/tests/test/index.html
### View Excel Execution Report:
- RunResults.xlsx