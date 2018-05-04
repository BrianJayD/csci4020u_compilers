ANTLR=../../antlr-4.7.1-complete.jar
MAIN=Main

compile:
	@java -jar $(ANTLR) Calc.g4
	@javac -cp $(ANTLR):. *.java

run:
	@java -cp $(ANTLR):. $(MAIN) input.txt
