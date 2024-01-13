import java.io.*; // 因為外部寫入這個動作很可能會發生輸入輸出的異常情況 所以很多範例中都會建議編寫try-catch在主程式中去幫助運作

public class Ex14_6 {
    public static void main(String args[])
    {
        char hi[] = {'H', 'e', 'l', 'l', 'o', ',', 'J', 'a', '!','\r', '\n'};
        String fileName = "hello.txt";

        try
        {
            //使用io包中的FileWriter類別來幫助"寫入"程式
            FileWriter writer = new FileWriter(fileName); //建立寫入動作類別物件
            writer.write(hi); //將前面寫的字串使用write方法導入"寫入物件"的變數
            writer.close(); //關閉使用中的資源分配動作
            /*
            通常情況下，只有在你打開、建立或分配了某些資源後，才需要在適當的時候
            使用 close() 方法來釋放這些資源。 這些資源可以包括檔案、網路連線、
            資料庫連線、流、執行緒等等
            */

            System.out.println("字符成功寫入: " + fileName); //這裡只是打印剛剛的字串 而不是打印寫入完的檔案的內容 因為題目沒有說要打印輸入好的文件中的內容
        }
        catch(IOException e)
        {
            System.err.println("寫入文件發生錯誤" + e.getMessage());
            e.printStackTrace(); //如果發生錯誤就在錯誤回報中"打印堆疊的錯誤軌跡"
        }
    }
}
