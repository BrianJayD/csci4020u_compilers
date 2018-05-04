ANTLR=../../antlr-4.7.1-complete.jar

csv: step1 step2 step3

step1:
	java -jar $(ANTLR) Csv.g4

step2:
	javac -cp $(ANTLR):. Main.java

step3:
	java -cp $(ANTLR):. Main input.txt 2

var: step4 step5 step6

step4:
	java -jar $(ANTLR) Variables.g4

step5:
	javac -cp $(ANTLR):. Calculator.java

step6:
	java -cp $(ANTLR):. Calculator math.txt

clean:
	rm *.class Csv*.java *.interp *.tokens
