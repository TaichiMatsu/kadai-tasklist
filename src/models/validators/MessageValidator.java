package models.validators;

import java.util.ArrayList;
import java.util.List;

import models.Tasks;

public class MessageValidator {
    //バリデーションを実行する
    public static List<String> validate(Tasks t) {
        List<String> errors = new ArrayList<String>();



        String content_error = _validateContent(t.getContent());
        if(!content_error.equals("")) {
            errors.add(content_error);
        }

        return errors;
    }

    //タイトルの必須入力チェック
    private static String _validateContent(String content) {
        if(content == null || content.equals("") || content.equals(" ") || content.equals("　")) {
            return "タスクを入力してください。";
        }

        return "";
    }
}
