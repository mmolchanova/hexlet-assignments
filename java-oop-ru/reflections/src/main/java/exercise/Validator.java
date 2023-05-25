package exercise;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// BEGIN
public class Validator {
    public static List<String> validate(Address address) {
        List<String> invalidFields = new ArrayList<>();

        for (Field field: address.getClass().getDeclaredFields()) {
            try {
                NotNull notNull = field.getAnnotation(NotNull.class);
                field.setAccessible(true);
                if (notNull != null && field.get(address) == null) {
                    invalidFields.add(field.getName());
                }
            } catch (IllegalAccessException exception) {
                exception.printStackTrace();
            }
        }

        return invalidFields;
    }

    public static Map<String, List<String>> advancedValidate(Address address) {
        Map<String, List<String>> invalidFields = new HashMap<>();

        for (Field field: address.getClass().getDeclaredFields()) {
            try {
                NotNull notNull = field.getAnnotation(NotNull.class);
                MinLength minLength = field.getAnnotation(MinLength.class);
                field.setAccessible(true);
                if (notNull != null && field.get(address) == null) {
                    invalidFields.put(field.getName(), List.of("can not be null"));
                } else if (minLength != null && field.get(address).toString().length() < 4) {
                    invalidFields.put(field.getName(), List.of("length less than 4"));
                }
            } catch (IllegalAccessException exception) {
                exception.printStackTrace();
            }
        }

        return invalidFields;
    }
}
// END
