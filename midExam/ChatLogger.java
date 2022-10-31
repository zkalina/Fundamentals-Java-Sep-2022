package midExam;

import java.util.*;
import java.util.stream.Collectors;

public class ChatLogger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            String input = scanner.nextLine();
        List <String> newList = new ArrayList<>();

            while(!input.equals("end")){
                List<String> commandData = Arrays.stream(input.split(" ")).collect(Collectors.toList());
                String command = commandData.get(0);

                switch (command){
                    case "Chat":
                        String addMessage = commandData.get(1);
                        newList.add(addMessage);
                        break;

                    case "Delete":
                        String deleteMessage = commandData.get(1);
                        if(newList.contains(deleteMessage)){
                            newList.remove(deleteMessage);
                        }else{
                            break;
                        }
                        break;

                    case "Edit":
                        String oldMessage = commandData.get(1);
                        String editedMessage = commandData.get(2);
                            if(newList.contains(oldMessage)){
                                int index = newList.indexOf(oldMessage);
                                newList.set(index, editedMessage);
                        }else{
                                break;
                            }
                        break;

                    case "Pin":
                        String messageToPin = commandData.get(1);
                        if(newList.contains(messageToPin)){
                            newList.remove(messageToPin);
                            newList.add(messageToPin);
                        }
                        break;

                    case "Spam":
                        for (int i = 1; i <= commandData.size() - 1; i++){
                           String element =  commandData.get(i);
                            newList.add(element);
                        }

                        break;
                }

                input = scanner.nextLine();
            }
        for (String item : newList) {
            System.out.println(item);
        }
    }
}
