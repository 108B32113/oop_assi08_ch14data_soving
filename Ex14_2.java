import java.util.Scanner;

public class Ex14_2
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in); //參數由系統默認載入的 建構元不用寫
        String inputString = scan.nextLine(); //讀取用戶輸入的字串的方法
        String upperCaseString = inputString.toUpperCase(); //變成大寫的方法 調用要寫在等號右側 不是變數那裡
        System.out.println(upperCaseString);
        scan.close(); //關閉使用scnaner來輸入的方法 減少耗能
    }
}

//如果本來就是大寫 輸入後還是大寫