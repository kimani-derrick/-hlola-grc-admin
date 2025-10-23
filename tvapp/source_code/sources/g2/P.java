package g2;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class P {
    public static final byte[] d = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, Byte.MIN_VALUE, -69, 0, 0, 0, 0, 0};

    /* renamed from: e  reason: collision with root package name */
    public static final byte[] f10608e = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: a  reason: collision with root package name */
    public int f10609a;

    /* renamed from: b  reason: collision with root package name */
    public int f10610b;

    /* renamed from: c  reason: collision with root package name */
    public Comparable f10611c;

    public static void a(ByteBuffer byteBuffer, long j7, int i7, int i8, boolean z7) {
        byte b7;
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        boolean z8 = false;
        byteBuffer.put((byte) 0);
        if (z7) {
            b7 = 2;
        } else {
            b7 = 0;
        }
        byteBuffer.put(b7);
        byteBuffer.putLong(j7);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i7);
        byteBuffer.putInt(0);
        long j8 = i8;
        if ((j8 >> 8) == 0) {
            z8 = true;
        }
        android.support.v4.media.session.b.e(j8, "out of range: %s", z8);
        byteBuffer.put((byte) j8);
    }
}
