public class GradeCalculator{
  public double calculateAverage(int[] grade){
    if (grade == null || grade.length == 0){
      return 0;
    }

    int total1 = 0;
    for (int g : grade){
        total1 += g;
    }

    return (double) total1 / grade.length;
  }

  public String getGrade(double average){
    if (average >=80){
        return "A";
      }
      else if (average >= 70){
        return "B";
      }
      else if (average >= 60){
        return "C";
      }
      else if (average >=50){
        return "D";
      }
      else {
        return "F";
      }
  }
}