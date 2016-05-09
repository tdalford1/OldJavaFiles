import java.util.Scanner;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GobbletGame 
{
	static Gobbler[][][] board = new Gobbler[3][3][3];
	static int[] blueGobbAmt = new int[3];
	static int[] orangeGobbAmt = new int[3];
	/*JPanel panel;
	JButton[] button;
	int count = 0;
	int sign = 0;
	ImageIcon smallBlueIcon;
	ImageIcon smallOrangeIcon;
	ImageIcon mediumBlueIcon;
	ImageIcon mediumOrangeIcon;
	ImageIcon largeBlueIcon;
	ImageIcon largeOrangeIcon;
	static Icon firstGobblerImage;
	static Icon secondGobblerImage;
	static int firstButtonIndex;
	static int secondButtonIndex;
	static Gobbler firstGobbler = null;
	static Gobbler secondGobbler = null;
	int firstX = -1;
	int firstY = -1;
	int secondX;
	int secondY;
	*/
	
	/*public GobbletGame() 
	{
		//configure images into icons
		java.net.URL imageURL = GobbletGame.class.getResource("SmallBlue.png");
		smallBlueIcon = new ImageIcon(imageURL);
		imageURL = GobbletGame.class.getResource("SmallOrange.png");
		smallOrangeIcon = new ImageIcon(imageURL);
		imageURL = GobbletGame.class.getResource("MediumBlue.png");
		mediumBlueIcon = new ImageIcon(imageURL);
		imageURL = GobbletGame.class.getResource("MediumOrange.png");
		mediumOrangeIcon = new ImageIcon(imageURL);
		imageURL = GobbletGame.class.getResource("LargeBlue.png");
		largeBlueIcon = new ImageIcon(imageURL);
		imageURL = GobbletGame.class.getResource("LargeOrange.png");
		largeOrangeIcon = new ImageIcon(imageURL);
		panel = new JPanel();
		panel.setLayout(new GridLayout(4,4));
		this.add(panel);
		button = new JButton[16];
		//initialize blank buttons
		for(int i = 0; i <= 15; i++)
		{
			button[i] = new JButton();
		}
		//create buttons with icons
		button[1] = new JButton(smallBlueIcon);
		button[2] = new JButton(mediumBlueIcon);
		button[3] = new JButton(largeBlueIcon);
		button[4] = new JButton(smallOrangeIcon);
		button[8] = new JButton(mediumOrangeIcon);
		button[12] = new JButton(largeOrangeIcon);
		
		
		for(int i = 0; i <= 15; i++)
		{
			panel.add(button[i]);
			button[i].setEnabled(true);
			button[i].addActionListener(this);
		}
		this.pack();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		button[0].setVisible(false);
	}
	
	
	//if first click, store the icon of the box clicked
	//if second click, transfer the stored icon onto the new Button and reconfigure variable amounts
	public void actionPerformed(ActionEvent e){
		count++;
		if (count == 1)
		{
			for(int i = 1; i <= 15; i++)
			{
				if(button[i] == e.getSource())
				{
					firstButtonIndex = i;
					firstGobbler = getGobblerFromButton(firstButtonIndex);
					if (isOnBoard(i))
					{
					firstX = getXFromButton(firstButtonIndex);
					firstY = getYFromButton(firstButtonIndex);
					}
					firstGobblerImage = button[i].getIcon();
				}
			}
		}
		else
		{
		for(int i = 0; i <= 15; i++)
		{
			if(button[i] == e.getSource())
			{
				secondGobblerImage = button[i].getIcon();
				secondButtonIndex = i;
				secondX = getXFromButton(secondButtonIndex);
				secondY = getYFromButton(secondButtonIndex);
				if (getTopIndex(secondX, secondY) != -1)			
				{
					secondGobbler = getGobblerFromButton(secondButtonIndex);
				}
				if (firstX == -1)
				//Gobbler wasn't on board
				{
					move(firstGobbler, secondX, secondY);
					button[i].setIcon(getGobblerIcon(firstGobbler));
				}
				//gobbler was on board
				else
				{
					button[firstButtonIndex].setIcon(getGobblerIcon(board[firstX][firstY][getTopIndex(firstX, firstY)]));
					button[secondButtonIndex].setIcon(getGobblerIcon(firstGobbler));
					move(firstGobbler, firstX, firstY, secondX, secondY);
				}

			}
		}
		}
		if (count == 2)
		{
			count = 0;
		}
		checkWinner();
		sign++;
	}
	*/
	public boolean checkWinner()
	{
		/*
		for (int i = 0; i < 3; i++)
		{
			if (board[i][0][getTopIndex(i, 0)].color().equals(board[i][1][getTopIndex(i, 1)].color())
				&& board[i][1][getTopIndex(i, 1)].color().equals(board[i][2][getTopIndex(i, 2)].color()))
			{
				return true;
			}
		}
		
		for (int i = 0; i < 3; i++)
		{
			if (board[0][i][getTopIndex(0, i)].color().equals(board[1][i][getTopIndex(1, i)].color())
				&& board[1][i][getTopIndex(1, i)].color().equals(board[2][i][getTopIndex(2, i)].color()))
			{
				return true;
			}
		}
		
		for (int i = 0; i < 2; i++)
		{
			i *= 2;
			if (board[i][0][getTopIndex(0, i)].color().equals(board[1][i][getTopIndex(1, 1)].color())
				&& board[1][1][getTopIndex(1, 1)].color().equals(board[2][i][getTopIndex(2 - i, 2)].color()))
			{
				return true;
			}
		}			
		return false;
		*/
		//we will worry about this later
		return false;
	}
	
	/*public static void main(String[] args)
	{
		//initialize Gobbler amounts
		for (int i = 0; i < 3; i++)
		{
			blueGobbAmt[i] = 2;
			redGobbAmt[i] = 2;
		}
		new GobbletGame();
		run();
	}
	*/
	
	/*public static void run()
	{
		boolean hasWon = false;
		boolean isBlue = true;
		System.out.println("input a position to move a Gobbler, or input 'end' to break");
		System.out.println();
		System.out.println("Ex. 2, 0, 0 moves a Gobbler of size 2 to position (0, 0)");
		System.out.println("Ex. 2, 0, 0, 1, 1 moves a Gobbler of size 2 from position (0, 0) to position (1, 1)");
		while (hasWon == false)
		{
			Scanner myScanner = new Scanner(System.in);
			String movePos = myScanner.nextLine();
			if (movePos.indexOf("end") >= 0)
			{
				break;
			} 
			ArrayList<Integer> moveParams = new ArrayList<Integer>();
			for (int i = 0; i < movePos.length(); i++)
			{
				if (48 <= movePos.charAt(i) && movePos.charAt(i) <= 58)
				{
					moveParams.add(Character.getNumericValue(movePos.charAt(i)));
				}
			}
			String color;
			if (isBlue)
			{
				color = "Blue";
			}
			else
				color = "Orange";
			if (moveParams.size() == 3)
			{
				move(new Gobbler(color, moveParams.get(0)), moveParams.get(1), moveParams.get(2));
			}
			else if (moveParams.size() == 5)
			{
				move(new Gobbler(color, moveParams.get(0)), moveParams.get(1), moveParams.get(2), moveParams.get(3), moveParams.get(4));
			}
			else
			{
				System.out.println("Your string isn't in the correct format");
			}
			printGobblerBoard(board);
			if (isBlue == true)
			{
				isBlue = false;
			}
			else
			{
				isBlue = true;
			}
			
		}	
	}
	*/
	//moves by taking a gobbler on the board and moving it somewhere else
	public static boolean move(Gobbler gobb, int startX, int startY, int endX, int endY)
	{
		boolean hasMoved = false;
		//move to location (x, y).  if gobbSize > currentSize you play over it, 
		//otherwise you can't move
		int startIndex = getTopIndex(startX, startY);
		if (board[startX][startY][startIndex].equals(gobb))
		{
			board[startX][startY][startIndex] = null;
		}
		else
		{
			System.out.println("illegal move- no starting pos!");
			return hasMoved;
		}
		
		int endIndex = getTopIndex(endX, endY);
		if (endIndex == -1)
		{
			board[endX][endY][endIndex + 1] = gobb;			
		}
		else if (board[endX][endY][endIndex].size() < gobb.size())
		{
			board[endX][endY][endIndex + 1] = gobb;
		}
		else
		{
			System.out.println("illegal move- too big of a gobb!");
			return hasMoved;
		}
		hasMoved = true;
		return hasMoved;
			
	}
	
	//moves using a gobbler not on the board
	public static boolean move(Gobbler gobb, int endX, int endY)
	{
		boolean hasMoved = false;
		if (gobb.color() == "Orange")
		{
			if (orangeGobbAmt[gobb.size()] > 0)
			{
				orangeGobbAmt[gobb.size()]--;
			}
			else
			{
				System.out.println("Not enough orange gobbs!");
				return hasMoved;
			}
		}
		else
		{
			if (blueGobbAmt[gobb.size()] > 0)
			{
				blueGobbAmt[gobb.size()]--;
			}
			else
			{
				for (int i = 0; i < blueGobbAmt.length; i++)
				{
					System.out.println(blueGobbAmt[i]);
				}
				System.out.println("illegal move- not enough blue gobbs!");
				return hasMoved;
			}
		}
		
		int endIndex = getTopIndex(endX, endY);
		if (endIndex == -1)
		{
			board[endX][endY][endIndex + 1] = gobb;
		}
		else if (board[endX][endY][endIndex].size() < gobb.size())
		{
			board[endX][endY][endIndex + 1] = gobb;
		}
		else
		{
			System.out.println("illegal move- size doesn't work!");
			return hasMoved;
		}
		hasMoved = true;
		return hasMoved;		
	}
	
	public static int getTopIndex(int xCoord, int yCoord)
	{
		for (int i = 0; i < 3; i++)
		{
			if (board[xCoord][yCoord][i] == null)
			{
				return (i - 1);
			}
		}
		return 2;
	}
	
	public static Gobbler getTopGobbler(int xCoord, int yCoord)
	{
		for (int i = 2; i >= 0; i--)
		{
			if (board[xCoord][yCoord][i] != null)
			{
				return board[xCoord][yCoord][i];
			}
		}
		return null;
	}
	
	public static void printGobblerBoard(Gobbler[][][] board)
	{
		for (int r = 0; r < 3; r++)
		{
			for (int c = 0; c < 3; c++)
			{
				if (board[r][c][0] == null)
				{
					System.out.print("-");
				}
				else
				{
					System.out.print(board[r][c][getTopIndex(r, c)].size());
				}
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static Gobbler getGobblerFromButton(int buttonIndex)
	{
		if (buttonIndex > 0 && buttonIndex < 4)
		{
			//blueGobbAmt[buttonIndex - 1]--;
			return (new Gobbler("Blue", (buttonIndex - 1)));
		}
		
		else if (buttonIndex == 4 || buttonIndex == 8  || buttonIndex == 12)
		{
			//orangeGobbAmt[(buttonIndex / 4) - 1]--;
			return (new Gobbler("Orange", (buttonIndex / 4) - 1));
		}
		//Gobbler was on board
		//567, 91011, 131415
		//5- (0, 0), 6- (0, 1) 15- (2, 2)
		else			
		{
			int x;
			int y;
			if ( 4 < buttonIndex  && buttonIndex < 8)
			{
			x = 0;
			y = (buttonIndex - 5);
			}
			else if ( 8 < buttonIndex  && buttonIndex < 12)
			{
			x = 1;
			y = (buttonIndex - 9);
			}
			else if (12 < buttonIndex  && buttonIndex < 16)
			{
			x = 2;
			y = (buttonIndex - 13);
			}
			else
			{
				return null;
			}
			return getTopGobbler(x, y);	
		}	

	}

	public static int getXFromButton(int buttonIndex)
	{
		int x;
		if ( 4 < buttonIndex  && buttonIndex < 8)
		{
		x = 0;
		}
		else if ( 8 < buttonIndex  && buttonIndex < 12)
		{
		x = 1;
		}
		else if (12 < buttonIndex  && buttonIndex < 16)
		{
		x = 2;
		}
		else
		{
			return -1;
		}
		return x;
	}
	
	public static int getYFromButton(int buttonIndex)
	{
		int y;
		if ( 4 < buttonIndex  && buttonIndex < 8)
		{
		y = (buttonIndex - 5);
		}
		else if ( 8 < buttonIndex  && buttonIndex < 12)
		{
		y = (buttonIndex - 9);
		}
		else if (12 < buttonIndex  && buttonIndex < 16)
		{
		y = (buttonIndex - 13);
		}
		else
		{
			return -1;
		}
		return y;
	}
	
	public static boolean isOnBoard(int buttonIndex)
	{
		if ((4 < buttonIndex && buttonIndex < 8) || (8 < buttonIndex && buttonIndex < 12)
		|| (12 < buttonIndex && buttonIndex < 16))
		{
			return true;
		}
		return false;
	}
	
	/*public Icon getGobblerIcon(Gobbler gobb)
	{
		if (gobb.color() == "Orange")
		{
			if (gobb.size() == 0)
			{
				return smallOrangeIcon;
			}
			else if (gobb.size() == 1)
			{
				return mediumOrangeIcon;
			}
			else
			{
				return largeOrangeIcon;
			}
		}
		else
		{
			if (gobb.size() == 0)
			{
				return smallBlueIcon;
			}
			else if (gobb.size() == 1)
			{
				return mediumBlueIcon;
			}
			else
			{
				return largeBlueIcon;
			}
		}
	}
	*/
	
	public static void resetGobbAmounts()
	{
		for (int i = 0; i < 3; i++)
		{
			blueGobbAmt[i] = 2;
			orangeGobbAmt[i] = 2;
		}
	}
}