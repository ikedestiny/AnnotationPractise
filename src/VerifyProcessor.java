import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.element.TypeElement;
import java.lang.reflect.Field;
import java.util.Set;

public class VerifyProcessor {

    public void validate(Object object) throws IllegalAccessException {
        Field[] fields = object.getClass().getDeclaredFields();
        for (Field field : fields){
            field.setAccessible(true);
            if (field.isAnnotationPresent(VerifrySize.class)){
                VerifrySize verifrySize = field.getAnnotation(VerifrySize.class);
                if (field.get(object).toString().length()< verifrySize.min() || field.get(object).toString().length()> verifrySize.max()){
                    field.set(object,"INVALID");
                }
            }
        }
    }
}
