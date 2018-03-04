ANTLR=../../antlr-4.7.1-complete.jar
G_FILE=PL.g4
MAIN=Main
GOOD=good.pl

compile:
	java -jar $(ANTLR) $(G_FILE)
	javac -cp $(ANTLR):. *.java

run:
	java -cp $(ANTLR):. $(MAIN) $(GOOD)

gui:
	java -cp $(ANTLR):. org.antlr.v4.gui.TestRig PL section -gui $(GOOD)

clean:
	rm *.class
