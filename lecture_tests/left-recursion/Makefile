ANTLR=../../antlr-4.7.1-complete.jar
FACTOR=Factor
MAIN=Main
ONE=samples/1.test

factor:
	java -jar $(ANTLR) $(FACTOR).g4
	javac -cp $(ANTLR):. $(MAIN).java

run-factor:
	java -cp $(ANTLR):. $(MAIN) $(ONE)
