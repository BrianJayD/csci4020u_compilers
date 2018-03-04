ANTLR=../../antlr-4.7.1-complete.jar
G_FILE=Hello.g4
MAIN_FILE=Main
INPUT_FILE=input.c

compile:
	java -jar $(ANTLR) $(G_FILE)
	javac -cp .:$(ANTLR) *.java

run:
	java -cp .:$(ANTLR) $(MAIN_FILE) $(INPUT_FILE)
