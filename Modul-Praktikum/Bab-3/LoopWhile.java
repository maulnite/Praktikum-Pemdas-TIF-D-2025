public class LoopWhile{
    public static void main(String[] args){
        int nilai = 0;
        while(nilai < 10){
        if(nilai % 2 != 0) {
            nilai++;
            continue;
        } else {
            System.out.println(nilai);
        }

        nilai++;

        }
    }
}
