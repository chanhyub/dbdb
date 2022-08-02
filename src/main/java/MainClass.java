import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        String userName;
        int marble;

        Game game = new Game();
        // 회원가입 또는 로그인 메소드
        game.intro();

        // 입력한 아이디, 패스워드에 맞는 이름과 구슬 갯수 로드
        userName = DBConn.userName;
        marble = DBConn.marble;

        Base gm = new Base(marble,10, userName);
        //게임 시작 메소드
        gm.gameStart();
    }
}
