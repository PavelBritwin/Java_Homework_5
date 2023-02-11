package Java_homework_5;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task3 {
    static char[][] chessBoard = new char[8][8];
    static Map<Integer, Integer> coordintatesMap = new LinkedHashMap<>();
    static Integer queens = 0;
    static ArrayList<Integer> listOfQueens = new ArrayList<>();
    public static void main(String[] args) {
        returnResult();
        clearChessBoard();
        System.out.println("Result: ");
        for (var item : coordintatesMap.entrySet())
        {
            chessBoard[item.getKey()][item.getValue()] = 'X';
        }
        showChessBoard();
}
    public static void returnResult()
    {
        for (int startI = 0; startI < 8; startI++)
        {
            for (int startJ = 0; startJ < 8; startJ++)
            {
                clearChessBoard();
                coordintatesMap.clear();
                queens = 1;
                putQueen(startI, startJ);
                showChessBoard();
                while (true)
                {
                    if (checkNextField()[0] == -1)
                        break;
                    putQueen(checkNextField()[0],checkNextField()[1]);
                    showChessBoard();
                    queens++;
                }
                listOfQueens.add(queens);
                System.out.println(coordintatesMap);
                if (queens == 8)
                    return;
            }
        }
        System.out.println(listOfQueens);
    }
    public static void clearChessBoard()
    {
        for (int i = 0; i < chessBoard.length; i++)
        {
            for (int j = 0; j < chessBoard.length; j++)
            {
                chessBoard[i][j] = '0';
            }
        }
    }
    public static void showChessBoard()
    {
        for (int i = 0; i < chessBoard.length; i++)
        {
            for (int j = 0; j < chessBoard.length; j++)
            {
                if (chessBoard[i][j] == 'X')
                    System.out.print("\u001B[31m" + chessBoard[i][j] + "  "+ "\u001B[0m");
                else   
                System.out.print(chessBoard[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static int[] checkNextField()
    {
        int[] arr = new int[2];
        for (int i = 0; i < chessBoard.length; i++)
        {
            for (int j = 0; j < chessBoard.length; j++)
            {
                if (chessBoard[i][j] == 'X')
                    continue;
                else
                {
                    arr[0] = i;
                    arr[1] = j;
                    return arr;
            }
        }
    }
        arr[0] = -1;
        arr[1] = -1;
        return arr;
}
    public static void putQueen(int x, int y)
    {
        coordintatesMap.put(x, y);
        for (int i = 0; i < chessBoard.length; i++)
        {
            for (int j = 0; j < chessBoard.length; j++)
            {
                if (chessBoard[i][j] != 'X')
                {
                    if (i == x)
                    {
                        chessBoard[i][j] = 'X';
                        continue;
                    }
                    if (j == y)
                    {
                        chessBoard[i][j] = 'X';
                        continue;
                    }
                    if (j == i + (y - x))
                    {
                        chessBoard[i][j] = 'X';
                        continue;
                    }
                    if (j == (x + y) - i)
                    {
                        chessBoard[i][j] = 'X';
                    }
                }
            }
        }
       

    }
}
