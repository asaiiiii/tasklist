package models.validators;

import java.util.ArrayList;
import java.util.List;

import models.Tasklist;

public class TasklistValidator {
    public static List<String> validate(Tasklist m){
        List<String> errors=new ArrayList<String>();

        String title_error=validateTitle(m.getTitle());
        if(!title_error.equals("")) {
            errors.add(title_error);
        }
        String content_error=validateContent(m.getContent());
        if(!content_error.equals("")) {
            errors.add(content_error);
        }
        return errors;

    }
    private static String validateTitle(String title) {
        if(title==null||title.equals("")){
            return "日時を入力してください。";
        }

        return "";

    }
    private static String validateContent(String content) {
        if(content==null||content.equals("")) {
            return "タスク内容を入力してください";

        }
        return "";
    }
}
