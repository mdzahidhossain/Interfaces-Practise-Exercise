package ExerciseTenTwo;

public class Quiz implements Measurable
{

    private double score;
    private String letterGrade;

    public Quiz()
    {

    }
    public Quiz(double quizScore, String quizLetterGrade)
    {
        this.score = quizScore;
        this.letterGrade = quizLetterGrade;
    }

    public void setScore(double score)
    {
        this.score = score;
    }

    public double getScore()
    {
        return this.score;
    }
    public void setLetterGrade(String letterGrade)
    {
        this.letterGrade = letterGrade;
    }
    public String getLetterGrade()
    {
        return this.letterGrade;
    }
    public void determineLetterGrade()
    {
        if(this.score > 90)
        {
            this.letterGrade = "A";
        }
        else if(this.score > 85)
        {
            this.letterGrade = "B+";
        }
        else if(this.score > 80)
        {
            this.letterGrade = "B";
        }
        else if(this.score > 75)
        {
            this.letterGrade = "C+";
        }
        else if(this.score > 70)
        {
            this.letterGrade = "C";
        }
        else if(this.score >= 65)
        {
            this.letterGrade = "F+";
        }
        else if(this.score < 65)
        {
            this.letterGrade = "F";
        }
    }

    public void processGrade(double score)
    {
        this.score = score;

        determineLetterGrade();
    }

    @Override
    public double getMeasure()
    {
        return this.score;
    }
}
