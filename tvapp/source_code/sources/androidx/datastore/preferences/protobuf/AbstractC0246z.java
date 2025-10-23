package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
/* renamed from: androidx.datastore.preferences.protobuf.z  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0246z {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f5827a = Charset.forName("UTF-8");

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f5828b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f5828b = bArr;
        ByteBuffer.wrap(bArr);
        if ((0 - 0) + 0 <= Integer.MAX_VALUE) {
            return;
        }
        try {
            throw B.f();
        } catch (B e3) {
            throw new IllegalArgumentException(e3);
        }
    }

    public static void a(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException(str);
    }

    public static int b(long j7) {
        return (int) (j7 ^ (j7 >>> 32));
    }

    public static AbstractC0243w c(Object obj, Object obj2) {
        AbstractC0243w abstractC0243w = (AbstractC0243w) ((AbstractC0220a) obj);
        AbstractC0241u abstractC0241u = (AbstractC0241u) abstractC0243w.d(5);
        abstractC0241u.d();
        AbstractC0241u.e(abstractC0241u.f5824r, abstractC0243w);
        AbstractC0220a abstractC0220a = (AbstractC0220a) obj2;
        if (abstractC0241u.f5823q.getClass().isInstance(abstractC0220a)) {
            abstractC0241u.d();
            AbstractC0241u.e(abstractC0241u.f5824r, (AbstractC0243w) abstractC0220a);
            return abstractC0241u.c();
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
