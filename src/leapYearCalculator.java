public class leapYearCalculator {
    public static void main(String[] args) {
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(1700));
    }

    public static boolean isLeapYear(int year){
        boolean result = false;
        if(year > 1 && year < 9999) {

            if (year % 4 == 0) {//step1
                if(year % 100 == 0){ //step2
                    if(year % 400 == 0){//step3
                        //step 4
                        result = true;
                    }
                }
                else{ //step4
                    result = true;
                }
            }
            else { //step 5

            }
        }

        else{
            result = false;
        }
        return result;
    }
}