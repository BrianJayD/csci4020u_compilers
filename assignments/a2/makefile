ANTLR=../../antlr-4.7.1-complete.jar
G_FILE=PL.g4
MAIN=Main
GOOD=good.pl
BAD=bad.pl

compile:
	java -jar $(ANTLR) $(G_FILE)
	javac -cp $(ANTLR):. *.java

good:
	java -cp $(ANTLR):. $(MAIN) $(GOOD)

bad:
	java -cp $(ANTLR):. $(MAIN) $(BAD)


gui:
	java -cp $(ANTLR):. org.antlr.v4.gui.TestRig PL program -gui $(GOOD)

clean:
	rm *.class
