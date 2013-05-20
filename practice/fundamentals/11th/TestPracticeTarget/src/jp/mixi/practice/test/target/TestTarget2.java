package jp.mixi.practice.test.target;

/**
 * TODO: TestPractice2 の各テストケースをパスするメソッドを書く
 */
public class TestTarget2 {
    public boolean isValidLength(String string) {
        int maxLength = 10;
        if(string.length() == 0){
            return false;
        }
        if(string.length() > maxLength){
            return false;
        }
        return true;
    }

    public String formatTextCount(int count, int max) {
        return Integer.toString(count) + " / " + Integer.toString(max);
    }
}