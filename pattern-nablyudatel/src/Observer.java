import java.util.ArrayList;

/**
 * Интерфейс для наблюдателя, для того чтобы можно было добавлять любые экраны наблюдателя
 */
public interface Observer {

    void update(ArrayList<MeasuredParameter> parameters);
}
