ANTLR=../../antlr-4.7.1-complete.jar
CP= -cp $(ANTLR):.

all:
	java -jar $(ANTLR) *.g4
	javac $(CP) *.java

run:
	java $(CP) CalcParser;

clean:
	rm -f Calc*.java *.tokens
