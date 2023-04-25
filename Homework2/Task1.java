/*Дана строка sql-запроса "select * from students where ". 
Сформируйте часть WHERE этого запроса, используя StringBuilder. 
Данные для фильтрации приведены ниже в виде json-строки.
Если значение null, то параметр не должен попадать в запрос.
Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"} */

import java.util.HashMap;
import java.util.Map;

public class Task1 {

    public static void main(String[] args) {
        Map<String, String> maps = new HashMap<String,String>();
        maps.put("name","Ivanov");
        maps.put("country","Russia");
        maps.put("city","Moscow");
        maps.put("age",null);
        System.out.println(getQuery(maps));
    }
    public static String getQuery(Map<String, String> params)
    {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String,String> pair : params.entrySet())
        {
            if (pair.getValue() != null)
            {
                sb.append(pair.getKey() +" = '" + pair.getValue()+"' and ");
            }
        }
        sb.delete(sb.toString().length()-5,sb.toString().length());
        return sb.toString();
    }
}