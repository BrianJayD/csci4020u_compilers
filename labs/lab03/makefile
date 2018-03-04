ANTLR=../../antlr-4.7.1-complete.jar
G_FILE=Calc.g4
INPUT=input.txt
MAIN=Main

compile:
	java -jar $(ANTLR) $(G_FILE)
	javac -cp $(ANTLR):. *.java

run:
	java -cp $(ANTLR):. $(MAIN) $(INPUT)

gui:
	java -cp $(ANTLR):. org.antlr.v4.gui.TestRig Calc prog -gui input.txt

clean:
	rm *.class
