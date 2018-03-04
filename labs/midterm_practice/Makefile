ANTLR=../antlr-4.7.1-complete.jar
G_FILE=Midterm.g4
MAIN=Main
JSON=dummy.JSON

compile:
	java -jar $(ANTLR) $(G_FILE)
	javac -cp $(ANTLR):. *.java

run:
	java -cp $(ANTLR):. $(MAIN) $(JSON)

gui:
	java -cp $(ANTLR):. org.antlr.v4.gui.TestRig Midterm section -gui $(JSON)

clean:
	rm *.class
