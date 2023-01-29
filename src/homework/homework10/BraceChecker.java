package homework.homework10;

public class BraceChecker {
    private String text;
    private Stack ob = new Stack();

    BraceChecker(String text) {
        this.text = text;
    }

    void check() {
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '{') {
                ob.push('{');
            } else if (text.charAt(i) == '[') {
                ob.push('[');
            } else if (text.charAt(i) == '(') {
                ob.push('(');
            }
            switch (text.charAt(i)) {
                case '}':
                    if (ob.arrayLastElement() == '[') {
                        System.out.println("Error: opened [ but closed } at " + i);
                        ob.pop();
                    } else if (ob.arrayLastElement() == '(') {
                        System.out.println("Error: opened ( but closed } at " + i);
                        ob.pop();
                    } else if (ob.arrayLastElement() == -1) {
                        System.out.println("You didn't open any of the parentheses, but closed them }");
                    } else if (ob.arrayLastElement() == '{') {
                        ob.pop();
                    }
                    break;
                case ')':
                    if (ob.arrayLastElement() == '[') {
                        System.out.println("Error: opened [ but closed ) at " + i);
                        ob.pop();
                    } else if (ob.arrayLastElement() == '{') {
                        System.out.println("Error: opened { but closed ) at " + i);
                        ob.pop();
                    } else if (ob.arrayLastElement() == -1) {
                        System.out.println("You didn't open any of the parentheses, but closed them )");
                    } else if (ob.arrayLastElement() == '(') {
                        ob.pop();
                    }
                    break;
                case ']':
                    if (ob.arrayLastElement() == '{') {
                        System.out.println("Error: opened { but closed ] at " + i);
                        ob.pop();
                    } else if (ob.arrayLastElement() == '(') {
                        System.out.println("Error: opened ( but closed ] at " + i);
                        ob.pop();
                    } else if (ob.arrayLastElement() == -1) {
                        System.out.println("You didn't open any of the parentheses, but closed them ]");
                    } else if (ob.arrayLastElement() == '[') {
                        ob.pop();
                    }
                    break;
            }
        }
        for (int i = -1; i < ob.arrayLastElementIndex(); i++) {
            if (ob.arrayLastElement() == '(') {
                System.out.println("You opened ( but did not close it");
                ob.pop();
            } else if (ob.arrayLastElement() == '{') {
                System.out.println("You opened { but did not close it");
                ob.pop();
            } else if (ob.arrayLastElement() == '[') {
                System.out.println("You opened [ but did not close it");
                ob.pop();
            }
        }
    }
}
