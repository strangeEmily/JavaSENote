package io;
/**
 * IO流
 * 1.流的分类
 * 1.1 根据方向
 *   - 流根据方向可以分为：输入流和输出流
 *     注意：输入和输出是相对于内存而言的，从内存中出来就是输出，到内存中就是输入
 *   - 输入流又叫做InputStream,输出流又叫做OutputStream，输入还叫做“读Read”，输出还叫做“写Write”
 * 1.2 根据读取数据的方式
 *     - 流根据读取数据的方式可以分为：字节流和字符流，字节流按照字节的方式读取，字符流按照字符的方式读取每次读取2个字节。
 *       注意：java语言中一个字符占2个字节
 *     - 字节流适合读取视频，声音，图片等二进制文件。字符流适合读取纯文本文件
 *     - java中的所有字节流都以Stream结尾，所有字符流都含有Reader或Writer
 * --- java语言中的流分为四大家族：InputStream, OutputStream, Reader, Writer
 * ********************************************************************************************************
 * 2. InputStream和OutputStream的继承结构
 * Closeable<Interface>
 *     <实现>                       <实现>
 * InputStream                      OutputStream   <---<实现>--- Flushable<Interface>
 * <继承>                            <继承>
 * FileInputStream                  FileOutputStream
 *
 * ObjectInputStream                ObjectInputStream
 *
 * FilterInputStream【不常用】        FilterOutputStream【不常用】
 * <继承>                            <继承>
 * BufferedInputStream               BufferedOutputStream
 * DataInputStream                   DataOutputStream
 *                                   PrintStream
 * ***********************************************************************************************************
 * 3. Reader
 *  Closeable<Interface>
 *     <实现>                       <实现>
 *     Reader                       Writer  <---<实现>--- Flushable<Interface>
 *     <继承>                       <继承>
 *     BufferedReader               BufferedWriter
 *                                  PrintWriter
 *     InputStreamReader            OutputStreamWriter
 *     <继承>                        <继承>
 *     FileReader                   FileWriter
 * */
public class IOTest01_Base {
}
