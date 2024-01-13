import java.util.Scanner; // 這是io類別庫中的其中一個類別
import java.io.File; // 接下來的實作常常會用到這個

public class Ex14_3
{
    public static void main(String argsp[])
    {
        Scanner scan = new Scanner(System.in);

        String inputString = scan.nextLine();
        int num = Integer.parseInt(inputString); // java現在要將其他type轉成int 需要用這個指令
        
        
        if(num >= 3)
        {
            int sum = 0;
            for(int i=1; i<=num; i++) // for當中的i也要被給予type //記得是從1開始加 所以要int i=1
            {
                sum += i;
            }
            System.out.println(sum);
        }else
        {
            System.out.println("請至少輸入大於等於3的整數，不然接下來的計算程式無法正確執行");
        }
        
        scan.close();
    }
}
