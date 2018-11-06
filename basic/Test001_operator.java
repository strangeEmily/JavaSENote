package basic;

public class Test001_operator {
    public static void main(String[] args){
//        double grade = 80;
//        if ( grade >= 90 ){
//            System.out.println('A');
//        }else if ( grade >= 80 ){
//            System.out.println('B');
//        }else {
//            System.out.println('C');
//        }

        //mode
        double score = 20;
        String grade = null;
        if ( score < 0 || score > 100){
            grade = "ERROR";
        }else if (score >= 90){
            grade = "A";
        }else if (score >= 80){
            grade = "B";
        }else {
            grade = "C";
        }
        System.out.println(grade);
    }

}
