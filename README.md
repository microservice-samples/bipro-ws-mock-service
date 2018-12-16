# bipro-ws-mock-service
this service provide response data for BiN430.5

# Run functional tests with
mvn com.smartbear.soapui:soapui-maven-plugin:4.6.1:test

#loadtests with
mvn com.smartbear.soapui:soapui-maven-plugin:4.6.1:loadtest

# MockServices with
mvn com.smartbear.soapui:soapui-maven-plugin:4.6.1:mock

#Tipp
The plugin will load the specified project file and run all TestCases available in all TestSuites. If you want to narrow down which TestSuites/TestCases/LoadTest to run, use the testSuite, testCase and loadTest properties for that purpose.

# Integrated Tools

If you configure any of the integrated code generation tools in SoapUI for an interface in your project, you can invoke this code generation functionality with

mvn com.smartbear.soapui:soapui-maven-plugin:4.6.1:tool


# Plugin Goals

* test : Runs the SoapUI tests as specified by the plugin properties. Internally invokes the SoapUITestCaseRunner class as described there.

* loadtest : Runs the SoapUI loadtests as specified by the plugin properties. Internally invokes the SoapUILoadTestRunner class as described there.

* tool : Runs the specified and configured code-generation tool. Internally invokes the SoapUIToolRunner class as described there.

* mock : Runs the specified and configured code-generation tool. Internally invokes the SoapUIMockServiceRunner class as described there.

# Quelle: https://www.soapui.org/test-automation/maven/maven-2-x.html
