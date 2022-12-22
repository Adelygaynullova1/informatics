package New;

/**
 * Реализация стека с внутренней структурой хранения данных - массив объектов
 *
 * Если мы достигли длины массива, и класть больше некуда - увеличиваем массив ~ в 1.5 раза
 */
public class QueueImpl implements IQueue {

    private Object[] data;

    private int count = 0;

    private int len = 10;

    private int i = 0;

    public QueueImpl() {
        data = new Object[len];
    }

    public Object pop() {
            Object tmp =data[i];
            data[i] = null;
            ++i;
            return tmp;

    }

    public void push(Object o) {
        // контролируем длину массива
        if (count + 1 > len) {
            len += (len / 2);
            Object[] tmp = new Object[len];
            System.arraycopy(data, 0, tmp, 0, count);
            data = tmp;
        }
        data[count++] = o;
    }


}
