# Test Automation Framework for BDD Enviroment 
Test Automation framework that works well with BDD environment. It supports CLuecumber report for every test automation it generates. 
It supports multiple browser selection and parallel testing.


## Execution Triggers
The test can be triggered with following commands:
```bash
mvn test
```

Specified teests can be triggered with following commands:
```bash
mvn test -Dcucumber.options="--tags @smoke"
```

Specified tests with specified browser can be triggered with following commands:
```bash
mvn test -Dcucumber.options="--tags @smoke" -Dbrowser="chrome"
```

Supported browser:
| Browser         | Options String        |
| --------------- | --------------------- |
| Google Chrome   | `-Dbrowser="chrome"`  |
| Mozilla Firefox | `-Dbrowser="firefox"` |
| Ms Edge         | `-Dbroswer="edge"`    |


## Generating the Report 
After the test execution, you can generate CluClumber Test Report by executing following maven command.

```bash
mvn cluecumber-report:reporting
```

Example Report:

![screenshot](/images/report.png)

