public class Model {

    private final Viewer viewer;
    private String temp;
    private String expression;;
    String calculation;
    double number, answer;

    public Model(Viewer viewer) {
        this.viewer = viewer;
        temp = "";
        expression = "";
    }

    public void doAction(String command) {
        if (command.equals("Clean")) {
            temp = "";
        } else if (command.equals("CleanEntry")) {
            temp = "";
            expression = "";
        } else if (command.equals("Back")) {
            int length = temp.length();
            int number = length - 1;

            if (length > 0) {
                StringBuilder back = new StringBuilder(temp);
                back.deleteCharAt(number);
                temp = back.toString();
            }
        } else if (command.equals("Zero")) {
            if (temp.equals("0")) {
                return;
            } else temp = temp + "0";
        } else if(command.equals("One")) {
            temp = temp + "1";
        } else if(command.equals("Two")) {
            temp = temp + "2";
        } else if (command.equals("Three")) {
            temp = temp + "3";
        } else if (command.equals("Four")) {
            temp = temp + "4";
        } else if (command.equals("Five")) {
            temp = temp + "5";
        } else if (command.equals("Six")) {
            temp = temp + "6";
        } else if (command.equals("Seven")) {
            temp = temp + "7";
        } else if (command.equals("Eight")) {
            temp = temp + "8";
        } else if (command.equals("Nine")) {
            temp = temp + "9";
        } else if (command.equals("Dot")) {
            if (temp.contains(".")) {
                return;
            } else temp = temp + ".";
        } else if (command.equals("Plus")) {
            String str = temp;
            number = Double.parseDouble(temp);
            temp = "";
            expression = str + "+";
            calculation = "Plus";
        } else if (command.equals("Minus")) {
            String str = temp;
            number = Double.parseDouble(temp);
            temp = "";
            expression = str + "-";
            calculation = "Minus";
        }else if (command.equals("Multi")) {
            String str = temp;
            number = Double.parseDouble(temp);
            temp = "";
            expression = str + "*";
            calculation = "Multi";
        }else if (command.equals("Div")) {
            String str = temp;
            number = Double.parseDouble(temp);
            temp = "";
            expression = str + "/";
            calculation = "Div";
        } else if (command.equals("Equal")) {
            switch (calculation) {
                case "Plus":
                    answer = number + Double.parseDouble(temp);
                    if (Double.toString(answer).endsWith(".0")) {
                        temp = Double.toString(answer).replace(".0", "");
                    } else {
                        temp = Double.toString(answer);
                    }
                    expression = "";
                    break;
                case "Minus":
                    answer = number - Double.parseDouble(temp);
                    if (Double.toString(answer).endsWith(".0")) {
                        temp = Double.toString(answer).replace(".0", "");
                    } else {
                        temp = Double.toString(answer);
                    }
                    expression = "";
                    break;
                case "Multi":
                    answer = number * Double.parseDouble(temp);
                    if (Double.toString(answer).endsWith(".0")) {
                        temp = Double.toString(answer).replace(".0", "");
                    } else {
                        temp = Double.toString(answer);
                    }
                    expression = "";
                    break;
                case "Div":
                    answer = number / Double.parseDouble(temp);
                    if (Double.toString(answer).endsWith(".0")) {
                        temp = Double.toString(answer).replace(".0", "");
                    } else {
                        temp = Double.toString(answer);
                    }
                    expression = "";
                    break;
            }
        }

        viewer.updateExpression(expression);
        viewer.updateTemp(temp);
    }
}



