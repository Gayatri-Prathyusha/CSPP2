import java.util.Scanner;
/**
 * Class for question.
 */
class Question {
    /**
     * { var_description }.
     */
    private String questiontext;
    /**
     * { var_description }.
     */
    private String[] choices;
    /**
     * { var_description }.
     */
    private int correctAnswer;
    /**
     * { var_description }.
     */
    private int maxMarks;
    /**
     * { var_description }.
     */
    private int penalty;
    /**
     * { var_description }.
     */
    private String response;
    /**
     * Constructs the object.
     */
    Question() {

    }
    /**
     * Constructs the object.
     *
     * @param      question1       The question 1
     * @param      choices1        The choices 1
     * @param      correctAnswer1  The correct answer 1
     * @param      maxMarks1       The maximum marks 1
     * @param      penalty1        The penalty 1
     */
    Question(final String question1, final String[] choices1,
        final int correctAnswer1, final int maxMarks1, final int penalty1) {
        questiontext = question1;
        choices = choices1;
        correctAnswer = correctAnswer1;
        maxMarks = maxMarks1;
        penalty = penalty1;


    }
    /**
     * { function_description }.
     *
     * @param      choice  The choice
     *
     * @return     { description_of_the_return_value }
     */
    public boolean evaluateResponse(final String choice) {
        int cho = Integer.parseInt(choice);
        if(cho == correctAnswer) {
            return true;
        }
        return false;
    }
    /**
     * Gets the correct answer.
     *
     * @return     The correct answer.
     */
    public int getCorrectAnswer() {
         return correctAnswer;
    }
    /**
     * Gets the question text.
     *
     * @return     The question text.
     */
    public String getQuestionText() {
            return this.questiontext;
        }
    /**
     * Gets the choice.
     *
     * @return     The choice.
     */
    public String[] getChoice() {
        return this.choices;
    }
    /**
     * Gets the maximum marks.
     *
     * @return     The maximum marks.
     */
    public int getMaxMarks() {
        return this.maxMarks;
    }
    /**
     * Gets the penalty.
     *
     * @return     The penalty.
     */
    public int getPenalty() {
        return this.penalty;
    }
    /**
     * Sets the response.
     *
     * @param      answer  The answer
     */
    public void setResponse(final String answer) {
        this.response = answer;

    }
    /**
     * Gets the response.
     *
     * @return     The response.
     */
    public String getResponse() {
        return this.response;
    }
    /**
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        String s = "";
        s = questiontext + "(" + maxMarks + ")" + "\n";
        for(int i=0;i<choices.length-1;i++) {
            s+= choices[i] + "\t";
        }
        s += choices[choices.length-1] + "\n";
        return s;
    }
}
/**
 * Class for quiz.
 */
class Quiz {
    /**
     * { var_description }.
     */
    private final int onehundred = 100;
    /**
     * { var_description }.
     */
    private Question[] questions;
    /**
     * { var_description }.
     */
    private int size;
    /**
     * Constructs the object.
     */
    Quiz() {
        size = 0;
        questions = new Question[onehundred];
    }
    /**
     * Adds a question.
     *
     * @param      q     The question
     */
    public int size() {
        return size;
    }
    public void addQuestion(final Question q) {
        questions[size++] = q;

    }
    /**
     * Gets the question.
     *
     * @param      index  The index
     *
     * @return     The question.
     */
    public Question getQuestion(final int index) {
        return questions[index];
    }
    /**
     * Shows the report.
     *
     * @return     { description_of_the_return_value }
     */
    public String showReport() {
        String s = "";
        return s;
    }

}
/**
 * Solution class for code-eval.
 */
public final class Solution {
     /**
     * Constructs the object.
     */
    private Solution() {
        // leave this blank
    }
    /**
     * main function to execute test cases.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
         // instantiate this Quiz
        Quiz q = new Quiz();
         // code to read the test cases input file
        Scanner s = new Scanner(System.in);
        // check if there is one more line to process
        while (s.hasNext()) {
            // read the line
            String line = s.nextLine();
             // split the line using space
            String[] tokens = line.split(" ");
              // based on the list operation invoke the corresponding method
            switch (tokens[0]) {
                case "LOAD_QUESTIONS":
                System.out.println("|----------------|");
                System.out.println("| Load Questions |");
                System.out.println("|----------------|");
                loadQuestions(s, q, Integer.parseInt(tokens[1]));
                break;
                case "START_QUIZ":
                System.out.println("|------------|");
                System.out.println("| Start Quiz |");
                System.out.println("|------------|");
                startQuiz(s, q, Integer.parseInt(tokens[1]));
                break;
                case "SCORE_REPORT":
                System.out.println("|--------------|");
                System.out.println("| Score Report |");
                System.out.println("|--------------|");
                displayScore(q);
                break;
                default:
                break;
            }
        }
    }
    /**
     * Loads questions.
     *
     * @param      scan       The scan
     * @param      quiz       The quiz
     * @param      q          The question count
     *
     */
    public static void loadQuestions(final Scanner scan,
        final Quiz quiz, int q) {
        if(q == 0) {
            System.out.println("Quiz does not have questions");
        }
        for (int i = 0; i < q; i++) {
            String ques = scan.nextLine();
            String[] quesToken = ques.split(":");
            String[] choice = quesToken[1].split(",");
            //System.out.println(quesToken[0]);
            if(quesToken[0].equals("") || choice.length == 0 || quesToken[2].equals("") || quesToken[3].equals("") || quesToken.length < 5) {
                System.out.println("Error! Malformed question");
            }
            if(choice.length < 2) {
                System.out.println(quesToken[0] + "does not have enough answer choices");
            }
            if(Integer.parseInt(quesToken[2]) < 1 || Integer.parseInt(quesToken[2]) > choice.length) {
                System.out.println("Error! Correct answer choice number is out of range for " + quesToken[0]);
            }
            if(Integer.parseInt(quesToken[3]) <= 0) {
                System.out.println("Invalid max marks for " + quesToken[0]);
            }
            if (Integer.parseInt(quesToken[4]) > 0) {
                System.out.println("Invalid penalty for " + quesToken[0]);
            } else {
        Question qes = new Question(quesToken[0], quesToken[1].split(",") , Integer.parseInt(quesToken[2]),
        Integer.parseInt(quesToken[3]), Integer.parseInt(quesToken[4]));
        quiz.addQuestion(qes);
        } 
    }
    System.out.println(q + " are added to the quiz");
    return;
    }
    /**
     * Starts a quiz.
     *
     * @param      scan  The scan
     * @param      quiz  The quiz
     * @param      q     The answer count
     */
    public static void startQuiz(final Scanner scan,
        final Quiz quiz, final int q) {
        if (quiz.size() <= 0) {
            return;
        }
        // write your code here to display the quiz questions on the console.
        // read the user responses from the console using scanner object.
        // store the user respone in the question object
        for(int i = 0; i < q; i++) {
            System.out.println(quiz.getQuestion(i));
            String userresponse = scan.nextLine();
            //String[] userchoice = userresponse.split(" ");
            quiz.getQuestion(i).setResponse(userresponse);
        } 
    }
    /**
     * Displays the score report.
     *
     * @param      quiz     The quiz object
     */
    public static void displayScore(final Quiz quiz) {
        if (quiz.size() <= 0) {
            return;
        }
        int totalscore = 0;
        String s = "";
        for(int i = 0; i < quiz.size(); i++) {
        //System.out.println(quiz.getQuestion(i).getResponse());
        Question q1 = quiz.getQuestion(i);
        String[] choic = q1.getChoice();

        if(q1.getResponse().equals(choic[q1.getCorrectAnswer() - 1])) {
        s = q1.getQuestionText() + "\n" + " Correct Answer! - Marks Awarded: "
         + q1.getMaxMarks();
         totalscore += q1.getMaxMarks(); 

        } else {
        s = q1.getQuestionText() + "\n" + " Wrong Answer! - Penalty: " 
         + q1.getPenalty(); 
         totalscore += q1.getPenalty(); 

        }
        System.out.println(s);
        
    }
    System.out.println("Total Score: " +totalscore);
    }
}
