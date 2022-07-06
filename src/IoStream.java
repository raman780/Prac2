//Java I/O is used to process the input ad produce the output
//the concept of stream is used to make I/O operation fast.
// Stream; it is a sequence of data. In java, a stream is composed o bytes. It;s called a stream because it is like a stream of water that continues to flow.
//three Streams are :
//1. System.out --- Standard output Stream
//2. System.in --- Standard input Stream
//3. System.err --- standard error stream
// the java.io package contains all the classes required for input nad output operations.
// File handling can be performed by using Java I/O API.
//

//useful methods of inputStream
//1. public abstract int read() throwsIOException : reads the next byte of data from the input stream. it returns - 1 at the end of a file.
//2. public int available() throws IO Exception : returns an estimate of the number of bytes that can be read from the current input stream.
//3. public void close() throws IOException : it used to close the current input stream.


public class IoStream {
    public static void main(String[] args) {
        System.out.println("simple message");
        System.err.println("error message");
    }
}
