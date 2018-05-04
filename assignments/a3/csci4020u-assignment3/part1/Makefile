ANTLR=../../../../antlr-4.7.1-complete.jar
CALC1=Calc1.g4
GRAMMAR=Calc1
APP1=App1
FILE1=../1.calc
FILE2=../2.calc
FILE3=../3.calc
FILE4=../4.calc
FILE5=../5.calc
TEST=../test.calc

compile:
	java -jar $(ANTLR) $(CALC1)
	javac -cp $(ANTLR):. $(APP1).java

file1:
	java -cp $(ANTLR):. $(APP1) $(FILE1)

file2:
	java -cp $(ANTLR):. $(APP1) $(FILE2)

file3:
	java -cp $(ANTLR):. $(APP1) $(FILE3)

file4:
	java -cp $(ANTLR):. $(APP1) $(FILE4)

file5:
	java -cp $(ANTLR):. $(APP1) $(FILE5)

test:
	java -cp $(ANTLR):. $(APP1) $(TEST)

clean:
	rm -f $(GRAMMAR)*.java *.tokens *.class *.interp
