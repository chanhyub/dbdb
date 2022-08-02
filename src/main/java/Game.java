import java.util.Objects;
import java.util.Scanner;

public class Game {
    String userCheck;
    String idCheck;
    String pwCheck;
    Scanner scanner = new Scanner(System.in);
    public void intro(){
        System.out.println("오징어 게임에 오신 것을 환영합니다.");
        System.out.print("아이디가 있습니까? (Y/N) >> ");
        userCheck = scanner.next();

        if (userCheck.equals("N")) {
            register();
            System.out.println("회원가입이 완료되었습니다.");
            System.out.println("게임을 시작하기 위해 아이디 패스워드를 입력해주세요.");
            start();
        } else if (userCheck.equals("Y")) {
            System.out.println("게임을 시작하기 위해 아이디 패스워드를 입력해주세요.");
            start();
        }
        else{
            System.out.println("대소문자를 구분하여 정확히 입력해주세요.");
            intro();
        }
    }

    public void register(){
        System.out.println("회원 가입을 진행하겠습니다.");
        System.out.print("아이디 입력 >> ");
        String userId = scanner.next();
        System.out.print("패스워드 입력 >> ");
        String userPw = scanner.next();
        System.out.print("이름 입력 >> ");
        String name = scanner.next();

        DBConn.save(userId, userPw, name);

    }

    public void start(){
        while (DBConn.id == 0) {
            System.out.print("아이디를 입력해주세요. >>");
            idCheck = scanner.next();
            System.out.print("패스워드를 입력해주세요. >>");
            pwCheck = scanner.next();

            DBConn.idcheck(idCheck, pwCheck);
        }
    }


}
