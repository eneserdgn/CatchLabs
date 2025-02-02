CatchLabs Test Automation Project

Overview

Welcome to the CatchLabs Test Automation project! This project utilizes Cucumber, Java, Selenium, and TestNG to provide a robust framework for UI testing. It is designed to be scalable and maintainable, ensuring high-quality test automation.

Features

Behavior-Driven Development (BDD) using Cucumber

Page Object Model (POM) architecture for modular and reusable test scripts

TestNG integration for powerful test execution

Selenium WebDriver for browser automation

Maven for dependency management and build automation

Parallel Test Execution using TestNG

Tag-based Test Execution

Browser Configuration from config.properties

Project Structure

CatchLabs/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── utils/               # Utility classes
│   │   └── resources/               # Configuration files
│           └── config.properties    # Browser and environment settings

│   └── test/
│       ├── java/
│       │   ├── pages/              # Page classes
│       │   ├── pageObjects/        # Page elements
│       │   ├── stepDefinitions/    # Step definition classes
│       │   └── runner/             # TestNG and Cucumber runners
│       └── resources/
│           ├── features/           # Feature files
│
├── pom.xml                          # Maven dependencies
├── testng.xml          # TestNG configuration file
└── README.md                        # Project documentation

Getting Started

Prerequisites

Java JDK 8+

Maven 3.6+

IDE (IntelliJ IDEA, Eclipse, etc.)

Git

Setup

Clone the repository:

git clone https://github.com/eneserdgn/CatchLabs.git

Navigate to the project directory:

cd CatchLabs

Install dependencies:

mvn clean install

Running Tests

Run all tests:

mvn test

Run tests by tag:

To execute specific scenarios using Cucumber tags, use:

mvn test -Dcucumber.options="--tags @tagname"

Run tests in parallel:

You can define the number of parallel threads in testng.xml:

<suite name="Parallel Suite" parallel="tests" thread-count="2">

Set browser from config.properties:

Define the browser type in config.properties:

browser=chrome

Reporting

Test execution reports are generated using Cucumber Reports and can be found in the target/cucumber-reports/ directory.

Contributing

Feel free to open issues or submit pull requests. Contributions are welcome!

License

This project is licensed under the MIT License.

Happy Testing! 🚀

