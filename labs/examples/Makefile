ANTLR=../../antlr-4.7.1-complete.jar

csv: step1 step2 step3

step1:
	java -jar $(ANTLR) Func.g4

step2:
	javac -cp $(ANTLR):. Main.java

step3:
	java -cp $(ANTLR):. Main input.txt
	
clean:
	rm *.class Csv*.java *.interp *.tokens
