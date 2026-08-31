# Selenium Java Automation Framework

A Selenium-based UI automation framework built using **Java, Selenium WebDriver, TestNG, Maven, and Page Object Model (POM)**.

This project is being developed as part of my hands-on automation learning, with a focus on building a reusable and maintainable Selenium framework and strengthening SDET-level automation skills.

## Tech Stack

- Java 17
- Selenium WebDriver 4
- TestNG
- Maven
- Log4j2
- Git & GitHub
- IntelliJ IDEA

## Framework Design

The framework currently follows:

- Page Object Model (POM)
- BaseTest for test setup and teardown
- BasePage for reusable Selenium actions
- DriverFactory for WebDriver management
- ConfigReader for configuration management
- WaitUtils for explicit waits
- TestNG Listeners
- Log4j2 for logging

## Framework Structure

```text
src
├── main
│   ├── java/com.shreya
│   │   ├── base
│   │   │   ├── BasePage.java
│   │   │   └── BaseTest.java
│   │   ├── config
│   │   │   └── ConfigReader.java
│   │   ├── driver
│   │   │   └── DriverFactory.java
│   │   ├── pages
│   │   └── utils
│   │       ├── AlertUtils.java
│   │       └── WaitUtils.java
│   └── resources
│       ├── config.properties
│       └── log4j2.xml
│
└── test
    └── java/com.shreya
        ├── listeners
        │   └── TestListener.java
        └── tests
```

## Reusable BasePage Methods

Common Selenium operations are maintained in `BasePage` to reduce duplicate code across Page Objects.

Currently implemented reusable methods include:

- `click()`
- `type()`
- `getText()`
- `isDisplayed()`
- `getAttribute()`
- `pressEnter()`
- `selectByValue()`
- `getSelectedOption()`

Reusable methods use explicit waits where appropriate before interacting with elements.

## Selenium Scenarios Automated

The framework currently contains hands-on automation for:

- Basic browser interactions
- Dropdown handling
- JavaScript Alerts
  - Alert
  - Confirm
  - Prompt
- iFrames
- Multiple browser windows
- Actions class
  - Right click
  - Double click
  - Drag and drop
- JavaScriptExecutor
- File upload
- File download
- Web Tables
  - Reading rows and columns
  - Retrieving row data dynamically
  - Retrieving cell values
  - Finding data based on another column
  - Row-specific actions
  - Collecting column values
  - Counting rows based on conditions
- Screenshot capture on test failure

## Wait Handling

`WaitUtils` provides reusable explicit-wait functionality, including:

- Wait for element visibility
- Wait for element clickability
- Wait for element invisibility
- Wait for JavaScript alerts
- Wait for file downloads

## Logging

Logging is implemented using **Log4j2** to provide useful information during test execution and debugging.

## Test Failure Handling

A TestNG listener is used to handle test events.

The framework supports capturing screenshots when a test fails, making debugging easier.

## Configuration

Framework configuration is managed using:

```text
config.properties
```

This allows configuration such as the application URL and browser-related settings to be maintained separately from test code.

## How to Run

### 1. Clone the repository

```bash
git clone <repository-url>
```

### 2. Open the project

Open the project in IntelliJ IDEA as a Maven project.

### 3. Verify Java

The project currently uses:

```text
Java 17
```

### 4. Run tests

Tests can currently be executed directly through IntelliJ/TestNG.

Individual test classes are available under:

```text
src/test/java/com.shreya/tests
```

## Current Learning Progress

### Completed

- Selenium WebDriver fundamentals
- Locators and element interactions
- Page Object Model
- DriverFactory
- BaseTest
- BasePage
- ConfigReader
- Explicit waits
- Log4j2 logging
- Dropdowns
- Actions class
- JavaScriptExecutor
- Alerts
- iFrames
- Multiple windows
- File upload and download
- Web Tables
- Screenshots on failure
- TestNG Listener
- Reusable Selenium methods
- Framework inheritance using `BasePage`

### Next

- Advanced TestNG
- DataProvider and data-driven testing
- TestNG groups and parameters
- Retry mechanism
- Test suite configuration
- Java concepts for automation/SDET
- Reporting improvements
- Maven test execution
- REST Assured API automation
- Cucumber BDD
- CI/CD with Jenkins
- SDET interview preparation

## Purpose of This Project

The purpose of this project is to strengthen practical automation skills by building a Selenium framework from scratch rather than only practicing isolated Selenium commands.

