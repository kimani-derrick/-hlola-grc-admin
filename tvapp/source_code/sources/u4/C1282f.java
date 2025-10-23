package u4;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;
/* renamed from: u4.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1282f {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicLong f14994a = new AtomicLong(0);

    /* renamed from: b  reason: collision with root package name */
    public static String f14995b;

    public C1282f(C1273A c1273a) {
        long time = new Date().getTime();
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt((int) (time / 1000));
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        byte[] array = allocate.array();
        byte b7 = array[0];
        byte b8 = array[1];
        byte b9 = array[2];
        byte b10 = array[3];
        byte[] a7 = a(time % 1000);
        byte b11 = a7[0];
        byte b12 = a7[1];
        byte[] a8 = a(f14994a.incrementAndGet());
        byte b13 = a8[0];
        byte b14 = a8[1];
        byte[] a9 = a(Integer.valueOf(Process.myPid()).shortValue());
        byte[] bArr = {b7, b8, b9, b10, b11, b12, b13, b14, a9[0], a9[1]};
        String i7 = AbstractC1284h.i(c1273a.c().f14988a);
        String f = AbstractC1284h.f(bArr);
        Locale locale = Locale.US;
        f14995b = String.format(locale, "%s%s%s%s", f.substring(0, 12), f.substring(12, 16), f.subSequence(16, 20), i7.substring(0, 12)).toUpperCase(locale);
    }

    public static byte[] a(long j7) {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.putShort((short) j7);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    public final String toString() {
        return f14995b;
    }
}
