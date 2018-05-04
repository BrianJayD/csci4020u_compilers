ANTLR=../../antlr-4.7.1-complete.jar
PL=PL
MAIN=Main
TEST=samples/test.sample
FILE1=samples/1.sample
FILE2=samples/2.sample
FILE3=samples/3.sample
FILE4=samples/4.sample
FILE5=samples/5.sample


compile:
	java -jar $(ANTLR) $(PL).g4
	javac -cp $(ANTLR):. $(MAIN).java

test:
	java -cp $(ANTLR):. $(MAIN) $(TEST)

file1:
	java -cp $(ANTLR):. $(MAIN) $(FILE1)

file2:
	java -cp $(ANTLR):. $(MAIN) $(FILE2)

file3:
	java -cp $(ANTLR):. $(MAIN) $(FILE3)

file4:
	java -cp $(ANTLR):. $(MAIN) $(FILE4)

file5:
	java -cp $(ANTLR):. $(MAIN) $(FILE5)


clean:
	rm -f $(GRAMMAR)*.java *.tokens *.class
