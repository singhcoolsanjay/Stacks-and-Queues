/*
 * Your code should have the following Output:
 * true
 * false
 * www.upgrad.com
 * www.yahoo.com
 * [www.google.co.in, www.facebook.com, www.yahoo.com]
 */


import java.util.Stack;
import java.util.Scanner;

public class SolutionA {

    private static Stack<String> history = new Stack<String>();

    public static Boolean isBrowsingHistoryEmpty() {
        // using is.Empty() on the stack
        return history.isEmpty();
    }

    public static String mostRecentlyVisitedSite() {
        // using peek() operation on the stack
        if (!history.isEmpty()) {
            return history.peek();
        } else {
            return "Browsing history is empty";
        }

    }

    public static void addSiteToHistory(String url) {
        // pushing an element into the stack
        history.push(url);
    }

    public static void goBackInTime(int n) {
        // popping n elements from the stack
        // When the no. n is more than the size of the stack, the stack is emptied and the code proceeds
        for (int i = 0; (i < n && !history.isEmpty()); i++) {
            history.pop();
        }
    }

    public static void printBrowsingHistory() {
        // printing the contents of the stack
        if (!history.isEmpty()) {
            System.out.println(history);
        } else {
            System.out.print("Browsing History is empty");
        }
    }

    public static void main(String[] args) {
        System.out.println(isBrowsingHistoryEmpty()); // Checking if Browsing History is Empty
        addSiteToHistory("www.google.co.in"); // Navigating to Google
        addSiteToHistory("www.facebook.com"); // Navigating to Facebook
        addSiteToHistory("www.upgrad.com"); // Navigating to UpGrad
        System.out.println(isBrowsingHistoryEmpty()); // Checking if Browsing History is Empty
        System.out.println(mostRecentlyVisitedSite()); // Fetching most recently visited site (UpGrad)
        addSiteToHistory("www.youtube.com"); // Navigating to Youtube
        goBackInTime(2); // Going back by 2 sites
        addSiteToHistory("www.yahoo.com"); // Navigating to UpGrad platform site
        System.out.println(mostRecentlyVisitedSite()); // Fetching most recently visited site (UpGrad Learn Platform)
        printBrowsingHistory(); // Printing browsing history

    }
}