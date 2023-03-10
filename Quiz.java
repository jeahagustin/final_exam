public class Quiz
{
	private int id, maxScore, totalScore;
	private Student student;
	
	public Quiz(int id, Student student, int maxScore, int totalScore){
		this.id = maxScore;
		this.maxScore = maxScore;
		this.totalScore = totalScore;
		this.student = student;
	}
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}
	public int getMaxScore(){
		return maxScore;
	}
	public void setMaxScore(int maxScore){
		this.maxScore = maxScore;
	}
	public int getTotalScore(){
		return totalScore;
	}
	public void setTotalScore(int totalScore){
		this.totalScore = totalScore;
	}
	public double grade(){
		return totalScore * 100 / maxScore;
	}
}
