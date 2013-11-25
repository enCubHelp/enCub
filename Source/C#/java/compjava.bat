@cls
@set JAVA_SRC=Repository\%1%
@echo %DATE: =0% %TIME: =0%
@echo javac -d . -cp "C:\Users\MIR\Documents\Visual Studio 2010\Projects\enCub\java;C:\Users\MIR\Documents\Visual Studio 2010\Projects\enCub\java\commons-codec-1.8.jar;C:\Users\MIR\Documents\Visual Studio 2010\Projects\enCub\java\antlr-4.1-complete.jar" %JAVA_SRC%.java
@javac -d . -cp "C:\Users\MIR\Documents\Visual Studio 2010\Projects\enCub\java;C:\Users\MIR\Documents\Visual Studio 2010\Projects\enCub\java\commons-codec-1.8.jar;C:\Users\MIR\Documents\Visual Studio 2010\Projects\enCub\java\antlr-4.1-complete.jar" %JAVA_SRC%.java
@echo %DATE: =0% %TIME: =0%
