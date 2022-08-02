import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Game game = new Game();

        // 회원가입 또는 로그인 메소드
        game.intro();

        Base gm = new Base(DBConn.marble,10, DBConn.userName);

        //게임 시작 메소드
        gm.gameStart();
    }
}
