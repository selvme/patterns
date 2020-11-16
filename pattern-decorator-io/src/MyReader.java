import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Admin on 28.09.2017.
 */
public class MyReader extends FilterInputStream {


    /**
     * Creates a <code>FilterInputStream</code>
     * by assigning the  argument <code>in</code>
     * to the field <code>this.in</code> so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or <code>null</code> if
     *           this instance is to be created without an underlying stream.
     */
    protected MyReader(InputStream in) {
        super(in);
    }

    public int read() throws IOException {
        int с = super.read();
        return (с == - 1 ? с : Character.toLowerCase((char)с));
    }

    public int read(byte[] b, int offset, int len) throws IOException{
        int result = super.read(b, offset, len);
        for (int i = offset; i < offset+result; i++) {
            b[i] = (byte)Character.toLowerCase((char)b[i]);
        }
        return result;
    }

}
