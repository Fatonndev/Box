// PRE: Expects gdxBuffers.i to be included
// POST: Pointers to most of the basic types are mapped to Buffers

ENABLE_NIO_BUFFER_TYPEMAP(unsigned char, ByteBuffer);
ENABLE_NIO_BUFFER_TYPEMAP(short, ShortBuffer);
ENABLE_NIO_BUFFER_TYPEMAP(unsigned short, IntBuffer);
ENABLE_NIO_BUFFER_TYPEMAP(int, IntBuffer);
ENABLE_NIO_BUFFER_TYPEMAP(unsigned int, LongBuffer);
ENABLE_NIO_BUFFER_TYPEMAP(long, IntBuffer);
ENABLE_NIO_BUFFER_TYPEMAP(unsigned long, LongBuffer);
ENABLE_NIO_BUFFER_TYPEMAP(float, FloatBuffer);
ENABLE_NIO_BUFFER_TYPEMAP(double, DoubleBuffer);
ENABLE_NIO_BUFFER_TYPEMAP(btScalar, FloatBuffer);