java -jar -Dwebdriver.chrome.driver=C:\binary\drivers\chromedriver.exe   -Dwebdriver.ie.driver=C:\binary\drivers\IEDriverServer.exe   -Dwebdriver.gecko.driver=C:\binary\drivers\geckodriver.exe     -jar C:\binary\selenium-server-standalone.jar  -role node -hub http://localhost:4444/grid/register    -port    4411         -browser    "browserName=chrome,version=ANY,platform=WINDOWS,maxInstances=5"    -browser    "browserName=internet explorer,version=ANY,platform=WINDOWS,maxInstances=5"    -browser    "browserName=firefox,version=ANY,platform=WINDOWS,maxInstances=5"     -browser    "browserName = MicrosoftEdge, version=ANY, platform = WINDOWS, maxInstances = 10"   