package ch20.oracle.sec12;

public class BoardExample1 {
    // Field

    // Constructor

    public static void main(String[] args) {
        BoardExample1 boardExample = new BoardExample1();
        boardExample.list();
    }

    // Method		
    public void list() {
        System.out.println();
        System.out.println("[게시물 목록]");
        System.out.println("-----------------------------------------------------------------------");
        System.out.printf("%-6s%-12s%-16s%-40s\n", "no", "writer", "date", "title");
        System.out.println("-----------------------------------------------------------------------");
        System.out.printf("%-6s%-12s%-16s%-40s \n",
                "1", "winter", "2022.01.27", "게시판에 오신 것을 환영합니다.");
        System.out.printf("%-6s%-12s%-16s%-40s \n",
                "2", "winter", "2022.01.27", "올 겨울은 많이 춥습니다.");
        mainMenu();
    }

    public void mainMenu() {
        System.out.println();
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("메인메뉴: 1.Create | 2.Read | 3.Clear | 4.Exit");
        System.out.print("메뉴선택: ");
        System.out.println();
    }
}

